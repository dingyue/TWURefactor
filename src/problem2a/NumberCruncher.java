package problem2a;
//Understands counting strategy
public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        int count=countEvenOrOdd(0);
        return count;
    }

    public int countOdd() {
        int count=countEvenOrOdd(1);
        return count;
    }

    public int countPositive() {
        int count = 0;
        for (int number : numbers) {
            if (number >= 0) count++;
        }
        return count;
    }

    public int countNegative() {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) count++;
        }
        return count;
    }

    public int countEvenOrOdd(int evenOrOdd){


        int count = 0;
        for (int number : numbers) {
            if (number % 2 == evenOrOdd) count++;
        }
        return count;

    }
}