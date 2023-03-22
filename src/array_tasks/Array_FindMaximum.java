package array_tasks;

public class Array_FindMaximum {
    public static void main(String[] args) {
        int[] num ={2,5,7,4,1,10};
        int max =num[0];
        for(int i = 0; i<num.length; i++){
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
    /*
        Write a function that can find the maximum number from an int Array
     */


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }


}
