package ExceptionHandling;

import java.util.Scanner;


//custom exception creation ShortPasswordException
class ShortPasswordException extends Exception {
    public ShortPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {

    //static method validatePassword(String password){}
    //this method checks if the password's length is >=8 or not
    static void validatePassword(String password) throws ShortPasswordException {
        if (password.length() < 8) {
            throw new ShortPasswordException("Password is too short. It must be at least 8 characters long.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        try{
            validatePassword(pass);
            System.out.println("Password Accepted");
        } catch (ShortPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
