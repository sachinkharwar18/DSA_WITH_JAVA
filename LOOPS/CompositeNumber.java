import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();

        boolean flag = true;  // true means prime

        for(int i=2; i<=n-1; i++){
            if(n%i==0){    // i to n ka factor nikla
            flag=false; // 1 means composite
            break;
        }
    }
    if(n==1){
        System.out.println("Neither composite and nor prime number");
    }else if(flag==false){
        System.out.println("composite number");
    }else{
        System.out.println("prime number");
    }
}
}