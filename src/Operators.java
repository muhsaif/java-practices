import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        // + (Addition): Adds two values.
        // - (Subtraction): Subtracts the right operand from the left.
        // * (Multiplication): Multiplies two values.
        // / (Division): Divides the left operand by the right.
        // % (Modulo): Returns the remainder of a division operation.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition : " + (num1+num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1*num2));
        System.out.println("Division : " + (num1/num2));
        System.out.println("Modulo : " + (num1%num2));

        // Unary Operators
        // Operators that require only one operand.

        // ++ (Increment): Increases a value by 1.
        // -- (Decrement): Decreases a value by 1.
        // ! (Logical NOT): Inverts the boolean value.

        System.out.println("Unary Operators");
        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(num1--);
//         Relational Operators
// Used to compare two values. They return a boolean result (true or false).

// == (Equal to): Checks if two values are equal.
// != (Not equal to): Checks if two values are not equal.
// > (Greater than): Checks if the left value is greater than the right.
// < (Less than): Checks if the left value is less than the right.
// >= (Greater than or equal to): Checks if the left value is greater than or equal to the right.
// <= (Less than or equal to): Checks if the left value is less than or equal to the right.
        
    }
    
}
