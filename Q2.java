// 2. Print all even numbers between 1 and N

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt(); 

        for(int i=1; i<=N; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
