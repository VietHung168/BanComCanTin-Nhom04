/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;

import java.util.Date;

/**
 *
 * @author hung
 */
 public class NhanVien {
    String MaNhanVien ;
    String TenNhanVien ;
    String SDT ;
    Date NamSinh ;
    String CMND ;
    String PhanQuyen ;
    String Email ;
    String GioiTinh ;
    String TinhTrangHoatDong;
    byte lamviec;

    public byte getLamviec() {
        return lamviec;
    }

    public void setLamviec(byte lamviec) {
        this.lamviec = lamviec;
    }
    public String getTinhTrangHoatDong() {
        return TinhTrangHoatDong;
    }

    public void setTinhTrangHoatDong(String TinhTrangHoatDong) {
        this.TinhTrangHoatDong = TinhTrangHoatDong;
    }

   

    public NhanVien() {
        System.out.println("khoi tao nhan vien");
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String SDT, Date NamSinh, String CMND, String PhanQuyen, String Email, String GioiTinh, String TinhTrangHoatDong) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.SDT = SDT;
        this.NamSinh = NamSinh;
        this.CMND = CMND;
        this.PhanQuyen = PhanQuyen;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.TinhTrangHoatDong = TinhTrangHoatDong;
        
    }

 

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(Date NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(String PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNhanVien=" + MaNhanVien + ", TenNhanVien=" + TenNhanVien + ", SDT=" + SDT + ", NamSinh=" + NamSinh + ", CMND=" + CMND + ", PhanQuyen=" + PhanQuyen + ", Email=" + Email + ", GioiTinh=" + GioiTinh + '}';
    }

   
    
    
    
}

