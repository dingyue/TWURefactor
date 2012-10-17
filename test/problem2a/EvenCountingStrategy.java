package problem2a;

public class EvenCountingStrategy implements CountingStrategy{
    public int count(int[] numbers)
    {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++;
        }
        return count;

    }
}
