package homework3;

public class Aircond {
    private String air_cond;
    private int cost;

    public  Aircond(String air_cond){
        this.air_cond = air_cond;
        switch (air_cond){
            case "auto": this.cost = 12000;break;
            case "manual":this.cost = 10000;break;
        }
    }

    public int getCost(){
        return  this.cost;
    }

}
