package duLieu;


import duLieu.ChiTietKhachHang;
import java.util.ArrayList;
import java.util.List;

public class KhachHang {
   
    String SDT ;
    String TenKhachHang ;
    String DiaChi ;
    String Email ;
    
    List<ChiTietKhachHang> litsChitietKH = new ArrayList<ChiTietKhachHang>();

    public KhachHang() {
    }

    public KhachHang(String SDT, String TenKhachHang, String DiaChi, String Email ) {
        this.SDT = SDT;
        this.TenKhachHang = TenKhachHang;
        this.DiaChi = DiaChi;
        this.Email =Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<ChiTietKhachHang> getLitsChitietKH() {
        return litsChitietKH;
    }

    public void setLitsChitietKH(List<ChiTietKhachHang> litsChitietKH) {
        this.litsChitietKH = litsChitietKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    
}