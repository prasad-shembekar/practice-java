import java.util.*;
public class Solution12{
    public static void main(String args[]){
        int[] array = {1,2,3,4,4,5,5,6,6,7};

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]==array[j])&&(i!=j)){
                    System.out.println("Duplicate element: "+array[j]);
                }
            }
        }
    }
}