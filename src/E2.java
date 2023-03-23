import java.util.Scanner;

public class E2 {

    public static boolean isLegal(String str){
        boolean is_legical = true;

        if(str.length()!=4) return false;
        else{
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i); //  566
                String new_str= str.substring(i+1,str.length());
//                System.out.println(new_str);
                if(new_str.indexOf(c)>=0){return false;}
            }
            return is_legical;

        }

    }
    private static String checkAB(String guess, String ans) {
        int A = 0,B=0;
        // guess 1234
        // ans   1248
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==ans.charAt(i)){
                A++;
            }else{
                char c = guess.charAt(i);
                if(ans.indexOf(c)>0){
                    B++;
                }
            }

        }
        return A+"A"+B+"B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();
        String[] param = lines.split(" ");
        String guess = param[0];
        String ans = param[1];

        if(!isLegal(guess)||!isLegal(ans)){
            System.out.println("Wrong Input");
        }else{

            String result = checkAB(guess,ans);
            System.out.printf("%s %s: %s",guess,ans,result);
        }


    }


}
