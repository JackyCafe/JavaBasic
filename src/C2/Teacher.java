package C2;

public class Teacher extends Empolyee {
    protected int basicPayment;
    protected int studyPayment;
    protected int otPayment;
    protected int overTime;

    public Teacher(String name, int basicPayment, int studyPayment, int otPayment, int overTime) {
        this.name = name;
        this.basicPayment = basicPayment;
        this.studyPayment = studyPayment;
        this.otPayment = otPayment;
        this.overTime = overTime;
    }

    @Override
    public int getPayment() {
        return basicPayment+studyPayment+otPayment*overTime;
    }

    @Override
    public int getBonus() {
        return (int)(1.2*(basicPayment+studyPayment));
    }

    @Override
    public String toString() {
        return "Name:"+getName()+",Salary:"+getPayment()+",Bonus:"+getBonus();
    }
}
