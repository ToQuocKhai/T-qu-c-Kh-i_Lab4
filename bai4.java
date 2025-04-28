
package lab4;
import java.util.Scanner;
class HangHoa {
    private String maHang;
    private String tenHang;
    private long donGia;

    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("nhap don gia: ");
        donGia = sc.nextLong();
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("ma hang: " + maHang + ", ten hang: " + tenHang + ", don giaa: " + donGia);
    }
}

class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }

    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap thoi gian bao hanh: ");
        thoiGianBaoHanh = sc.nextInt();
        System.out.print("nhap dien ap: ");
        dienAp = sc.nextInt();
        System.out.print("nhap cong suat: ");
        congSuat = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("thoi gian bao hanh: " + thoiGianBaoHanh + " thang, dien ap: " + dienAp + "v, cong suat: " + congSuat + "W");
    }
}

class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;
    public HangThucPham() {
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }
    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ngay san xuat: ");
        ngaySanXuat = sc.nextLine();
        System.out.print("nhap ngay het han: ");
        ngayHetHan = sc.nextLine();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("ngay san xuat: " + ngaySanXuat + ", ngay het han: " + ngayHetHan);
    }
}
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thong tin hang dien may: ");
        HangDienMay dienMay = new HangDienMay();
        dienMay.nhap();
        System.out.println("thong tin hang dien may: ");
        dienMay.xuat();
        System.out.println("nhap thong tin hang thuc pham: ");
        HangThucPham thucPham = new HangThucPham();
        thucPham.nhap();
        System.out.println("thong tin hang thuc pham: ");
        thucPham.xuat();
    }
}

