package HW0203;

public class Teacher extends Employee{
    protected int basicPayment;
    protected int studyPayment;
    protected int otPayment;
    protected int overtime;

    public Teacher(String name,int basicPayment, int studyPayment, int otPayment, int overtime) {
        this.name = name;
        this.basicPayment = basicPayment;
        this.studyPayment = studyPayment;
        this.otPayment = otPayment;
        this.overtime = overtime;
    }

    public int getPayment(){
        return this.basicPayment+this.studyPayment+this.otPayment*this.overtime;

    }

    public int getBonus(){
        return (int)(1.2*(basicPayment+studyPayment));
    }


}
