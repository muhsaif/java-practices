package basic;

import java.util.Scanner;

public class SumOfNnumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
//        for(int i = 0; i<=n; i++){
//            sum += i;
//        }
        System.out.println(sum);
    }
}
