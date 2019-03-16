package Question2;

public class Addition implements Numbers{
    private int p;

    @Override
    public int intergers(int a, int b) {
        p = a + b;
        return p;
    }
}
