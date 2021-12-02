public class InsertionSort extends Sort{
    
    // insertion sort has an O(n) of n2, best case is n
    public int[] sort(int[] array, boolean descending) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            if(descending) {
                while (j >= 0 && array[j] < temp) {
                    array[j+1] = array[j];
                    printArray(array);
                    System.out.println("-----------------------------");
                    j--;

                }
            } else {
                while (j >= 0 && array[j] > temp) {
                    array[j+1] = array[j];
                    j--;
                }
            }
            array[j+1] = temp;
            
        }
        return array;
    }

}
