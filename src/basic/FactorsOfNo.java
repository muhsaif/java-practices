package basic;

import java.util.Scanner;

public class FactorsOfNo {
    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter any no ");
        int n = sc.nextInt();
        System.out.print("Factor of " + n + " is: " );
        for (int i = 1;  i<=n; i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
