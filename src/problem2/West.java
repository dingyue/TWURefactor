package problem2;

public class West extends Direction {

    public static final char WEST = 'W';

    public West() {
        super(WEST);
    }

    public Direction turnRight() {
        return new North();
    }

    public Direction turnLeft() {
        return new South();

    }
}
