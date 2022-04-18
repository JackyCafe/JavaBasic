import java.util.Scanner;

public class MyCal {
    public static void main(String[] args) {
        int[] dayinmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        int day = 0;
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        for (int i = 1998; i < year; i++) {
            if (isLeaper(i)) {
                dayinmonth[1] = 29;
            } else {
                dayinmonth[1] = 28;
            }
            for (int d : dayinmonth) {
                day += d;
            }
        }
        if (isLeaper(year)) {
            dayinmonth[1] = 29;
        } else {
            dayinmonth[1] = 28;
        }
        for (int j = 0; j < month - 1; j++) {
            day += dayinmonth[j];
        }
        int dd = (day + 4) % 7;

        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t","日", "一", "二", "三", "四", "五", "六" );
        System.out.println();
        int temp = 0;
        if (dd > 0) {
            for (int x = 0; x < dd ; x++) {
                System.out.printf("%s\t", "");
            }

            for (int x = dd ; x < 7; x++) {
                temp++;
                System.out.printf("%s\t", "" + temp);
            }System.out.println();
        }

        for (int x = temp + 1; x <= dayinmonth[month - 1]; x++) {
            System.out.printf("%s\t", x);
            if ((x - temp) % 7 == 0) System.out.println();
        }
    }

    public static boolean isLeaper(int year) {
        boolean is_lunar = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    is_lunar = true;
                } else {
                    is_lunar = false;
                }
            } else {
                is_lunar = true;
            }
        } else {
            is_lunar = false;
        }


        return is_lunar;
    }
}
