package basic;

import java.util.Scanner;

public class SumOfAllN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first no : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your sec no : ");
        int num2 = sc.nextInt();
        int sum = 0;
        for(int i = num1; i<=num2; i++){
            sum += i;
        }
        System.out.print("Sum : " +  sum);
    }
}
