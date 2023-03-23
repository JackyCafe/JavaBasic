package B3;

public class Sound {
    private int cost;
    public Sound(){
        cost = 2000;
    }
    public int getCost(){
        return this.cost;
    }

    @Override
    public String toString() {
        return "Sound: "+getCost();
    }
}
