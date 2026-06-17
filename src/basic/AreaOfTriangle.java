package basic;

import java.util.Scanner;

public class AreaOfTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height");
        float h = sc.nextFloat();
        System.out.print("Enter base");
        float b = sc.nextFloat();
        float A = (h*b)/2;
        System.out.print("the area of triangle is : " + A);
    }
}
