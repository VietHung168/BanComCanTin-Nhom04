/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;

import java.util.ArrayList;
import java.util.Date;
//import java.util.Date;
import  java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author hung
 */
 public class HoaDon {
    String MaHoaDon;
     Timestamp NgayLap ;
              //sqlTimestamp =
//      new java.sql.Timestamp(rs.getDate("NgayLap").getTime()); NgayLap ;
    String MaNhanVien ;
    int TongThanhToan ;
    String TrangThaiThanhToan ;
    String TrangThaiDung ;
    String MaNhanVienGiaoHang ;
    String MaKhachHang ;
    String MaNhanVienBep;
    String ManhanvienGiaohang ;
    String TinhTrangDonHang ;

    public String getTinhTrangDonHang() {
        return TinhTrangDonHang;
    }

    public void setTinhTrangDonHang(String TinhTrangDonHang) {
        this.TinhTrangDonHang = TinhTrangDonHang;
    }
    public String getManhanvienGiaohang() {
        return ManhanvienGiaohang;
    }

    public HoaDon(String MaHoaDon, Timestamp NgayLap, String MaNhanVien, int TongThanhToan, String TrangThaiThanhToan, String TrangThaiDung, String MaNhanVienGiaoHang, String MaKhachHang, String MaNhanVienBep, String ManhanvienGiaohang) {
        this.MaHoaDon = MaHoaDon;
        this.NgayLap = NgayLap;
        this.MaNhanVien = MaNhanVien;
        this.TongThanhToan = TongThanhToan;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
        this.TrangThaiDung = TrangThaiDung;
        this.MaNhanVienGiaoHang = MaNhanVienGiaoHang;
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVienBep = MaNhanVienBep;
        this.ManhanvienGiaohang = ManhanvienGiaohang;
    }

    public void setManhanvienGiaohang(String ManhanvienGiaohang) {
        this.ManhanvienGiaohang = ManhanvienGiaohang;
    }

    public String getMaNhanVienBep() {
        return MaNhanVienBep;
    }

    public void setMaNhanVienBep(String MaNhanVienBep) {
        this.MaNhanVienBep = MaNhanVienBep;
    }
   List<ChiTietHoaDon> litsChitietHD = new ArrayList<ChiTietHoaDon>();
    public HoaDon() {
    }

//    public HoaDon(String MaHoaDon, Timestamp NgayLap, String MaNhanVien, int TongThanhToan, String TrangThaiThanhToan, String TrangThaiDung, String MaNhanVienGiaoHang, String MaKhachHang) {
//        this.MaHoaDon = MaHoaDon;
//        this.NgayLap = NgayLap;
//        this.MaNhanVien = MaNhanVien;
//        this.TongThanhToan = TongThanhToan;
//        this.TrangThaiThanhToan = TrangThaiThanhToan;
//        this.TrangThaiDung = TrangThaiDung;
//        this.MaNhanVienGiaoHang = MaNhanVienGiaoHang;
//        this.MaKhachHang = MaKhachHang;
//    }

    public List<ChiTietHoaDon> getLitsChitietHD() {
        return litsChitietHD;
    }

    public void setLitsChitietHD(List<ChiTietHoaDon> litsChitietHD) {
        this.litsChitietHD = litsChitietHD;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Timestamp getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Timestamp NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getTongThanhToan() {
        return TongThanhToan;
    }

    public void setTongThanhToan(int TongThanhToan) {
        this.TongThanhToan = TongThanhToan;
    }

    public String getTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public String getTrangThaiDung() {
        return TrangThaiDung;
    }

    public void setTrangThaiDung(String TrangThaiDung) {
        this.TrangThaiDung = TrangThaiDung;
    }

    public String getMaNhanVienGiaoHang() {
        return MaNhanVienGiaoHang;
    }

    public void setMaNhanVienGiaoHang(String MaNhanVienGiaoHang) {
        this.MaNhanVienGiaoHang = MaNhanVienGiaoHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }
    
    
    
}
