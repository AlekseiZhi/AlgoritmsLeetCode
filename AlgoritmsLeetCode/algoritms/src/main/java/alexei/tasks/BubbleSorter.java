package alexei.tasks;

import java.util.Arrays;

public class BubbleSorter {

    public int[] sorted(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] arr = {6, 4, 7, 4, 8, 3, 1, 5, 9, 12, 0, 32, 6, 23, 10, 2, 11};
        System.out.println(Arrays.toString(bubbleSorter.sorted(arr)));
    }
}