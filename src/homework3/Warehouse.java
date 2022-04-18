package homework3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int capacity;
    private List<Car> cars;
    public Warehouse(int capacity){
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car newCar){
        cars.add(newCar);
    }

    public  int getTotalCost(){
        int cost = 0;
        for (Car c:cars){
            cost+=c.getCost();
        }
        return  cost;
    }

    public int getTotalPrice(){
        int price = 0;
        for (Car c:cars){
            price+=c.getPrice();
        }
        return  price;
    }

    public int getCapacity( ) {
        return capacity-cars.size();
    }



}
