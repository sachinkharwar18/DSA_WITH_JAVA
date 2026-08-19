import java.util.Scanner;
public class Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int space = 1;
        int star = 2*1-3;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            space++;
            star+=2;
            
        
        System.out.println();
    }
    }
    
}

    

