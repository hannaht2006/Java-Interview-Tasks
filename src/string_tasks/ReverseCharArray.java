package string_tasks;

import java.util.Arrays;

public class ReverseCharArray {

    public static void main(String[] args) {
        char[] s = {'a', 'l', 'z', 't'};
        System.out.println(Arrays.toString(reverseCharArray(s)));
    }

    public static char[]reverseCharArray(char[]arr){
        if(arr.length <2){
            return arr;
        }else{
            int left = 0;
            int right = arr.length-1;
            while(left < right){
                char temp = arr[left];
                arr[left] =arr[right];
                arr[right]= temp;
                left++;
                right--;

            }
        }
      return arr;
    }


}
