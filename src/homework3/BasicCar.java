package homework3;

public class BasicCar extends Car {
    private Engine eng;
    private Aircond aircond;
    public BasicCar(int cc,String air_cond){
        this.eng = new Engine(cc);
        this.aircond = new Aircond(air_cond);

    }

    public double getCost(){
        return this.eng.getCost()+this.aircond.getCost()+5000;
    }
    public double getPrice(){
        return (int)(1.2*getCost());
    }

}
