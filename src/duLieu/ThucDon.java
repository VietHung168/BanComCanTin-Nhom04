/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hung
 */
 public class ThucDon {
    Date NgayDung ;
    String MaNhanVien ;
    String MaThucDon ;
    String BuoiDung ;
    List<ChiTietThucDon> litsChitietTD = new ArrayList<ChiTietThucDon>();

    public ThucDon() {
    }

    public ThucDon(Date NgayDung, String MaNhanVien, String MaThucDon, String BuoiDung) {
        this.NgayDung = NgayDung;
        this.MaNhanVien = MaNhanVien;
        this.MaThucDon = MaThucDon;
        this.BuoiDung = BuoiDung;
        litsChitietTD = null;
    }

    public Date getNgayDung() {
        return NgayDung;
    }

    public void setNgayDung(Date NgayDung) {
        this.NgayDung = NgayDung;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaThucDon() {
        return MaThucDon;
    }

    public void setMaThucDon(String MaThucDon) {
        this.MaThucDon = MaThucDon;
    }

    public String getBuoiDung() {
        return BuoiDung;
    }

    public void setBuoiDung(String BuoiDung) {
        this.BuoiDung = BuoiDung;
    }

    public List<ChiTietThucDon> getLitsChitietTD() {
        return litsChitietTD;
    }

    public void setLitsChitietTD(List<ChiTietThucDon> litsChitietTD) {
        this.litsChitietTD = litsChitietTD;
    }
    
    
}
