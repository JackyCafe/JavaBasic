package D3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int capacity;
    List<Car> cars= new ArrayList();
    //容量
    public  Warehouse(int capacity){
        this.capacity = capacity;
    }

    public void addCar(Car newCar){
        cars.add(newCar);
    }

    //剩餘的容量
    public int getCapacity(){
        return capacity-cars.size();
    }

    public int getTotalCost(){
        int cost = 0;
        for ( Car car: cars) {
            cost+=car.getCost();
        }
        return cost;
    }
    public int getTotalPrice()
    {
        int price =0 ;
        for (Car car:cars) {
            price +=car.getPrice();
        }
        return price;
    }

}
