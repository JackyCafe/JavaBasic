package B2;

public class Teacher extends Empolyee{
    private int basicPayment;
    private int studyPayment;
    private int otPayment;
    private int overTime;

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

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
