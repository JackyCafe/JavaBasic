package C2;

public class Worker extends Empolyee {
    protected int monthlyPayment;
    protected int jobPayment;

    public Worker(String name,int monthlyPayment, int jobPayment) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.jobPayment = jobPayment;
    }

    @Override
    public int getPayment() {
        return monthlyPayment+jobPayment;
    }

    @Override
    public int getBonus() {
        return (int)(1.1*(monthlyPayment+jobPayment));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
