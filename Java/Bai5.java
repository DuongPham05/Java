import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n nguyên dương: ");
        int n = sc.nextInt();

        long f0 = 0, f1 = 1;
        System.out.print("Dãy Fibonacci gồm " + n + " số đầu tiên: ");

        for (int i = 0; i < n; i++) {
            System.out.print(f0 + " ");
            long fNext = f0 + f1;
            f0 = f1;
            f1 = fNext;
        }
        System.out.println();
    }
}