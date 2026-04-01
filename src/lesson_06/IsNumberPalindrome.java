package lesson_06;

public class IsNumberPalindrome {
    private int number;

    public boolean isNumberPalindrome(int number) {
        // example number = 121
        if (number < 0) {
            return false;
        }

        int original_number = number;
        int reversed_number = 0;

        while (original_number > 0) {
            // extract last
            int last_digit = original_number % 10;
            // put that into our reversed number
            // as we are going from right to left when extracted, to put, we need to push numbers to the left
            reversed_number = (reversed_number * 10) + last_digit;

            // finally, remove the last digit performing floor division
            original_number = Math.floorDiv(original_number, 10);
        }
        if (reversed_number == number) {
            return true;
        }

        return false;
    }
}
