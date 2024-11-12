import java.util.*;
public class pro5 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :");
        int num = sc.nextInt();

        int org_num = num;

        int numOfDigits = String.valueOf(num).length();

        int sum = 0;

        while(num!=0){
            int digit = num % 10;

            sum += Math.pow(digit, numOfDigits);
            num = num/10;
        }

        if(sum==org_num){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }



        sc.close();
    }
}
