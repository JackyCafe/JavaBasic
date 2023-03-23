package A3;

public class Engine {
    private int cc;
    private int cost;
    public  Engine(int cc){
        this.cc = cc;
    }
    public int getCost(){
        switch (this.cc){
            case 1600: this.cost=20000;break;
            case 2000: this.cost=25000;break;
        }
        return this.cost;
    }

    @Override
    public String toString() {
        //1600cc Engine: 20000
        return cc+"cc Engine: "+getCost();
    }
}
