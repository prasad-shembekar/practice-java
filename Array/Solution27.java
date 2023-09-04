import java.util.*;
public class Solution27{
    public static void main(String args[]){
        int[] array = {5,7,2,4,9};
        System.out.println("Original array: "+Arrays.toString(array_nums));
        int ctr = 0;

        for(int i=0;i<array_nums.length;i++){
            if(array_nums[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Number of even number: "+ctr);
        System.out.println("Number of odd number:"+(array_nums.length-ctr));
    }
}