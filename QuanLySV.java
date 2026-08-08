import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class QuanLySV {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Ma SV: ");
        String maSV = sc.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();

        double cc = nhapDiem(sc, "Diem chuyen can: ");
        double gk = nhapDiem(sc, "Diem giua ky: ");
        double ck = nhapDiem(sc, "Diem cuoi ky: ");

        double tongKet = cc * 0.1 + gk * 0.3 + ck * 0.6;
        String xepLoai = tongKet >= 8.5 ? "A" : tongKet >= 7.0 ? "B" : tongKet >= 5.5 ? "C" : tongKet >= 4.0 ? "D" : "F";

        System.out.printf("%s - %s - %.2f - %s%n", maSV, hoTen, tongKet, xepLoai);
    }

    static double nhapDiem(Scanner sc, String msg) {
        double d;
        while (true) {
            System.out.print(msg);
            d = Double.parseDouble(sc.nextLine());
            if (d >= 0 && d <= 10) return d;
            System.out.println("Diem khong hop le , vui long nhap lai!");
        }
    }
}