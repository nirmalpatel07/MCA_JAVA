import java.util.*;
public class pro3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer number : ");
        int org_num = sc.nextInt();
        int num = org_num;
        int rev_num = 0;
        
        while(num>0){
            int last_digit = num % 10;
            rev_num = rev_num*10 + last_digit;
            num = num/10;
        }
        
        if(org_num == rev_num){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrone");
        }
        sc.close();
    }
}
