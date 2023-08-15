
package buoi3_btvn;
import java.util.Scanner;
public class buoi3_bai4 {
    public static boolean kiemTra(String s){
        int n= s.length();
        for (int i=0; i< n/2;i++){
            if(s.charAt(i) != s.charAt(n -1 -i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập chuỗi: ");
        String s=sc.nextLine();
        boolean b= kiemTra(s);
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
