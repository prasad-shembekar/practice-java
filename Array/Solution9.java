import java.util.*;
public class Solution9{
    public static void main(String args[]){
        int[] array = {15,20,25,300,200};

        int index_pos = 2;
        int newVal = 5;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i= array.length-1; i > index_pos;i--){
            my_array[i] = my_array[i-1];
        }

        my_array[index_pos] = newVal;
        System.out.println("Original Array : "+Arrays.toString(my_array));
    }
}