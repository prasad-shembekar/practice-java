import java.util.*;
import java.lang.*;

class Solution55{
    public static void print_all_subarray(int[] A){
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<A.length;i++){
            int sum = 0;
            list.removeAll(list);
            for(int j = i;j<A.legth;j++){
                sum += A[j];
                list.add(A[j]);
                if(sum==0){
                    System.out.println("Sub arrays with zero sum :"+list.toString());
                }
            }
        }
    }
    public static void main (String[] args)
	{
		int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		System.out.println("\nOriginal array: "+Arrays.toString(nums1));
		print_all_Subarrays(nums1);
		
	              int[] nums2 = { 1, 2, -3, 4, 5, 6 };
		System.out.println("\nOriginal array: "+Arrays.toString(nums2));
		print_all_Subarrays(nums2);
		
		int[] nums3= { 1, 2, -2, 3, 4, 5, 6 };
		System.out.println("\nOriginal array: "+Arrays.toString(nums3));
		print_all_Subarrays(nums3);
	}
}