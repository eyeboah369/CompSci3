import java.util.Random;

public class BankAccounts {
 
    public static void main(String[]args) {
        
        double[] bank = new double[30]; //initializing of array to store objects
        double random = (double)(Math.random() * 999999 + 0);   //creation of variable to generate random objects
        BankAccount account1 = new BankAccount(random);     //initializing of the bank account object
        int sum = 0;        //collection of sum for the smaller values
        for(int i = 0; i < 15; i++) {   //loop to iterate through the 30 accounts and assign values accordningly
          
            
            if(bank[i] < 500000) {      //determines if random value generated is less than 500,000
                  bank[i] = account1.deposit(random);
                  sum += bank[i];       //sum of the smaller values
            }
        }
        
        //ran into the issue of "void cannot be converted to double", not entirelty sure how to solve this issue, but rest of code is functional
        
        BankAccount account2 = new BankAccount(random);     //initialization of the second bank account object
        int sum1 = 0;       //collection of sum for the larger values
       for(int i = 15; i <= bank.length; i++) {     //loop to iterate through the second half of the 30 accounts
           if(bank[i] > 500000) {       //determines if random value generated is more than 500,000
            bank[i] = account2.deposit(random);
            sum1 += bank[i];    //sum of the larger values
        }
    
         }
         System.out.print("smaller: " + sum);
         System.out.print("larger: " + sum1);
}
}