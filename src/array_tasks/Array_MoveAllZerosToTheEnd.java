package array_tasks;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int [] num = {1, 3, 8, 4, 0, 10, 0, 3, 9};
        int [] result = new int[num.length];
        int count = 0;
        for(int each:num){
            if(each !=0){
              result[count++]= each ;
            }
        }
        System.out.println(result);
    }

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


}
