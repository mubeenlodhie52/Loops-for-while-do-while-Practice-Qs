// 5. Count digits in a number

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); 

        int count = 0;
        while (num > 0) {
            num = num/10;
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
