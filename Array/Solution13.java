import java.util.*;
public class Solution13{
    public static void main(String args[]){
        String[] my_array = {"bcd",'abd',"bcd",'ouz'};

        for(int i=0;i<my_array.length;i++){
            for(int j=0;j<my_array.length;j++){
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }
    }
}