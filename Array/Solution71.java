import java.util.*;

public class Solution71{
    public static String largest_number(int[] num){
        String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(array_nums,(String str1,String str2)-> (str2+str1).compareTo(str1 + str2));
        return Arrays.stream(array_nums).reduce((a,b)-> a.equals('0')?b:a+b).get();
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,0,4,6};
        System.out.printf("Largest :"+largest_number(nums));
    }
}