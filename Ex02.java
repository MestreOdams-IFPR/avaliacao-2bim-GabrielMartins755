import java.util.Scanner;

public class Ex02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int tribonacci = tribonacci(n);
        System.out.println(tribonacci);
    }

    public static int tribonacci(int n) {
        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;

        return (n - 1)+ tribonacci(n - 2) + tribonacci(n - 3);
    } 
}
