public class BubbleSort extends Sort{
    
    // bubble sort has an O(n) of n2. Best case (already sorted) is n.
    // compare adjacent elements; swap elements depending on size, continue until sorted
    public int[] sort(int[] array, boolean descending) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - (i + 1); j++) {
                if(descending) {
                    if(array[j] < array[j+1]) {
                        swapElements(array, j, j+1);
                    }
                } else {
                    if(array[j] > array[j+1]) {
                        swapElements(array, j, j+1);
                    }
                }
            }
        }

        return array;
    }
}
