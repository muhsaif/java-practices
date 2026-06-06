import java.util.Scanner;

public class SumOfAllint {
//     Given two integers low and high, return the sum of all integers from low to high inclusive.
// Example 1
// Input: low = 1, high = 5
// Output: 15
// Explanation: 1 + 2 + 3 + 4 + 5 = 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sum = 0;
        // simple
        // for(int i = low + 1 ; i<=high; i++){
        //     int sum = low + i;
        //     low = sum;
        // }
        // System.out.println("Sum of all int is : " + low);
        // good
        for (int i = low; i<=high; i++){
            sum = sum + i;
        }
        System.out.println("Sum of all int is : " + sum);
    }
    
}
