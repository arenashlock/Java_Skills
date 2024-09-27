import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    static Scanner userInput = new Scanner(System.in);

    public static int search(int[] array, int start, int end, int target) {
        int middle = start + ((end - start) / 2);

        if(array[middle] == target) {
            return middle;
        }

        else if((end - start) != 0) {
            if(target < array[middle]) {
                return search(array, start, middle - 1, target);
            }

            // target > array[middle]
            else if(target > array[middle]) {
                return search(array, middle + 1, end, target);
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        // Sample (sorted) array for showing the function of binary search
        int[] sortedArray = {2, 6, 13, 32, 45, 73, 101, 251, 721};

        // Introduction to program
        System.out.println("\nThis program gives an example of binary search in Java (on an already sorted array).\n\nBelow is the sample array I'll be working with:\n" + Arrays.toString(sortedArray) + "\n");

        System.out.print("What number would you like to search for? (Doesn't have to be in the array): ");
        int target = userInput.nextInt();

        int result = search(sortedArray, 0, (sortedArray.length - 1), target);

        if(result < 0) {
            System.out.println("\nYour number was not found in the array.\n");
        } else {
            System.out.println("\nYour number was found at index " + result + ".\n");
        }

        userInput.close();
    }
}