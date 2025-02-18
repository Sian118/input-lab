import java.util.Scanner;

public class Run {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        byte b;
        long l;
        short s;
        int i;
        String k;
        char c;
        boolean o;

        System.out.printf("Enter the integer: ");
        i = sc.nextInt();

        System.out.printf("Enter the Byte: ");
        b = sc.nextByte();

        sc.nextLine();

        System.out.printf("Enter the long: ");
        l = sc.nextLong();

        System.out.printf("Enter the short: ");
        s = sc.nextShort();

        sc.nextLine();

        System.out.printf("Enter the string: ");
        k = sc.nextLine();

        System.out.printf("Enter the Character: ");
        c = sc.next().charAt(0);

        System.out.printf("Enter the boolean: ");
        o = sc.nextBoolean();

        System.out.printf("\nYou entered:\n");
        System.out.printf("Integer: %d\n", i);
        System.out.printf("Byte: %d\n", b);
        System.out.printf("Long: %d\n", l);
        System.out.printf("Short: %d\n", s);
        System.out.printf("String: %s\n", k);
        System.out.printf("Character: %c\n", c);
        System.out.printf("Boolean: %b\n", o);

        sc.close();
    }
}
