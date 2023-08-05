
package java_public;
import java.util.Scanner;
public class buoi2_bai2 {

    public static float tinhBieuThuca(int n) {

        float sum = 0;
        for (int i = 1; i < n; i++) {
            sum += 1.0 / i;
        }
        return sum;

    }

    public static float tinhnGiaiThuc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * tinhnGiaiThuc(n - 1);

    }

    private static float tinhBieuThucb(int n) {
        if (n == 1) {
            return 1;
        }
        return tinhnGiaiThuc(n) + tinhBieuThucb((int) tinhnGiaiThuc(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("tong bieu thuc a: " + tinhBieuThuca(n));
        System.out.println("tong bieu thuc b: " + tinhBieuThucb(n));

    }

}
