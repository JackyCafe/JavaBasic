package B3;

public class CraMain {
    public static void main(String[] args) {
        BasicCar bc = new BasicCar(1600,"manual");
        System.out.println(bc);

        LuxCar luxc = new LuxCar(2000,"auto");
        System.out.println(luxc);
    }
}
