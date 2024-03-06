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
            for (LocalDate available : availability) {
                LocalDate booking = trainer.book(available, employee);
                if (booking != null) {
                    return booking;
                }
            }
        }
        return null;
    }
}

// ? How does the TrainingSystem violate the Law of Demeter?
// * Line 16: this is fine because we are just iterating through a list that is a member variable
// * Line 17: this is fine because we can call methods from the Trainer class which is a friend
// * Line 18: this is fine because we can access values passed in as arguments
// ! Line 19: this is not okay because we cannot call methods (getStart, getAttendees) from the
// ! Seminar class since it is not a friend

// ? What other properties of this design are undesirable?
// * Seminar class is poorly encapsulated:
    // * restriction of capacity is not being enforced by the class itself
    // * getAttendees exposes our internal list of attendees to potential malicious users
// * Lack of a abstraction / modularisation: String employee and List<LocalDate> can be combined into a class
