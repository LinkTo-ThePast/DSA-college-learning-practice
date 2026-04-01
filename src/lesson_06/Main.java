package lesson_06;

public class Main {
    public static void main(String[] args) {
        int number = 232;

        IsNumberPalindrome isNumberPalindrome = new IsNumberPalindrome();
        boolean result = isNumberPalindrome.isNumberPalindrome(number);

        System.out.println("Is the number " + number + " palindrome? " +  result);
    }
}
