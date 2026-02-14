// 9. Find GCD of two numbers
public class Q9 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        while (a%b !=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(b);
    }
}
