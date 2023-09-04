import java.util.*;
public class Solution7{
    public static void main(String args[]){
        int[] array = {20,30,40,50};
        System.out.println("Original array :"+Arrays.toString(array));
        int removeIndex = 1;

        for(int i=removeIndex;i< array.length-1;i++){
            array[i] = array[i+1];
        }
        System.out.println("After removing element:"+Arrays.toString(array));
    }
}