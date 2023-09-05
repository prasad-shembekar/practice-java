import java.util.*;

public class Solution51{
    public static void main(String args[]){
        int arr[] = new int[]{0,0,1,1,0,1,1,1,0};
        int result[];
        System.out.println("Originl array");
        System.out.println(Arrayd.toString(arr));

        int  n = arr.length;
        result = seperate_0_1(arr,n);
        System.out.println(Arrays.toString(result));
    }

    static int[] seperate_0_1(int arr[],int n){
        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0)
                count++;
        }

        for(int i=0;i<count;i++){
            arr[i] = 0;
        }
        for(int i=count;i<n;i++){
            arr[i] = 1;
        }
        return arr;
    }
}