package ro.fasttrackit.curs8.credit;

public class CreditBank {

    private String bank;
    private int depositMoney;
    private int withdrawMoney;


    public int getDepositedMoney(){
        return depositMoney;
    }

    public int getWithdrawMoney(){
        return withdrawMoney;
    }

    public int totalMoney(){
        return depositMoney - withdrawMoney;
    }

    public void setDepositMoney(int deposit){
        this.depositMoney = depositMoney + deposit;
    }

    public void setWithdrawMoney(int withdraw){
        this.withdrawMoney = this.withdrawMoney + withdraw;
    }

}
