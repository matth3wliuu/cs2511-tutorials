package unsw.training;

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

    public LocalDate makeBooking(String employee, List<LocalDate> avail) {
        for (Seminar seminar : this.seminars) {
            LocalDate booking = seminar.makeBooking(employee, avail);
            if (booking == null) {
                continue;
            }
            return booking;
        }
        return null;
    }
}
