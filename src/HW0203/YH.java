package HW0203;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class YH {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Employee [] member = new  Employee[5];
        int num = sc.nextInt();
        Date now = new Date();
        sc.nextLine();
        for (int i =0;i<num;i++){
              String lines = sc.nextLine();
              String [] p = lines.split(",");
              switch (p[0]){
                  case "1": member[i]= new Teacher(p[1],toInt(p[2]),toInt(p[3]),toInt(p[4]),toInt(p[5])); break;
                  case "2": member[i]= new Worker(p[1],toInt(p[2]),toInt(p[3])); break;
                  case "8": member[i]= new ContractTeacher(p[1],toInt(p[2]),toInt(p[3]),toInt(p[4]),toInt(p[5])
                          ,toDate(p[6]),toDate(p[7]));
                            ((ContractTeacher) member[i]).isContractExpired(now);
                           break;
                  case "9": member[i]= new ContractWorker(p[1],toInt(p[2]),toInt(p[3]),toDate(p[4]),toDate(p[5]));
                            ((ContractWorker) member[i]).isContractExpired(now);
                        break;

              }
          }
        for (Employee e: member ) {
            System.out.println(e);
        }
    }

    public static int toInt(String str){
        return Integer.valueOf(str);
    }

    public static Date toDate(String str) throws ParseException {
        return sdf.parse(str);
    }
}
