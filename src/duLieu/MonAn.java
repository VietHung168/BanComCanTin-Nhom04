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
 public class MonAn {
    String MaMon;
    String TenMon;
    int GiaTien;
    byte img[] ;

    public byte[] getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "MonAn{" + "MaMon=" + MaMon + ", TenMon=" + TenMon + ", GiaTien=" + GiaTien + ", img=" + img + '}';
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
   
   public MonAn(){
       
   }
    public MonAn(String MaMon, String TenMon, int GiaTien, String DuongDanAnh,  byte []img) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.GiaTien = GiaTien;
       this.img=img;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(int GiaTien) {
        this.GiaTien = GiaTien;
    }

   

   
    
    
    
    
    
}
