import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {

        final int N = 30;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 1; i <= N; i++) {
            arr.add(i);         // updates arr to contain a sorted list of positive integers of size N
        }

        Random random = new Random();

        int target = 15; // random.nextInt(30); uncomment to find a random integer in the list

        System.out.println("search target: " + target);

        System.out.println(arr);
        
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


}