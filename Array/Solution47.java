import java.util.*;
public class Solution47{
    static int count_rotation(int[] arr,int n){
        int min_val= arr[0],min_index = -1;
        for(int i=0;i<n;i++){
            if(min_val>arr[i]{
                min_val = arr[i];
                min_index = i;
            })
        }
        return min_index;
    }
    public static void main(String[] args){
        int arr[] = {35,32,30,14,18,21};
        int n = arr.length;
        System.out.println(count_rotation(arr,n));
    }
}