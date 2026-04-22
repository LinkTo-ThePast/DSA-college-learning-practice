package lesson_07;

public class BinarySearch {

    int[] numbers;
    int numberObjective;

    public int findNumber(int[] numbers, int numberObjective) {
        if (numberObjective < 0 || numbers.length == 0) {
            return 0;
        }

        int halfOfArray = numbers.length % 2;
        int halfOfElements;
        if (halfOfArray == 0) {
            halfOfElements = numbers[halfOfArray];
        } else {
            halfOfElements = numbers[Math.floorDiv(numbers.length, 2)];
        }

        if (numberObjective < halfOfElements) {

        }
    }
}
