import java.lang.reflect.Parameter;

public class Arguments {
    public static void max(int a, int b, int c){ //ARGUMENTS

        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }
    public static void main(String[] args) {
        max(8,9,7);  //Parameter
    }
    
}
