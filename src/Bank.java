import java.util.ArrayList;

public class Bank {
    public static ArrayList<Integer> withdrawCash(Client client, double amount) {
        double removedAmount = amount; // saved unaltered value, deducted in the end for the safety reason
        
        if (amount > 50000) {  // checks if the minimum for transaction is >200
            System.out.println("The amount for the ATM can't exceed 50.000");
            return new ArrayList<>(); // returns an empty ArrayList, that throws an error
        }
        if (amount > client.getMaxBalance()) {  // checks the maximum balance for daily transaction
            System.out.println("The amount exceeds your allowed daily maximum");
            return new ArrayList<>(); // returns an empty ArrayList, that throws an error
        }
        if (client.getBalance() - amount < 0){ // checks if there is sufficient balance
            System.out.println("Insufficient funds");
            return new ArrayList<>(); // returns an empty ArrayList, that throws an error
        }
        if (amount < 200) {  // checks if the minimum for transaction is >200
            System.out.println("Minimum is 200, please select a bigger amount");
            return new ArrayList<>(); // returns an empty ArrayList, that throws an error
        }

        ArrayList<Integer> banknotes = new ArrayList<>(); // an ArrayList to represent a physical number of banknotes

        int numberOf2000Banknotes = (int)(amount / 2000);
        System.out.println("Number of 2000: "+ numberOf2000Banknotes);
        amount = amount - (2000 * numberOf2000Banknotes);
        //method that returns a number of numberOf2000Banknotes for client
        for (int i = 0; i < numberOf2000Banknotes; i++){
            banknotes.add(2000);
        }

        int numberOf1000Banknotes = (int)(amount/1000);
        System.out.println("Number of 1000: "+ numberOf1000Banknotes);
        amount = amount - (1000 * numberOf1000Banknotes);
        //method that returns a number of numberOf1000Banknotes for client
        for (int i = 0; i < numberOf1000Banknotes; i++){
            banknotes.add(1000);
        }

        int numberOf500Banknotes = (int)(amount/500);
        amount = amount - (500 * numberOf500Banknotes);
        System.out.println("Number of 500: "+ numberOf500Banknotes);
        //method that returns a number of numberOf500Banknotes for client
        for (int i = 0; i < numberOf500Banknotes; i++){
            banknotes.add(500);
        }

        int numberOf200Banknotes = (int)(amount/200);
        System.out.println("Number of 200: "+ numberOf200Banknotes);
        //method that returns a number of numberOf200Banknotes for client
        for (int i = 0; i < numberOf200Banknotes; i++){
            banknotes.add(200);
        }

        client.setBalance(client.getBalance()-removedAmount); //updating the balance
        
        return banknotes;
    }
}


