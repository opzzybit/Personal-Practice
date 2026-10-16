public class Matter {
  
  private int myWeight;
  private String myState;
//behaviors 


  public String changeState(String state) {
    if (state != "") {
        if(state.equals("gas") || state.equals("liquid") || state.equals("solid")) {
              myState = state;
              return "sucessfully changed";
        }
    }
        return "an error occured";
  }

  public int addWeight(int weight) { //setter
    return myWeight = myWeight + weight;
  }
  
  public int getWeight() { //getter
    return myWeight;
  }
  
  public String getState(){
    return myState;
  }
}
