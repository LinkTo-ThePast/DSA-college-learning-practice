package lesson_09;

import java.util.Arrays;

public class Main {
    // x is new element, arr[] is fixed size array and n is the size of the array
    public static int[] addNewItem(int x, int n, int[] arr)
    {
        int newArr[] = new int[n + 1];

        for (int i = 0; i < n; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[n] = x;
        return newArr;
    }


    public static void main(String[] args) {

        int n = 5;
        int x = 300;
        int[] arr = {1,2,3,4,5};

        int[] newArr = addNewItem(x, n, arr);

        System.out.println(Arrays.toString(newArr));
    }
}
