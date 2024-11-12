import java.util.*;
public class pro4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Enter a power Number : ");
        int power = sc.nextInt();

        int ans=1;

        for(int i=1; i<=power; i++){
            ans=ans*num;
        }

        System.out.println(ans);

        sc.close();
    }
}
