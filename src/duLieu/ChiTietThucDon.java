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
public class ChiTietThucDon {
    String MaMon;
    int SoLuong ;

    public ChiTietThucDon() {
    }

    public ChiTietThucDon(String MaMon, int SoLuong) {
        this.MaMon = MaMon;
        this.SoLuong = SoLuong;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
    
}
