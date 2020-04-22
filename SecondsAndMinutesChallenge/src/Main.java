public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        getDurationString(8, 9);
        getDurationString(8,40);
        getDurationString(16,4);
        getDurationString(250, 10);
        getDurationString(245,32);
        getDurationString(245,8);
        getDurationString(3842, 5);
        getDurationString(-5, 6);
        getDurationString(-8);

    }

    public static int getDurationString(int minutes, int seconds) {

        if ((minutes <= 0) || (seconds <= 0) || (seconds > 59)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }

        int hours = 0;

        if (minutes > 59) {
            hours = minutes / 60;
            minutes %= 60;
        }

        if (hours < 10) {
            if (minutes < 10) {
                if (seconds < 10) {
                    System.out.println("0" + hours + "h " + "0" + minutes + "m " + "0" + seconds + "s");
                } else {
                    System.out.println("0" + hours + "h " + "0" + minutes + "m " + seconds + "s");
                }
            } else if (seconds < 10) {
                System.out.println("0" + hours + "h " + minutes + "m " + "0" + seconds + "s");
            } else {
                System.out.println("0" + hours + "h " + minutes + "m " + seconds + "s");
            }
        } else if (minutes < 10) {
            if (seconds < 10) {
                System.out.println(hours + "h " + "0" + minutes + "m " + "0" + seconds + "s");
            } else {
                System.out.println(hours + "h " + "0" + minutes + "m " + seconds + "s");
            }
        } else if (seconds < 10) {
            System.out.println(hours + "h " + minutes + "m " + "0" + seconds + "s");
        } else {
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }

        return 0;

    }


    public static int getDurationString(int seconds) {

        if (seconds <= 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }

        int minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }
}
