public class Heat {
  public static void main(String[] args) {  
    Matter newMatter = new Matter(10, "gas");
    Matter oldMatter = new Matter(10, "solid");

    
    
    
    String result = newMatter.changeState("liquid");
    System.out.println(result); 
    newMatter.addWeight(20); 
    newMatter.addWeight(10);
    newMatter.addWeight(1);

    System.out.printf("this is the weight of the old matter %d\n", oldMatter.getWeight());
    oldMatter.addWeight(100);
    System.out.printf("this new weight of the old matter is now %d\n", oldMatter.getWeight());
    System.out.println(newMatter.getWeight());
    System.out.println(newMatter.getState());
    newMatter.changeState("solid");
    System.out.println(newMatter.getState());
  }
}
