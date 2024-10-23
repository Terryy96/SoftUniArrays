import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean areIdentical = true;
        int index = -1;

        int[] array1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] array2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        // First, check if the lengths are the same
        if (array1.length != array2.length) {
            areIdentical = false;
            index = Math.min(array1.length, array2.length);
        } else {
            // If lengths are equal, compare each element
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areIdentical = false;
                    index = i;
                    break;
                }
                sum += array1[i]; // Sum the first array elements if they are identical so far
            }
        }

        // Print the appropriate result
        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + index + " index.");
        }

    }
}
