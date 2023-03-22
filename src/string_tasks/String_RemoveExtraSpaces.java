package string_tasks;

public class String_RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        String[] sentence = str.split(" ");

        String result = "";
        for (String each:   sentence) {
            if(!each.isEmpty()){
                result +=each + " ";
            }
        }
        System.out.println(result);

    }

    /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */

    public static String removeExtraSpace(String sentence) {

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();

    }


}
