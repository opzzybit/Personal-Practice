import java.util.Scanner;
public class Factorial{

    public static void main(String [] opzzy){
    
        Scanner inputCollector = new Scanner (System.in);
  
        System.out.println("Enter any number :");
        int userinput = inputCollector.nextInt();

        System.out.println();
        System.out.println("THE FACTORIAL OF THE NUMBER  ");     
        for (int index = 1 ; index <= userinput; index ++){
              System.out.println(index);
        }
    }
}
  
