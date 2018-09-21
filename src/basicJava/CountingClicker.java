package basicJava;

public class CountingClicker {

    private int count;

    public CountingClicker() {
        count = 0;
    }

    public void reset() {
        count = 0;
    }

    public int getValue() {
        return count;
    }

    public int click() {
        count++;
        return getValue();
    }

    public void setValue(int newCount) {
        count = newCount; //can use this.count (refers to object's variable) = count
    }

}
