package B2;

public class Empolyee {
    protected String name;
    public String getName(){
        return "";
    }

    public int getPayment(){
        return 0;
    }
    public int getBonus(){
        return 0;
    }

    @Override
    public String toString() {
        return "Name:"+getName()+",Salary:"+getPayment()+",Bonus:"+getBonus();
    }
}
