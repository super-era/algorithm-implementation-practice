public class SelectionSort extends Sort{
    
    // selection sort always has an O(n) of n2
    public int[] sort(int[] array, boolean descending) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; 
            for (int j = i + 1; j < array.length; j++) {
                if(descending) {      // descending order
                    if(array[j] > array[index]) {       // comparision signs swapped in comparison to insertion sort and bubble sort
                        index = j;      // move the bigger number backwards
                    }
                } else {    // ascending order
                    if(array[j] < array[index]) {
                        index = j;      // move the bigger number forwards
                    }
                }
            }
            swapElements(array, i, index);
            
        }
        return array;
    }
}
