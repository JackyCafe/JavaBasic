package C2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class YH {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for(int i =0;i<num;i++) {
            String lines = sc.nextLine();
            String[] e = lines.split(",");
            int type = toInt(e[0]);
            switch (type) {
                case 1:
                    Teacher t = new Teacher(e[1], toInt(e[2]), toInt(e[3]), toInt(e[4]), toInt(e[5]));
                    System.out.println(t);
                    break;

                case 2:
                    Worker w = new Worker(e[1], toInt(e[2]), toInt(e[3]));
                    System.out.println(w);
                    break;
                case 8:
                    Date now = new Date(System.currentTimeMillis());

                    ContactTeacher ct = new ContactTeacher(e[1], toInt(e[2]), toInt(e[3]), toInt(e[4])
                            , toInt(e[5]), toDate(e[6]), toDate(e[7]));
                    ct.isContractExpired(now);
                    System.out.println(ct);
                    break;


            }
        }
    }

    public static int toInt(String item) {
        return Integer.parseInt(item);
    }

    public static Date toDate(String date) throws ParseException {
        return new SimpleDateFormat("yyyy/MM/dd").parse(date);
    }
}
