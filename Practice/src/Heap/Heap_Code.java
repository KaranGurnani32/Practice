package Heap;

public class Heap_Code {

    // We take an integer array of name data
    int[] data;

    // A constructor is made where data array has zero elements
    public Heap_Code(int[] data) {
        data = new int[0];
    }

    public void insert(int input) {
        //increase size of array - we make new array called newData
        // we put the elements of data array into newData array
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        // we put input as last element of newData array
        newData[data.length] = input;

        data = newData;

        // we check if its max heap or not
        heapCorrectionUpward();
    }

    private void heapCorrectionUpward() { // max heap
        print();
        int childIndex = data.length - 1;

        while (childIndex != 0) {
            int parentIndex = (childIndex - 1)/ 2;
            if (data[parentIndex] < data[childIndex]) {
                int temp = data[parentIndex];
                data[parentIndex] = data[childIndex];
                data[childIndex] = temp;
                childIndex = parentIndex;
            } else {
                return;
            }
        }
    }

    public int remove() {
        if (this.data.length <= 0) {
            System.out.println("Empty array");
            return -404;
        }

        int lastIndex = this.data.length - 1;

        int elementToDelete = this.data[0];

        int temp = this.data[0];
        this.data[0] = this.data[lastIndex];
        this.data[lastIndex] = temp;

        int[] newData = new int[lastIndex];
        for (int i = 0; i < newData.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;

        heapCorrectionDownward();
        return elementToDelete;
    }

    private void heapCorrectionDownward() {
    }

    private void print() {
        System.out.println("--------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + ", ");
        }
        System.out.println("");
        System.out.println("--------------");
    }
}
