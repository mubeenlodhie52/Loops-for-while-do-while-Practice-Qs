// 1. Print numbers from 1 to N

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt(); 
        int i = 1;
        while(i<=N){
            System.out.print(i+" ");
            i++;
        }

        sc.close();
    }
}