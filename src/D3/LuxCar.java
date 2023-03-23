package D3;

public class LuxCar extends Car {
    private Engine eng;
    private Aircond aircond;
    public LuxCar(int cc,String air_cond){
        eng = new Engine(cc);
        aircond = new Aircond(air_cond);
    }

    public double getCost(){
        return eng.getCost()+aircond.getCost()+10000;
    }
    public double getPrice(){
        return (int)(1.2*getCost());
    }
    @Override
    public String toString() {

        return "Lux car cost: "+getCost()+"\nLux car price:"+getPrice();
    }
}
