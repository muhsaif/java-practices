package basic;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radus of cicle : ");
        double r = sc.nextInt();
        double A = Math.PI*r*r;
        System.out.print("The Area of radius is : " + A);
    }
}
