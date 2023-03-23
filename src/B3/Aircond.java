package B3;

public class Aircond {
    private String air_contioner;
    private int cost;

    public Aircond(String air_contioner){
        this.air_contioner = air_contioner;
    }

    public int getCost() {
        switch (this.air_contioner)
        {
            case "auto": cost=12000; break;
            case "manual": cost=10000;break;
        }

        return cost;
    }

    @Override
    public String toString() {
        return air_contioner+" Aircon: "+getCost();
    }
}
