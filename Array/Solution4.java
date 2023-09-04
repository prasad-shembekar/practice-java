import java.util.*;
public class Solution4{
    public static void main(String args[]){
        int[] numbers = new int[]{20,30,40,50,60};
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Average of array is: "+average);
    }
}