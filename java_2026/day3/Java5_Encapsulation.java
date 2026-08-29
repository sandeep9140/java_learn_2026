class BankAccount{
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance >= 0){
            this.balance=balance;
        }
    }
}
public class Java5_Encapsulation {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.setBalance(5000);
        System.out.println(account.getBalance());
    }
    
}
