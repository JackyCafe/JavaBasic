import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        String result;
        boolean isPrime = true;

        for (int i = 1; i < 100; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            System.out.print(isPrime ? i + "*\t" : i+"\t");
            if (i % 10 == 0)
                System.out.println();

        }

    }
}
