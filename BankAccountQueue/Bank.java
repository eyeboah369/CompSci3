import java.util.*;

class bankAccount{

  int num;
  bankAccount(int num){
    this.num = num;
  }

}
//-------------------------------------------------------------------

public class Bank {

public static void main(String args[]) {
Random  randomNum = new Random();

int sum1 = 0;
int sum2 = 0;

Queue<bankAccount> poor = new LinkedList<>();

Queue<bankAccount> rich = new LinkedList<>();

 for(int i = 0; i < 30; i++) {

  int balance = randomNum.nextInt(1000000);

  bankAccount account = new bankAccount(balance);
  if (balance < 500000){
    poor.add(account);
    sum1 += balance;
  }

  else{

  rich.add(account);
  sum2 += balance;

    }
 }
 System.out.println(sum1);
 System.out.println(sum2);
}
}
