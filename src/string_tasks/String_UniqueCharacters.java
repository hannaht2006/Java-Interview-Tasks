package string_tasks;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {
        String letter = "AAABBBCCCDEF";

        String unique = "";

        for(int i=0; i< letter.length(); i++){
            int count=0;
            for(int j=0; j< letter.length(); j++){
                if( letter.charAt(i)==letter.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                unique +=letter.charAt(i);
            }
        }
        System.out.println(unique);
    }

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }


}
