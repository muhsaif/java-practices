package Arrays;

import java.util.Scanner;

public class Arrays {
    static void main() {
        //dec
        int[] arr ;
        //alocation
        arr = new int[5];
        //init
//        int brr[]={1,3,4,5,2};
//        System.out.println(brr[4]);
//
//        for (int val:brr){
//            System.out.print(val);
//        }


        // taking input

        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for (int val : arr){
            System.out.print(val);
        }
    }
}
