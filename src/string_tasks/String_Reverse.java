package string_tasks;

public class String_Reverse {
    public static void main(String[] args) {
        String str = "ABCD";
        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }


}
