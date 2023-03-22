package array_tasks;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }
//merge two array other way
    public static void main(String[] args) {
        int [] num1 ={1,5,7,2};
        int[] num2 = {10, 30, 40};
        int[] all = new int [num1.length + num2.length];

        for (int i=0, j = 0; i< all.length;j++, i +=2){
                all[i] = num1[j];
            }

        for (int i =1, j=0; i< all.length; j++, i+=2){
            all[i] = num2[j];
        }

        System.out.println(Arrays.toString(all));

    }

}
