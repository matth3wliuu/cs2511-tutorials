package training;

import java.time.LocalDate;
import java.util.List;

/**
 * A trainer that runs in person seminars.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Trainer {

    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate bookTraining(String employee, List<LocalDate> availabilities) {
        for (Seminar seminar : this.getSeminars()) {
                seminar.makeBooking(employee, availabilities);
            }

        return null;
    }
}
