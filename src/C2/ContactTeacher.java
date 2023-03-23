package C2;

import java.util.Date;

public class ContactTeacher extends Teacher{
    Date fromDate;
    Date toDate;
    Date now;

    public ContactTeacher(String name, int basicPayment, int studyPayment, int otPayment, int overTime, Date fromDate,
                          Date toDate) {
        super(name, basicPayment, studyPayment, otPayment, overTime);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public int getBonus() {
        return basicPayment+studyPayment;
    }

    public boolean isContractExpired(Date date){
        now = date;
        return (date.getTime()>fromDate.getTime()) &&(date.getTime()<toDate.getTime());
    }

    @Override
    public String toString() {
        return super.toString()+",contractExpired:"+isContractExpired(this.now) ;
    }
}
