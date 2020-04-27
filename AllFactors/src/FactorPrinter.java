public class FactorPrinter {

    public static void printFactors(int number) {

        String output = "";

        if (number < 1)
            output = "Invalid Value";

        int divider = 1;

        while (divider <= number) {

            if (number % divider == 0) {
                output += divider + " ";
            }

            divider++;
        }

        System.out.println(output);
    }
}
