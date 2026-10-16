import java.util.Scanner;
public class PlayerAttributes{
    public static void main (String [] args){
    
    FootballPlayer newAttribute = new FootballPlayer();
    FootballPlayer newAttribute2 = new FootballPlayer();
    
    String status = newAttribute.setName("Lionel");
    System.out.println();
    System.out.printf("THE NAME OF THE PLAYER: \n%s ",status);
    
    
    //THE INITIAL STATIS OF THE PLAYER
    newAttribute.setName("Messi");
    System.out.println(newAttribute.getaddName());
    
    System.out.println();
    newAttribute.setSkinColor("Fair");
    System.out.println("COMPLEXION: " + newAttribute.getaddComplexion());
    
    System.out.println();
    newAttribute.setAge(36);
    System.out.println("AGE: " + newAttribute.getTheAge() + " years old");
    
    System.out.println();
    newAttribute.setBodySize(28);
    System.out.println("BODYSIZE: " + newAttribute.getBodySizeStatus() + "kg");
    
    System.out.println();
    newAttribute.setHeight(6.7);
    System.out.println("HEIGHT: " + newAttribute.getaddHeight() + "feet");
    
    System.out.println();
    newAttribute.setIqRate(120);
    System.out.println("THE IQ: " + newAttribute.getaddIqRate() + "IQ");
    
    System.out.println();
    newAttribute.setSpeed(34.8);
    System.out.println("SPEED: " + newAttribute.getaddSpeed() + "km/h");
    
    System.out.println();
    newAttribute.setMuscularRate(250);
    System.out.println("MUSCULAR RATE: " + newAttribute.getaddMusculineRate() + "kg");
    
    System.out.println();
    newAttribute.setAgility(89);
    System.out.println("AGILITY RATE: " + newAttribute.getaddAgility() + " out of 100");
  
    System.out.println();
    newAttribute.setDefendingRate(52);
    System.out.println("DEFEND RATE: " + newAttribute.getaddDefendRate() + " out of 100");
  
    System.out.println();
    newAttribute.setDribbling(60);
    System.out.println("DRIBBLING RATE: " + newAttribute.getDribbling() + " out of 100");
  
    
    
    System.out.println();
    System.out.println("\tEDIT THE PLAYER (OR 'Yes' TO  EIXT TO THE GAME)");
    Scanner input = new Scanner(System.in);
    
    while(true){
    System.out.println("Enter option Yes or No :");
    String exitinput = input.nextLine();
    if (exitinput.equalsIgnoreCase("yes")){
        System.out.println("Back to game!!!!");
        break;
    }
    else{
        
        System.out.println("let go !!!");
    }
    
    
    System.out.println();
    System.out.println("Enter the player name:");
    String username = input.nextLine();
    newAttribute2.setName(username);
    
    System.out.println("Enter the complexion: ");
    String usercolor = input.nextLine();
    newAttribute2.setSkinColor(usercolor );
  
    System.out.println("Enter the age: ");
    int userAge = input.nextInt();
    newAttribute2.setAge(userAge);
    
    System.out.println("Enter the BodySize: ");
    int userBodySize = input.nextInt();
    newAttribute2.setBodySize(userBodySize);
  
    System.out.println("Enter the Height: ");
    double userHeight = input.nextDouble();
    newAttribute2.setHeight(userHeight);
  
    System.out.println("Enter the Player IQ: ");
    int userIq = input.nextInt();
    newAttribute2.setIqRate(userIq);
  
    System.out.println("Enter the Player Speed: ");
    double userSpeed = input.nextDouble();
    newAttribute2.setSpeed(userSpeed);
   
    System.out.println("Enter the Muscular Rate: ");
    int userMusculine = input.nextInt();
    newAttribute2.setMuscularRate(userMusculine);
   
    System.out.println("Enter the Agility Rate: ");
    int userAgility = input.nextInt();
    newAttribute2.setAgility(userAgility);
   
    System.out.println("Enter the Defend Rate: ");
    int userDefend = input.nextInt();
    newAttribute2.setDefendingRate(userDefend);
   
    System.out.println("Enter the Dribbling Rate: ");
    int userinput = input.nextInt();
    newAttribute2.setDribbling(userinput);
   
   System.out.println();
   System.out.println("\tNEW PLAYER UPDATED");
   System.out.println();
   System.out.printf("THE NEW PLAYER NAME: %s\n",newAttribute2.getaddName());
   System.out.println();
   System.out.println("COMPLEXION: " + newAttribute2.getaddComplexion());
   System.out.println();
   System.out.println("AGE: " + newAttribute2.getTheAge() + " years old");
   System.out.println();
   System.out.println("BODYSIZE: " + newAttribute2.getBodySizeStatus() + "kg");
   System.out.println();
   System.out.println("HEIGHT: " + newAttribute2.getaddHeight() + "feet");
   System.out.println();
   System.out.println("THE IQ: " + newAttribute2.getaddIqRate() + "IQ");
   System.out.println();
   System.out.println("SPEED: " + newAttribute2.getaddSpeed() + "km/h");
   System.out.println();
   System.out.println("MUSCULAR RATE: " + newAttribute2.getaddMusculineRate() + "kg");
   System.out.println();
   System.out.println("AGILITY RATE: " + newAttribute2.getaddAgility() + " out of 100");
   System.out.println();
   System.out.println("DEFEND RATE: " + newAttribute2.getaddDefendRate() + " out of 100");
   System.out.println();
   System.out.println("DRIBBLING RATE: " + newAttribute2.getDribbling() + " out of 100");
   break;
  }  
  
}
}
