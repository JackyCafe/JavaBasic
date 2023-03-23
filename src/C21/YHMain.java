package C21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class YHMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[5];
        for(int i=0;i<num;i++){
            String lines = sc.nextLine();
            String[] p = lines.split(",");
            switch (p[0]){
                case "1": employees[i] = new Teacher(p[1],toInt(p[2]),toInt(p[3]),toInt(p[4]),toInt(p[5]));
                          break;
                case  "2": employees[i] = new Worker(p[1],toInt(p[2]),toInt(p[3])); break;
                case  "8": employees[i] = new ContractTeacher(p[1],toInt(p[2]),toInt(p[3]),toInt(p[4]),toInt(p[5]),toDate(p[6]),toDate(p[7]));
                      ((ContractTeacher) employees[i]).isContractExpired(new Date());
                    break;
                case  "9":employees[i] = new ContractWorker(p[1],toInt(p[2]),toInt(p[3]),toDate(p[4]),toDate(p[5]));
                    ((ContractWorker) employees[i]).isContractExpired(new Date());
                    break;
            }

        }
        for (Employee  e: employees) {
            System.out.println(e);
        }
    }

    public static int toInt(String str){
        return Integer.valueOf(str);
    }

    public static Date toDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return  sdf.parse(str);
    }
}
