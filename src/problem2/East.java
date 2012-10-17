package problem2;

public class East extends Direction {

    public static final char EAST = 'E';

    public East() {
        super(EAST);
    }

    public Direction turnRight() {
        return new South();
    }

    public Direction turnLeft() {
        return new North();

    }
}
