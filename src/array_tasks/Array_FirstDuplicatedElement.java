package array_tasks;

public class Array_FirstDuplicatedElement {

    /*
    write a program that can find the first duplicated element from the array
     */
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7, 3, 7, 4};
        int dup = 0;
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            dup = 0;

            for (int j=0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dup++;
                }
            }
            if (dup > 1) {
                result = nums[i];
                break;
            }

        }
        System.out.println(result);
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2) {
                    frequency++;
                }
            }
                if (frequency > 1) {
                    firstDuplicated = each;
                    break;
                }

            }

            return firstDuplicated;

        }



}

