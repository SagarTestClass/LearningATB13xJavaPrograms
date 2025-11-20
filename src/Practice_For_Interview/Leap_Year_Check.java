package Practice_For_Interview;

public class Leap_Year_Check {
    public static void main(String[] args) {
        int year = 2023;

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap);
    }
}