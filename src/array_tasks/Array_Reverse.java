package array_tasks;

import java.util.Arrays;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */

    public static void main(String[] args) {
        String[] words = {"I", "love", "selenium", "java"};
        String[] reverse = new String[words.length];

        for(int i = words.length -1, j=0; i>=0 ;j++, i--){
            reverse[j] =words[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }




}
