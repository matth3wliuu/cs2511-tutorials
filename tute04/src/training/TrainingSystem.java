package training;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// * Requirements
// * 1) Each employee must attend a seminar run by a trainer
// * 2) Each trainer can run multiple seminars with no more than
// *    10 attendees per seminar

public class TrainingSystem {
    private List<Trainer> trainers = new ArrayList<Trainer>();

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            LocalDate booking = trainer.book(employee, availability);
            if (booking != null) {
                return booking;
            }
        }
        return null;
    }
}

// ? How does the TrainingSystem violate the Law of Demeter?
// * Line 13: we defined a list of Trainers in the TrainingSystem
    // * Each Trainer in the list is a neighbour of the TrainingSystem
// * Line 16: iterate through a list defined in the class: OKAY
// * Line 17: calling the getSeminars method on a neighbouring class: OK
//      * Each instance of Seminar from a Trainer is not a neighbour of the TrainingSystem
// * Line 18: iterating through a list passed as an argument to the mthod: OK
// ! Line 19: calling a method from an object that is not a neighbour of the TrainingSystem

// ? What other properties of this design are undesirable?
// * High Coupling: TrainingSystem knows too much about the internal details of Seminar and Trainer
// * Low Cohesion: TrainingSystem uses too many external classes to achieve the goal of booking an employee
// * Poor encapsulation: Seminar is poorly encapsulated because
//  - Should not be TrainingSystem's responsibility to add and check attendees