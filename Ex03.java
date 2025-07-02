import java.util.Scanner;

public class Ex03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int pell = pell(n);
        System.out.println(pell);
    }

    public static int pell(int n) {
        if (n == 0)return 0;
        if (n == 1)return 1;

        return 2 * pell(n - 1) + pell(n -2);
    }
}
