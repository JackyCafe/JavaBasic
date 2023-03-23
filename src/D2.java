import java.util.Scanner;

public class D2 {
    public static boolean isLegal(String str){
        boolean is_legical = true;

        if(str.length()!=4) return false;
        else{
            //5566
            //i=0, c= 5
            //i=1, c= 5
            //i=2. c = 6
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i); //  566
                String new_str= str.substring(i+1,str.length());
//                System.out.println(new_str);
                if(new_str.indexOf(c)>=0){return false;}
            }
            return is_legical;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        boolean isOK =  isLegal(line);
        if(isOK){
            System.out.printf("%s is legal.",line);
        }else{
            System.out.printf("%s is illegal.",line);
        }
    }

}
