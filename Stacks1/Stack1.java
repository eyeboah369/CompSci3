import java.util.Random;    //import random class for number generation

public class Stack1 {
    
    
    public static void main(String[] args) {
        
        int[] random = new int[30];
        int randomNum = (int)(Math.random() * 99 + 1);
        
        
        for (int i = 0; i >= random.length; i++) {  //loop to generate array of random integer numbers
            random[i] = randomNum;
           System.out.print(random[i]+ " ");    
        }
        
           Stack<Integer> stack1 = new Stack<Integer>(); //initialization of stack 1
           int num = 0; //integer to iterate through array of random numbers 
           
        while(random[num] % 2 == 0) {   //pushing the random values into the stack
           stack1.push(random[num]); 
           num++;
           System.out.print(stack1.getTop());
        }
        
        System.out.println();
        
        
        Stack<Integer> stack2 = new Stack<Integer>(); //initialization of stack 2
 
        int num1 = 0; //second integer to iterate through random number array
        while(random[num1] % 2 == 1) {
           stack2.push(random[num1]); 
           num1++;
           System.out.print(stack2.getTop());
        }
        
        
        
        
        
        
        
    }
    
}
    