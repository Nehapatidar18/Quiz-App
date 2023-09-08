import java.util.*;

class Prime {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read five integers from input
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check and print prime numbers
        for (int num : numbers) {
            if (Prime.isPrime(num)) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
