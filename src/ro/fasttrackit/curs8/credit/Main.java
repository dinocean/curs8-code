package ro.fasttrackit.curs8.credit;

public class Main {
    public static void main(String[] args) {
        CreditBank ING = new CreditBank();
        ING.setDepositMoney(800);
        ING.setDepositMoney(1290);
        System.out.println("Money that you deposit. " + ING.getDepositedMoney());
        ING.setWithdrawMoney(905);
        ING.setWithdrawMoney(493);
        System.out.println("Money that you withdraw. " + ING.getWithdrawMoney());
        System.out.println("Money left: " + ING.totalMoney());
        System.out.println("-------------------------------------");

        CreditBank BT = new CreditBank();
        BT.setDepositMoney(576);
        BT.setDepositMoney(863);
        System.out.println("Money that you deposit. " + ING.getDepositedMoney());
        BT.setWithdrawMoney(357);
        BT.setWithdrawMoney(425);
        System.out.println("Money that you deposit. " + ING.getWithdrawMoney());
        System.out.println("Money left: " + BT.totalMoney());
        System.out.println("-------------------------------------");

        CreditBank BRD = new CreditBank();
        BRD.setDepositMoney(682);
        BRD.setDepositMoney(921);
        System.out.println("Money that you deposit. " + ING.getDepositedMoney());
        BRD.setWithdrawMoney(724);
        BRD.setWithdrawMoney(123);
        System.out.println("Money that you withdraw. " + ING.getWithdrawMoney());
        System.out.println("Money left: " + BRD.totalMoney());
        System.out.println("-------------------------------------");
    }
}
