package btvnBuoi4_bai2;
import java.util.Scanner;

public class HCN {
    private float chieuDai;
    private float chieuRong;
    
    public HCN(){
        
    }
    public HCN(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai HCN: ");
        chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong HCN: ");
        chieuRong = sc.nextInt();
    }
    public void Ve(){
        for(int i=0; i< chieuDai; i++){
            for(int j=0; j< chieuRong; j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }
    public float dienTich(){
        return chieuDai*chieuRong;
    }
    public float chuVi(){
        return (chieuDai+chieuRong)*2;
    }
}
