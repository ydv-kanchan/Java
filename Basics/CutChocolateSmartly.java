package Basics;

import java.util.Scanner;

public class CutChocolateSmartly {
    public static int cutPieces(int n) {
        int horizontalCuts = n/2;
        int verticalCuts = n - n/2;
        return (horizontalCuts+1)*(verticalCuts+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cutPieces(n));
        sc.close();
    }
}
