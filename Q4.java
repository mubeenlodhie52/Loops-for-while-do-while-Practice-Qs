// 4. Print multiplication table of a number

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt(); 

        for(int i=1; i<=10; i++){
            System.out.println(N +" X "+i +" = "+ i*N);
        }

        sc.close();
    }
}
