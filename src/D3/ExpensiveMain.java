package D3;

public class ExpensiveMain {
    public static void main(String[] args) {
        SuperLuxCar car1 = new SuperLuxCar(2000,"auto");
        System.out.println("Car1 cost: " + car1.getCost());
        System.out.println("Car1 price: " + car1.getPrice());
        LuxCar car2 = new LuxCar(2000,"auto");
        System.out.println("Car2 cost: " + car2.getCost());
        System.out.println("Car2 price: " + car2.getPrice());
        System.out.println("Is Car1 more expensive than Car2: " + car1.isExpensive(car2));
    }
}
