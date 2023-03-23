package C21;


import java.util.Date;

public class ContractTeacher extends Teacher{
    Date fromDate;
    Date toDate;
    Date now;
    public ContractTeacher(String name, int basicPayment, int studyPayment, int otPayment, int overtime
            ,Date fromDate,Date toDate) {
        super(name, basicPayment, studyPayment, otPayment, overtime);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public int getBonus() {
        return this.basicPayment+this.studyPayment;
    }

    //合約失效
    public boolean isContractExpired(Date now){
        this.now = now;
        return !(fromDate.getTime()<now.getTime()&&toDate.getTime()>now.getTime());
    }

    @Override
    public String toString() {
        return super.toString()+",contractExpired:"+isContractExpired(now);
    }
}
