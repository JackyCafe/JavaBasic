package C21;

public class Employee {
    protected String name;
    public String getName(){return  this.name;}
    public int getPayment(){ return 0;}
    public int getBonus(){return  0;}

    @Override
    public String toString() {
//        Name:James Chen,Salary:63575,Bonus:74400
        return "Name:"+getName()+",Salary:"+getPayment()+",Bonus:"+getBonus();
    }
}
