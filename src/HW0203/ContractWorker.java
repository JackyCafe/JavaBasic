package HW0203;

import java.util.Date;

public class ContractWorker extends Worker{
    Date fromDate;
    Date toDate;
    private Date now;

    public ContractWorker(String name, int monthPayment, int jobPayment,Date fromDate,Date toDate) {
        super(name, monthPayment, jobPayment);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    public int getBonus(){
        return monthlyPayment+jobPayment;}


    public boolean isContractExpired(Date now){
        this.now = now;
        return !(fromDate.getTime()<now.getTime() && toDate.getTime()>now.getTime());
    }

    @Override
    public String toString() {
        return super.toString()+",contractExpired:"+isContractExpired(now);
    }
}
