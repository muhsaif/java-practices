package Methods;

public class ExcutionFlow {
//    1) CREATE A METHOD PRINTWELCOMEMESSAGE() THAT PRINTS A GREETING

//2) CREATE A METHOD ADD(INT A, INT B) THAT RETURNS THE SUM.
//            3) CREATE A METHOD ISEVEN(INT NUMBER) THAT RETURNS TRUE IF NUMBER IS EVEN.
//            4) CREATE A METHOD GETMAXIMUM(INT A, INT B) THAT RETURNS THE LARGER NUMBER.
//            5) CREATE A METHOD CALCULATEPERCENTAGE(INT OBTAINED, INT TOTAL).
//            6) CREATE AN OVERLOADED METHOD DISPLAY () WITH ONE INT PARAMETER OR ONE
//    STRING PARAMETER
//7) WRITE A METHOD UPDATEVALUE(INT X) AND VERIFY THAT ORIGINAL VARIABLE IN MAIN() DOES NOT CHANGE.
    static void main() {
        System.out.println("Hi");
        solve();
        System.out.println("BYe BYe");
    }
    static void solve(){
        System.out.println("helloo ");
        int ans = add(12, 18);
        System.out.println(ans);
        System.out.println("back main");
    }
    static int add(int a , int b){
        System.out.println("add function");
        int sum = a+b;
        return sum;
//        System.out.println();
    }
}
