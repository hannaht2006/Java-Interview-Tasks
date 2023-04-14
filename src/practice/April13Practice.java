package practice;

public class April13Practice {
    public static void main (String [] args){
        String password = "*.Ha12nnah Ton&!)";
        String hidden="";
        for (int i = 0; i<password.length(); i++){
            char letter = password.charAt(i);
            if(letter ==' '){
                hidden+= '*'+"";
            }
            if(letter!=' '){
                hidden += '*'+"";
            }
        }
        System.out.println(hidden);
    }
}
