/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;

/**
 *
 * @author hung
 */
public class ChiTietKhachHang {
    String SDTNhan ;
    String TenNguoiNhan ;
    String GhiChu ;
    String MaHoaDon ;
    String DiaChiNhan ;

    public ChiTietKhachHang() {
    }

    public ChiTietKhachHang(String SDTNhan, String TenNguoiNhan, String GhiChu, String MaHoaDon, String DiaChiNhan) {
        this.SDTNhan = SDTNhan;
        this.TenNguoiNhan = TenNguoiNhan;
        this.GhiChu = GhiChu;
        this.MaHoaDon = MaHoaDon;
        this.DiaChiNhan = DiaChiNhan;
    }

    public String getSDTNhan() {
        return SDTNhan;
    }

    public void setSDTNhan(String SDTNhan) {
        this.SDTNhan = SDTNhan;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getDiaChiNhan() {
        return DiaChiNhan;
    }

    public void setDiaChiNhan(String DiaChiNhan) {
        this.DiaChiNhan = DiaChiNhan;
    }
    
    
}
