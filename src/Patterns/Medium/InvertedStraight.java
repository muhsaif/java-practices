package Patterns.Medium;

import java.util.Scanner;

public class InvertedStraight {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
        inverted(n);
    }
    static void pattern6(int n){
        for(int i = 1; i<=n; i++ ){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void inverted(int n){
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
