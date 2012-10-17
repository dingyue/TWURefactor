package problem2;

// Understands the right orientation for specific action of a point
public class North extends Direction {

    public static final char NORTH = 'N';

    public North() {
        super(NORTH);
    }

    public Direction turnRight() {
        return new East();
    }

    public Direction turnLeft() {
        return new West();

    }
}
