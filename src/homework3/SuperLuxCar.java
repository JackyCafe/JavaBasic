package homework3;

public class SuperLuxCar extends LuxCar{
    private Sound sound;
    public SuperLuxCar(int cc, String air_cond) {
        super(cc, air_cond);
        sound = new Sound();
    }

    @Override
    public double getCost() {
        return super.getCost()+sound.getCost();
    }

    public boolean isExpensive( LuxCar lc) {
        return this.getPrice()>lc.getPrice();
    }
}
