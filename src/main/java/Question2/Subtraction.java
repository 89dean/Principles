package Question2;

public class Subtraction implements Numbers {
    private int t;

    @Override
    public int intergers(int a, int b) {
        t = a - b;
        return t;
    }
}
