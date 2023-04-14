package practice;

public class PasswordChecking {
    public static void main(String[] args) {

        String password ="Hannah@1";
        boolean hasUppercase =password.matches("(.*[A-Z].*)");
        boolean hasLowercase =password.matches("(.*[a-z].*)");
        boolean hasDigit =password.matches("(.*[0-9].*)");
        boolean hasSpecialChar =password.matches("(.*[-/, :-@].*)");

        if(password.length()>=6 && !password.contains(" ")&&hasUppercase && hasLowercase && hasDigit && hasSpecialChar){
            System.out.println("the password is valid");
        } else{
            System.out.println("the password is invalid");
        }
    }
}
/*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */