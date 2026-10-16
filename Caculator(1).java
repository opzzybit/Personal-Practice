import java.util.Scanner;

    public class Caculator{ 

      public static void main (String [] args){
        
        Scanner input = new Scanner (System.in);


   System.out.println("Enter first number ;");
      int firstnumber = input.nextInt();

    System.out.println("Enter mathematical operator ;");
      int  operator = input.nextInt();

     System.out.println("Enter second number ;");
      int secondnumber = input.nextInt();

 int answer = firstnumber + operator + secondnumber;

 System.out.println("ANSWER = " + answer);

}
  }
