package ajpLAB;
import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create and initialize an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Calculate the sum of all even numbers in the list
        int sum = calculateSumOfEvenNumbers(numbers);

        // Print the result
        System.out.println("Sum of even numbers: " + sum);
    }

    // Method to calculate the sum of all even numbers in a list
    public static int calculateSumOfEvenNumbers(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            // Check if the number is even
            if (number % 2 == 0) {
                sum += number; // Add the even number to the sum
            }
        }
        return sum;
    }
}
