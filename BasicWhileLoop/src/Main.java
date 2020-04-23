import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        long input = scanner.nextLong();
        long sum = 0, min = input, max = input;
        boolean isPrimeNumber;

        while(input != 0) {

            isPrimeNumber = true;

            sum += input;
            min = Math.min(min, input);
            max = Math.max(max, input);

            for (int i = 2; i <= input / 2; ++i) {
                if (input % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber && input != 1 && input != -1)
                System.out.println(input + " is a prime number");

            System.out.print("Insert a number: ");
            input = scanner.nextLong();
        }

        System.out.println("Your sum is: " + sum);
        System.out.println("Your min is: " + min);
        System.out.println("Your max is: " + max);
        scanner.close();
    }

}
