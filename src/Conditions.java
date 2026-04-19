import java.util.Scanner;

public class Conditions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you salary : ");
        int salary = sc.nextInt();
        if (salary >= 10000) {
            salary = salary + 2000;
            System.out.println("Your salary after bounce is : " + salary);
        }else {
            salary = salary+5000;
            System.out.println("Your salary after bounce is : " + salary);
        }

    }
}
