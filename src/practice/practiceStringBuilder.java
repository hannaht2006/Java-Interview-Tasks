package practice;

import java.util.Arrays;

public class practiceStringBuilder {
    public static void main(String[] args) {
 String s = "i love you";
 String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);

        String[] s1 =  s.split(" ");
        System.out.println(Arrays.toString(s1));

        String extraWord =  new StringBuilder(s).insert(7, "more ").toString();
        System.out.println(extraWord);
    }
}
