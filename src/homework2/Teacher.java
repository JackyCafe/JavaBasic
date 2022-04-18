package homework2;

public class Teacher extends Employee{
    private int basicPayment;
    private int studyPayment;
    private int otPayment;
    private int overtime;

    public Teacher(String name ,int basicPayment, int studyPayment, int otPayment, int overtime) {
        this.name = name;
        this.basicPayment = basicPayment;
        this.studyPayment = studyPayment;
        this.otPayment = otPayment;
        this.overtime = overtime;
    }

    @Override
    public int getPayment(){
        return this.basicPayment+this.studyPayment+this.otPayment*this.overtime;
    }

    @Override
    public int getBonus(){
        return (int)(1.2*(basicPayment+studyPayment));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
