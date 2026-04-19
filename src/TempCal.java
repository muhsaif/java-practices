import java.util.Scanner;

public class TempCal {
    static void main() {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter temprature : ");
//        float tempC=sc.nextFloat();
//        float tempF  = (tempC * 9/5) + 32;
//        System.out.println("tempC = " + tempF);
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()==s2.length() && s1.matches(s2)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
