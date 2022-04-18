package HW0203;

public class Worker extends Employee{
       protected int monthlyPayment;
       protected int jobPayment;

    public Worker(String name,int monthPayment, int jobPayment) {
        this.name = name;
        this.monthlyPayment = monthPayment;
        this.jobPayment = jobPayment;
    }

    @Override
    public  int getPayment(){
        return this.jobPayment+this.monthlyPayment;
    }

    @Override
    public int getBonus(){
        return (int)(1.1*(monthlyPayment+jobPayment));}

    @Override
    public String toString() {
        return super.toString();
    }

}
