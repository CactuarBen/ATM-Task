

public class Client {
    //String name;
    double balance;
    double maxBalance = 25000.0; // less than ATM allows daily for a test case

    public Client(String name, double balance) {
        //this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getMaxBalance() {
        return maxBalance;
    }
}
