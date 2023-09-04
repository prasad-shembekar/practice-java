import java.util.*;
public class Solution6{
    public static int findIndex(int[] array,int t){
        if(array == null) return -1;
        int len = array.length;
        int i =0;
        while(i<len){
            if(array[i]==t)return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] array = {10,20,30,40,50,60};
        System.out.println("Index position of 20 is:"+findIndex(array,20));
    }
}