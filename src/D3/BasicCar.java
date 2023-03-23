package D3;

public class BasicCar extends Car {
    private Engine eng;
    private Aircond aircond;

    public BasicCar(int cc,String aircod){
        eng = new Engine(cc);
        aircond = new Aircond(aircod);
    }

    public double getCost(){
        return eng.getCost()+aircond.getCost()+5000;
    }
    public double getPrice(){
        return (int)(1.2*getCost());
    }

    @Override
    public String toString() {
//        System.out.println("Basic car cost: " + bc.getCost());
//        System.out.println("Basic car price: " + bc.getPrice());
        return "Basic car cost: "+getCost()+"\nBasic car price:"+getPrice();
    }
}
