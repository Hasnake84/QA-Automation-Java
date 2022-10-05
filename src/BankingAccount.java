
class BankingAccount {

    public int balance=0;

    public void deposit(int sum) {
        balance = balance + sum;
    }

    public void withdrawal(int sum) {
        balance = balance - sum;
    }
}

