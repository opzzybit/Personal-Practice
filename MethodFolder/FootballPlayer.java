public class FootballPlayer{
    
    private double addBodySize;
    private double addIqRate;
    private double addMusculineRate;
    private double addDefendRate;
    private double addHeight;
    private double addSpeed;
    private String addName;
    private double addAgility;
    private String addComplexion;
    private double addAge;
    private double addDribbling;


//SETTER BEHAVIOURS   
    public String setSpeed(double speed){
       addSpeed = addSpeed + speed;
       return "updated successful"
    }
    public String setName(String name){
        addName = name;
        return "updated successful";
    } 
    
    public String setSkinColor(String complexion){
        addComplexion = complexion;
        return "updated successful";
    }
    
    public String  setAge(double age){
       addAge = addAge + age;
       return "updated successful";
    }

    public String setBodySize(double bodySize){
       addBodySize = addBodySize + bodySize;
       return "updated successful";
    }
    public String setIqRate(double iqRate){ 
       addIqRate = addIqRate + iqRate;
       return "updated successful";
    }

    public  String setDefendingRate(double defendRate){
        addDefendRate = addDefendRate + defendRate;
        return "updated successful";
    }  
    
    
    public String setMuscularRate(double muscularRate){
        addMusculineRate = addMusculineRate + muscularRate;
        return "updated successful";
    }

    public String setHeight(double height){
       addHeight = addHeight + height;
       return "updated successful";    
    }
    
    public String setAgility(double agility){
       addAgility = addAgility + agility;
       return "updated successful";
    }
    
    public String setDribbling(double dribbling){
      addDribbling = addDribbling + dribbling;
      return "it has been updated";
    }



// GETTER  BEHAAVIOURS    
    public double getDribbling(){
      return addDribbling;
    }
    
    public  double getTheAge(){ 
      return addAge; 
    }
    public  double getBodySizeStatus(){ 
      return addBodySize; 
    }
    
    public  double getaddIqRate(){ 
      return addIqRate; 
    }
    
    public  double getaddMusculineRate(){ 
      return addMusculineRate; 
    }

    public  double getaddDefendRate(){ 
      return addDefendRate; 
    }

    public  double getaddHeight(){ 
      return addHeight;
    }

    public  double getaddSpeed(){ 
      return addSpeed; 
    }

    public  String getaddName(){
      return addName;
   }
    public double getaddAgility(){
      return addAgility;
   }

    public String getaddComplexion(){
      return addComplexion;
    }



}
