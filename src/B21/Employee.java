package B21;

public class Employee {
    String name;
    public String getName(){
        return "";

    }
    protected   int getPayment(){
        return 0;
    }

    protected int getBonus(){return 0;}

    @Override
    public String toString() {
        return "Name:"+this.name+",Salary:"+getPayment()+",Bonus:"+getBonus();
    }

}
