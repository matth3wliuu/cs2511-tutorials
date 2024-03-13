package training;

import java.time.LocalDate;
import java.util.List;

/**
 * An in person all day seminar with a maximum of 10 attendees.
 * @author Robert Clifton-Everest
 *
 */
public class Seminar {
    private LocalDate start;

    private List<String> attendees;

    public LocalDate getStart() {
        return start;
    }

    public LocalDate book(LocalDate available, String employee) {
        if (getStart().equals(available) && attendees.size() < 10) {
            attendees.add(employee);
            return available;
        }
        return null;
    }
}
