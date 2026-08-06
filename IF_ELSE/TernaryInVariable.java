import java.util.Scanner;

public class TernaryInVariable {
     public static void main(String[]args) {
                  Scanner sc = new Scanner(System.in);
          
                  System.out.println("Enter the number");
                  int n = sc.nextInt();
          
                  int x = (n>=0) ? 100 : 0;
                  System.out.println(x);
               sc.close();
          }
          
    }
