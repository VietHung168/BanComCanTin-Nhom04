/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketNoiDatabase;

import duLieu.ChiTietKhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import duLieu.NhanVien;
import duLieu.MonAn;
import duLieu.nguoiDungDangNhap;
import duLieu.KhachHang;
import duLieu.ThucDon;
import duLieu.ChiTietThucDon;
import duLieu.ChiTietHoaDon;
import duLieu.ChuanHoaDuLieu;
import duLieu.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import duLieu.XuLyChuanHoa;
import giaoDien.XuLyHinhAnh;
import java.awt.Image;
import java.io.IOException;
import java.security.Timestamp;

/**
 *
 * @author acer
 */
public class KetNoDuLieu {

    public static Connection layKetNoi() {
//          System.out.println("Ket noi thanh cong dmmm");
        Connection ketNoi = null;
        String url = "jdbc:sqlserver://;databaseName=test";
        String pass = "123";
        String user = "sa";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(url, user, pass);
//            System.out.println("Ket noi thanh cong");

        } catch (ClassNotFoundException | SQLException ex) {
//            System.out.println("FAILED");
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Ket noi that bai");
        }

        return ketNoi;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("danh sach nhan vien");
        KetNoDuLieu kn = new KetNoDuLieu();
        layKetNoi();
//        kn.dangNhap("nv1@gmail.com", "123");
//        System.err.println("1");
//        kn.layKetNoi();
//        System.err.print("2");
//        kn.layNhanVien();
//        kn.phanPhoiDonHangChoBep("dh48");
//         kn.luuChiTietKhachHang("0886376012", "1111", "111", "222", "hd3", "i20");
//        Date date = new Date(2021, 5, 7);
//      kn.capNhatHoaDon("NV1","NV2", "HD1");
//         kn.luuHoaDon("hd1001", date, "nv3", 0, "chờ", "dat onlie", "nv3", "0886376012", 0, "dagiao");
//          System.err.println("3");
//        List<MonAn> layMonAn = kn.layMonAn();
//          System.err.println("4");
//        kn.layHoaDoncanhoanthanh();
//        kn.layChiTietHoaDon();
//        kn.layChiTietKhachHang();
//        kn.layChiTietThucDon();
//        kn.layDangNhap();
//        kn.layHoNHaDon();
//        kn.layKhachHang();
//        kn.layMonAn();
//        kn.layThucDon();
//        kn.xoaChiTietHoaDon("hd2");
//        kn.xoaChiTietKhachHang("0932145905"); da test thanh cong
//        kn.xoaHoaDon("hd2");
//        kn.xoaChiTietThucDon("td1");        
//        kn.xoaThucDon("td1");da test thanh cong
//        kn.xoaNhanVien("nv1");
//          kn.xoaChiTietThucDon("td2");        
//          kn.xoaThucDon("td2");da test thanh cong
//          kn.xoaNhanVien("nv2");
//kn.layThucDonTheoThoiGianThuc();
    }

    public void capNhatHoaDon(String maNV, String MaNVGH, String Mahd) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "UPDATE HOADON SET MANHANVIEN = ? , MANHANVIENGIAOHANG= ? WHERE MAHOADON = ?";
        try {

            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maNV);
            ps.setString(2, MaNVGH);
            ps.setString(3, Mahd);
