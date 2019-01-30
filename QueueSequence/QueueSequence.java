import java.util.*;

public class QueueSequence {
    
    public static void main (String[] args) {
    
        
        
        
        
        int[] array = new int[30];
        
    for(int i = 0; i <=15; i++) {
        Queue2<Integer> queue1 = new Queue2<Integer>();
        Random random = new Random();
            int balance = random.nextInt(100);
            array[i] = balance;
            
            //System.out.print(array[i] + " ");
            if(array[i] % 2 != 0) {
            queue1.enqueue(array[i]);
            System.out.print("odd values: " + queue1.getFrontData() + " ");
            
        }
        
    
    }
    System.out.println();
    for(int i = 0; i <=15; i++) {
        Queue2<Integer> queue2 = new Queue2<Integer>();
        Random random = new Random();
        int balance = random.nextInt(100);
            array[i] = balance;
        if(array[i] % 2 == 0){
        queue2.enqueue(array[i]);
        System.out.print("even values: " + queue2.getFrontData() + " ");
        }
       
    }
    System.out.println();
}
}

