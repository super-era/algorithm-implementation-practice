public class MergeSort extends Sort{
    

    // merge sort always has an O(n) of nlogn
    public int[] sort(int[] array, boolean descending) {
        mergeSort(array, 0, array.length-1, descending);
        return array;
    } 

    // recursively splits an array in half multiple times before merging them together
    private void mergeSort(int[] array, int start, int end, boolean descending) {
        if (start < end) {
            int mid = (start + end)/2;
            mergeSort(array, start, mid, descending);
            mergeSort(array, mid + 1, end, descending);
            merge(array, start, mid, end, descending);
        }
    }

    // sorts and merges input array together based on element size
    private void merge(int[]array, int start, int mid, int end, boolean descending) {
        // setting up the two subarrays' size
        int left_size = mid - start + 1;
        int right_size = end - mid;

        // initialising subarrays and size
        int[] L = new int[left_size];
        int[] R = new int[right_size];

        // initialising left-side elements in left-side array
        for (int i = 0; i < left_size; i++) {
            L[i] = array[start + i];        
        }

        // initialising right-side elements in right-side array
        for (int j = 0; j < right_size; j++) {
            R[j] = array[(mid + 1) + j];
        }

        int i = 0, j = 0;
        int array_index = start;

        while(i < left_size && j < right_size) {
            // identifying and merging elements in descending order
            if (descending) {
                if (L[i] >= R[j]) {
                    array[array_index] = L[i];
                    i++;
                } else {
                    array[array_index] = R[j];
                    j++;
                }
            } else {
                // identifying and merging elements in ascending order
                if (L[i] <= R[j]) {
                    array[array_index] = L[i];
                    i++;
                } else {
                    array[array_index] = R[j];
                    j++;
                }
            }

            array_index++;
        }

        // if the two arrays to be merged are of different sizes
        while (i < left_size) {
            array[array_index] = L[i];
            i++;
            array_index++;
        }

        while (j < right_size) {
            array[array_index] = R[j];
            j++;
            array_index++;
        }

    }

}