package lesson_07;

public class Main {


    public static void main(String[] args) {
        int[] sorted_array = {1,3,5,7,9,10};


        BinarySearch binarySearch = new BinarySearch();

        int getPosition = binarySearch.findNumber(sorted_array, 3);
        System.out.println("The position of the objective item is: " + getPosition);

    }

}
