// 10. Check whether a number is Armstrong

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt(); 

        int org_num = num;

        int total_digits = 0;
        int temp_num = num;
        while(temp_num!=0){
            temp_num = temp_num/10;
            total_digits++;
        }

        int temp_num2 = num;
        int sum = 0;
        while (temp_num2 !=0) {
            int last_digit = temp_num2 % 10;
            sum += Math.pow(last_digit, total_digits);
            temp_num2 = temp_num2/10;
        }

        if(sum == org_num){
            System.out.println("Amstrong Number.");
        }else{
            System.out.println("Not Amstrong Number.");
        }

        sc.close();
        
    }
}
