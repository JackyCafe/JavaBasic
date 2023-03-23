package B2;

import java.util.Scanner;

public class YH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int M = Integer.valueOf(lines[0]);
        int N = Integer.valueOf(lines[1]);

        for (int i=0;i<M;i++){
            String line1 = sc.nextLine();
            String[] param = line1.split(",");
            String name = param[0];
            int basicPayment= Integer.valueOf(param[1]);
            int studyPayment =  Integer.valueOf(param[2]);
            int otPayment = Integer.valueOf(param[3]);
            int overTime =  Integer.valueOf(param[4]);
            Teacher teacher = new Teacher(name,basicPayment,studyPayment,otPayment,overTime);
            System.out.println(teacher);
        }

        for (int j=0;j<N;j++){
            String line2 = sc.nextLine();
            String[] param = line2.split(",");
            String name = param[0];
            int monthlyPayment= Integer.valueOf(param[1]);
            int jobPayment =  Integer.valueOf(param[2]);

            Worker worker = new Worker(name,monthlyPayment,jobPayment);
            System.out.println(worker);
        }

    }
}
