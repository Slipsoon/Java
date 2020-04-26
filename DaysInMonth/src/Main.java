public class Main {

    public static void main(String[] args) {

//        NumberOfDayjsInMonth.isLeapYear(-1600);
//        NumberOfDayjsInMonth.isLeapYear(1600);
//        NumberOfDayjsInMonth.isLeapYear(2017);
//        NumberOfDayjsInMonth.isLeapYear(2000);

        System.out.println(NumberOfDayjsInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDayjsInMonth.isLeapYear(1600));
        System.out.println(NumberOfDayjsInMonth.isLeapYear(2017));
        System.out.println(NumberOfDayjsInMonth.isLeapYear(2000));

        System.out.println(NumberOfDayjsInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDayjsInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDayjsInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDayjsInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDayjsInMonth.getDaysInMonth(1, -2020));
    }
}

