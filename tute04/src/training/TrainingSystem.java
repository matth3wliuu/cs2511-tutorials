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
            for (Seminar seminar : trainer.getSeminars()) {
                for (LocalDate available : availability) {
                    if (seminar.getStart().equals(available) && seminar.getAttendees().size() < 10) {
                        seminar.getAttendees().add(employee);
                        return available;
                    }
                }
            }
        }
        return null;
    }
}

// ? How does the TrainingSystem violate the Law of Demeter?
// * Line 16:
// * Line 17:
// * Line 18:
// * Line 19:

// ? What other properties of this design are undesirable?