import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b && b!=c && a!=c) {
            if (a>b) if (a>c) System.out.println(a*100);
            if (a<b) if (b>c) System.out.println(b*100);
            if (c>a) if (c>b) System.out.println(c*100);
        }
        else if(a==b && b==c) System.out.println(10000+(a*1000));
        else if(a==b || a==c) System.out.println(1000+a*100);
        else if(b==c) System.out.println(1000+b*100);

        }

    }