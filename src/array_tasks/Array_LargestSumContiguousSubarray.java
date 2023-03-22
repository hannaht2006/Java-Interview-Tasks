package array_tasks;

public class Array_LargestSumContiguousSubarray {
    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

     */
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = 0;
        for(int i =0; i< nums.length; i++){
            int max = nums[i];
            int max1 = 0;
            for(int j = i; j< nums.length-1; j++){
                max1 += nums[j+1];
                if(max+max1>maxSum){
                    maxSum = max+max1;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println("--------------");
        int te = 0;
        int ma = 0;
        for(int each :nums){
            te = te+each;
            te = Integer.max(te ,0);
            ma = Integer.max(te , ma);
        }
        System.out.println(ma);
    }
    public static int maxSum(int[] arr) {
        int max = 0, temp = 0;

        for (int each: arr) {
            temp = temp + each;
            temp = Integer.max(temp, 0);
            max = Integer.max(max, temp);
        }

       return max;
    }

}
