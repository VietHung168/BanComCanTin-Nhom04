/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;
import duLieu.XuLyChuanHoa;

/**
 *
 * @author hung
 */
public class nguoiDungDangNhap {

   String maNguoiDung;
   String phanQuyen ;
   XuLyChuanHoa ch= new XuLyChuanHoa() ;

    public nguoiDungDangNhap() {
    }

    public nguoiDungDangNhap(String maNguoiDung, String phanQuyen) {
        this.maNguoiDung = maNguoiDung;
        this.phanQuyen = phanQuyen;
    }

    public String getMaNguoiDung() {
      
        return maNguoiDung;
    }
    public void setMaNguoiDung(String maNguoiDung) {
        
        this.maNguoiDung = maNguoiDung;
    }

    public String getPhanQuyen() {
        
        return ch.xoakhoangtrong(phanQuyen);
    }

    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen =ch.xoakhoangtrong(phanQuyen);
    }
   
   
}
