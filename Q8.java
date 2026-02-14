// 8. Print Fibonacci series

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); 

        int first_num = 0;
        int sec_num = 1;

        for(int i=0; i<n; i++){
            System.out.print(first_num + " ");
            int third_num = first_num + sec_num;
            first_num = sec_num;
            sec_num = third_num;           
        }

        sc.close();
    }
}
