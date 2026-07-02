package basic;

import java.util.Scanner;

public class ReverseNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nuwNum = 0;
        int i;
        for ( i= 0; i<=n/10; i++){
            nuwNum = i;
        }
        System.out.println(i);
        System.out.println(nuwNum);
    }
}
