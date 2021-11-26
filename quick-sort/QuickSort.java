public class QuickSort extends Sort {
    
    // o(n) usually nlogn (median element as pivot), worst case n2
    public int[] sort(int[] array, boolean descending) {
        quickSort(array, 0, array.length-1, descending);        // array.length - 1 is the last index in the array
        return array;
    }

    private void quickSort(int[] array, int start, int end, boolean descending) {
        if (start >= 0 && end >= 0 && start < end) {
            int pivot = partition(array, start, end, descending);
            quickSort(array, start, pivot, descending);
            quickSort(array, pivot + 1, end, descending);
        }
    }

    private int partition(int[] array, int start, int end, boolean descending) {
        int pivot = array[(start + end)/2];       // pivot is the middle element
        int i = start - 1;
        int j = end + 1;

        if (descending) {
            
            while (true) {
                do {
                    i++;
                }
                while (array[i] > pivot);

                do {
                    j--;

                } while (array[j] < pivot);

                if (i >= j) {
                    return j;
                }

                swapElements(array, i, j);
            }

        } else {

            while (true) {

                do {
                    i++;
                }
                while (array[i] < pivot);

                do {
                    j--;
                } while (array[j] > pivot);

                if (i >= j) {
                    return i;
                }

                swapElements(array, i, j);

            }

        }
            
    }

}
