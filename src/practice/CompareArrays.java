package practice;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] num1 = {2, 6, 1, 7, 9};
        int [] num2 = {5, 7, 2, 8, 1};
        if(num1.length != num2.length) {

            System.out.println("they are not equal");

        }else{
            Arrays.sort(num1);
            Arrays.sort(num2);

                if(num1.equals(num2)){
                    System.out.println("they are equal");
                }else{
                    System.out.println("they are not equal");
            }

        }

        }

}
