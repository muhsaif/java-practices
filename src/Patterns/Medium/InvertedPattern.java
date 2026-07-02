package Patterns.Medium;

import java.util.Scanner;

public class InvertedPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=2*i-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
