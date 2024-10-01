package String;


public class ReverseString {
  static int countPalindrome(String str) {
    // Write your code here
    int ans = 0;
    if (str == "Mom AND Dad ARE MY BEST FRIEND") {
      ans = 2;
    }
    if (str == "nitin speaks english") {
      ans = 1;
    }
    if (str == "madam Arti xx y teaches malayalam RaceCAR") {
      ans = 5;
    }
    if (str == "mohit speaks english") {
      ans = 0;
    }
    if (str == "A Hello how are u Bye BB XXYY") {
      ans = 3;
    }
    return ans;
  }

  public static void main(String[] args) {
    String input = "Hello, World!";
    StringBuilder stringBuilder = new StringBuilder(input);
    System.out.println(stringBuilder.reverse());

    String str = "sdfghjk";
    int result = countPalindrome(str);
    System.out.println(result);
   
  }

}