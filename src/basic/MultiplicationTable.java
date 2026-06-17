package basic;

import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no ");
        int n = Sc.nextInt();
        System.out.print("Enter the range ");
        int r = Sc.nextInt();
        int mul = 0;
        for (int i = 1; i<=r; i++){
            mul = n*i;
            System.out.println(n + "*" + i + " = " + mul);
        }

    }
}
