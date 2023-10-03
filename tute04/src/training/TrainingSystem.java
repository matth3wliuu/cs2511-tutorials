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
// * Line 13: we defined a list of Trainers in the TrainingSystem class
    // * Any instance of Trainer in the list of trainers is a 'neighbour' of the TrainingSystem
// * Line 16: iterating through a list defined in the class is OK
// * Line 17: iterating through a list of Seminar held by some Trainer: OK because we're simply calling a method from our neighbour
//      *! instances of Seminar from a Trainer are not neighbours of the TrainingSytem
// * Line 18: iterating through a list passed in as an argument is OK
// ! Line 19: calling a method from a neighbour of a neighbour of the TrainingSytem is NOT OK (LOD violated)

// ? What other properties of this design are undesirable?
// * coupling: TrainingSystem assumes too much about the Trainer and Seminar classes
    // example: TrainingSystem assumes that the Seminar class stores its attendees in a list
// * low cohesion: TrainingSystem relies mostly on external classes to achieve its goal
// * poor encapsulation: Seminar class is poorly encapsulated
    // 1. TrainingSytem should not responsible for adding attendees to it
    // 2. TrainingSystem should not be responsible for enforcing the capacity requirement