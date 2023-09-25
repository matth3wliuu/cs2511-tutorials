package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    public List<Integer> wondrous(int start) {
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

        return sequence;
    }

    public static void main(String[] args) {
        Wondrous w = new Wondrous();
        System.out.println(w.wondrous(3));
    }
}