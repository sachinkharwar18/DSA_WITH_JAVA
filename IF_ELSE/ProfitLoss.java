import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the CP = ");
        int CP = sc.nextInt();

        System.out.println("Enter the SP = ");
        int SP = sc.nextInt();

        if(CP<SP){
            System.out.println("Profit = " + (SP-CP));

            int Profit = SP-CP;
       double ProfitPercentage = (Profit * 100.0) / CP;
       System.out.println(ProfitPercentage + "%");
        }
        else if(CP>SP){
            System.out.println("Loss = " + (CP-SP));


       int Loss = CP-SP;
       double LossPercentage = (Loss * 100.0) / CP;
       System.out.println(LossPercentage + "%");
        }
        else{
            System.out.println("No profit no loss");
        }
        sc.close();

        
    }
    
}
