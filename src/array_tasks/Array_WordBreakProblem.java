package array_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_WordBreakProblem {

    /*
    Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
        { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilike
        Output: Yes
        The string can be segmented as "i like".

        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
     */

    public static void main(String[] args) {

        String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};

        String input = "ilikesamsung";

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j+1);
               if(Arrays.asList(dictionary).contains(temp) ){
                   if(!words.contains(temp)) {
                       words.add(temp);
                   }
               }
            }
        }

       String result = (words.size() > 0) ? "YES" : "NO";

        //redo
        System.out.println("--------------" );

        List<String> letter = new ArrayList<>();

        for (int i = 0; i<input.length(); i++){

            for(int j = i; j<input.length(); j++){
                String temp = "";
                temp = input.substring(i, j+1);
                if(Arrays.asList(dictionary).contains(temp)){
                    if(!letter.contains(temp)){
                        letter.add(temp);
                    }
                }
            }
        }
String ans = (letter.size()>0)?"yes":"no";

    }

public static ArrayList<String> dictionary( String s, String[] dictionary){
        ArrayList<String> word = new ArrayList<>();
        for(int i=0; i< s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String temp = s.substring(i, j+1);
                if(Arrays.asList(dictionary).contains(temp)){
                    if(!word.contains(temp)){
                        word.add(temp);
                    }
                }
            }
        }
        return word;
}


}
