import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many test cases: ");
        int t = scanner.nextInt();

        if (t >= 1 && t <= 100) {
            getDates(t);
        } else {
            System.out.println("Out of test range 1-100");
        }
        scanner.close();
    }

    public static String calculateDay(int date, int month, int year) {

        boolean isLeapYear = isLeapYear(year);

        System.out.println("Is leap year?: " + isLeapYear);

        return date + " " + month + " " + year;
    }

    public static boolean isLeapYear(int year) {

        return ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));

    }

    public static void getDates(int t) {

        Scanner scanner = new Scanner(System.in);

        List<String> storedDays = new ArrayList<>();
        int testCase = 0;

        while (testCase != t) {
            System.out.print("Date: ");
            int date = scanner.nextInt();

            System.out.print("Month: ");
            int month = scanner.nextInt();

            System.out.print("Year ");
            int year = scanner.nextInt();

            storedDays.add(calculateDay(date, month, year));

            testCase++;
        }

        for(String date : storedDays) {
            System.out.println(date);
            System.out.println();
        }
    }
}
