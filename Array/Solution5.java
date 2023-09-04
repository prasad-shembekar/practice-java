import java.util.*;
public class Solution5{
    public static boolean contains(int[] arr,int item){
        for(int n: arr){
            if(item==n){
                return true;
            }
        } return false;
    }
    public static void main(String args[]){
        int [] my_array = {10,20,30,40,50};
        System.out.println(contains(my_array,30));
    }
}