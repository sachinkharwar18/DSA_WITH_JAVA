import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++ ){
        System.out.println(i);
         System.out.println(n - i + 1);
    
        }
    }
    
}
