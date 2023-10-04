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

    public LocalDate book(String employee, List<LocalDate> avails) {
        for (Seminar seminar : this.getSeminars()) {
            LocalDate booking = seminar.book(employee, avails);
            if (booking != null) {
                return booking;
            }
        }
        return null;
    }

}