//            ps.setBytes(4, hinhAnh);
//            ps.setInt(3, giaTien);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/*
    public int tinhLuongDoKhongBanHet() {

        return 0;
    }

    public int tinhtongdoanhthu() {
        return 0;
    }

    public nguoiDungDangNhap dangNhap(String nguoiDung, String matKhau) throws SQLException {
        nguoiDungDangNhap taiKhoan = new nguoiDungDangNhap();
//        taiKhoan= null;
//          System.out.println("da dnag hdsfdssfdhsdjsjsjdjsdnhao vo nha dmmmm");
        String sql = "select nguoidung,SDT  from dangnhap, khachhang where dangnhap.nguoidung ='" + nguoiDung + "' and dangnhap.matkhau = '" + matKhau + "' and khachhang.email='" + nguoiDung + "'";
        Connection kn = KetNoDuLieu.layKetNoi();
        PreparedStatement ps = kn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs != null) {
            while (rs.next()) {

                taiKhoan.setMaNguoiDung(rs.getString("SDT"));
                rs.getString("nguoidung");
            }

//            System.out.println("ketNoiDatabase.KetNoiSQL.dangNhap()"+taiKhoan.getMaNguoiDung()+"  "+taiKhoan.getPhanQuyen());
            if (taiKhoan.getMaNguoiDung() != null) {
                taiKhoan.setPhanQuyen("khach");
                return taiKhoan;
            }

        }
        Connection kn1 = KetNoDuLieu.layKetNoi();
        String hoatDong = "";
        String sql1 = "select nguoidung, phanquyen,TinhTrangHoatDong from dangnhap, nhanvien where dangnhap.nguoidung ='" + nguoiDung + "' and dangnhap.matkhau = '" + matKhau + "' and nhanvien.email='" + nguoiDung + "'";
        PreparedStatement ps1 = kn1.prepareStatement(sql1);
        ResultSet rs1 = ps1.executeQuery();
        if (rs1 != null) {
            while (rs1.next()) {
                taiKhoan.setMaNguoiDung(rs1.getString("nguoidung"));
                taiKhoan.setPhanQuyen(rs1.getString("phanquyen"));
                hoatDong = rs1.getString("tinhtranghoatdong");
            }
//          
            hoatDong = XuLyChuanHoa.xoakhoangtrong(hoatDong);
//            System.out.println("ketNoiDatabase.KetNoiSQL.dangNhap()" + taiKhoan.getMaNguoiDung() + "  " + taiKhoan.getPhanQuyen());
            if (hoatDong.equals("hd")) {
                if (taiKhoan.getMaNguoiDung() != null) {
                    thayDoiTrangThaiLamViec(nguoiDung, 1);
                    return taiKhoan;
                }
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");

                JOptionPane.showMessageDialog(frame,
                        "Vui lòng liên hệ Admin để cấp quyền hoạt động",
                        "",
                        JOptionPane.DEFAULT_OPTION);
            }
//           
        }

        taiKhoan = null;
        return taiKhoan;
    }

    public void thayDoiTrangThaiLamViec(String eMailNhanVien, int tinhtrang) {
        Connection kn = KetNoDuLieu.layKetNoi();
        byte lamViec = 0;
        if (tinhtrang == 1) {
            lamViec = 1;
        } else {
            tinhtrang = 0;
        }
        String sql = "UPDATE NhanVien SET lamviec=? WHERE email='" + eMailNhanVien + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setByte(1, lamViec);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String timMaNhanVienTheoGmail(String gmail) {
        try {
            Connection kn1 = KetNoDuLieu.layKetNoi();
//        System.out.println("ket noi nhan vien");
            String sql1 = "select MaNhanVien from nhanvien where nhanvien.email='" + gmail + "'";

            PreparedStatement ps1 = kn1.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1 != null) {
                while (rs1.next()) {
                    return rs1.getString("MANHANVIEN");
                }
//

//           
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public ChiTietKhachHang timChiTietKhachHang(String MaHoaDon) {
        try {
            ChiTietKhachHang ChiTiet = new ChiTietKhachHang();
            String sql = "select * From ChiTietKhachHang where MaHoaDon ='" + MaHoaDon + "'";
            Connection kn = layKetNoi();
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rs.getString("maKhangHang");
                ChiTiet.setSDTNhan(rs.getString("sdtnhan"));
                ChiTiet.setTenNguoiNhan(rs.getString("tennguoinhan"));
                ChiTiet.setGhiChu(rs.getString("ghichu"));
                ChiTiet.setMaHoaDon(rs.getString("mahoadon"));
                ChiTiet.setDiaChiNhan(rs.getString("diachinhan"));
                return ChiTiet;
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public List<NhanVien> layNhanVien() {
        List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
        ChuanHoaDuLieu chuanHoa = new ChuanHoaDuLieu();

        String sql = "select * from NhanVien";

        Connection kn = layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nvTam = new NhanVien();
                String maNhanVien = rs.getString("MaNhanVien");

                String tenNhanVien = rs.getString("TenNhanVien");
                String sDT = rs.getString("SDT");
                Date namSinh = rs.getDate("NamSinh");
                String cMND = rs.getString("CMND");
                String phanQuyen = rs.getString("PhanQuyen");
                String Email = rs.getString("email");
                String GioiTinhString = rs.getString("GioiTinh");
                String tinhtranghoatdong = rs.getString("TinhTrangHoatDong");
                nvTam.setMaNhanVien(maNhanVien);
                nvTam.setTenNhanVien(tenNhanVien);
                nvTam.setSDT(sDT);
                nvTam.setNamSinh(namSinh);
                nvTam.setCMND(cMND);
                nvTam.setPhanQuyen(phanQuyen);
                nvTam.setEmail(Email);
                nvTam.setGioiTinh(GioiTinhString);
                nvTam.setTinhTrangHoatDong(tinhtranghoatdong);
                nvTam.setLamviec(rs.getByte("LamViec"));
                if (chuanHoa.chuanHoa(nvTam.getMaNhanVien()).equals("PP") == false) {
                    listNhanVien.add(nvTam);
                }

//                System.out.println(maNhanVien);
//                System.out.println(tenNhanVien);
//                System.out.println(sDT);
//                System.out.println(namSinh);
//                System.out.println(cMND);
//                System.out.println(phanQuyen);
//                System.out.println(Email);
//                System.out.println(GioiTinhString);
//                System.out.println(tinhtranghoatdong);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNhanVien;

    }

    public List<NhanVien> layNhanVienTheophanQuyen(String PhanQuyen) {
        List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
        ChuanHoaDuLieu chuanHoa = new ChuanHoaDuLieu();

        String sql = "select * from NhanVien where phanquyen='" + PhanQuyen + "'";

        Connection kn = layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nvTam = new NhanVien();
                String maNhanVien = rs.getString("MaNhanVien");

                String tenNhanVien = rs.getString("TenNhanVien");
                String sDT = rs.getString("SDT");
                Date namSinh = rs.getDate("NamSinh");
                String cMND = rs.getString("CMND");
                String phanQuyen = rs.getString("PhanQuyen");
                String Email = rs.getString("email");
                String GioiTinhString = rs.getString("GioiTinh");
                String tinhtranghoatdong = rs.getString("TinhTrangHoatDong");
                rs.getByte("LamViec");
                nvTam.setMaNhanVien(maNhanVien);
                nvTam.setTenNhanVien(tenNhanVien);
                nvTam.setSDT(sDT);
                nvTam.setNamSinh(namSinh);
                nvTam.setCMND(cMND);
                nvTam.setPhanQuyen(phanQuyen);
                nvTam.setEmail(Email);
                nvTam.setGioiTinh(GioiTinhString);
                nvTam.setTinhTrangHoatDong(tinhtranghoatdong);
                if (chuanHoa.chuanHoa(nvTam.getMaNhanVien()).equals("PP") == false) {
                    listNhanVien.add(nvTam);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNhanVien;

    }

    public List<NhanVien> layNhanVienTheophanQuyenDangLamViec(String PhanQuyen) {
        List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
        ChuanHoaDuLieu chuanHoa = new ChuanHoaDuLieu();
      byte lamviec= 1;
        String sql = "select * from NhanVien where phanquyen='" + PhanQuyen + "'and lamviec="+lamviec+"";

        Connection kn = layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nvTam = new NhanVien();
                String maNhanVien = rs.getString("MaNhanVien");

                String tenNhanVien = rs.getString("TenNhanVien");
                String sDT = rs.getString("SDT");
                Date namSinh = rs.getDate("NamSinh");
                String cMND = rs.getString("CMND");
                String phanQuyen = rs.getString("PhanQuyen");
                String Email = rs.getString("email");
                String GioiTinhString = rs.getString("GioiTinh");
                String tinhtranghoatdong = rs.getString("TinhTrangHoatDong");
                byte LamViec = rs.getByte("LamViec");
                nvTam.setMaNhanVien(maNhanVien);
                nvTam.setTenNhanVien(tenNhanVien);
                nvTam.setSDT(sDT);
                nvTam.setNamSinh(namSinh);
                nvTam.setCMND(cMND);
                nvTam.setPhanQuyen(phanQuyen);
                nvTam.setEmail(Email);
                nvTam.setGioiTinh(GioiTinhString);
                nvTam.setTinhTrangHoatDong(tinhtranghoatdong);
//                if (chuanHoa.chuanHoa(nvTam.getMaNhanVien()).equals("PP") == false && "hd".equals(chuanHoa.chuanHoa(tinhtranghoatdong)) && LamViec == 1) {
                    listNhanVien.add(nvTam);
//                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNhanVien;

    }

    public NhanVien timNhanVienTheoMa(String maNV) {
ChuanHoaDuLieu ch =new ChuanHoaDuLieu();
maNV=ch.chuanHoa(maNV);
        String sql = "select * from NhanVien where manhanvien = ?" ;
        Connection kn = layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1,maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nvTam = new NhanVien();
                String maNhanVien = rs.getString("MaNhanVien");
                String tenNhanVien = rs.getString("TenNhanVien");
                String sDT = rs.getString("SDT");
                Date namSinh = rs.getDate("NamSinh");
                String cMND = rs.getString("CMND");
                String phanQuyen = rs.getString("PhanQuyen");
                String Email = rs.getString("email");
                String GioiTinhString = rs.getString("GioiTinh");
                String tinhtranghoatdong = rs.getString("TinhTrangHoatDong");
                rs.getByte("LamViec");
                nvTam.setMaNhanVien(maNhanVien);
                nvTam.setTenNhanVien(tenNhanVien);
                nvTam.setSDT(sDT);
                nvTam.setNamSinh(namSinh);
                nvTam.setCMND(cMND);
                nvTam.setPhanQuyen(phanQuyen);
                nvTam.setEmail(Email);
                nvTam.setGioiTinh(GioiTinhString);
                nvTam.setTinhTrangHoatDong(tinhtranghoatdong);
                return nvTam;

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean themKhachHang(KhachHang kh, String mk) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql1 = "insert into dangnhap values (?,?)";
        String sql = "insert into KhachHang values (?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql1);
            ps.setString(1, kh.getEmail());
            ps.setString(2, mk);

            ps.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            PreparedStatement ps1 = kn.prepareStatement(sql);
            ps1.setString(1, kh.getSDT());
            ps1.setString(2, kh.getTenKhachHang());
            ps1.setString(3, kh.getDiaChi());
            ps1.setString(4, kh.getEmail());

            ps1.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public List<MonAn> layMonAn() {
        String sql = "select * from MonAn";
        List<MonAn> list = new ArrayList<>();

        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonAn monanTam = new MonAn();
                String maMon = rs.getString("MaMon");
                String tenMon = rs.getString("TenMon");

                int giaTien = rs.getInt("GiaTien");
                byte hinhAnh[] = rs.getBytes("Anh");
                monanTam.setMaMon(maMon);
                monanTam.setTenMon(tenMon);
                monanTam.setGiaTien(giaTien);
                monanTam.setImg(hinhAnh);

                list.add(monanTam);

//                System.out.println(maMon);
//                System.out.println(tenMon);
////                System.out.println(hinhAnh);
//                System.out.println(giaTien);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public void luuMonAn(String maMon, String tenMon, byte hinhAnh[], int giaTien) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into MonAn values (?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maMon);
            ps.setString(2, tenMon);
            ps.setBytes(4, hinhAnh);
            ps.setInt(3, giaTien);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<KhachHang> layKhachHang() {
        List<KhachHang> list = new ArrayList<>();
        String sql = "select * from KhachHang";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String sDT = rs.getString("SDT");
                String tenKhachHang = rs.getString("TenKhachHang");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("email");
                KhachHang kh = new KhachHang(sDT, tenKhachHang, diaChi, email);
                kh.setLitsChitietKH(layChiTietKhachHang(sDT));
                list.add(kh);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    private List<ChiTietKhachHang> layChiTietKhachHang(String maKhachHang) {
        String sql = "select * from ChiTietKhachHang where makhanghang='" + maKhachHang + "'";
        List<ChiTietKhachHang> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                rs.getString("MaKhangHang");
                String sDTNhan = rs.getString("SDTNhan");
                String tenNguoiNhan = rs.getString("TenNguoiNhan");
                String ghiChu = rs.getString("GhiChu");
                String maHoaDon = rs.getString("MaHoaDon");
                String diaChiNhan = rs.getString("DiaChiNhan");
                ChiTietKhachHang ct = new ChiTietKhachHang(sDTNhan, tenNguoiNhan, ghiChu, maHoaDon, diaChiNhan);
                list.add(ct);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<ThucDon> layThucDon() {
        List<ThucDon> list = new ArrayList<>();
        String sql = "select * from ThucDon";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Date ngayDung = rs.getDate("NgayDung");
                String maNhanVien = rs.getString("MaNhanVien");
                String maThucDon = rs.getString("MaThucDon");
                String buoiDung = rs.getString("BuoiDung");
                ThucDon td = new ThucDon(ngayDung, maNhanVien, maThucDon, buoiDung);
                td.setLitsChitietTD(layChiTietThucDon(maThucDon));
                list.add(td);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).getNgayDung().compareTo(list.get(j).getNgayDung()) > 0) {
                    ThucDon tdt = new ThucDon();
                    tdt = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tdt);
                } else if (list.get(i).getNgayDung().compareTo(list.get(j).getNgayDung()) == 0) {
                    if (list.get(i).getBuoiDung().equals("sang"));
                }

            }
        }

        return list;

    }

    public ThucDon layThucDonTheoThoiGianThuc() {
        ThucDon list = new ThucDon();
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        int gio = java.time.LocalTime.now().getHour();

        String buoi = "";
        if (5 < gio && gio <= 10) {
            buoi = "SÁNG";
        } else if (gio < 16) {
            buoi = "TRƯA";
        } else if (16 < gio && gio < 20) {
            buoi = "TỐI";
        }
        System.out.println("ketNoiDatabase.KetNoDuLieu.layThucDonTheoThoiGianThuc()" + gio + " " + buoi);
        String sql = "select * from ThucDon where ngaydung = ? and buoidung=? ";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setDate(1, date);
            ps.setString(2, buoi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Date ngayDung = rs.getDate("NgayDung");
                String maNhanVien = rs.getString("MaNhanVien");
                String maThucDon = rs.getString("MaThucDon");
                String buoiDung = rs.getString("BuoiDung");
                ThucDon td = new ThucDon(ngayDung, maNhanVien, maThucDon, buoiDung);
                td.setLitsChitietTD(layChiTietThucDon(maThucDon));
                System.err.println(td.getMaThucDon());
                return td;
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
//       System.out.println("ketNoiDatabase.KetNoDuLieu.layThucDonTheoThoiGianThuc()"+td.getMaThucDon());
        return list;

    }

    void capNhatSoluongConTrongThucDon(String Matd, String MaMon, int sl) {
        String sql = "update chitietthucdon set soluong=? where mathucdon=? and mamon=?";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setString(2, Matd);
            ps.setString(3, MaMon);
            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<ChiTietThucDon> layChiTietThucDon(String MaTD) {
        String sql = "select * from ChiTietThucDon where mathucdon='" + MaTD + "'";
        List<ChiTietThucDon> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                rs.getString("MaThucDon");
                String maMon = rs.getString("MaMon");
                int soLuong = rs.getInt("SoLuong");
                ChiTietThucDon ct = new ChiTietThucDon(maMon, soLuong);
                list.add(ct);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public HoaDon timHoaDontheoma(String MaHoaDon) {

        String sql = "select * from HoaDon Where MaHoaDon='" + MaHoaDon + "'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("ketNoiDatabase.KetNoDuLieu.timHoaDontheoma() da vao21122");
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
//                Date NgayLap = rs.getDate("NgayLap");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");
                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);

//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                System.out.println("ketNoiDatabase.KetNoDuLieu.timHoaDontheoma() da vao222");
                return hd;

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<HoaDon> layHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
//                Date NgayLap = rs.getDate("NgayLap");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                String manvbepString=rs.getString("nhanvienbep");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                  String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");//hd.setTinhTrangDonHang(Tinhtrangdonhang);
                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                list.add(hd);
//                NgayLap.get
//                System.out.println("/"maHoaDon+"/");
//                System.out.println(ngayLap.get);
//                System.out.println(maNhanVien);
//                System.out.println(tongThanhToan);
//                System.out.println(trangThaiThanhToan);
//                System.out.println(trangThaiDung);
//                System.out.println(maNhanVienGiaoHang);
//                System.out.println(maKhachHang);
//                System.out.println(danhGia);
//                System.out.println(tinhTrangDonHang);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<HoaDon> layHoaDoncanhoanthanh(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()" + MaNhanVien + "///");
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where tinhtrangdonhang='dangcho' and nhanvienbep='" + MaNhanVien + "'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
               int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep"); 
                  String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");
                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
                                
                                 hd.setTinhTrangDonHang(Tinhtrangdonhang);

//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

//                System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//                System.out.println(maHoaDon);
////                System.out.println(ngayLap);
//                System.out.println(maNhanVien);
//                System.out.println(tongThanhToan);
//                System.out.println(trangThaiThanhToan);
//                System.out.println(trangThaiDung);
//                System.out.println(maNhanVienGiaoHang);
//                System.out.println(maKhachHang);
//                System.out.println(danhGia);
//                System.out.println(tinhTrangDonHang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }
public List<HoaDon> layHoaDonhonay() {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
//        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        java.sql.Timestamp sqlDate
                        = new java.sql.Timestamp(javaTime);
//        System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()" + MaNhanVien + "///");
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon ";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                String maNhanVienbep = rs.getString("Nhanvienbep");
                                  String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang,nhanvienbep);
        hd.setTinhTrangDonHang(Tinhtrangdonhang); 
        hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if ((sqlDate.getYear() != sqlTimestamp.getYear() || sqlDate.getMonth() != sqlTimestamp.getMonth()) || sqlDate.getDay() != sqlTimestamp.getDay()) {
                } else {
                    //                   System.out.println(String.valueOf(sqlDate.getDate())+"ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+"/"+String.valueOf(sqlTimestamp.getDate());

                    list.add(hd);
//                    System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDonhonay()da the vao");
                }
//
////                System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
////                System.out.println(maHoaDon);
//////                System.out.println(ngayLap);
////                System.out.println(maNhanVien);
////                System.out.println(tongThanhToan);
////                System.out.println(trangThaiThanhToan);
////                System.out.println(trangThaiDung);
////                System.out.println(maNhanVienGiaoHang);
////                System.out.println(maKhachHang);
////                System.out.println(danhGia);
////                System.out.println(tinhTrangDonHang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        list.sort(c);
        return list;
    }

    public List<HoaDon> layHoaDoncanGiao(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where trangthaidung='datonlie' and tinhtrangdonhang='hoanthanh' and manhanviengiaohang='" + MaNhanVien + "'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

//                System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//                System.out.println(maHoaDon);
////                System.out.println(ngayLap);
//                System.out.println(maNhanVien);
//                System.out.println(tongThanhToan);
//                System.out.println(trangThaiThanhToan);
//                System.out.println(trangThaiDung);
//                System.out.println(maNhanVienGiaoHang);
//                System.out.println(maKhachHang);
//                System.out.println(danhGia);
//                System.out.println(tinhTrangDonHang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }

    public List<HoaDon> layHoaDoncuaNhanVienDaChon(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncuaNhanVienDaChon()" + MaNhanVien);
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where MaNhanVienGiaoHang='" + MaNhanVien + "'" + " and tinhtrangdonhang= 'danggiao'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
              int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

//                System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//                System.out.println(maHoaDon);
////                System.out.println(ngayLap);
//                System.out.println(maNhanVien);
//                System.out.println(tongThanhToan);
//                System.out.println(trangThaiThanhToan);
//                System.out.println(trangThaiDung);
//                System.out.println(maNhanVienGiaoHang);
//                System.out.println(maKhachHang);
//                System.out.println(danhGia);
//                System.out.println(tinhTrangDonHang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }

    public List<HoaDon> layHoaDoncuaNhanVienBep(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where MaNhanVien='" + MaNhanVien + "'" + " and tinhtrangdonhang= 'danggiao'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }

    public List<ChiTietHoaDon> layChiTietHoaDon(String MaHD) {
        String sql = "select * from ChiTietHoaDon where mahoadon='" + MaHD + "'";
        List<ChiTietHoaDon> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                rs.getString("MaHoaDon");
                String maMon = rs.getString("MaMon");
                int soLuong = rs.getInt("SoLuong");
                ChiTietHoaDon cthd = new ChiTietHoaDon(maMon, soLuong);
                list.add(cthd);
//                System.out.println(maHoaDon);
//                System.out.println(maMon);
//                System.out.println(soLuong);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void luuThucDon(Date ngayDung, String maNhanVien, String maThucDon, String buoiDung) {
        Connection kn = KetNoDuLieu.layKetNoi();
//        System.out.print(" DSGAQAHJSHJASFGSDA1");
        String sql = "insert into ThucDon values (?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
//            System.out.print(" DSGAQAHJSHJASFGSDA2");
            ps.setDate(1, ngayDung);
            ps.setString(2, maNhanVien);
            ps.setString(3, maThucDon);
            ps.setString(4, buoiDung);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.print(" DSGAQAHJSHJASFGSDA");
    }

    public void luuChiTietThucDon(String maThucDon, String maMon, int soLuong) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into ChiTietThucDon values (?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maThucDon);
            ps.setString(2, maMon);
            ps.setInt(3, soLuong);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void luuHoaDon(String maHoaDon, Date ngayLap, String maNhanVien,
            int tongThanhToan, String trangThaiThanhToan, String trangThaiDung,
            String maNhanVienGiaoHang, String maKhachHang, int danhGia, String tinhTrangDonHang, String nvBep) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into HoaDon values (?,CURRENT_TIMESTAMP,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maHoaDon);
//            ps.setDate(2, CURRENT_TIMESTAMP);
            ps.setString(2, maNhanVien);
            ps.setInt(3, tongThanhToan);
            ps.setString(4, trangThaiThanhToan);
            ps.setString(5, trangThaiDung);
            ps.setString(6, maNhanVienGiaoHang);

            ps.setString(7, maKhachHang);
            ps.setInt(8, danhGia);
            ps.setString(9, tinhTrangDonHang);
            ps.setString(10, nvBep);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void luuChiTietHoaDon(String maHoaDon, String maMon, int soLuong) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into ChiTietHoaDon values (?,?,?)";

//         lay ma thuc don luc nay = thoi gian lap hoa don
        String matd = "";
        String sql1 = "update chitietthucdon set where mathucdon= '" + matd + "'" + "";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maHoaDon);
            ps.setString(2, maMon);
            ps.setInt(3, soLuong);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String sql1="selsect Mathucdon,ngay"
        ThucDon TDon = layThucDonTheoThoiGianThuc();
        int slcon = -1;
        for (ChiTietThucDon ct : TDon.getLitsChitietTD()) {
            if (ct.getMaMon().equals(maMon)) {
                slcon = ct.getSoLuong();
                break;
            }
        }
        slcon = slcon - soLuong;
        capNhatSoluongConTrongThucDon(TDon.getMaThucDon(), maMon, slcon);
    }

    int kiemTraLuongTonCuaThucDon(String MaMonAn) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        int gio = date.getHours();
        String buoi = "";
        if (5 < gio && gio <= 10) {
            buoi = "SÁNG";
        } else if (gio < 16) {
            buoi = "TRƯA";
        } else if (16 < gio && gio < 20) {
            buoi = "TỐI";
        } else {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "Căn Tin hoạt động từ 5h -> 20h vui lòng quay lại sau",
                    "",
                    JOptionPane.DEFAULT_OPTION);
        }
        // kiem tra thuc don theo buoi và ngay de lay thuc don
        timThucDon(MaMonAn);
        return 0;
    }

    public void capNhatTrangThaiDonHang(String maHoaDon, String TinhTrang) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "UPDATE HOADON SET TINHTRANGDONHANG=? WHERE MAHOADON='" + maHoaDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, TinhTrang);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void capNhatgiaohang(String maHoaDon, String TinhTrang, String MaNV) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "UPDATE HOADON SET MANHANVIENGIAOHANG='" + MaNV + "',TINHTRANGDONHANG=? WHERE MAHOADON='" + maHoaDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, TinhTrang);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void capNhatDonHangBep(String maHoaDon, String TinhTrang, String MaNV) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "UPDATE HOADON SET nhanvienbep='" + MaNV + "',TINHTRANGDONHANG=? WHERE MAHOADON='" + maHoaDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, TinhTrang);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void luuKhachHang(String sDT, String tenKhachHang, String diaChi) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into KhachHang values (?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, sDT);
            ps.setString(2, tenKhachHang);
            ps.setString(3, diaChi);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void luuNhanVien(String maNhanVien, String tenNhanVien, String sDT,
            Date namSinh, String cMND, String phanQuyen, String email, String gioiTinh, String tinhTrangHoatDong) {
        try {
            Connection kn = KetNoDuLieu.layKetNoi();
            String sql1 = "insert into DangNhap values (?,'123')";
            PreparedStatement ps1 = kn.prepareStatement(sql1);
            ps1.setString(1, email);
            ps1.executeUpdate();
            String sql = "insert into NhanVien values (?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = kn.prepareStatement(sql);
                ps.setString(1, maNhanVien);
                ps.setString(2, tenNhanVien);
                ps.setString(3, sDT);
                ps.setDate(4, namSinh);
                ps.setString(5, cMND);

                ps.setString(6, phanQuyen);
                ps.setString(7, email);
                ps.setString(8, gioiTinh);
                ps.setString(9, tinhTrangHoatDong);
                byte b = 0;
                ps.setByte(10, b);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void capnhatnhanvien(String maNhanVien, String tenNhanVien, String sDT,
            Date namSinh, String cMND, String phanQuyen, String email, String gioiTinh, String tinhTrangHoatDong) {
    Connection kn = KetNoDuLieu.layKetNoi();
    //            String sql1 = "insert into DangNhap values (?,'123')";
//            PreparedStatement ps1 = kn.prepareStatement(sql1);
//            ps1.setString(1, email);
//            ps1.executeUpdate();
String sql = "update NhanVien set tennhanvien=?,sdt=?,cmnd=?,phanquyen=?,gioitinh=?,tinhtranghoatdong=? where manhanvien=?";
try {
    PreparedStatement ps = kn.prepareStatement(sql);
//                ps.setString(1, maNhanVien);
ps.setString(1, tenNhanVien);
ps.setString(2, sDT);
//                ps.setDate(4, namSinh);
ps.setString(3, cMND);

ps.setString(4, phanQuyen);
//                ps.setString(7, email);
ps.setString(5, gioiTinh);
ps.setString(6, tinhTrangHoatDong);
ps.setString(7, maNhanVien);
//                byte b = 0;
//                ps.setByte(10, b);
ps.executeUpdate();
} catch (SQLException ex) {
    Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
}
    }

    public void luuChiTietKhachHang(String maKhachHang, String sDTNhan, String tenNguoiNhan,
            String ghiChu, String maHoaDon, String diaChiNhan) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into ChiTietKhachHang values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maKhachHang);
            ps.setString(2, sDTNhan);
            ps.setString(3, tenNguoiNhan);
            ps.setString(4, ghiChu);
            ps.setString(5, maHoaDon);
            ps.setString(6, diaChiNhan);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void phanPhoiDonHangChoBep(String maDonHang) {
        String donHang = maDonHang;
        System.out.println("ketNoiDatabase.KetNoDuLieu.phanPhoiDonHangChoBep()" + maDonHang);
        ArrayList<NhanVien> listNhanVienBepHoatDong = new ArrayList<>();
        listNhanVienBepHoatDong = (ArrayList<NhanVien>) layNhanVienTheophanQuyenDangLamViec("bep");
        System.out.println("ketNoiDatabase.KetNoDuLieu.phanPhoiDonHangChoBep() da den roi");
        int chiSo = 0;
        if (listNhanVienBepHoatDong.size() == 0) {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "Không nhan vien bếp, vui lòng liên hệ quản lý",
                    "",
                    JOptionPane.DEFAULT_OPTION);
        } else {
            maDonHang = maDonHang.replaceAll("hd", "");
            chiSo = Integer.parseInt(maDonHang) % listNhanVienBepHoatDong.size();
            capNhatDonHangBep(donHang, "dangcho", listNhanVienBepHoatDong.get(chiSo).getMaNhanVien());
            System.out.println("da phan phoi don hang111111111111111111111111111111111111111111111111111111111111111111111");
        }

    }

    public void phanPhoiDonHangChoGiaoHang(String maDonHang) {
        String donHang = maDonHang;
        ArrayList<NhanVien> listNhanVienGiaoHangHoatDong = new ArrayList<>();
        listNhanVienGiaoHangHoatDong = (ArrayList<NhanVien>) layNhanVienTheophanQuyenDangLamViec("giaoHang");
        int chiSo = 0;
        if (listNhanVienGiaoHangHoatDong.size() == 0) {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "Không có nhân vien giao hàng, vui lòng liên hệ quản lý",
                    "",
                    JOptionPane.DEFAULT_OPTION);
        } else {
            maDonHang = maDonHang.replaceAll("hd", "");
            chiSo = Integer.parseInt(maDonHang) % listNhanVienGiaoHangHoatDong.size();
            capNhatgiaohang(donHang, "danggiao", listNhanVienGiaoHangHoatDong.get(chiSo).getMaNhanVien());
        }

    }

    public boolean capNhapThongTinMon(String maMon, String Ten, Image hinhanh) {
        Connection kn = KetNoDuLieu.layKetNoi();
        XuLyHinhAnh xla = new XuLyHinhAnh();
        String sql = "UPDATE MONAN SET TENMON = ? , ANH= ? WHERE MAMON = ?";
        byte anh[] = null;
        try {
            anh = xla.toByteImage(hinhanh, "jpg");
        } catch (IOException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, Ten);
            ps.setBytes(2, anh);
            ps.setString(3, maMon);
//            ps.setBytes(4, hinhAnh);
//            ps.setInt(3, giaTien);

            ps.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
//----------------------------------------------

//    public KhachHang themKhachHang(KhachHang kh){
//        
//        return kh;
//    }
//    private void layMonAn() {
//        String sql = "select * from MonAn";
//        Connection kn = KetNoDuLieu.layKetNoi();
//        try {
//            PreparedStatement ps = kn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//
//                String maMon = rs.getString("MaMon");
//                String tenMon = rs.getString("TenMon");
//                String hinhAnh = rs.getString("HinhAnh");
//                String giaTien = rs.getString("GiaTien");
//
//                System.out.println(maMon);
//                System.out.println(tenMon);
//                System.out.println(hinhAnh);
//                System.out.println(giaTien);
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    private void luuDangNhap(String nguoiDung, String matKhau) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "insert into DangNhap values (?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, nguoiDung);
            ps.setString(2, matKhau);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int timChiTietHoaDon(String maHoaDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaHoaDon from ChiTietHoaDon where MaHoaDon='" + maHoaDon + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

//    private int timChiTietKhachHang(String maKhachHang) {
//        Connection kn = KetNoDuLieu.layKetNoi();
//        String sql = "select MaKhachHang from ChiTietKhachHang where MaKhachHang='" + maKhachHang + "'";
//        PreparedStatement ps;
//        try {
//            ps = kn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return 1;
//            } else {
//                return 0;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 0;
//
//    }
    private int timChiTietThucDon(String maThucDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaThucDon from ChiTietThucDon where MaThucDon='" + maThucDon + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timDangNhap(String nguoiDung) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select NguoiDung from DangNhap where NguoiDung='" + nguoiDung + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timHoaDon(String maHoaDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaHoaDon from HoaDon where MaHoaDon='" + maHoaDon + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timKhachHang(String sDT) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select SDT from KhachHang where SDT='" + sDT + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timMonAn(String maMon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaMon from MonAn where MaMon='" + maMon + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timNhanVien(String maNhanVien) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaNhanVien from NhanVien where MaNhanVien='" + maNhanVien + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private int timThucDon(String maThucDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "select MaThucDon from ThucDon where MaThucDon='" + maThucDon + "'";
        PreparedStatement ps;
        try {
            ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private void xoaChiTietHoaDon(String maHoaDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from ChiTietHoaDon where MaHoaDon='" + maHoaDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void xoaChiTietKhachHang(String maKhachHang) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from ChiTietKhachHang where MaKhachHang='" + maKhachHang + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void xoaHoaDon(String maHoaDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from HoaDon where MaHoaDon='" + maHoaDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void xoaChiTietThucDon(String maThucDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from ChiTietThucDon where MaThucDon='" + maThucDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void xoaDangNhap(String nguoiDung) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from DangNhap where NguoiDung='" + nguoiDung + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void xoaKhachHang(String sDT) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from KhachHang where SDT='" + sDT + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean xoaMonAn(String maMon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from MonAn where MaMon='" + maMon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    private void xoaNhanVien(String maNhanVien) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from NhanVien where MaNhanVien='" + maNhanVien + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void xoaThucDon(String maThucDon) {
        Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "delete from ThucDon where MaThucDon='" + maThucDon + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void capNhatMatKhau(String NguoiDung, String mk){
         Connection kn = KetNoDuLieu.layKetNoi();
        String sql = "update dangnhap set matkhau = '"+mk+"'where nguoidung='"+NguoiDung+"'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  public int doanhThuNgay(Date date){
       int dt=0;
   
        String sql = "select ngaylap,tongthanhtoan  from hoadon";
//        List<ChiTietKhachHang> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 java.sql.Timestamp T
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime()); 
                if(date.getDate()==T.getDate()&&date.getMonth()==T.getMonth()&&date.getYear()==T .getYear())
                
               dt=dt+ rs.getInt("tongthanhtoan");
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("ketNoiDatabase.KetNoDuLieu.doanhThuNgay()"+ date+" doanh thu"+dt);
        return dt;
    }

    public int LuongTonNgay(Date date) {
         int dt=0;
   ArrayList<ThucDon> listtd = (ArrayList<ThucDon>) this.layThucDon();
   ArrayList<MonAn> listMonAns= (ArrayList<MonAn>) this .layMonAn();
   for(ThucDon td :listtd){
       if(date.getDate() == td.getNgayDung().getDate()&&date.getMonth()== td.getNgayDung().getMonth()&&date.getYear()== td.getNgayDung().getYear()){
           for(ChiTietThucDon ct : td.getLitsChitietTD()){
                for(MonAn ma :listMonAns){
                    if(ma.getMaMon().equals(ct.getMaMon())){
                        dt=ma.getGiaTien()*ct.getSoLuong()+dt ;
                    }
                }
           }
       }
   }
        return dt;
    }

    public int doanhThuThang(int m, int y) {
            int dt=0;
   
        String sql = "select ngaylap,tongthanhtoan  from hoadon";
//        List<ChiTietKhachHang> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 java.sql.Timestamp T
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime()); 
                if(m==T.getMonth()&&y==T .getYear())
                
               dt=dt+ rs.getInt("tongthanhtoan");
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
//         System.out.println("ketNoiDatabase.KetNoDuLieu.doanhThuNgay()"+ date+" doanh thu"+dt);
        return dt;
    }

    public int LuongTonThang(int m, int y) {
           int dt=0;
   ArrayList<ThucDon> listtd = (ArrayList<ThucDon>) this.layThucDon();
   ArrayList<MonAn> listMonAns= (ArrayList<MonAn>) this .layMonAn();
   for(ThucDon td :listtd){
       if(m== td.getNgayDung().getMonth()&&y== td.getNgayDung().getYear()){
           for(ChiTietThucDon ct : td.getLitsChitietTD()){
                for(MonAn ma :listMonAns){
                    if(ma.getMaMon().equals(ct.getMaMon())){
                        dt=ma.getGiaTien()*ct.getSoLuong()+dt ;
                    }
                }
           }
       }
   }
        return dt;
    }
    

    public int doanhThuNam(int y) {
         int dt=0;
   
        String sql = "select ngaylap,tongthanhtoan  from hoadon";
//        List<ChiTietKhachHang> list = new ArrayList<>();
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 java.sql.Timestamp T
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime()); 
                if(y==T .getYear())
                
               dt=dt+ rs.getInt("tongthanhtoan");
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
//         System.out.println("ketNoiDatabase.KetNoDuLieu.doanhThuNgay()"+ date+" doanh thu"+dt);
        return dt;
    }

    public int LuongTonNam(int y) {
            int dt=0;
   ArrayList<ThucDon> listtd = (ArrayList<ThucDon>) this.layThucDon();
   ArrayList<MonAn> listMonAns= (ArrayList<MonAn>) this .layMonAn();
   for(ThucDon td :listtd){
       if(y== td.getNgayDung().getYear()){
           for(ChiTietThucDon ct : td.getLitsChitietTD()){
                for(MonAn ma :listMonAns){
                    if(ma.getMaMon().equals(ct.getMaMon())){
                        dt=ma.getGiaTien()*ct.getSoLuong()+dt ;
                    }
                }
           }
       }
   }
        return dt;
    }
    
    /////////////////////////////////////////
    public List<HoaDon> layHoaDoncuaNhanVienBepHomNay(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where nhanvienbep='" + MaNhanVien + "'" ;
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
               int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }
public List<HoaDon> layHoaDoncuaNhanVienGiaoHangHomNay(String MaNhanVien) {
    System.err.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncuaNhanVienGiaoHangHomNay()"+MaNhanVien);
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where MaNhanViengiaohang='" + MaNhanVien +"'";
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }
public List<HoaDon> layHoaDoncuaNhanVienBanHangHomNay(String MaNhanVien) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where MaNhanVien='" + MaNhanVien + "'" ;
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
                String maNhanVien = rs.getString("MaNhanVien");
                int tongThanhToan = rs.getInt("TongThanhToan");
                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
                String trangThaiDung = rs.getString("TrangThaiDung");
                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
                String maKhachHang = rs.getString("MaKhachHang");
                int danhGia = rs.getInt("DanhGia");
                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
                  String maNhanVienbep = rs.getString("Nhanvienbep");
                                    String Tinhtrangdonhang = rs.getString("tinhtrangdonhang");

                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, tongThanhToan, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang, maNhanVienbep, maNhanVienGiaoHang);
               hd.setTinhTrangDonHang(Tinhtrangdonhang);
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    list.add(hd);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getNgayLap().compareTo(o2.getNgayLap());
            }
        });
//        list.sort(c);
        return list;
    }

//   public List<HoaDon> layHoaDonHomNay() {
//        java.util.Date javaDate = new java.util.Date();
//        long javaTime = javaDate.getTime();
//        java.sql.Date sqlDate = new java.sql.Date(javaTime);
//
//        List<HoaDon> list = new ArrayList<>();
//        String sql = "select * from HoaDon where MaNhanVien='" + //MaNhanVien + "'" + " and tinhtrangdonhang= 'danggiao'";
//        Connection kn = KetNoDuLieu.layKetNoi();
//        try {
//            PreparedStatement ps = kn.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//
//                String maHoaDon = rs.getString("MaHoaDon");
//                java.sql.Timestamp sqlTimestamp
//                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
////             ;   Date NgayLap = ;
//                String maNhanVien = rs.getString("MaNhanVien");
//                String tongThanhToan = rs.getString("TongThanhToan");
//                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
//                String trangThaiDung = rs.getString("TrangThaiDung");
//                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
//                String maKhachHang = rs.getString("MaKhachHang");
//                int danhGia = rs.getInt("DanhGia");
//                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
//                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
//                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
////                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
//                    list.add(hd);
//                }
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collections.sort(list, new Comparator<HoaDon>() {
//            @Override
//            public int compare(HoaDon o1, HoaDon o2) {
//                return o1.getNgayLap().compareTo(o2.getNgayLap());
//            }
//        });
////        list.sort(c);
//        return list;
//    }
// 
//     public List<HoaDon> layHoaDonKhachHang() {
//        java.util.Date javaDate = new java.util.Date();
//        long javaTime = javaDate.getTime();
//        java.sql.Date sqlDate = new java.sql.Date(javaTime);
//
//        List<HoaDon> list = new ArrayList<>();
//        String sql = "select * from HoaDon where MaNhanVien='" + MaNhanVien + "'" + " and tinhtrangdonhang= 'danggiao'";
//        Connection kn = KetNoDuLieu.layKetNoi();
//        try {
//            PreparedStatement ps = kn.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//
//                String maHoaDon = rs.getString("MaHoaDon");
//                java.sql.Timestamp sqlTimestamp
//                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
////             ;   Date NgayLap = ;
//                String maNhanVien = rs.getString("MaNhanVien");
//                String tongThanhToan = rs.getString("TongThanhToan");
//                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
//                String trangThaiDung = rs.getString("TrangThaiDung");
//                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
//                String maKhachHang = rs.getString("MaKhachHang");
//                int danhGia = rs.getInt("DanhGia");
//                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
//                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
//                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
////                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
//                    list.add(hd);
//                }
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collections.sort(list, new Comparator<HoaDon>() {
//            @Override
//            public int compare(HoaDon o1, HoaDon o2) {
//                return o1.getNgayLap().compareTo(o2.getNgayLap());
//            }
//        });
////        list.sort(c);
//        return list;
//    }

    public int laytonghoadonngayhomnay() {
               java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);

        List<HoaDon> list = new ArrayList<>();
        String sql = "select mahoadon, ngaylap from HoaDon ";
        int d=0;
        Connection kn = KetNoDuLieu.layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maHoaDon = rs.getString("MaHoaDon");
                java.sql.Timestamp sqlTimestamp
                        = new java.sql.Timestamp(rs.getTimestamp("NgayLap").getTime());
//             ;   Date NgayLap = ;
//                String maNhanVien = rs.getString("MaNhanVien");
//                String tongThanhToan = rs.getString("TongThanhToan");
//                String trangThaiThanhToan = rs.getString("TrangThaiThanhToan");
//                String trangThaiDung = rs.getString("TrangThaiDung");
//                String maNhanVienGiaoHang = rs.getString("MaNhanVienGiaoHang");
//                String maKhachHang = rs.getString("MaKhachHang");
//                int danhGia = rs.getInt("DanhGia");
//                String tinhTrangDonHang = rs.getString("TinhTrangDonHang");
//                HoaDon hd = new HoaDon(maHoaDon, sqlTimestamp, maNhanVien, danhGia, trangThaiThanhToan, trangThaiDung, maNhanVienGiaoHang, maKhachHang);
//                hd.setLitsChitietHD(layChiTietHoaDon(maHoaDon));
                if (sqlDate.getYear() == sqlTimestamp.getYear() && sqlDate.getMonth() == sqlTimestamp.getMonth() && sqlDate.getDay() == sqlTimestamp.getDay()) {
//                   System.out.println("ketNoiDatabase.KetNoDuLieu.layHoaDoncanhoanthanh()"+maHoaDon);
                    d++;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
  public  void capnhatquyen(String email, String quyen) throws SQLException{
        String sql ="update nhanvien set phanquyen =? where email=?";
       
            Connection kn = KetNoDuLieu.layKetNoi();
      
        try {

            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(2, email);
            ps.setString(1, quyen);
//            ps.setString(3, Mahd);
//            ps.setBytes(4, hinhAnh);
//            ps.setInt(3, giaTien);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }

    public void capnhatdunghoatdong(String email, String tinhtrang) {
         String sql ="update nhanvien set tinhtranghoatdong =? where email=?";
       
            Connection kn = KetNoDuLieu.layKetNoi();
      
        try {

            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, tinhtrang);
            ps.setString(2, email);
//            ps.setString(3, Mahd);
//            ps.setBytes(4, hinhAnh);
//            ps.setInt(3, giaTien);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
        
        */
        
    
}
