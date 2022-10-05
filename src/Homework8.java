
public class Homework8 {
    public static void main(String[] args) {
        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500);
        myAccount.deposit(150);
        myAccount.deposit(35);
        if (myAccount.balance == 685) {
            System.out.println("Deposits are correct (685 expected):" + myAccount.balance);
        }
        //System.out.println("Current Balance = " + myAccount.balance);
        myAccount.withdrawal(40);
        //System.out.println("Current Balance = " + myAccount.balance);
        myAccount.withdrawal(120);
        //System.out.println("Current Balance = " + myAccount.balance);
    }
    }
