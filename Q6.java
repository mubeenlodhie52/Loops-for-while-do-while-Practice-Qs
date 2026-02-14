// 6. Reverse a number

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); 

        int rev_num  = 0;

        while(num > 0){
            int last_digit = num % 10;
            rev_num = rev_num * 10 + last_digit;
            num = num/10;
        }

        System.out.println(rev_num);
        sc.close();
    }
}
