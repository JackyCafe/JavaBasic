package B21;

public class Worker extends Employee{
    int monthlyPayment;
    int jobPayment;

    public Worker(String name,int monthlyPayment, int jobPayment) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.jobPayment = jobPayment;
    }
    @Override
    protected   int getPayment(){
        return this.jobPayment+this.monthlyPayment;
    }

    @Override
    protected int getBonus(){
        return (int)(1.1*(monthlyPayment+jobPayment));}

    @Override
    public String toString() {
        return super.toString();
    }
}
