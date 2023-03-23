package B21;

import java.util.Scanner;

public class YH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] param = sc.nextLine().split(" ");
        int M =  Integer.valueOf(param[0]);
        int N = Integer.valueOf(param[1]);

        for(int i = 0;i<M;i++){
            String[] lines = sc.nextLine().split(",");
            String name = lines[0];
            int basicPayment = Integer.valueOf(lines[1]);
            int studyPayment  = Integer.valueOf(lines[2]);
            int otPayment  = Integer.valueOf(lines[3]);
            int overtime = Integer.valueOf(lines[4]);
            Teacher t = new Teacher (name ,basicPayment,  studyPayment,  otPayment,  overtime);
            System.out.println(t);
        }
        for(int j = 0;j<N;j++){
            String lines =sc.nextLine();
            String[] params = lines.split(",");
            String name = params[0];
            int monthlyPayment = Integer.valueOf(params[1]);
            int jobPayment  = Integer.valueOf(params[2]);

            Worker worker = new Worker (name ,monthlyPayment,jobPayment);
            System.out.println(worker);
        }
    }
}
