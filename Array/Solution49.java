import java.util.*;
public class Solution49{
    public static void main(String args[]){
        int array[] = {-4,8,6,-5,6,-2,1,2,3,-11};
        System.out.println("Original array: "+toString(array));
        int j,temp,array_size;

        array_size = array.length;
        for(int i=0;i<array.size;i++){
            j = i;

            while((j>0) &&(array[j]>0) && (array[j-1]<0)){
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }
    System.out.println("New array : "+Arrays.toString(array));
}