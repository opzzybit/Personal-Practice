import java.util.Scanner;
public class EvenArray{
    public static void main(String [] args){
    
        int[] number = {0,0,0,0,0,};
        
        Scanner opzzy = new Scanner (System.in);
        
        
        int userInputNumber = 0;
        int numberAdd = 1;
        for (int adder = 1; adder <= number.length + 1; adder ++){
            System.out.println("Enter a number"+numberAdd+":");
            int userInput = opzzy.nextInt();
             userInputNumber += userInput;
             numberAdd += 1 ;
        }
        
        
        for (int index : userInputNumber){
            number = index;  
        }
        
        for (int index : number){
           if (index % 2 == 0); 
              System.out.println(index);
        }
    
    }
}
