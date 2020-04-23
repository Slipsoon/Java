import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("number a = ");
        int a = scanner.nextInt();

        System.out.print("number b = ");
        int b = scanner.nextInt();

        System.out.print("number c = ");
        int c = scanner.nextInt();

        scanner.close();

        showNumbersBetweenAAndB(a,b);
        showNumbersBetweenAAndBDivisibleByC(a,b,c);
        showFormNumbersSmallerThanB(a,b,c);
    }

    public static void showNumbersBetweenAAndB(int a, int b) {

        System.out.println();
        System.out.println("1. all integer numbers between " + a + " and " + b + ":");

        if (b > a) {
            for (int i = (a + 1); i < b; i++) {

                System.out.print(i + ", ");
            }
        } else if (a > b) {
            for (int i = (b + 1); i < a; i++) {

                System.out.print(i + ", ");
            }
        }

        System.out.println();
    }

    public static void showNumbersBetweenAAndBDivisibleByC(int a, int b, int c) {

        System.out.println();
        System.out.println("2. all integer numbers between " + a + " and " + b + " that are divisible by " + c + ".");

        if (c == 0) {
            System.out.println("Can't divide by 0");
        } else if (b > a) {
            for (int i = (a + 1); i < b; i++) {

                if (i % c == 0)
                    System.out.print(i + ", ");
            }
        } else if (a > b) {
            for (int i = (b + 1); i < a; i++) {

                if (i % c == 0)
                    System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void showFormNumbersSmallerThanB(int a, int b, int c) {
        System.out.println();
        System.out.println("3. numbers of the form a, a+c, a+2c, a+3c,... that are smaller than " + b + ".");

        int output = a;

        if (c == 0) {
            System.out.println("Can't divide by 0");
        } else if (output < b) {
            for (int i = 0; output < b; ++i) {

                output = a + (i * c);

                if (output < b)
                    System.out.print(output + ", ");
            }
        }
    }
}
