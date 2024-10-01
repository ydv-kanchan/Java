package ExceptionHandling;

// import java.util.Scanner;

public class LearnException {
    public static void main(String[] args) {
        try {
            firstLevelMethod();
        } catch (Exception e) {
            System.out.println("Caught in main, final clean-up.");
            System.out.println(e.getMessage());

        }
        finally {

        }
        
    }

    public static void firstLevelMethod() throws Exception {
        try {
            secondLevelMethod();
        } catch (Exception e) {
            System.out.println("Performing some initial clean-up.");
            throw e;  // Re-throwing the exception
        }
    }

    public static void secondLevelMethod() throws Exception {
        throw new Exception("Error occurred in secondLevelMethod.");
        
    }


    // public static void main(String[] args) {
    //     try {
    //         try {
    //             int result = 10 / 0; // This will throw ArithmeticException
    //         } catch (NullPointerException e) {
    //             System.out.println("Caught NullPointerException");
    //         }
    //         System.out.println("Inner try block finished.");
    //     } catch (ArithmeticException e) {
    //         System.out.println("Caught ArithmeticException in outer try block.");
    //     }
    // }
    
    
    // public static void main(String args[])
    // {
    //     int divisor =0;
    //     int dividend = 11;
     
    //     try
    //     {
    //         int result=dividend/divisor;
    //         System.out.println("The result is "+result);
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println("An exception occured");
    //     }
    //     catch(ArithmeticException ae)
    //     {
            
    //         System.out.println("Division by zero");
    //     }
    //     finally
    //     {
    //         System.out.println("We are done!");
    //     }
    // }
}
//     public static void main(String[] args) { 

//         int arr[] = new int[10]; 

//         System.out.println("Hello World"); 

//         System.out.println(arr[11]); 

//         System.out.println("Will not priint"); 

//     } 

// } 






// public class LearnExeception {

//     public static void main(String[] args) {

//         int arr[] = new int[10];

//         System.out.println("Exception k pehle ka code");

//         try {

//             System.out.println(arr[11]);

//         } catch (ArrayIndexOutOfBoundsException e) {

//             System.out.println("Array was not that long");

//         }

//         System.out.println("Exception k baad wala code");

//     }

// }




// public class LearnExeception { 

//     public static void main(String[] args) { 

//          Scanner sc = new Scanner(System.in); 

//         int a = sc.nextInt(); 

//         int b = sc.nextInt(); 

//         int c = 0; 

//         try { 

//             c = division(a, b); 

//         } catch (Exception e) { 

//             System.out.println(e); 

//         } 

//         System.out.println(c);
//         sc.close();

//     } 

 

//     public static int division(int a, int b) throws ArithmeticException { 

//         return a / b; 

//     } 

// } 




// public class LearnExeception { 

//     public static void main(String[] args) { 

//         Scanner sc = new Scanner(System.in); 

//         try { 

//             int roll = sc.nextInt(); 

 

//             if (roll < 0) { 

//                 throw new MyException("Roll Number invalid"); 

//             } 

//         } catch (Exception e) { 

//             System.out.println(e); 

//         } 

 

//         System.out.println("Enter Name");
//         sc.close();

//     } 

// } 

 

// class MyException extends Exception { 

//     public MyException(String message) { 

//         super(message); 

//     } 

// } 



