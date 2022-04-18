public class MyMath {
    int[] a;


    public static float average(int[] a){
        float sum = 0;
        int count = 0;
        for(int v: a){
            sum +=v;
            count++;
        }
        return sum/count;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        float  average = MyMath.average(a);
        System.out.println(average);
    }


}
