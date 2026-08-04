public class CharDataType  {
    public static void main(String[] args) {
        // Typecasting- ek data type se dusre data type me conversion
        char ch = 'A';
        int x = ch;  // implicit typecasting
        System.out.println(x);

        char sachin = 'a';
        int y = (int)sachin; //explicit typecasting
        System.out.println(y);

        char suraj = '3';
        System.out.println((int)suraj);

        char su = 'c';
        System.out.println(ch+0);

        //integer to character 
        int z = 42;
        char sa = (char)z;
        System.out.println(sa);

    }
    
}
