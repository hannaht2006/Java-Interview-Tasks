package array_tasks;

import java.util.*;

public class Array_FrequencyOfEachElement {

    /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */


    public static void main(String[] args) {

       String[] testArray = {"Apple","Banana","Apple","Cherry"};

        //solution 1:
       Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : testArray) {
            int frequency = 0;
            for (String s : testArray) {
                if(each.equals(s)){
                    frequency++;
                }
            }

            map.put(each, frequency);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }



        System.out.println("--------------------------------------");
        //Solution 2:
        List<String> temp = Arrays.asList(testArray);
        for (String s : new LinkedHashSet<>(temp)) {
            System.out.println(s +"="+ Collections.frequency(temp, s) );
        }



        System.out.println("--------------------------------------");
        //Solution 3:
        Arrays.stream(testArray).distinct().forEach( e ->
                System.out.println(e+"="+Arrays.stream(testArray).filter( p -> p.equals(e)).count() ));

        System.out.println("Solution 4------------");

//        String [] testArray = {"Apple","Banana","Apple","Cherry"};
        Map<String, Integer> result = new HashMap<>();
        for(int i = 0; i< testArray.length; i++){
            int frequent = 0;
            for(int j = 0; j< testArray.length; j++){
                if(testArray[i] == testArray[j]){
                    frequent++;
                }
            }
            result.put(testArray[i], frequent);
        }

        System.out.println(result);
        for(Map.Entry<String, Integer> each: result.entrySet()){
            System.out.println(each);
        }


    }






}
