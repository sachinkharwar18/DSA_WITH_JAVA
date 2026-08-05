import java.util.Scanner;

public class FoutDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n>999 && n<10000){
            System.out.println("This is four digit number");
        }
        else{
            System.out.println("This is not a four digit number");
        }
        sc.close();
    }
    
}
