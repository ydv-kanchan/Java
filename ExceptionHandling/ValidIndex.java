// package ExceptionHandling;

// import java.util.Scanner;
// class OutOfBoundsException extends Exception {
//     public OutOfBoundsException(String message) {
//         super(message);
//     }
// }
    
// class validIndex{
//     public static void validIndex(int index, int size) throws OutOfBoundsException{
//       if(!(index>=0 && index<size)){
//         throw new OutOfBoundsException("Out of Bounds");
//       }
//     }
//     public static void main(String[] args)
//     {
//         // Write your code here
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int[] array = new int[size];
//       for(int i=0;i<size;i++){
//         int ele = sc.nextInt();
//         array[i] = ele;
//       }
//       int queries = sc.nextInt();
//       for (int i = 0; i < queries; i++) {
//           int index = sc.nextInt();
//           try {
//               validIndex(index, size);
//               System.out.println(array[index]);
//           } catch (OutOfBoundsException e) {
//               System.out.println(e.getMessage());
//           }
//       }
//       sc.close();
//     }
// }