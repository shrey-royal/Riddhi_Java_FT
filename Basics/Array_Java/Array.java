import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // int arr[]; // declaration
        // arr = new int[5]; // instantiation - allocating memory to array
        // int arr[] = new int[10];
        // String names[] = new String[10];

        // System.out.println("Enter the size of array: ");
        // int size = Integer.parseInt(System.console().readLine());

        // int arr[] = new int[size];  // declaration and instantiation

        //generating random elements for the array
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = (int)(Math.random()*100);
        // }

        // printing the array elements
        // System.out.println("Array elements are: " + Arrays.toString(arr));
        // System.out.println("Array elements are: ");
        // for (int i : arr) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();

        // int[] [] arr2d = new int[3][3];

        // generating random elements for the 2d array
        // for(int i=0; i<arr2d.length; i++) {
        //     for(int j=0; j<arr2d[i].length; j++) {
        //         arr2d[i][j] = (int)(Math.random()*100);
        //     }
        // }

        // printing the 2d array elements
        // System.out.println("2d Array elements are: ");
        // for (int[] is : arr2d) {
        //     System.out.println(Arrays.toString(is));
        // }


        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Original Array elements are: " + Arrays.toString(arr));


        // Arrays.sort(arr);
        // System.out.println("Array elements are: " + Arrays.toString(arr));\
        

        // int index = Arrays.binarySearch(arr, 50);
        // System.out.println("Index of 50 is: " + index);

        // int arr2[] = Arrays.copyOf(arr, 5);
        // System.out.println("Array elements are: " + Arrays.toString(arr2));

        // int arr2[] = Arrays.copyOfRange(arr, 2, 5);
        // System.out.println("Array elements are: " + Arrays.toString(arr2));

        // boolean isEqual = Arrays.equals(arr, arr2);
        // System.out.println("Arrays are equal: " + isEqual);

        int arr2[] = new int[10];
        Arrays.fill(arr2, 50);
        System.out.println("Array elements are: " + Arrays.toString(arr2));

        System.out.println("Hashcode of array is: " + Arrays.hashCode(arr2));
    }
}

/*
    Array is a collection of similar data type values.
    Array is a reference type data type.
    Array is a fixed size data structure.
    Array is a ordered collection of elements.
    Array is a object in java.
    Array is a container which holds fixed number of items.
    Array is a data structure where we store similar elements in a contiguous memory location.


    In java we have methods in Arrays class to perform operations on arrays.
    Arrays.sort() -> to sort the array elements.
    Arrays.toString() -> to print the array elements.
    Arrays.binarySearch() -> to search the element in the array.
    Arrays.copyOf() -> to copy the array elements.
    Arrays.copyOfRange() -> to copy the range of array elements.
    Arrays.equals() -> to check if two arrays are equal.
    Arrays.fill() -> to fill the array elements with a value.
    Arrays.hashCode() -> to get the hashcode of the array.
*/