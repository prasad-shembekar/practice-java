import java.util.Arrays;

class solution
{
	public static int[] find_Product_in_array(int[] nums)
	{
		int n = nums.length;

		int[] left_element = new int[n];
		int[] right_element = new int[n];

		left_element[0] = 1;
		for (int i = 1; i < n; i++) {
			left_element[i] = nums[i - 1] * left_element[i - 1];
		}

		right_element[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right_element[j] = nums[j + 1] * right_element[j + 1];
		}

		for (int i = 0; i < n; i++) {
			nums[i] = left_element[i] * right_element[i];
		}
	return nums;	
	}

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7};
		System.out.println("Original array:\n"+Arrays.toString(nums1));
		int[] result1 = find_Product_in_array(nums1);
		System.out.println("Array with product of every other element:\n" + Arrays.toString(result1));

		int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println("\nOriginal array:\n"+Arrays.toString(nums2));
		int[] result2 = find_Product_in_array(nums2);
		System.out.println("Array with product of every other element:\n" + Arrays.toString(result2));

	}
}
