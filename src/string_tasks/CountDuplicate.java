package string_tasks;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {
    public static void main(String[] args) {
        String str = "AAbbbCCCCCCEEEE";
        Map<Character, Integer> dup = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if(!dup.containsKey(c)){
                dup.put(c, 1);
            }else{
                dup.put(c, dup.get(c)+1);
            }
        }
        System.out.println(dup);
    }
}
