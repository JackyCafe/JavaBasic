package D3;

public class SuperLuxCar extends LuxCar {
    Sound snd;
    public SuperLuxCar(int cc, String air_cond) {
        super(cc, air_cond);
        snd = new Sound();
    }

    @Override
    public double getCost() {
        return super.getCost()+ snd.getCost();
    }

    public boolean isExpensive(LuxCar luxCar){
        return this.getCost()>= luxCar.getCost();
    }
}
