package C21;

import java.util.Date;

public class ContractWorker extends Worker{
    Date fromDate;
    Date toDate;
    Date now;
    public ContractWorker(String name, int monthlyPayment, int jobPayment
            ,Date fromDate,Date toDate) {
        super(name, monthlyPayment, jobPayment);
        this.fromDate = fromDate;
        this.toDate = toDate;

    }

    @Override
    public int getBonus() {
        return monthlyPayment+jobPayment;
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
