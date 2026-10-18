import java.util.Arrays;
public class ArrayBuiltInFunctions{
public static void main(String [] args){
  
int[] list1 = {7, 2, 10, 4};
int[] list2 = {2, 4, 7, 10};
int[] list3 = {4, 2, 7, 10};
System.out.println("the binary/index search for list [3] element 3 = " + java.util.Arrays.binarySearch(list3,7)); 
  
System.out.println(java.util.Arrays.equals(list2, list3));
  
Arrays.fill(list1, 7);
System.out.println(Arrays.toString(list1));
  
Arrays.sort(list3);
System.out.println(Arrays.toString(list3));
  
  
if (args.length != 5){
System.out.println("i am extremely shocked");
System.exit(0);  
}
  
}
}
