import java.util.*;
public class pro7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number : ");
        int d = sc.nextInt();
        
        int max = (a>b && a>c && a>d) ? a : (b>c && b>d ? b : (c>d ? c :d));
        System.out.println("Maximum number is : "+max);

        sc.close();
    }
}
