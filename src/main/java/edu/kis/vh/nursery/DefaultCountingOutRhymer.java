package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int MAX_INDEX = MAX_SIZE - 1;
    public static final int DEFAULT_RETURN = -1;
    public static final int EMPTY_VALUE = -1;
    private int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}
