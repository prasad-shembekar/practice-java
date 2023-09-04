import java.util.*;

public class Solution{
    public static void main(String args[]){
        int [] my_array = {10,20,30,40,50};
        String [] my_array1 = {"Java","Python","C++"};

        System.out.println("Original array is:"+Array.toString(my_array));
        Arrays.sort(my_array1);
        System.out.println("Sorted array is: "+Arrays.toString(my_array1));
    }
}