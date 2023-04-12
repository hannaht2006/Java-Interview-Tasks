package practice;

import java.util.Arrays;

public class ReverseHaft {
    public static void main(String[] args) {
        int[] num = {1, 4, 5, 9, 3};
        int [] num2 = new int[num.length];
        int n = 3;
        //9,3,1,4,5
        //39145
        //54193
        int j = 0;
        for(int i = n-1; i>=0; i--){
            num2[j++] = num[i];
        }
        int k = n;
        for(int i = num.length-1; i >=n; i--){
            num2[k++] = num[i];
        }
        int t = 0;
        for(int i = num2.length-1; i>=0; i--){
            num[t++]=num2[i];
        }
        System.out.println(Arrays.toString(num));
    }
}
