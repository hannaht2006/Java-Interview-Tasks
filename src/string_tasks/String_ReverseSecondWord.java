package string_tasks;

public class String_ReverseSecondWord {

    public static void main(String[] args) {
        String sentence = "I Love Java";

        String [] word = sentence.split(" ");

        String reverse ="";
        for(int i = word[1].length()-1; i>=0; i--){
            reverse+=word[1].charAt(i);
        }
        word[1] = reverse;
        String result = "";
        for(String each : word){
            result += each +" ";
        }
        System.out.println(result);
    }

    /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */


    public static String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }

}
