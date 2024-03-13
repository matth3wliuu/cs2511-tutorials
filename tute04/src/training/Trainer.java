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

    LocalDate book(LocalDate available, String name) {
        for (Seminar seminar : getSeminars()) {
            LocalDate booking = seminar.book(available, name);
            if (booking != null) {
                return booking;
            }
        }
        return null;
    }
}
