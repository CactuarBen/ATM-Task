import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // this is a hypothetical ATM simulation

        Client clientOne = new Client("James", 100000.0); // normal case, should return array with banknotes
        Client clientTwo = new Client("James", 100.0); //client with insufficient funds
        Client clientThree = new Client("James", 10000.0); //client with request less than 200
        Client clientFour = new Client("James", 30000.0); //client with lower maximum limitation
        Client clientFive = new Client("James", 100000.0); //client with a transaction >50000

        //System.out.println("Initial balance: "+ client/*number*/.getBalance());

        returnCash(Bank.withdrawCash(clientOne, 7400)); // success, returns banknotes
        returnCash(Bank.withdrawCash(clientTwo, 5000)); // failure, low balance
        returnCash(Bank.withdrawCash(clientThree, 199)); // failure, amount <200
        returnCash(Bank.withdrawCash(clientFour, 100001)); // failure, transaction exceeds ATM maximum
        returnCash(Bank.withdrawCash(clientFive, 26000)); // failure, transaction exceeds personal maximum

    }

    public static void returnCash(ArrayList<Integer> withdrawal){
        if (withdrawal.isEmpty()){
            System.out.println("Returning to the previous screen...");
        } else {
            System.out.println("Transaction was successful!");
            System.out.println(withdrawal); // prints out the ArrayList of all banknotes
            for (Integer banknote : withdrawal){ //
                System.out.println(banknote);
            }
        }
    }


}
