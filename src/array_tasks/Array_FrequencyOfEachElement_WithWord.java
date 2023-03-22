package array_tasks;

import java.util.*;

public class Array_FrequencyOfEachElement_WithWord {
    /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};

write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five

     */


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1,3,2,2,2,4};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        Map<Integer, String> result = new LinkedHashMap<>();
        for(int each:arr){
            int count =0;
            for (int each2:arr){
                if(each==each2){
                    count++;
                }
            }


        result.put(each, words[count]);
        }
        result.forEach((a,b) -> System.out.println(a + " is " +b));


        //solution1:
        Map<Integer, String> map = new LinkedHashMap<>();

        for (int each : arr) {
            int count = 0;
            for (int n : arr) {
                if(each == n){
                    count++;
                }
            }
          if(count > 10){
              map.put(each, words[11]);
          }else{
              map.put(each, words[count]);
          }
        }

        map.forEach( (k,v) -> System.out.println(k+" is "+v));

        System.out.println("------String duplicate-----------");

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cup", "rain", "shirt", "cup", "flower", "shirt", "cup"));


        Map<String , Integer> results = new HashMap<>();

        for(String each : list){
            int count = 0;
            for (String each1 : list){
                if (each ==each1){
                    count ++;
                }
            }
            if(count>1){
                results.put(each, count);
            }
        }
        System.out.println(results);
    }


}
