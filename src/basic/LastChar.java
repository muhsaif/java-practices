package basic;

import java.util.Scanner;

public class LastChar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char lastChar = str.charAt(str.length()-1);
        System.out.println(lastChar);
    }
}
