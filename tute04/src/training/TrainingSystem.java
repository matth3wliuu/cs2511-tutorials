package training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {

    private List<Trainer> trainers;

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            LocalDate time = trainer.bookTraining(employee, availability);
            if (time == null) {
                continue;
            }
            else {
                return time;
            }
        }
        return null;
    }
}
