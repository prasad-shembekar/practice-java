import java.util.Arryas;
class Solution66{
    public static int largest(int[] A){
        int max_elem = 0;
        int max_end = 0;
        for(int i: A){
            max_end = max_end + i;
            max_end = Integer.max(max_end,0);

            max_elem  = Integer.max(max_elem,max_end);
        }
        return max_elem;
    }
    public static void main(String[] args){
        int[] A = {1,2,-3,-4,0,6,7,8,9};
        System.out.println("Original: "+Arrays.toString(A));
        System.out.println("The largest sum of contiguous sub-array: " + largest(A));
    }
}