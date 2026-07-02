package Methods;

public class MethodPractice {
    static void main() {
        //    1) CREATE A METHOD PRINTWELCOMEMESSAGE() THAT PRINTS A GREETING
//2) CREATE A METHOD ADD(INT A, INT B) THAT RETURNS THE SUM.
//3) CREATE A METHOD ISEVEN(INT NUMBER) THAT RETURNS TRUE IF NUMBER IS EVEN.
//4) CREATE A METHOD GETMAXIMUM(INT A, INT B) THAT RETURNS THE LARGER NUMBER.
//5) CREATE A METHOD CALCULATEPERCENTAGE(INT OBTAINED, INT TOTAL).
//6) CREATE AN OVERLOADED METHOD DISPLAY () WITH ONE INT PARAMETER OR ONE
// STRING PARAMETER
//7) WRITE A METHOD UPDATEVALUE(INT X) AND VERIFY THAT ORIGINAL VARIABLE IN MAIN() DOES NOT CHANGE.
        add(5,10);
        isEven(15);
        getMax(5,7);
        calPercentage(865,1200);

    }
    //2) CREATE A METHOD ADD(INT A, INT B) THAT RETURNS THE SUM.
    static int add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    //3) CREATE A METHOD ISEVEN(INT NUMBER) THAT RETURNS TRUE IF NUMBER IS EVEN.
    static boolean isEven(int num){
        if(num%2==0){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
    //4) CREATE A METHOD GETMAXIMUM(INT A, INT B) THAT RETURNS THE LARGER NUMBER.
    static int getMax(int a, int b){
        if(a>b){
            System.out.println(a);
            return a;
        }else {
            System.out.println(b);
            return b;
        }
    }
    //5) CREATE A METHOD CALCULATEPERCENTAGE(INT OBTAINED, INT TOTAL).
    static float calPercentage(int obt_marks, int total_marks){
        float percentage = (obt_marks*100)/total_marks;
        System.out.println(percentage);
        return percentage;
    }


}

