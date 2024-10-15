package calculator.entity;

import java.util.List;

public class Num {

    private final int number;

    public Num(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be positive");
        }
        this.number = number;
    }


    public static int total(List<Num> numList) {
        int sum = 0;

        for (Num num : numList) {
            sum += num.number;
        }
        return sum;
    }
}
