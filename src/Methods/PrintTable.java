package Methods;


import java.util.Scanner;

public class PrintTable {

//    static void print2Table(int x, int y){
//
//        System.out.println(x*y);
//    }
    static int add(int a, int b){
        int sum = a+b;
//        System.out.println(sum);
        return sum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("2 ka table");
        int result = add(a,b);
        System.out.println(result);
    }
}
