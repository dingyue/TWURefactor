package problem2;

public class South extends Direction {

    public static final char SOUTH = 'S';

    public South() {
        super(SOUTH);
    }

    public Direction turnRight() {
        return new West();
    }

    public Direction turnLeft() {
        return new East();

    }
}
