import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.*;

public class FactorialStream {
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x * y);
    }

    public static long c(int x, int y) {
        long greater, minor;
        if (x > y) {
            greater = Long.valueOf(x);
            minor = Long.valueOf(y);
        } else {
            greater = Long.valueOf(y);
            minor = Long.valueOf(x);
        }

        long sum = greater + minor;

        long result = 1;
        for (long i = sum; i > greater; i--) {
            result = result * i;
        }

        long minorFactorial = factorialUsingStreams((int)minor);

        return result/minorFactorial;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an integer number: ");
                int x = scanner.nextInt();

                System.out.print("Please enter an integer number: ");
                int y = scanner.nextInt();


                long result = c(x, y);
                System.out.printf("Result: c(%d, %d) = %d%n",
                    x, y, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",
                    inputMismatchException);
                scanner.nextLine();
                System.out.printf(
                    "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n",
                    arithmeticException);
                System.out.printf(
                    "Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);
    }
}
