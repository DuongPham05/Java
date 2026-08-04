import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("day la 3 canh cua 1 tam giac");

            if (a == b && b == c) {
                System.out.println("Loại tam giác: Đều");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                if (a == b || b == c || a == c) {
                    System.out.println("Loai tam giac : Vuong can ");
                } else {
                    System.out.println("Loai tam giac : Vuong ");
                }
            } else if (a == b || b == c || a == c) {
                System.out.println("Loai tam giac : Can ");
            } else {
                System.out.println("Loai tam giac : Thuong ");
            }
        } else {
            System.out.println("3 so tren khong phai la 3 canh cua 1 tam giac");
        }
    }
}