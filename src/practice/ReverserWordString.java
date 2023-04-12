package practice;

import java.util.Arrays;

public class ReverserWordString {
    public static void main(String[] args) {


        String str = "the sky is blue";
  String [] temp = str.split(" ");
        String result = "";
        for (int i = temp.length- 1; i>=0; i--){
           result += temp[i] +" ";
        }
        System.out.println(result);


        System.out.println("------------");

        System.out.println(reverseWords(str));

    }
    public static String reverseWords(String s){
        String [] word = s.split(" ");
        int last = word.length-1;
        int first = 0;
        while(first<last){
            String t = word[first];
            word[first] = word[last];
            word[last] = t;
            first++;
            last--;
        }
 String result = String.join(" ", word);
       return result;
    }
}