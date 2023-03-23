package C2;

import java.util.Date;

public class ContactWorker extends Worker{
    Date fromDate;
    Date toDate;
    Date now;

    public ContactWorker(String name, int monthlyPayment, int jobPayment, Date fromDate, Date toDate) {
        super(name, monthlyPayment, jobPayment);
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.now = now;
    }

    @Override
    public int getBonus() {
        return monthlyPayment+jobPayment;
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
