import java.util.Random;
import java.util.Arrays;

class BinarySearch {
    private static final int evenLength = 10;
    private static final int oddLength = 11;

    public static void main(String args[]) {
        Random randomArrayElement = new Random(System.currentTimeMillis());

        // Introduction to program
        System.out.println("This program gives an example of binary search in Java (on an already sorted array)\n");


        
        // Create a random, sorted array of even length
        int[] evenArray = new int[evenLength];
        for(int i = 0; i < evenLength; i++) {
            if(i == 0) {
                evenArray[i] = randomArrayElement.nextInt(10);
            } else {
                evenArray[i] = evenArray[i - 1] + randomArrayElement.nextInt(10);
            }
        }

        System.out.println("EVEN\nThis is the random array: " + Arrays.toString(evenArray));



        // Create a random, sorted array of even length
        int[] oddArray = new int[oddLength];
        for(int i = 0; i < oddLength; i++) {
            if(i == 0) {
                oddArray[i] = randomArrayElement.nextInt(10);
            } else {
                oddArray[i] = oddArray[i - 1] + randomArrayElement.nextInt(10);
            }
        }

        System.out.println("ODD\nThis is the random array: " + Arrays.toString(oddArray));
    }
}