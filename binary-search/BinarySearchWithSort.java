// This version of the binary search has a self-implemented sort method, instead of initialising an array that is already entirely sorted.

import java.util.ArrayList;
import java.util.Random;

public class BinarySearchWithSort {

    public static void main(String[] args) {

        final int N = 30;       // number of elements in the arraylist to be sorted

        Random random = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int temp = random.nextInt(N);
        arr.add(temp);

        System.out.println(arr);

        for (int i = 1; i < N; i++) {
            temp = random.nextInt(N);
            while (arr.lastIndexOf(temp) != -1) {       // inbuilt method
                temp = random.nextInt(N);
            }
            arr.add(temp);
        }

        System.out.println(arr);


        int target = 14; // random.nextInt(30); uncomment to find a random integer in the list

        System.out.println("search target: " + target);

        System.out.println(arr);

        sortArr(arr);
        
        System.out.println(binarySearch(arr, 0, arr.size(), target));

    }


    // binarySearch has a big O of logN, where N is the length of the input array
    public static boolean binarySearch(ArrayList<Integer> arr, int start, int end, int target) {
        System.out.println(arr.subList(start, end));
        System.out.println("------------------------------------------------------------------------------------------");
        int mid = (start + end)/2;
        if (start < end) {
            if (arr.get(mid) == target) {
                return true;
            } else if (arr.get(mid) < target) {
                return binarySearch(arr, mid + 1, end, target);
            } else {        // arr.get(mid) > target
                return binarySearch(arr, start, mid, target);
            }
        } else {        // terminating search once the list has been searched, otherwise it will throw an index error
            return false;
        }
    }

    public static void sortArr(ArrayList<Integer> arr) {        // insertion sort
        int length = arr.size();
        for (int i = 1; i < length; i++) {
            int temp = arr.get(i);
            int j = i - 1;
            while ((j >= 0) && (arr.get(j) > temp)) {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, temp);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(arr);

    }

}