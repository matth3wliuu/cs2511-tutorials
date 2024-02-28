package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    // * We don't users to provide us with a start value less than 0
    // * make sure to add back the throws exception clause if uncomment below
    public List<Integer> wondrous(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Start value must be greater than 0");
        }

        int current = start;
        List<Integer> sequence = new ArrayList<>();

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

    public static void main(String[] args) {
        Wondrous w = new Wondrous();

        try {
            System.out.println(w.wondrous(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}