import java.util.Scanner;
public class SumOfDigitAndReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

       int r = 0;
       int sum = 0;
       while(n!=0){
        r *= 10;
        r += (n%10);
         sum  += (n%10);
        n /= 10;
        
       }
       System.out.println("Reverse of Number = " + r);
       System.out.println("Sum of Digit = " + sum  );


        }

    }
    

