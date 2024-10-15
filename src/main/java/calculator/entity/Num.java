package calculator.entity;

public class Num {

    private int number;

    public Num(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be positive");
        }
        this.number = number;
    }
}
