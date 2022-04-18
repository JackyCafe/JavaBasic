package homework3;

public class Engine {
    private int cc;
    private int cost;

    public Engine(int cc) {
        this.cc = cc;
        switch (cc) {
            case 1600:
                this.cost = 20000;
                break;
            case 2000:
                this.cost = 25000;
                break;
        }
    }


    public int getCost() {
        return  this.cost;
    }
}