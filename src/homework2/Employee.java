package homework2;

public class Employee {
    String name;
    public String getName(){
        return "";

    }
    public  int getPayment(){
        return 0;
    }

    public int getBonus(){return 0;}

    @Override
    public String toString() {
        return "Name:"+this.name+",Salary:"+getPayment()+",Bonus:"+getBonus();
    }

}

