package basic;

import java.util.Scanner;

public class PrintX {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number x : ");
        int X = sc.nextInt();
        System.out.print("Enter a N number : ");
        int N = sc.nextInt();
        for (int i = 1; i<=N; i++){
            System.out.print(X);
            if (i<N) {
                System.out.print(" ");
            }
        }
    }
}
