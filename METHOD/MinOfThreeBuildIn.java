import java.util.Scanner;

public class MinOfThreeBuildIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        

        System.out.println("MIN OF A,B,C = " +Math.min(Math.min(a,b),c));
        System.out.println("MAX OF A,B,C,D = "+ Math.max(Math.max(Math.max(a,b),c),d));
    }
    
}
