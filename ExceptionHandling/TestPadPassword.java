package ExceptionHandling;

import java.util.Scanner;

//too short custom exception
class TooShort extends Exception{
  public TooShort(String message){
    super(message);
  }
}

//no digit custom exception
class NoDigit extends Exception{
  public NoDigit(String message){
    super(message);
  }
}

/*no character custom exception
class NoCharacter extends Exception{
  public NoCharacter(String message){
    super(message);
  }
}
*/

class TestPasPassword{
  //validPassword method
  public static void validPassword(String pass) throws NoDigit, TooShort {
    if (pass.length() < 6) {
      throw new TooShort("Too short!");
    }
    boolean hasDigit = false;
    for(char ch : pass.toCharArray()){
    if(Character.isDigit(ch)){
      hasDigit = true;
      break;
    }
    }

    if (!hasDigit) {
      throw new NoDigit("No digit!");
    }
    
}
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // String user = sc.next();
    String pass = sc.next();
    try{
      validPassword(pass);
      System.out.println("Correct");
    }catch(TooShort s){
      System.out.println(s.getMessage());
    }catch(NoDigit d){
      System.out.println(d.getMessage());
    }finally{
      sc.close();
    }
  }
}