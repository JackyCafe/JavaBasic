package C21;

public class Worker extends Employee{
    protected int monthlyPayment;
    protected int jobPayment;

    public Worker(String  name ,int monthlyPayment, int jobPayment) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.jobPayment = jobPayment;
    }

    @Override
    public int getPayment() {
        return  this.monthlyPayment+this.jobPayment;
    }

    @Override
    public int getBonus() {
        return (int)1.1*getPayment();
    }
}
