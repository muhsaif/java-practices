import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = {2,4,5,6,8,9};
        // for (int num : arr){
        //     System.out.print(num + " ");
        // }
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
