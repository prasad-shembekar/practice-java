import java.util.*;

class Solution64{
    public static int find(int[] nums){
        int[] incre = new int[nums.length];
        incre[0] = 1;

        for(int i =0;i<nums.length;i++){
            incre[i] = 1;
            if(nums[i-1] < nums[i]){
                incre[i] = incre[i-1]+1;
            }
        }
        int[] decre_array = new int[nums.length];
		decre_array[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			decre_array[i] = 1;
			if (nums[i] > nums[i + 1]) {
				decre_array[i] = decre_array[i + 1] + 1;
			}
		}

		int lbs_len = 1;
		int start = 0, end = 0;

		for (int i = 0; i < nums.length; i++)
		{
			if (lbs_len < incre_array[i] + decre_array[i] - 1)
			{
				lbs_len = incre_array[i] + decre_array[i] - 1;
				start = i - incre_array[i] + 1;
				end = i + decre_array[i] - 1;
			}
		}

		// print longest bitonic sub-array
		System.out.println("The longest bitonic subarray is [" + start + "," + end + "]");
		System.out.print("Elements of the said sub-array: ");
	    for (int x = start; x <= end; x++)
	     {
			
		  System.out.print(nums[x]+" ");			
		 }	

		System.out.println("\nThe length of longest bitonic subarray is " + lbs_len);

		return lbs_len;
	}

	public static void main(String[] args)
	{
		int[] nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
		System.out.println("\nOriginal array: "+Arrays.toString(nums));
		find_Bitonic_Subarray(nums);
	}
}
