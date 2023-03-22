package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>( Arrays.asList(1, 0, 6, 7, 0, 3));
        System.out.println("nums = " + nums);
        int numsSize = nums.size();
        nums.removeAll(Arrays.asList(0));
        System.out.println("nums = " + nums);
        int newSize = nums.size();
        int numberOfZero = numsSize - newSize;
        for (int i = 0; i< numberOfZero; i++){
            nums.add(0);
        }
        System.out.println("nums = " + nums);
    }
    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }


}
