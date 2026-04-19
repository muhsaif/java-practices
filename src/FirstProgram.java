import java.util.Scanner;

public class FirstProgram {
    static void main() {
// calculator using if else ladder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("operations(+,-,/,*,%) : ");
        String operation = sc.next();
//        if(operation.equals("+")) {
//            System.out.println("sum of num is : " + num1 + num2);
//        }else if(operation.equals("-")) {
//            int diff = num1 - num2;
//            System.out.println("diff of num is : " + diff);
//        }else if(operation.equals("*")) {
//            System.out.println("multiplication of num is : " + num1 * num2);
//        }else if(operation.equals("/")) {
//            System.out.println("division of num is : " + num1 / num2);
//        }else if(operation.equals("%")) {
//            System.out.println("remainder of num is : " + num1 % num2);
//        }else{
//            System.out.println("Invalid operation");
//        }
        // using switch case
        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
