package arrays;

public class Main {

    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a persons name
        String name = "Karan Gurnani";

        // Q: save five roll number
        int rol1 = 10;
        int rol2 = 20;
        int rol3 = 30;
        int rol4 = 40;
        int rol5 = 50;

        // An array is collection of data types
        // Syntax -
        // datatype[] variable_name = new datatype[size];
        // store five roll numbers

        int[] rolno = new int[5];

        //or directly
        int[] rolno2 = {10, 20, 30, 40, 50};

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialization - actual memory creation (object is being created in heap memory)



    }
}
