public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10))
            return -1;

        int smallerNumber = Math.min(first, second);
        int i;

        for (i = smallerNumber; i > 1; i--) {

            if ((second % i == 0) && (first % i == 0))
                break;
        }

        return i;
    }
}
