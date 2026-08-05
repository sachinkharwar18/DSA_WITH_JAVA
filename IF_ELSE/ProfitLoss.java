import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the CP = ");
        int CP = sc.nextInt();

        System.out.println("Enter the SP = ");
        int SP = sc.nextInt();

        if(CP<SP){
            System.out.println("Profit =" + (SP-CP));
        }
        else if(CP>SP){
            System.out.println("Loss =" + (CP-SP));
        }
        else{
            System.out.println("No profit no loss");
        }
       int  ProfitPercentage = (Profit/CP)*100;
       System.out.println(ProfitPercentage);
        
    }
    
}
