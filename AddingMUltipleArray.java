import java.util.Arrays;
public class AddingMUltipleArray{
    public static void main(String[] args){
    
    int[]  array1 = {1,2,3,4};
    int[]  array2 = {5,6,7,8};
    
    int[] result = getSingleArray(array1,array2);
    System.out.println("combined array = " + Arrays.toString(result));
    }
    public static int[] getSingleArray(int[] arrayOne, int[] arrayTwo){
    
    int totalLength = arrayOne.length + arrayTwo.length;
    
    int[] combine = new int[totalLength];
    
    for (int index = 0; index < arrayOne.length; index++){
        combine[index] = arrayOne[index];
    }
    for (int index2 = 0; index2 < arrayTwo.length; index2++){
        combine[arrayOne.length + index2] = arrayTwo[index2];
    }
    
    return combine;
    
    
    
    }
}
