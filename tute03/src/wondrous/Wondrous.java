package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    public List<Integer> wondrous(int start) throws Exception {
        if (start < 1) {
            throw new Exception("Start cannot be less than 1");
        }

        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }

        sequence.add(current);

        return sequence;
    }

}