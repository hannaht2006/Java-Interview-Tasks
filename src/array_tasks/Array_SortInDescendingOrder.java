package array_tasks;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

    public static int[] sortingArrayDsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums ={26, 5, 7, 1, 3, 8 };

        for(int i =0; i< nums.length; i++){

            for(int j=0; j< nums.length; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];

                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(sortingArrayDsc(nums)));
    }

}
