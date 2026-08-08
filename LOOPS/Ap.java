import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the nth term");
    int n = sc.nextInt();
       //last term of ap =  a+(n-1)d
    // for(int i=2; i<=3*n-1; i+=3){
    //     System.out.println(i);

        int a=2; int d=5;
        for(int i=1; i<=n; i++){
        System.out.println(a);
        a += d;

        }
    }
    }
    

