abstract public class Sort {

    // abstract methods
    abstract public int[] sort(int[] array, boolean descending);

    // helper methods
    public void printArray(int[] array) {
        System.out.print("{");
        for(int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + "}");
    }

    public int[] swapElements(int[] array, int index_1, int index_2) {
        int temp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = temp;
        return array;
    }
}