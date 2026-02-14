// 3. Find sum of first N natural numbers

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt(); 

        int sum = 0;
        for(int i=1; i<=N; i++){
            sum+=i;
        }
        System.out.println("Sum: "+sum);

        sc.close();
    }
}
