import java.util.*;

public class pro2 {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting number : ");
        int start  = sc.nextInt();

        System.out.print("Enter Ending number : ");
        int end  = sc.nextInt();

        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }
        System.out.println("Prime number between "+start+" to "+end+" :");

        for(int i=start; i<=end; i++){
            if (i <= 1) {
                continue;  
            }

            boolean isprime = true;

            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }

        System.out.println("Fibonacci numbers between "+start+" to "+end+" :");

        int a=0, b=1;

        while(b<=end){
            if(b>=start){
                System.out.println(b);
            }
            int next = a+b;
            a=b;
            b=next;
        }
        sc.close();

    }
}
