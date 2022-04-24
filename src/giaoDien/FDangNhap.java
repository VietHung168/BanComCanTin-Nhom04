///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package giaoDien;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.border.Border;
//import duLieu.*;
//import java.awt.Image;
//import java.awt.event.KeyEvent;
//import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
//import java.awt.image.ImageProducer;
//import java.io.File;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import ketNoiDatabase.*;
//import java.sql.Date;
//import javax.swing.Icon;
//import duLieu.ChuanHoaDuLieu;
//import java.awt.CardLayout;
//import java.awt.Component;
//import java.io.FileOutputStream;
//import javax.swing.JPanel;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableCellRenderer;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
///**
// *
// * @author hung
// */
//public class FDangNhap extends javax.swing.JFrame {
// public void capNhatNhanVienLamViec() {
//
//        LuongCapNhatTinhTrangLamViecNhanVien = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                    System.err.println("luong .run()");
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//                    }
////                    docDuLieu();
//                    setDanhSachNhanVien((ArrayList<NhanVien>) Ketnoi.layNhanVien());
//                    capNhatTinhTrangLamViecCacNhanVien();   
//                }
//
//            }
//
//        });
//        LuongCapNhatTinhTrangLamViecNhanVien.start();
//    }
//
//    public void capNhatThucDonKhachHang() {
//
//        LuongCapNhatThucDonKhachHang = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                    System.err.println("luong .run()");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//                    }
////                    docDuLieu();
//                    setDanhSachThucDon((ArrayList<ThucDon>) Ketnoi.layThucDon());
//                    khoiTaoDuLieuCacThanhPhanKhachHang();
//                }
//
//            }
//
//        });
//        LuongCapNhatThucDonKhachHang.start();
//    }
//
//    public void capNhatThucDonBanHang() {
//
//        LuongCapNhatThucDonBanHang = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                     System.err.println("luong .run()");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//                    }
////               docDuLieu();
//                    setDanhSachThucDon((ArrayList<ThucDon>) Ketnoi.layThucDon());
//                    khoiTaoDuLieuCacThanhPhanBanHang();
//                }
//
//            }
//
//        });
//        LuongCapNhatThucDonBanHang.start();
//    }
//public void capNhatDonHangBep() {
//
//        LuongCapNhatNhatDonHangBep = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                     System.err.println("luong .run()");
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//                    }
////               docDuLieu();
////                    setDanhSachThucDon((ArrayList<ThucDon>) Ketnoi.layThucDon());
//                 khoiTaoDuLieuCacThanhPhanBep();
//khoiTaoDuLieuHoatDongBep();
//                }
//
//            }
//
//        });
//        LuongCapNhatNhatDonHangBep .start();
//    }
//public void capNhatDonHangDiGiao() {
//
//       LuongCapNhatDonHangDiGiao = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                     System.err.println("luong .run()");
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//                    }
////               docDuLieu();
////                   showDanhSachDonHangCanGiao();
//showBangCacDonHangNhanVienDaChon();
//                }
//
//            }
//
//        });
//        LuongCapNhatDonHangDiGiao.start();
//    }
//public void CapNhatTienTrinhGiaoHang(String MaHoaDon){
//    
//    
//}
//    /**
//     * Creates new form FDangNhap
//     */
//    nguoiDungDangNhap nguoidung = new nguoiDungDangNhap();
//    ArrayList<ThucDon> danhSachThucDon = new ArrayList<>();
//    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
//    ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
//    ArrayList<KhachHang> danhsachKhachHang = new ArrayList<>();
//    ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();
//    Thread LuongCapNhatThucDonKhachHang;
//    Thread LuongCapNhatThucDonBanHang;
//    Thread LuongCapNhatNhatDonHangBep;
//    Thread LuongCapNhatDonHangDiGiao;
//    Thread LuongCapNhatTinhTrangLamViecNhanVien;
//    KetNoDuLieu Ketnoi = new KetNoDuLieu();
//
////    DefaultTableModel model;
//    public FDangNhap() {
//        initComponents();
//         FKhachHang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         FBep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         FGiaoHang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         FBanHang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Fadmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Border border = BorderFactory.createBevelBorder(0, Color.yellow, Color.YELLOW);
//        jPanel1.setBackground(new Color(255, 255, 255, 150));
//        jPanel1.setBorder(border);
//        jPanel4.setBackground(new Color(0, 0, 0, 210));
//       
//        
//
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlKhachHangMoi = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textTenDK = new javax.swing.JTextField();
        textSDTDK = new javax.swing.JTextField();
        textDiaChiDK = new javax.swing.JTextField();
        textEmailDK = new javax.swing.JTextField();
        btDKKhachHang = new javax.swing.JButton();
        btHuyDKkHachHang = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textmatkhauDK = new javax.swing.JPasswordField();
        textconfMatKhau = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        textGioiTinh = new javax.swing.JTextField();
        Fadmin = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DoanhThu_Admin = new javax.swing.JTable();
        bt_xuatFileDoanhThuNgay_Admin = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        bt_tkDTTheoNgay_DoanhThu_Admin = new javax.swing.JButton();
        bt_tkDTTheoThang_DoanhThu_Admin = new javax.swing.JButton();
        bt_tkDTTheoNam_DoanhThu_Admin = new javax.swing.JButton();
        pn_bieuDoThuNhapNgay = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tb_danhSachNhanVienGiaoHang_AD = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        tb_TongDonHangXuLyGiaoHang_AD = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txt_manhanvientheodoiGiaoHang_Ad = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tb_danhSachNhanvVienBanHang_AD = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        tb_TongDonHangXuLyBanHang_AD = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        txt_manhanvientheodoibanhang_Ad = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tb_danhSachNhanVienBep_AD = new javax.swing.JTable();
        jScrollPane31 = new javax.swing.JScrollPane();
        tb_TongDonHangXuLyBep_AD = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_manhanvientheodoiBep_Ad = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tb_danhSachDonHang_AD = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        txt_tongdodonhangtrongngay_ad = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_DanhSachNhanVien_AD = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        bt_themnhanVien_AD = new javax.swing.JButton();
        bt_ChiTietNhanVien_Ad = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        hotenAdmin = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tb_dskhachhang_AD = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        bt_doiVaiTroBep_AD = new javax.swing.JButton();
        bt_doivaitrogiaohang_ad = new javax.swing.JButton();
        bt_doivaitrobanhang_ad = new javax.swing.JButton();
        bt_themQuanTriVien = new javax.swing.JButton();
        cbb_lauchonquantrivien_ = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jtxtfield_PassHienTai_Bep1 = new javax.swing.JPasswordField();
        jtxtfield_PassMoi_Bep1 = new javax.swing.JPasswordField();
        jtxtfield_XacNhanPass_Bep1 = new javax.swing.JPasswordField();
        jBtCapNhapPass_Bep1 = new javax.swing.JButton();
        jBtBoquaPass_Bep1 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        bt_DungQuyenQuanTri = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        FGiaoHang = new javax.swing.JFrame();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPThongtinNhanVien = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txt_mahoadonTimKiem_giaoHang = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_DonHang_giaohnag = new javax.swing.JTextField();
        bt_xacNhanThanhToan_GiaoHang = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_thongTinDonHang_GiaoHang = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        bt_ChiTietDonHang_giaoHang = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_GiaoHang = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jtxtfield_PassHienTai_GiaoHang = new javax.swing.JPasswordField();
        jtxtfield_PassMoi_GiaoHang = new javax.swing.JPasswordField();
        jtxtfield_XacNhanPass_GiaoHang = new javax.swing.JPasswordField();
        jBtCapNhapPass_GiaoHang = new javax.swing.JButton();
        jBtBoquaPass_GiaoHang = new javax.swing.JButton();
        panelComponent = new javax.swing.JPanel();
        FKhachHang = new javax.swing.JFrame();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel46 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        pn_ThucDonKhachHang = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txt_khachNhanHang_khackHang = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_ngayHienTai_KhachHang = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tb_MonDaChon_KhackHang = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txt_tongThanhToan_KhackHang = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_monchon_khachHang_khackHang = new javax.swing.JTextField();
        bt_DatHang_KhachHang = new javax.swing.JButton();
        bt_HuyMonDaChon_KhachHang = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txt_SDTkhachNhanHang_khackHang = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_DiaChikhachNhanHang_khackHang = new javax.swing.JTextField();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        TinhTrangGiaoKhachHang = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jtxtfield_PassHienTai_Khach = new javax.swing.JPasswordField();
        jtxtfield_PassMoi_Khach = new javax.swing.JPasswordField();
        jtxtfield_XacNhanPass_Khach = new javax.swing.JPasswordField();
        jBtCapNhapPass_Khach = new javax.swing.JButton();
        jBtBoquaPass_Khach = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        FBep = new javax.swing.JFrame();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        pn_HoatDong_Bep = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_danhSachDonHang_Bep = new javax.swing.JTable();
        bt_HoanThanhDonHang_Bep = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_ChitietDonHang_Bep = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txt_ghichuchodonhang_bep = new javax.swing.JTextArea();
        txt_MaDonHang_Bep = new javax.swing.JTextField();
        txt_trangThaiDungdonhang_bep = new javax.swing.JTextField();
        pn_Menu_Bep = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        menu_Bep = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tb_DanhSachThucDon_menu_Bep = new javax.swing.JTable();
        bt_taothucdonmoi_bep = new javax.swing.JButton();
        btTroLaiTrangChu = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pn_MonAn_Bep = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tb_DanhSachMonAn_Bep = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lb_img_MonAn_Bep = new javax.swing.JLabel();
        txt_MaMon_MonAn_Bep = new javax.swing.JTextField();
        txt_TenMon_MonAn_Bep = new javax.swing.JTextField();
        txt_Gia_MonAn_Bep = new javax.swing.JTextField();
        bt_ThemMon_MonAn_Bep = new javax.swing.JButton();
        bt_SuaMon_MonAn_Bep = new javax.swing.JButton();
        bt_XoaMon_MonAn_Bep = new javax.swing.JButton();
        pn_Exit_Bep = new javax.swing.JPanel();
        pn_HeThong_Bep = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jtxtfield_PassHienTai_Bep = new javax.swing.JPasswordField();
        jtxtfield_PassMoi_Bep = new javax.swing.JPasswordField();
        jtxtfield_XacNhanPass_Bep = new javax.swing.JPasswordField();
        jBtCapNhapPass_Bep = new javax.swing.JButton();
        jBtBoquaPass_Bep = new javax.swing.JButton();
        FBanHang = new javax.swing.JFrame();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel74 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        pn_menu_BanHang = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tb_MonDaChon_nhanVienBanHang = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        bt_BanHan_BanHang = new javax.swing.JButton();
        txt_tongThanhToan_BanHang = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        bt_HuyMon_BanHang = new javax.swing.JButton();
        txt_Ngayhientai_BanHang = new javax.swing.JTextField();
        cb_MangVe = new javax.swing.JCheckBox();
        cb_dungTaiCho = new javax.swing.JCheckBox();
        txt_MonDaChon_BanHang = new javax.swing.JTextField();
        txt_TongthanhToan_BanHang = new javax.swing.JTextField();
        jPanel76 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jtxtfield_PassHienTai_BanHang = new javax.swing.JPasswordField();
        jtxtfield_PassMoi_BanHang = new javax.swing.JPasswordField();
        jtxtfield_XacNhanPass_BanHang = new javax.swing.JPasswordField();
        jBtCapNhapPass_BanHang = new javax.swing.JButton();
        jBtBoquaPass_BanHang = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        dl_themMon_bep = new javax.swing.JDialog();
        txt_Gia_MonAn_Bep1 = new javax.swing.JTextField();
        txt_TenMon_MonAn_Bep1 = new javax.swing.JTextField();
        txt_MaMon_MonAn_Bep1 = new javax.swing.JTextField();
        lb_img_MonAn_Bep1 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        bt_themMonMoi_Bep = new javax.swing.JButton();
        dl_ThucDonMoi = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        txt_NgayApDungThucDon_bep = new javax.swing.JTextField();
        cbb_buoidung_bep = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        bt_Lich_Bep = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        txt_MaThucDonMoi_Bep = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        tb_BangMonAnTrongThucDon = new javax.swing.JTable();
        cbb_ChonMonMenu_Bep = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        bt_themMonVaoThucDon_Bep = new javax.swing.JButton();
        bt_xoaMonKhoiThucDon_Bep = new javax.swing.JButton();
        bt_TaoThucDonMoi = new javax.swing.JButton();
        bt_boquataothucdonMoi = new javax.swing.JButton();
        cld_ChonNgayThucDon = new com.toedter.calendar.JCalendar();
        txt_SoLuongMoiMon_ThucDOn_Bep = new javax.swing.JTextField();
        dl_ChiTietDonHang_GiaoHang = new javax.swing.JDialog();
        jScrollPane18 = new javax.swing.JScrollPane();
        tb_ChitietDonHang_ChitietDonHang_GiaoHang = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        txt_nguoidat_chitietdonhang_giaoHang = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txt_thongTinDonHang_chitietdonhang_giaoHang = new javax.swing.JTextArea();
        dl_ThongTinNhanVien_AD = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txt_MaNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        txt_TenNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        txt_SDTNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        txt_NamSinhNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        txt_cmnnNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        txt_EmailNhanVien_ThongTinNhanVien_Ad = new javax.swing.JTextField();
        btNam_NhanVien_ad = new javax.swing.JRadioButton();
        bt_nu_nhanvine_ad = new javax.swing.JRadioButton();
        bt_hoatdong_nhanvien_ad = new javax.swing.JRadioButton();
        bt_chan_nhanvien_ad = new javax.swing.JRadioButton();
        bt_luunhanvien_ad = new javax.swing.JButton();
        bt_xoaNhanVien_Ad = new javax.swing.JButton();
        bt_boqua_thongtinnhanvien_ad = new javax.swing.JButton();
        cbb_phanquyen_NhanVien_Ad = new javax.swing.JComboBox<>();
        bt_ngaySinhNhanVien_thongTinNhanVien_AD = new javax.swing.JButton();
        cld_lich_thongTinNhanVien_Ad = new com.toedter.calendar.JCalendar();
        grbt_NamNu_nhanvien_ad = new javax.swing.ButtonGroup();
        grbt_tinhtranghoatdong_nhanvien_ad = new javax.swing.ButtonGroup();
        dl_chiTietThucDon_Bep = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        txt_NgayApDungThucDonChiTiet_bep = new javax.swing.JTextField();
        cbb_buoidungChiTiet_bep = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        txt_MaThucDonMoiChiTiet_Bep = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        tb_BangMonAnTrongThucDonChiTiet = new javax.swing.JTable();
        cbb_ChonMonMenuChiTiet_Bep = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        bt_themMonVaoThucDonChiTiet_Bep = new javax.swing.JButton();
        bt_xoaMonKhoiThucDonChiTiet_Bep = new javax.swing.JButton();
        bt_LuuThucDonChinhSuaChiTiet = new javax.swing.JButton();
        bt_boquataothucdonMoiChiTiet = new javax.swing.JButton();
        txt_SoLuongMoiMonChiTiet_ThucDOn_Bep = new javax.swing.JTextField();
        dl_xacminhquyenquantriad = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/img/nendn.jpg"));
            public void paintComponent(Graphics g){         Dimension d = getSize();         g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);         setOpaque(false);         super.paintComponent(g);     }
        };
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_TaiKhoanDangNhap = new javax.swing.JTextField();
        btDangNhap = new javax.swing.JButton();
        btDangKiTaiKhoan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_MatKhauDangNhap = new javax.swing.JPasswordField();
        txtCanhBao = new javax.swing.JLabel();

        dlKhachHangMoi.setMinimumSize(new java.awt.Dimension(400, 292));

        jLabel5.setText("ĐĂNG KÍ TÀI KHOẢN");

        jLabel6.setText("Họ Và Tên:");

        jLabel7.setText("SDT: ");

        jLabel8.setText("Địa Chỉ:");

        jLabel9.setText("Email:");

        textTenDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTenDKActionPerformed(evt);
            }
        });

        textDiaChiDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiaChiDKActionPerformed(evt);
            }
        });

        btDKKhachHang.setText("Đăng Ký");
        btDKKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDKKhachHangActionPerformed(evt);
            }
        });

        btHuyDKkHachHang.setText("Hủy");
        btHuyDKkHachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyDKkHachHangActionPerformed(evt);
            }
        });

        jLabel11.setText("Mật Khẩu:");

        jLabel12.setText("Nhập lại MK");

        textconfMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textconfMatKhauActionPerformed(evt);
            }
        });

        jLabel13.setText("Giới Tính");

        javax.swing.GroupLayout dlKhachHangMoiLayout = new javax.swing.GroupLayout(dlKhachHangMoi.getContentPane());
        dlKhachHangMoi.getContentPane().setLayout(dlKhachHangMoiLayout);
        dlKhachHangMoiLayout.setHorizontalGroup(
            dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlKhachHangMoiLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(144, 144, 144))
            .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                        .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(17, 17, 17)
                        .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTenDK, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(textGioiTinh)))
                    .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                        .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21)
                        .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textconfMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(textSDTDK)
                            .addComponent(textDiaChiDK)
                            .addComponent(textEmailDK)
                            .addComponent(textmatkhauDK)
                            .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                                .addComponent(btDKKhachHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btHuyDKkHachHang)
                                .addGap(33, 33, 33)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        dlKhachHangMoiLayout.setVerticalGroup(
            dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlKhachHangMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textTenDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textSDTDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textDiaChiDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(textEmailDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textmatkhauDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textconfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(dlKhachHangMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDKKhachHang)
                    .addComponent(btHuyDKkHachHang))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Fadmin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FadminWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FadminWindowClosing(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        tb_DoanhThu_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày", "Tổng Xuất", "Tổng Thu", "Lượng Tồn", "Doanh Thu", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_DoanhThu_Admin);

        bt_xuatFileDoanhThuNgay_Admin.setText("XUẤT FILE EXEL");
        bt_xuatFileDoanhThuNgay_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xuatFileDoanhThuNgay_AdminActionPerformed(evt);
            }
        });

        jLabel49.setText("Từ Ngày");

        jLabel50.setText("Đến Ngày");

        bt_tkDTTheoNgay_DoanhThu_Admin.setText("Theo Ngày");
        bt_tkDTTheoNgay_DoanhThu_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tkDTTheoNgay_DoanhThu_AdminActionPerformed(evt);
            }
        });

        bt_tkDTTheoThang_DoanhThu_Admin.setText("Theo Tháng");
        bt_tkDTTheoThang_DoanhThu_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tkDTTheoThang_DoanhThu_AdminActionPerformed(evt);
            }
        });

        bt_tkDTTheoNam_DoanhThu_Admin.setText("Theo Năm");
        bt_tkDTTheoNam_DoanhThu_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tkDTTheoNam_DoanhThu_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_xuatFileDoanhThuNgay_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel49)
                        .addGap(347, 347, 347)
                        .addComponent(jLabel50))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(bt_tkDTTheoNgay_DoanhThu_Admin)
                        .addGap(117, 117, 117)
                        .addComponent(bt_tkDTTheoThang_DoanhThu_Admin)
                        .addGap(108, 108, 108)
                        .addComponent(bt_tkDTTheoNam_DoanhThu_Admin)))
                .addGap(0, 339, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_tkDTTheoNam_DoanhThu_Admin)
                    .addComponent(bt_tkDTTheoThang_DoanhThu_Admin)
                    .addComponent(bt_tkDTTheoNgay_DoanhThu_Admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xuatFileDoanhThuNgay_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pn_bieuDoThuNhapNgay.setPreferredSize(new java.awt.Dimension(1250, 161));

        javax.swing.GroupLayout pn_bieuDoThuNhapNgayLayout = new javax.swing.GroupLayout(pn_bieuDoThuNhapNgay);
        pn_bieuDoThuNhapNgay.setLayout(pn_bieuDoThuNhapNgayLayout);
        pn_bieuDoThuNhapNgayLayout.setHorizontalGroup(
            pn_bieuDoThuNhapNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
        );
        pn_bieuDoThuNhapNgayLayout.setVerticalGroup(
            pn_bieuDoThuNhapNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pn_bieuDoThuNhapNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_bieuDoThuNhapNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DOANH THU", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/profits (2).png")), jPanel2); // NOI18N

        tb_danhSachNhanVienGiaoHang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "SẢN LƯỢNG"
            }
        ));
        tb_danhSachNhanVienGiaoHang_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_danhSachNhanVienGiaoHang_ADMouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(tb_danhSachNhanVienGiaoHang_AD);

        tb_TongDonHangXuLyGiaoHang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ĐƠN HÀNG", "THỜI GIAN NHẬN", "ĐƠN GIÁ", "TÌNH TRẠNG"
            }
        ));
        jScrollPane25.setViewportView(tb_TongDonHangXuLyGiaoHang_AD);

        jLabel18.setText("Mã Nhân Viên:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_manhanvientheodoiGiaoHang_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_manhanvientheodoiGiaoHang_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("GIAO HÀNG", jPanel13);

        tb_danhSachNhanvVienBanHang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "SỐ LƯỢNG ĐƠN HÀNG"
            }
        ));
        tb_danhSachNhanvVienBanHang_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_danhSachNhanvVienBanHang_ADMouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(tb_danhSachNhanvVienBanHang_AD);

        tb_TongDonHangXuLyBanHang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ĐƠN HÀNG", "THỜI GIAN NHẬN", "ĐƠN GIÁ", "TÌNH TRẠNG"
            }
        ));
        jScrollPane27.setViewportView(tb_TongDonHangXuLyBanHang_AD);

        jLabel25.setText("Mã Nhân Viên");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel25)
                        .addGap(42, 42, 42)
                        .addComponent(txt_manhanvientheodoibanhang_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_manhanvientheodoibanhang_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("BÁN HÀNG", jPanel19);

        tb_danhSachNhanVienBep_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "SẢN LƯỢNG"
            }
        ));
        tb_danhSachNhanVienBep_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_danhSachNhanVienBep_ADMouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(tb_danhSachNhanVienBep_AD);

        tb_TongDonHangXuLyBep_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ĐƠN HÀNG", "THỜI GIAN NHẬN", "ĐƠN GIÁ", "TÌNH TRẠNG"
            }
        ));
        jScrollPane31.setViewportView(tb_TongDonHangXuLyBep_AD);

        jLabel10.setText("Mã Nhân Viên: ");

        txt_manhanvientheodoiBep_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_manhanvientheodoiBep_AdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(txt_manhanvientheodoiBep_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_manhanvientheodoiBep_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane31))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("BẾP", jPanel12);

        tb_danhSachDonHang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ĐƠN HÀNG", "BẾP", "GIAO HÀNG", "BÁN HÀNG", "THỜI GIAN", "ĐƠN GIÁ"
            }
        ));
        jScrollPane20.setViewportView(tb_danhSachDonHang_AD);

        jLabel66.setText("ĐƠN HÀNG: ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/loupe.png"))); // NOI18N

        jLabel67.setText("TỔNG ĐƠN HÀNG HÔM NAY:");

        jLabel68.setText("CHI TIẾT ĐƠN HÀNG");

        jLabel69.setText("ĐƠN HÀNG");

        jLabel70.setText("GIỜ ĐẶT");

        jLabel71.setText("BÊP");

        jLabel72.setText("BÁN HÀNG");

        jLabel73.setText("GIAO HÀNG");

        jLabel74.setText("TÌNH TRẠNG");

        jLabel75.setText("THÔNG TIN CHI TIẾT ĐƠN HÀNG");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane23.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel71)
                                            .addComponent(jLabel72)
                                            .addComponent(jLabel73)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel70)
                                            .addComponent(jLabel69))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel68)
                                        .addGap(107, 107, 107))))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGap(129, 129, 129)
                                            .addComponent(jLabel75))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel67)
                        .addGap(21, 21, 21)
                        .addComponent(txt_tongdodonhangtrongngay_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txt_tongdodonhangtrongngay_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel69)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel70)
                                .addGap(7, 7, 7))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("ĐƠN HÀNG", jPanel11);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("THEO DÕI ", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/process.png")), jPanel6); // NOI18N

        tb_DanhSachNhanVien_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NV", "TÊN NV", "SDT", "PHÂN QUYÊN", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_DanhSachNhanVien_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DanhSachNhanVien_ADMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_DanhSachNhanVien_AD);

        jButton6.setText("NHÂN VIÊN HIỆN TẠI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("NHÂN VIÊN KHÔNG CÒN HOẠT ĐỘNG");

        bt_themnhanVien_AD.setText("THÊM NHÂN VIÊN MỚI");
        bt_themnhanVien_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themnhanVien_ADActionPerformed(evt);
            }
        });

        bt_ChiTietNhanVien_Ad.setText("CHI TIẾT NHÂN VIÊN");
        bt_ChiTietNhanVien_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ChiTietNhanVien_AdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton6)
                        .addGap(44, 44, 44)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bt_themnhanVien_AD)
                        .addGap(47, 47, 47)
                        .addComponent(bt_ChiTietNhanVien_Ad)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_themnhanVien_AD)
                    .addComponent(bt_ChiTietNhanVien_Ad))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NHÂN VIÊN", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/team.png")), jPanel14); // NOI18N

        jLabel26.setText("DANH SÁCH KHÁCH HÀNG");

        tb_dskhachhang_AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TÊN KHÁCH HÀNG", "SDT", "ĐỊA CHỈ", "EMAIL"
            }
        ));
        jScrollPane17.setViewportView(tb_dskhachhang_AD);

        jButton1.setText("XUẤT TẤT CẢ CÁC ĐƠN HÀNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hotenAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(hotenAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KHÁCH HÀNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/target (2).png")), jPanel15); // NOI18N

        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });

        bt_doiVaiTroBep_AD.setText("VAI TRÒ BẾP");
        bt_doiVaiTroBep_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doiVaiTroBep_ADActionPerformed(evt);
            }
        });

        bt_doivaitrogiaohang_ad.setText("VAI TRÒ GIAO HÀNG");
        bt_doivaitrogiaohang_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doivaitrogiaohang_adActionPerformed(evt);
            }
        });

        bt_doivaitrobanhang_ad.setText("VAI TRÒ BÁN HÀNG");
        bt_doivaitrobanhang_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doivaitrobanhang_adActionPerformed(evt);
            }
        });

        bt_themQuanTriVien.setText("THÊM QUẢN TRỊ VIÊN");
        bt_themQuanTriVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themQuanTriVienActionPerformed(evt);
            }
        });

        jLabel96.setText("Mật khẩu hiện tại:");

        jLabel97.setText("Mật khẩu mới:");

        jLabel98.setText("Xác nhận mật khẩu:");

        jtxtfield_PassMoi_Bep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfield_PassMoi_Bep1ActionPerformed(evt);
            }
        });

        jBtCapNhapPass_Bep1.setText("Cập nhật");
        jBtCapNhapPass_Bep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCapNhapPass_Bep1ActionPerformed(evt);
            }
        });

        jBtBoquaPass_Bep1.setText("Bỏ qua");
        jBtBoquaPass_Bep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBoquaPass_Bep1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_XacNhanPass_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_PassMoi_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jtxtfield_PassHienTai_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtCapNhapPass_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jBtBoquaPass_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jtxtfield_PassHienTai_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(jtxtfield_PassMoi_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jtxtfield_XacNhanPass_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCapNhapPass_Bep1)
                    .addComponent(jBtBoquaPass_Bep1))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabel99.setText("THAY ĐỔI MẬT KHẨU");

        bt_DungQuyenQuanTri.setText("DỪNG QUYỀN QUẢN TRỊ VIÊN");
        bt_DungQuyenQuanTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DungQuyenQuanTriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_doiVaiTroBep_AD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_doivaitrogiaohang_ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_doivaitrobanhang_ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(cbb_lauchonquantrivien_, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_themQuanTriVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_DungQuyenQuanTri, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(478, 478, 478)
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(bt_doiVaiTroBep_AD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bt_doivaitrogiaohang_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bt_doivaitrobanhang_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel99)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_DungQuyenQuanTri, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_lauchonquantrivien_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_themQuanTriVien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("QUẢN TRỊ", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/integrity.png")), jPanel30); // NOI18N

        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1381, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("THOÁT", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/exit.png")), jPanel22); // NOI18N

        javax.swing.GroupLayout FadminLayout = new javax.swing.GroupLayout(Fadmin.getContentPane());
        Fadmin.getContentPane().setLayout(FadminLayout);
        FadminLayout.setHorizontalGroup(
            FadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        FadminLayout.setVerticalGroup(
            FadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        FGiaoHang.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FGiaoHangWindowClosing(evt);
            }
        });

        jTabbedPane4.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPThongtinNhanVien.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPThongtinNhanVienLayout = new javax.swing.GroupLayout(jPThongtinNhanVien);
        jPThongtinNhanVien.setLayout(jPThongtinNhanVienLayout);
        jPThongtinNhanVienLayout.setHorizontalGroup(
            jPThongtinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        jPThongtinNhanVienLayout.setVerticalGroup(
            jPThongtinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel19.setText("TÌM KIẾM: ");

        txt_mahoadonTimKiem_giaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mahoadonTimKiem_giaoHangActionPerformed(evt);
            }
        });
        txt_mahoadonTimKiem_giaoHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mahoadonTimKiem_giaoHangKeyPressed(evt);
            }
        });

        jLabel20.setText("ĐƠN HÀNG:");

        bt_xacNhanThanhToan_GiaoHang.setText("Xác Nhận Thanh Toán");
        bt_xacNhanThanhToan_GiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xacNhanThanhToan_GiaoHangActionPerformed(evt);
            }
        });

        txt_thongTinDonHang_GiaoHang.setColumns(20);
        txt_thongTinDonHang_GiaoHang.setRows(5);
        jScrollPane4.setViewportView(txt_thongTinDonHang_GiaoHang);

        jLabel21.setText("THÔNG TIN ĐƠN HÀNG");

        bt_ChiTietDonHang_giaoHang.setText("Chi Tiết Đơn Hàng");
        bt_ChiTietDonHang_giaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ChiTietDonHang_giaoHangActionPerformed(evt);
            }
        });

        tb_GiaoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Đơn Hàng", "Khách Hàng ", "SĐT", "Đơn Giá", "Thời gian", "Địa Chỉ ", "Tình Trạng ", "Ghi Chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_GiaoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_GiaoHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_GiaoHang);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_ChiTietDonHang_giaoHang)
                                .addGap(236, 236, 236))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_mahoadonTimKiem_giaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(txt_DonHang_giaohnag, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(173, 173, 173)
                                        .addComponent(bt_xacNhanThanhToan_GiaoHang)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPThongtinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_mahoadonTimKiem_giaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_DonHang_giaohnag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xacNhanThanhToan_GiaoHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(bt_ChiTietDonHang_giaoHang)
                                .addGap(31, 31, 31)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPThongtinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("HOẠT ĐỘNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/food-delivery.png")), jPanel16); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("THOÁT", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/exit.png")), jPanel23); // NOI18N

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("ĐỔI MẬT KHẨU");

        jLabel93.setText("Mật khẩu hiện tại:");

        jLabel94.setText("Mật khẩu mới:");

        jLabel95.setText("Xác nhận mật khẩu:");

        jtxtfield_PassMoi_GiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfield_PassMoi_GiaoHangActionPerformed(evt);
            }
        });

        jBtCapNhapPass_GiaoHang.setText("Cập nhật");
        jBtCapNhapPass_GiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCapNhapPass_GiaoHangActionPerformed(evt);
            }
        });

        jBtBoquaPass_GiaoHang.setText("Bỏ qua");
        jBtBoquaPass_GiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBoquaPass_GiaoHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_XacNhanPass_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_PassMoi_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jtxtfield_PassHienTai_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtCapNhapPass_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jBtBoquaPass_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jtxtfield_PassHienTai_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jtxtfield_PassMoi_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jtxtfield_XacNhanPass_GiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCapNhapPass_GiaoHang)
                    .addComponent(jBtBoquaPass_GiaoHang))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelComponentLayout = new javax.swing.GroupLayout(panelComponent);
        panelComponent.setLayout(panelComponentLayout);
        panelComponentLayout.setHorizontalGroup(
            panelComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        panelComponentLayout.setVerticalGroup(
            panelComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(panelComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("HỆ THỐNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/settings.png")), jPanel18); // NOI18N

        javax.swing.GroupLayout FGiaoHangLayout = new javax.swing.GroupLayout(FGiaoHang.getContentPane());
        FGiaoHang.getContentPane().setLayout(FGiaoHangLayout);
        FGiaoHangLayout.setHorizontalGroup(
            FGiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FGiaoHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FGiaoHangLayout.setVerticalGroup(
            FGiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FGiaoHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jTabbedPane6.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane6.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jLabel32.setText("BIỂU ĐỒ");

        pn_ThucDonKhachHang.setBackground(new java.awt.Color(153, 153, 255));
        pn_ThucDonKhachHang.setMinimumSize(new java.awt.Dimension(100, 5000));
        pn_ThucDonKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_ThucDonKhachHangMouseClicked(evt);
            }
        });
        pn_ThucDonKhachHang.setLayout(new java.awt.GridLayout(20, 1, 0, 10));
        jScrollPane10.setViewportView(pn_ThucDonKhachHang);

        jLabel33.setText("KHÁCH HÀNG: ");

        txt_khachNhanHang_khackHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_khachNhanHang_khackHangActionPerformed(evt);
            }
        });

        jLabel34.setText("Ngày:");

        tb_MonDaChon_KhackHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÓN", "GIÁ", "SỐ LƯỢNG", "MÃ MÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_MonDaChon_KhackHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_MonDaChon_KhackHangMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tb_MonDaChon_KhackHang);
        if (tb_MonDaChon_KhackHang.getColumnModel().getColumnCount() > 0) {
            tb_MonDaChon_KhackHang.getColumnModel().getColumn(4).setMinWidth(0);
            tb_MonDaChon_KhackHang.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jLabel36.setText("TỔNG THANH TOÁN: ");

        jLabel38.setText("Món:");

        bt_DatHang_KhachHang.setText("ĐẶT HÀNG");
        bt_DatHang_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DatHang_KhachHangActionPerformed(evt);
            }
        });

        bt_HuyMonDaChon_KhachHang.setText("Hủy Món");

        jLabel39.setText("SĐT:");

        txt_SDTkhachNhanHang_khackHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SDTkhachNhanHang_khackHangActionPerformed(evt);
            }
        });

        jLabel40.setText("ĐỊA CHỈ:");

        txt_DiaChikhachNhanHang_khackHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChikhachNhanHang_khackHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel68Layout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_monchon_khachHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_HuyMonDaChon_KhachHang)
                            .addContainerGap(403, Short.MAX_VALUE))
                        .addGroup(jPanel68Layout.createSequentialGroup()
                            .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel68Layout.createSequentialGroup()
                                    .addComponent(txt_khachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel39))
                                .addComponent(txt_ngayHienTai_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_SDTkhachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel40)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_DiaChikhachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_DatHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tongThanhToan_KhackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(241, Short.MAX_VALUE))))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_khachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txt_SDTkhachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt_DiaChikhachNhanHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ngayHienTai_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_monchon_khachHang_khackHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_HuyMonDaChon_KhachHang))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(txt_tongThanhToan_KhackHang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(bt_DatHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(650, Short.MAX_VALUE))
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel32))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(34, 34, 34))
        );

        jTabbedPane6.addTab("HOẠT ĐỘNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/shopping-cart.png")), jPanel46); // NOI18N

        jPanel70.setBackground(new java.awt.Color(102, 102, 102));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Đơn Hàng", "Date", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable8);

        jLabel41.setText("TÌM KIẾM");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TinhTrangGiaoKhachHangLayout = new javax.swing.GroupLayout(TinhTrangGiaoKhachHang);
        TinhTrangGiaoKhachHang.setLayout(TinhTrangGiaoKhachHangLayout);
        TinhTrangGiaoKhachHangLayout.setHorizontalGroup(
            TinhTrangGiaoKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        TinhTrangGiaoKhachHangLayout.setVerticalGroup(
            TinhTrangGiaoKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel42.setText("Thông tin đơn hàng:");

        jButton13.setText("jButton1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("jButton2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel43.setText("ĐÁNH GIÁ ");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TinhTrangGiaoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(39, 39, 39)
                                .addComponent(jButton14)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(TinhTrangGiaoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13)
                            .addComponent(jButton14))
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel43))
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("ĐƠN HÀNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/customer.png")), jPanel69); // NOI18N

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("ĐỔI MẬT KHẨU");

        jLabel85.setText("Mật khẩu hiện tại:");

        jLabel86.setText("Mật khẩu mới:");

        jLabel87.setText("Xác nhận mật khẩu:");

        jtxtfield_PassMoi_Khach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfield_PassMoi_KhachActionPerformed(evt);
            }
        });

        jBtCapNhapPass_Khach.setText("Cập nhật");
        jBtCapNhapPass_Khach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCapNhapPass_KhachActionPerformed(evt);
            }
        });

        jBtBoquaPass_Khach.setText("Bỏ qua");
        jBtBoquaPass_Khach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBoquaPass_KhachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_XacNhanPass_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_PassMoi_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jtxtfield_PassHienTai_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtCapNhapPass_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jBtBoquaPass_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jtxtfield_PassHienTai_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jtxtfield_PassMoi_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jtxtfield_XacNhanPass_Khach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCapNhapPass_Khach)
                    .addComponent(jBtBoquaPass_Khach))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addGap(35, 35, 35)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("HỆ THỐNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/settings.png")), jPanel73); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("THOÁT", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/exit.png")), jPanel24); // NOI18N

        javax.swing.GroupLayout FKhachHangLayout = new javax.swing.GroupLayout(FKhachHang.getContentPane());
        FKhachHang.getContentPane().setLayout(FKhachHangLayout);
        FKhachHangLayout.setHorizontalGroup(
            FKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FKhachHangLayout.setVerticalGroup(
            FKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FBep.setTitle("BẾP");
        FBep.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FBepWindowClosing(evt);
            }
        });

        jTabbedPane5.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseExited(evt);
            }
        });

        jLabel22.setText("ĐƠN HÀNG");

        tb_danhSachDonHang_Bep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ĐƠN HÀNG", "THỜI GIAN", "LƯU Ý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_danhSachDonHang_Bep.setEnabled(false);
        tb_danhSachDonHang_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_danhSachDonHang_BepMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tb_danhSachDonHang_Bep);

        bt_HoanThanhDonHang_Bep.setText("HOÀN THÀNH");
        bt_HoanThanhDonHang_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_HoanThanhDonHang_BepActionPerformed(evt);
            }
        });

        tb_ChitietDonHang_Bep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÓN", "SỐ LƯỢNG", "LƯU Ý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tb_ChitietDonHang_Bep);

        jLabel23.setText("TRẠNG THÁI DÙNG:");

        jLabel24.setText("GHI CHÚ:");

        txt_ghichuchodonhang_bep.setColumns(20);
        txt_ghichuchodonhang_bep.setRows(5);
        jScrollPane13.setViewportView(txt_ghichuchodonhang_bep);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(bt_HoanThanhDonHang_Bep))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel27Layout.createSequentialGroup()
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                            .addComponent(txt_trangThaiDungdonhang_bep, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_MaDonHang_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel27Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(254, 254, 254))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_MaDonHang_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(txt_trangThaiDungdonhang_bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel24)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(bt_HoanThanhDonHang_Bep)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_HoatDong_BepLayout = new javax.swing.GroupLayout(pn_HoatDong_Bep);
        pn_HoatDong_Bep.setLayout(pn_HoatDong_BepLayout);
        pn_HoatDong_BepLayout.setHorizontalGroup(
            pn_HoatDong_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_HoatDong_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_HoatDong_BepLayout.setVerticalGroup(
            pn_HoatDong_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_HoatDong_BepLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("HOẠT ĐỘNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/serving-dish (1).png")), pn_HoatDong_Bep); // NOI18N

        pn_Menu_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Menu_BepMouseClicked(evt);
            }
        });

        jScrollPane7.setMaximumSize(new java.awt.Dimension(400, 32767));

        menu_Bep.setBackground(new java.awt.Color(153, 153, 255));
        menu_Bep.setMaximumSize(new java.awt.Dimension(400, 6000));
        menu_Bep.setMinimumSize(new java.awt.Dimension(100, 5000));
        menu_Bep.setLayout(new java.awt.GridLayout(20, 1, 0, 10));
        jScrollPane7.setViewportView(menu_Bep);

        tb_DanhSachThucDon_menu_Bep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ THỰC ĐƠN", "NGÀY DÙNG", "BUỔI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_DanhSachThucDon_menu_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DanhSachThucDon_menu_BepMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tb_DanhSachThucDon_menu_Bep);

        bt_taothucdonmoi_bep.setText("THÊM THỰC ĐƠN");
        bt_taothucdonmoi_bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_taothucdonmoi_bepActionPerformed(evt);
            }
        });

        btTroLaiTrangChu.setText("TrangChủ");

        jButton8.setText("CHI TIẾT THỰC ĐƠN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btTroLaiTrangChu)
                .addContainerGap())
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bt_taothucdonmoi_bep)
                .addGap(41, 41, 41)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTroLaiTrangChu)
                        .addGap(261, 261, 261))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_taothucdonmoi_bep)
                    .addComponent(jButton8))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_Menu_BepLayout = new javax.swing.GroupLayout(pn_Menu_Bep);
        pn_Menu_Bep.setLayout(pn_Menu_BepLayout);
        pn_Menu_BepLayout.setHorizontalGroup(
            pn_Menu_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Menu_BepLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_Menu_BepLayout.setVerticalGroup(
            pn_Menu_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Menu_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("THỰC ĐƠN", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/menu.png")), pn_Menu_Bep); // NOI18N

        pn_MonAn_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_MonAn_BepMouseClicked(evt);
            }
        });

        tb_DanhSachMonAn_Bep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ MÓN", "TÊN MÓN", "GIÁ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_DanhSachMonAn_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DanhSachMonAn_BepMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tb_DanhSachMonAn_Bep);

        jLabel31.setText("THÔNG TIN MÓN");

        jLabel45.setText("Mã Món");

        jLabel47.setText("Tên Món");

        jLabel48.setText("Giá");

        lb_img_MonAn_Bep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_img_MonAn_Bep.setText("    Hình Ảnh");
        lb_img_MonAn_Bep.setAlignmentY(0.0F);
        lb_img_MonAn_Bep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_img_MonAn_Bep.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_img_MonAn_Bep.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lb_img_MonAn_Bep.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lb_img_MonAn_BepAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lb_img_MonAn_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_img_MonAn_BepMouseClicked(evt);
            }
        });

        txt_MaMon_MonAn_Bep.setEditable(false);

        txt_TenMon_MonAn_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenMon_MonAn_BepActionPerformed(evt);
            }
        });

        txt_Gia_MonAn_Bep.setEditable(false);

        bt_ThemMon_MonAn_Bep.setText("Thêm Món");
        bt_ThemMon_MonAn_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ThemMon_MonAn_BepActionPerformed(evt);
            }
        });

        bt_SuaMon_MonAn_Bep.setText("SỬA THÔNG TIN");
        bt_SuaMon_MonAn_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SuaMon_MonAn_BepActionPerformed(evt);
            }
        });

        bt_XoaMon_MonAn_Bep.setText("XÓA");
        bt_XoaMon_MonAn_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_XoaMon_MonAn_BepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_MonAn_BepLayout = new javax.swing.GroupLayout(pn_MonAn_Bep);
        pn_MonAn_Bep.setLayout(pn_MonAn_BepLayout);
        pn_MonAn_BepLayout.setHorizontalGroup(
            pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                                .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel48))
                                .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                                        .addGap(241, 241, 241)
                                        .addComponent(bt_XoaMon_MonAn_Bep))
                                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_MaMon_MonAn_Bep, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                            .addComponent(txt_TenMon_MonAn_Bep)
                                            .addComponent(txt_Gia_MonAn_Bep)))))
                            .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                                .addComponent(bt_ThemMon_MonAn_Bep)
                                .addGap(46, 46, 46)
                                .addComponent(bt_SuaMon_MonAn_Bep))))
                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lb_img_MonAn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel31)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        pn_MonAn_BepLayout.setVerticalGroup(
            pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(33, 33, 33)
                        .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(txt_MaMon_MonAn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addGroup(pn_MonAn_BepLayout.createSequentialGroup()
                                .addComponent(txt_TenMon_MonAn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Gia_MonAn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_img_MonAn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(pn_MonAn_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_ThemMon_MonAn_Bep)
                            .addComponent(bt_SuaMon_MonAn_Bep)
                            .addComponent(bt_XoaMon_MonAn_Bep)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("MÓN ĂN", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/hamburger.png")), pn_MonAn_Bep); // NOI18N

        pn_Exit_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Exit_BepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_Exit_BepLayout = new javax.swing.GroupLayout(pn_Exit_Bep);
        pn_Exit_Bep.setLayout(pn_Exit_BepLayout);
        pn_Exit_BepLayout.setHorizontalGroup(
            pn_Exit_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1289, Short.MAX_VALUE)
        );
        pn_Exit_BepLayout.setVerticalGroup(
            pn_Exit_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("VỀ TRANG CHỦ", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/exit.png")), pn_Exit_Bep); // NOI18N

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("ĐỔI MẬT KHẨU");

        jLabel81.setText("Mật khẩu hiện tại:");

        jLabel82.setText("Mật khẩu mới:");

        jLabel83.setText("Xác nhận mật khẩu:");

        jtxtfield_PassMoi_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfield_PassMoi_BepActionPerformed(evt);
            }
        });

        jBtCapNhapPass_Bep.setText("Cập nhật");
        jBtCapNhapPass_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCapNhapPass_BepActionPerformed(evt);
            }
        });

        jBtBoquaPass_Bep.setText("Bỏ qua");
        jBtBoquaPass_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBoquaPass_BepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_XacNhanPass_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_PassMoi_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jtxtfield_PassHienTai_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtCapNhapPass_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jBtBoquaPass_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jtxtfield_PassHienTai_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jtxtfield_PassMoi_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jtxtfield_XacNhanPass_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCapNhapPass_Bep)
                    .addComponent(jBtBoquaPass_Bep))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_HeThong_BepLayout = new javax.swing.GroupLayout(pn_HeThong_Bep);
        pn_HeThong_Bep.setLayout(pn_HeThong_BepLayout);
        pn_HeThong_BepLayout.setHorizontalGroup(
            pn_HeThong_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_HeThong_BepLayout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        pn_HeThong_BepLayout.setVerticalGroup(
            pn_HeThong_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_HeThong_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80)
                .addGap(35, 35, 35)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("HỆ THỐNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/settings.png")), pn_HeThong_Bep); // NOI18N

        javax.swing.GroupLayout FBepLayout = new javax.swing.GroupLayout(FBep.getContentPane());
        FBep.getContentPane().setLayout(FBepLayout);
        FBepLayout.setHorizontalGroup(
            FBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBepLayout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        FBepLayout.setVerticalGroup(
            FBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FBepLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FBanHang.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FBanHangWindowClosing(evt);
            }
        });

        jTabbedPane7.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane7.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTabbedPane7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane7MouseClicked(evt);
            }
        });

        jScrollPane15.setMaximumSize(new java.awt.Dimension(400, 32767));

        pn_menu_BanHang.setBackground(new java.awt.Color(153, 153, 255));
        pn_menu_BanHang.setMaximumSize(new java.awt.Dimension(400, 6000));
        pn_menu_BanHang.setMinimumSize(new java.awt.Dimension(100, 5000));
        pn_menu_BanHang.setLayout(new java.awt.GridLayout(30, 1, 0, 14));
        jScrollPane15.setViewportView(pn_menu_BanHang);

        tb_MonDaChon_nhanVienBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÓN", "GIÁ", "SỐ LƯỢNG", "MÃ MÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane16.setViewportView(tb_MonDaChon_nhanVienBanHang);
        if (tb_MonDaChon_nhanVienBanHang.getColumnModel().getColumnCount() > 0) {
            tb_MonDaChon_nhanVienBanHang.getColumnModel().getColumn(4).setMinWidth(0);
            tb_MonDaChon_nhanVienBanHang.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jLabel35.setText("Ngày:");

        jLabel44.setText("Thanh Toán:");

        bt_BanHan_BanHang.setText("HOÀN THÀNH");
        bt_BanHan_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BanHan_BanHangActionPerformed(evt);
            }
        });

        jLabel57.setText("Món:");

        bt_HuyMon_BanHang.setText("Hủy");

        txt_Ngayhientai_BanHang.setEditable(false);

        cb_MangVe.setText("Mang Về");
        cb_MangVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_MangVeActionPerformed(evt);
            }
        });

        cb_dungTaiCho.setText("Dùng Tại Chỗ");
        cb_dungTaiCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dungTaiChoActionPerformed(evt);
            }
        });

        txt_TongthanhToan_BanHang.setEditable(false);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tongThanhToan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_BanHan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_TongthanhToan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel26Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Ngayhientai_BanHang))
                        .addGroup(jPanel26Layout.createSequentialGroup()
                            .addComponent(jLabel57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_MonDaChon_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(bt_HuyMon_BanHang)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(cb_MangVe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addComponent(cb_dungTaiCho, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(801, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txt_Ngayhientai_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(cb_MangVe)
                .addGap(6, 6, 6)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(txt_tongThanhToan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel57)
                                .addComponent(txt_MonDaChon_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_HuyMon_BanHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txt_TongthanhToan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bt_BanHan_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(cb_dungTaiCho)
                    .addContainerGap(615, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("HOẠT ĐỘNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/seller.png")), jPanel74); // NOI18N

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("ĐỔI MẬT KHẨU");

        jLabel89.setText("Mật khẩu hiện tại:");

        jLabel90.setText("Mật khẩu mới:");

        jLabel91.setText("Xác nhận mật khẩu:");

        jtxtfield_PassMoi_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfield_PassMoi_BanHangActionPerformed(evt);
            }
        });

        jBtCapNhapPass_BanHang.setText("Cập nhật");
        jBtCapNhapPass_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCapNhapPass_BanHangActionPerformed(evt);
            }
        });

        jBtBoquaPass_BanHang.setText("Bỏ qua");
        jBtBoquaPass_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBoquaPass_BanHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_XacNhanPass_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtfield_PassMoi_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jtxtfield_PassHienTai_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtCapNhapPass_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jBtBoquaPass_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jtxtfield_PassHienTai_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jtxtfield_PassMoi_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jtxtfield_XacNhanPass_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCapNhapPass_BanHang)
                    .addComponent(jBtBoquaPass_BanHang))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88)
                .addGap(35, 35, 35)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("HỆ THỐNG", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/settings.png")), jPanel76); // NOI18N

        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("THOÁT", new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/exit.png")), jPanel25); // NOI18N

        javax.swing.GroupLayout FBanHangLayout = new javax.swing.GroupLayout(FBanHang.getContentPane());
        FBanHang.getContentPane().setLayout(FBanHangLayout);
        FBanHangLayout.setHorizontalGroup(
            FBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FBanHangLayout.setVerticalGroup(
            FBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_Gia_MonAn_Bep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Gia_MonAn_Bep1ActionPerformed(evt);
            }
        });

        txt_TenMon_MonAn_Bep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenMon_MonAn_Bep1ActionPerformed(evt);
            }
        });

        txt_MaMon_MonAn_Bep1.setEditable(false);

        lb_img_MonAn_Bep1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_img_MonAn_Bep1.setText("    Hình Ảnh");
        lb_img_MonAn_Bep1.setAlignmentY(0.0F);
        lb_img_MonAn_Bep1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_img_MonAn_Bep1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_img_MonAn_Bep1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lb_img_MonAn_Bep1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lb_img_MonAn_Bep1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lb_img_MonAn_Bep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_img_MonAn_Bep1MouseClicked(evt);
            }
        });

        jLabel51.setText("Giá");

        jLabel52.setText("Tên Món");

        jLabel53.setText("Mã Món");

        jLabel54.setText("THÔNG TIN MÓN");

        bt_themMonMoi_Bep.setText("THÊM");
        bt_themMonMoi_Bep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_themMonMoi_BepMouseClicked(evt);
            }
        });
        bt_themMonMoi_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themMonMoi_BepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dl_themMon_bepLayout = new javax.swing.GroupLayout(dl_themMon_bep.getContentPane());
        dl_themMon_bep.getContentPane().setLayout(dl_themMon_bepLayout);
        dl_themMon_bepLayout.setHorizontalGroup(
            dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dl_themMon_bepLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(bt_themMonMoi_Bep)
                .addGap(158, 158, 158))
            .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                            .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel52)
                                .addComponent(jLabel53)
                                .addComponent(jLabel51))
                            .addGap(18, 18, 18)
                            .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_TenMon_MonAn_Bep1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(txt_Gia_MonAn_Bep1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_MaMon_MonAn_Bep1)))
                        .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel54))
                        .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(lb_img_MonAn_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        dl_themMon_bepLayout.setVerticalGroup(
            dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dl_themMon_bepLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(bt_themMonMoi_Bep)
                .addGap(21, 21, 21))
            .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel54)
                    .addGap(18, 18, 18)
                    .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53)
                        .addComponent(txt_MaMon_MonAn_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(txt_TenMon_MonAn_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dl_themMon_bepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel51))
                        .addGroup(dl_themMon_bepLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Gia_MonAn_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lb_img_MonAn_Bep1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jLabel27.setText("NGÀY");

        txt_NgayApDungThucDon_bep.setEditable(false);

        cbb_buoidung_bep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SÁNG", "TRƯA", "TỐI" }));

        jLabel30.setText("BUỔI");

        bt_Lich_Bep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/calendar.png"))); // NOI18N
        bt_Lich_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Lich_BepActionPerformed(evt);
            }
        });

        jLabel55.setText("MÃ THỰC ĐƠN");

        txt_MaThucDonMoi_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaThucDonMoi_BepActionPerformed(evt);
            }
        });

        tb_BangMonAnTrongThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ MÓN", "TÊN MÓN", "SL", "GIÁ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_BangMonAnTrongThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_BangMonAnTrongThucDonMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tb_BangMonAnTrongThucDon);

        cbb_ChonMonMenu_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_ChonMonMenu_BepActionPerformed(evt);
            }
        });

        jLabel56.setText("CHỌN MÓN ");

        bt_themMonVaoThucDon_Bep.setText("THÊM VÀO THỰC ĐƠN");
        bt_themMonVaoThucDon_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themMonVaoThucDon_BepActionPerformed(evt);
            }
        });

        bt_xoaMonKhoiThucDon_Bep.setText("XÓA KHỎI THỰC ĐƠN");
        bt_xoaMonKhoiThucDon_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaMonKhoiThucDon_BepActionPerformed(evt);
            }
        });

        bt_TaoThucDonMoi.setText("LƯU THỰC ĐƠN");
        bt_TaoThucDonMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TaoThucDonMoiActionPerformed(evt);
            }
        });

        bt_boquataothucdonMoi.setText("BỎ QUA");

        cld_ChonNgayThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cld_ChonNgayThucDonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dl_ThucDonMoiLayout = new javax.swing.GroupLayout(dl_ThucDonMoi.getContentPane());
        dl_ThucDonMoi.getContentPane().setLayout(dl_ThucDonMoiLayout);
        dl_ThucDonMoiLayout.setHorizontalGroup(
            dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dl_ThucDonMoiLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(32, 32, 32)
                                .addComponent(cbb_ChonMonMenu_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(bt_TaoThucDonMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_SoLuongMoiMon_ThucDOn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_xoaMonKhoiThucDon_Bep)
                            .addComponent(bt_themMonVaoThucDon_Bep)
                            .addComponent(bt_boquataothucdonMoi)))
                    .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel30))
                                .addGap(10, 10, 10)
                                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_NgayApDungThucDon_bep)
                                    .addComponent(cbb_buoidung_bep, 0, 292, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addComponent(bt_Lich_Bep))
                            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_MaThucDonMoi_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cld_ChonNgayThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        dl_ThucDonMoiLayout.setVerticalGroup(
            dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dl_ThucDonMoiLayout.createSequentialGroup()
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Lich_Bep)
                            .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(txt_NgayApDungThucDon_bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbb_buoidung_bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(txt_MaThucDonMoi_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cld_ChonNgayThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(cbb_ChonMonMenu_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_themMonVaoThucDon_Bep)
                    .addComponent(txt_SoLuongMoiMon_ThucDOn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_xoaMonKhoiThucDon_Bep)
                .addGap(37, 37, 37)
                .addGroup(dl_ThucDonMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_TaoThucDonMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_boquataothucdonMoi))
                .addGap(38, 38, 38))
        );

        tb_ChitietDonHang_ChitietDonHang_GiaoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "MÓN", "SỐ LƯỢNG", "LƯU Ý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane18.setViewportView(tb_ChitietDonHang_ChitietDonHang_GiaoHang);

        jLabel37.setText("Người Đặt: ");

        txt_nguoidat_chitietdonhang_giaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nguoidat_chitietdonhang_giaoHangActionPerformed(evt);
            }
        });

        jLabel58.setText("Thông Tin Nhận Hàng");

        txt_thongTinDonHang_chitietdonhang_giaoHang.setColumns(20);
        txt_thongTinDonHang_chitietdonhang_giaoHang.setRows(5);
        jScrollPane19.setViewportView(txt_thongTinDonHang_chitietdonhang_giaoHang);

        javax.swing.GroupLayout dl_ChiTietDonHang_GiaoHangLayout = new javax.swing.GroupLayout(dl_ChiTietDonHang_GiaoHang.getContentPane());
        dl_ChiTietDonHang_GiaoHang.getContentPane().setLayout(dl_ChiTietDonHang_GiaoHangLayout);
        dl_ChiTietDonHang_GiaoHangLayout.setHorizontalGroup(
            dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createSequentialGroup()
                .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nguoidat_chitietdonhang_giaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dl_ChiTietDonHang_GiaoHangLayout.setVerticalGroup(
            dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dl_ChiTietDonHang_GiaoHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txt_nguoidat_chitietdonhang_giaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dl_ChiTietDonHang_GiaoHangLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        dl_ThongTinNhanVien_AD.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Mã Nhân Viên:");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 19, -1, -1));

        jLabel15.setText("Họ Và Tên:");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 51, -1, -1));

        jLabel16.setText("SDT:");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 83, -1, -1));

        jLabel59.setText("Năm Sinh:");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 114, -1, -1));

        jLabel60.setText("CMND/CCCD");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 149, -1, -1));

        jLabel61.setText("Phân Quyền");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 181, -1, -1));

        jLabel62.setText("Email:");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 213, -1, -1));

        jLabel63.setText("Giới Tính");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 245, -1, -1));

        jLabel64.setText("Tình Trạng Hoạt Động");
        dl_ThongTinNhanVien_AD.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 277, -1, -1));
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_MaNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 13, 400, -1));
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_TenNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 48, 400, -1));
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_SDTNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 80, 400, -1));
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_NamSinhNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 111, 350, -1));

        txt_cmnnNhanVien_ThongTinNhanVien_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cmnnNhanVien_ThongTinNhanVien_AdActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_cmnnNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 146, 350, -1));

        txt_EmailNhanVien_ThongTinNhanVien_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailNhanVien_ThongTinNhanVien_AdActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(txt_EmailNhanVien_ThongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 210, 350, -1));

        grbt_NamNu_nhanvien_ad.add(btNam_NhanVien_ad);
        btNam_NhanVien_ad.setText("NAM");
        dl_ThongTinNhanVien_AD.getContentPane().add(btNam_NhanVien_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 241, -1, -1));

        grbt_NamNu_nhanvien_ad.add(bt_nu_nhanvine_ad);
        bt_nu_nhanvine_ad.setText("NỮ");
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_nu_nhanvine_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 241, -1, -1));

        grbt_tinhtranghoatdong_nhanvien_ad.add(bt_hoatdong_nhanvien_ad);
        bt_hoatdong_nhanvien_ad.setText("Cho Phép");
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_hoatdong_nhanvien_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 273, -1, -1));

        grbt_tinhtranghoatdong_nhanvien_ad.add(bt_chan_nhanvien_ad);
        bt_chan_nhanvien_ad.setText("Chặn");
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_chan_nhanvien_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        bt_luunhanvien_ad.setText("LƯU");
        bt_luunhanvien_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_luunhanvien_adActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_luunhanvien_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 314, -1, -1));

        bt_xoaNhanVien_Ad.setText("XÓA");
        bt_xoaNhanVien_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaNhanVien_AdActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_xoaNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 314, -1, -1));

        bt_boqua_thongtinnhanvien_ad.setText("BỎ QUA");
        bt_boqua_thongtinnhanvien_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_boqua_thongtinnhanvien_adActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_boqua_thongtinnhanvien_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 314, -1, -1));

        cbb_phanquyen_NhanVien_Ad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "banhang", "bep", "giaohang" }));
        dl_ThongTinNhanVien_AD.getContentPane().add(cbb_phanquyen_NhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 178, 350, -1));

        bt_ngaySinhNhanVien_thongTinNhanVien_AD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaoDien/icon/calendar.png"))); // NOI18N
        bt_ngaySinhNhanVien_thongTinNhanVien_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ngaySinhNhanVien_thongTinNhanVien_ADActionPerformed(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(bt_ngaySinhNhanVien_thongTinNhanVien_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        cld_lich_thongTinNhanVien_Ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cld_lich_thongTinNhanVien_AdMouseClicked(evt);
            }
        });
        dl_ThongTinNhanVien_AD.getContentPane().add(cld_lich_thongTinNhanVien_Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 330, 230));

        jLabel28.setText("NGÀY");

        txt_NgayApDungThucDonChiTiet_bep.setEditable(false);

        cbb_buoidungChiTiet_bep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SÁNG", "TRƯA", "TỐI" }));

        jLabel65.setText("BUỔI");

        jLabel77.setText("MÃ THỰC ĐƠN");

        txt_MaThucDonMoiChiTiet_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaThucDonMoiChiTiet_BepActionPerformed(evt);
            }
        });

        tb_BangMonAnTrongThucDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ MÓN", "TÊN MÓN", "SL", "GIÁ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_BangMonAnTrongThucDonChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_BangMonAnTrongThucDonChiTietMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(tb_BangMonAnTrongThucDonChiTiet);

        cbb_ChonMonMenuChiTiet_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_ChonMonMenuChiTiet_BepActionPerformed(evt);
            }
        });

        jLabel78.setText("CHỌN MÓN ");

        bt_themMonVaoThucDonChiTiet_Bep.setText("THÊM VÀO THỰC ĐƠN");
        bt_themMonVaoThucDonChiTiet_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themMonVaoThucDonChiTiet_BepActionPerformed(evt);
            }
        });

        bt_xoaMonKhoiThucDonChiTiet_Bep.setText("XÓA KHỎI THỰC ĐƠN");
        bt_xoaMonKhoiThucDonChiTiet_Bep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaMonKhoiThucDonChiTiet_BepActionPerformed(evt);
            }
        });

        bt_LuuThucDonChinhSuaChiTiet.setText("LƯU THỰC ĐƠN");
        bt_LuuThucDonChinhSuaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LuuThucDonChinhSuaChiTietActionPerformed(evt);
            }
        });

        bt_boquataothucdonMoiChiTiet.setText("BỎ QUA");

        javax.swing.GroupLayout dl_chiTietThucDon_BepLayout = new javax.swing.GroupLayout(dl_chiTietThucDon_Bep.getContentPane());
        dl_chiTietThucDon_Bep.getContentPane().setLayout(dl_chiTietThucDon_BepLayout);
        dl_chiTietThucDon_BepLayout.setHorizontalGroup(
            dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dl_chiTietThucDon_BepLayout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addGap(32, 32, 32)
                                .addComponent(cbb_ChonMonMenuChiTiet_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(bt_LuuThucDonChinhSuaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_SoLuongMoiMonChiTiet_ThucDOn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_xoaMonKhoiThucDonChiTiet_Bep)
                            .addComponent(bt_themMonVaoThucDonChiTiet_Bep)
                            .addComponent(bt_boquataothucdonMoiChiTiet)))
                    .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel65))
                        .addGap(10, 10, 10)
                        .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NgayApDungThucDonChiTiet_bep)
                            .addComponent(cbb_buoidungChiTiet_bep, 0, 292, Short.MAX_VALUE)))
                    .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaThucDonMoiChiTiet_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        dl_chiTietThucDon_BepLayout.setVerticalGroup(
            dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dl_chiTietThucDon_BepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txt_NgayApDungThucDonChiTiet_bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_buoidungChiTiet_bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(18, 18, 18)
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txt_MaThucDonMoiChiTiet_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(cbb_ChonMonMenuChiTiet_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_themMonVaoThucDonChiTiet_Bep)
                    .addComponent(txt_SoLuongMoiMonChiTiet_ThucDOn_Bep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_xoaMonKhoiThucDonChiTiet_Bep)
                .addGap(37, 37, 37)
                .addGroup(dl_chiTietThucDon_BepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_LuuThucDonChinhSuaChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_boquataothucdonMoiChiTiet))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout dl_xacminhquyenquantriadLayout = new javax.swing.GroupLayout(dl_xacminhquyenquantriad.getContentPane());
        dl_xacminhquyenquantriad.getContentPane().setLayout(dl_xacminhquyenquantriadLayout);
        dl_xacminhquyenquantriadLayout.setHorizontalGroup(
            dl_xacminhquyenquantriadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dl_xacminhquyenquantriadLayout.setVerticalGroup(
            dl_xacminhquyenquantriadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");

        jPanel1.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setMinimumSize(new java.awt.Dimension(334, 50));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TÀI KHOẢN:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MẬT KHẨU:");

        txt_TaiKhoanDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanDangNhapActionPerformed(evt);
            }
        });

        btDangNhap.setText("ĐĂNG NHẬP");
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });

        btDangKiTaiKhoan.setText("ĐĂNG KÍ");
        btDangKiTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKiTaiKhoanActionPerformed(evt);
            }
        });

        jLabel2.setText("           Quên mật khẩu?");

        txtCanhBao.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCanhBao, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txt_TaiKhoanDangNhap)
                    .addComponent(txt_MatKhauDangNhap)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btDangNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btDangKiTaiKhoan)
                                .addGap(45, 45, 45)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TaiKhoanDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_MatKhauDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(txtCanhBao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDangNhap)
                    .addComponent(btDangKiTaiKhoan))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1342, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TaiKhoanDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanDangNhapActionPerformed

    private void textTenDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTenDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTenDKActionPerformed

    private void textDiaChiDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiaChiDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiaChiDKActionPerformed

    private void btDKKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDKKhachHangActionPerformed
        // TODO add your handling code here:
        KhachHang kh = new KhachHang();
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        kh.setTenKhachHang(ch.chuanHoaDanhTuRieng(textTenDK.getText()));
        
        if(ch.checkPhoneNumber(textSDTDK.getText()) == false)
        {
            JOptionPane.showMessageDialog(panelComponent, "SĐT không hợp lệ mời nhập lại");
            textSDTDK.setText("");
        }else{
            kh.setSDT(textSDTDK.getText());
        }
        
        kh.setDiaChi(textDiaChiDK.getText());
        
        if(ch.checkEmail(textEmailDK.getText()) == false)
        {
            JOptionPane.showMessageDialog(panelComponent, "Email không hợp lệ mời nhập lại");
            textEmailDK.setText("");
        }else{
            kh.setEmail(textEmailDK.getText());
        }
        
        String mk = ch.chuanHoa(textmatkhauDK.getText());
        
        

        KetNoDuLieu kn = new KetNoDuLieu();
        System.out.println("da vao dang ki");
        if (kn.themKhachHang(kh, mk) == true) {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "ĐĂNG KÍ THÀNH CÔNG",
                    "",
                    JOptionPane.DEFAULT_OPTION);

            dlKhachHangMoi.setVisible(false);
            setVisible(true);
            //

        } else {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "KHÔNG THÀNH CÔNG VUI LÒNG THỬ LẠI",
                    "",
                    JOptionPane.DEFAULT_OPTION);
        }

        // check lại trung lap

    }//GEN-LAST:event_btDKKhachHangActionPerformed

    private void textconfMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textconfMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textconfMatKhauActionPerformed

    private void btDangKiTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKiTaiKhoanActionPerformed
        // TODO add your handling code here:
        dlKhachHangMoi.setVisible(true);
        dlKhachHangMoi.setSize(250, 450);
        dlKhachHangMoi.setLocation(500, 200);

    }//GEN-LAST:event_btDangKiTaiKhoanActionPerformed

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
//        System.out.println("dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
//
//Date date= new Date(2021, 6, 4);
//        System.out.println("giaoDien.FDangNhap.btDangNhapActionPerformed()"+Ketnoi.doanhThuNgay(date));   
           docDuLieu();
        
      Ketnoi.layThucDonTheoThoiGianThuc();
        
      
        try {
            // TODO add your handling code here:
            KetNoDuLieu kn = new KetNoDuLieu();
            nguoidung = new nguoiDungDangNhap();
            nguoidung = kn.dangNhap(txt_TaiKhoanDangNhap.getText(), txt_MatKhauDangNhap.getText());

//            System.out.println(" ket noi "+txt_TaiKhoanDangNhap.getText()+ txt_MatKhauDangNhap.getText());
//            System.out.println("taii khona dang nha/" + nguoidung.getMaNguoiDung() + "/" + nguoidung.getPhanQuyen() + "111");
        } catch (SQLException ex) {
            Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(txt_TaiKhoanDangNhap.getText().length()*txt_MatKhauDangNhap.getText().length()==0){
            txtCanhBao.setText("Vui lòng nhập đầy đủ thông tin");
        }
        
        else if(nguoidung== null){
             txtCanhBao.setText("Người dùng không tồn tại");
        }
        else if ("admin".equals(nguoidung.getPhanQuyen())) {

            Fadmin.setSize(1300, 680);
            tb_TheoDoiDanhSachNhanVienBep();
            showDanhSachNhanVien();
            Fadmin.setVisible(true);
            hotenAdmin.setText(nguoidung.getMaNguoiDung());
            showdoanhthu();
            showDanhSachNhanVien();
            setDataToChart2(pn_bieuDoThuNhapNgay);
           capNhatNhanVienLamViec();
            capNhatTinhTrangLamViecCacNhanVien();
            showDanhSachKhachHang();
            setVisible(false);
            khoitaoQuyenAD();
           
           
        } else if ("giaohang".equals(nguoidung.getPhanQuyen())) {
            FGiaoHang.setSize(1300, 680);
            FGiaoHang.setVisible(true);
//            showDanhSachDonHangCanGiao();
            showBangCacDonHangNhanVienDaChon();
            capNhatDonHangDiGiao();
            setVisible(false);
        } else if ("bep".equals(nguoidung.getPhanQuyen())) {
            FBep.setSize(1300, 720);
            FBep.setVisible(true);
            khoiTaoDuLieuCacThanhPhanBep();
           capNhatDonHangBep() ;
//             menu_Bep.
//              for(int i=0;i<15;i++){
//            System.out.println("gda vao menu bep");
//            pn_ThongTinMonAn pnAn= new pn_ThongTinMonAn();
//            menu_Bep.add(pnAn);
//        }
            setVisible(false);
//          
            System.out.println("giaoDien.FDangNhap.btDangNhapActionPerformed() ban hang");
        } else if ("banhang".equals(nguoidung.getPhanQuyen())) {
            FBanHang.setSize(1300, 680);
            FBanHang.setVisible(true);
            docDuLieu();
            khoiTaoDuLieuCacThanhPhanBanHang();
             capNhatThucDonBanHang();
//            khoiTaoDuLieuCacThanhPhanBanHang()
            setVisible(false);
        } else if ("khach".equals(nguoidung.getPhanQuyen())) {
            FKhachHang.setSize(1300, 680);
            FKhachHang.setVisible(true);
            docDuLieu();
  
            khoiTaoDuLieuCacThanhPhanKhachHang();
              
            capNhatThucDonKhachHang();
       
            setVisible(false);
        } else {
            txtCanhBao.setText("Người dùng không tồn tại");
        }


    }//GEN-LAST:event_btDangNhapActionPerformed

    private void txt_mahoadonTimKiem_giaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mahoadonTimKiem_giaoHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mahoadonTimKiem_giaoHangActionPerformed

    private void bt_DatHang_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DatHang_KhachHangActionPerformed

        String maHoaDon = "hd" + String.valueOf(Ketnoi.layHoaDon().size() + 1);
        long millis = System.currentTimeMillis();
        java.sql.Date ngayLap = new java.sql.Date(millis);

        // TODO add your handling code here:
        Ketnoi.luuHoaDon(maHoaDon, ngayLap, null, Integer.parseInt(txt_tongThanhToan_KhackHang.getText()), "Khigiao", "datonlie", null, nguoidung.getMaNguoiDung(), 5, "dangcho",null);
        for (int i = 0; i < tb_MonDaChon_KhackHang.getRowCount(); i++) {

            Ketnoi.luuChiTietHoaDon(maHoaDon, (String) tb_MonDaChon_KhackHang.getValueAt(i, 4), (int) tb_MonDaChon_KhackHang.getValueAt(i, 3));
        }
        Ketnoi.phanPhoiDonHangChoBep(maHoaDon);
        
        System.out.println("da lu xong chi tiet hoa don");
//        String nguoiDung

        Ketnoi.luuChiTietKhachHang(nguoidung.getMaNguoiDung(), txt_SDTkhachNhanHang_khackHang.getText(), txt_khachNhanHang_khackHang.getText(), maHoaDon, maHoaDon, txt_DiaChikhachNhanHang_khackHang.getText());
//          tb_MonDaChon_KhackHang.set
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        JOptionPane.showMessageDialog(frame,
                "ĐẶT HÀNG THÀNH CÔNG THÀNH CÔNG",
         
                "",
                JOptionPane.DEFAULT_OPTION);

        DefaultTableModel model = (DefaultTableModel) tb_MonDaChon_KhackHang.getModel();
        model.setNumRows(0);        
        txt_tongThanhToan_BanHang.setText("");
        docDuLieu();

        khoiTaoDuLieuCacThanhPhanBanHang();
    }//GEN-LAST:event_bt_DatHang_KhachHangActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void bt_HoanThanhDonHang_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HoanThanhDonHang_BepActionPerformed
        // TODO add your handling code here:
        
        Ketnoi.capNhatTrangThaiDonHang(txt_MaDonHang_Bep.getText(), "hoanthanh");
        Ketnoi.phanPhoiDonHangChoGiaoHang(txt_MaDonHang_Bep.getText());
//        ssssssssssssss//
    }//GEN-LAST:event_bt_HoanThanhDonHang_BepActionPerformed

    private void txt_TenMon_MonAn_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenMon_MonAn_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenMon_MonAn_BepActionPerformed

    private void lb_img_MonAn_BepAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lb_img_MonAn_BepAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_lb_img_MonAn_BepAncestorAdded

    private void lb_img_MonAn_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_img_MonAn_BepMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String pathFile = file.getAbsolutePath();
            BufferedImage b;

            try {
                b = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(new ImageIcon(b).getImage().getScaledInstance(lb_img_MonAn_Bep.getWidth(), lb_img_MonAn_Bep.getHeight(), Image.SCALE_SMOOTH));
                lb_img_MonAn_Bep.setIcon(icon);

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_lb_img_MonAn_BepMouseClicked

    private void txt_TenMon_MonAn_Bep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenMon_MonAn_Bep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenMon_MonAn_Bep1ActionPerformed

    private void lb_img_MonAn_Bep1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lb_img_MonAn_Bep1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_img_MonAn_Bep1AncestorAdded
    BufferedImage b;

    private void lb_img_MonAn_Bep1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_img_MonAn_Bep1MouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String pathFile = file.getAbsolutePath();
//            BufferedImage b;

            try {
                b = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(new ImageIcon(b).getImage().getScaledInstance(lb_img_MonAn_Bep1.getWidth(), lb_img_MonAn_Bep1.getHeight(), Image.SCALE_SMOOTH));
                lb_img_MonAn_Bep1.setIcon(icon);

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_lb_img_MonAn_Bep1MouseClicked

    private void bt_ThemMon_MonAn_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ThemMon_MonAn_BepActionPerformed
        // TODO add your handling code here:
        // xoa cac thong tin truoc khi nhap;
        int chiso =Ketnoi.layMonAn().size();
        String maMon = "mon"+String.valueOf(chiso+1);
        txt_MaMon_MonAn_Bep1.setText(maMon);
        txt_Gia_MonAn_Bep1.setText("");
        txt_TenMon_MonAn_Bep1.setText("");
        Icon icon=null;
        
        lb_img_MonAn_Bep1.setIcon(icon);
        
        dl_themMon_bep.setSize(500, 700);
        dl_themMon_bep.setVisible(true);

    }//GEN-LAST:event_bt_ThemMon_MonAn_BepActionPerformed

    private void bt_themMonMoi_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_themMonMoi_BepMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_bt_themMonMoi_BepMouseClicked

    private void txt_Gia_MonAn_Bep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Gia_MonAn_Bep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Gia_MonAn_Bep1ActionPerformed

    private void bt_themMonMoi_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themMonMoi_BepActionPerformed
        // TODO add your handling code here:
        XuLyHinhAnh xla = new XuLyHinhAnh();
        KetNoDuLieu kn = new KetNoDuLieu();
        ChuanHoaDuLieu ch =new ChuanHoaDuLieu();
        
        try {
//            Image im = null;
//            lb_img_MonAn_Bep1.getIcon()
            //Image im =(Image) lb_img_MonAn_Bep1.getIcon().paintIcon(this,  WIDTH, WIDTH);
            byte img[] = xla.toByteImage(b, "jpg");
            kn.luuMonAn(ch.chuanHoaDanhTuRieng(txt_MaMon_MonAn_Bep1.getText()), ch.chuanHoaDanhTuRieng(txt_TenMon_MonAn_Bep1.getText()), img, Integer.parseInt(txt_Gia_MonAn_Bep1.getText()));
        } catch (IOException ex) {
            Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        dl_themMon_bep.setVisible(false);
        setDanhSachMonAn((ArrayList<MonAn>) kn.layMonAn());
        showDanhSachMonAn();
    }//GEN-LAST:event_bt_themMonMoi_BepActionPerformed

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
//        System.out.println("nhan vo meniu r ");
//        FBep.setVisible(false);
//        this.setVisible(true);
//        txt_TaiKhoanDangNhap.setText("");
//        txt_MatKhauDangNhap.setText("");

    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void pn_MonAn_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_MonAn_BepMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_pn_MonAn_BepMouseClicked

    private void tb_DanhSachMonAn_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DanhSachMonAn_BepMouseClicked

        KetNoDuLieu kn = new KetNoDuLieu();
        int viTri = tb_DanhSachMonAn_Bep.getSelectedRow();
        MonAn monTamAn = kn.layMonAn().get(viTri);
        txt_MaMon_MonAn_Bep.setText(monTamAn.getMaMon());
        txt_TenMon_MonAn_Bep.setText(monTamAn.getTenMon());
        txt_Gia_MonAn_Bep.setText(Integer.toString(monTamAn.getGiaTien()));
        XuLyHinhAnh xla = new XuLyHinhAnh();
        Image img = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getHeight(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ImageProducer getSource() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Graphics getGraphics() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        try {
            img = xla.createImageFromByteArray(monTamAn.getImg(), "jpg");
        } catch (IOException ex) {
            Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon icon = new ImageIcon(img);
        lb_img_MonAn_Bep.setIcon(icon);

    }//GEN-LAST:event_tb_DanhSachMonAn_BepMouseClicked

    private void bt_SuaMon_MonAn_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SuaMon_MonAn_BepActionPerformed
        // TODO add your handling code here:
        XuLyHinhAnh xla = new XuLyHinhAnh();
              
        if(Ketnoi.capNhapThongTinMon(txt_MaMon_MonAn_Bep.getText(), txt_TenMon_MonAn_Bep.getText(),xla.iconToImage(lb_img_MonAn_Bep.getIcon()))){
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        JOptionPane.showMessageDialog(frame,
                "THAY DOI THONG TIN THANH CÔNNG",
         
                "",
                JOptionPane.DEFAULT_OPTION);
        showDanhSachMonAn();

        }
        else
        {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        JOptionPane.showMessageDialog(frame,
                "THAY ĐỔI THÔNG TIN KHÔNG THANH CÔNNG",
         
                "",
                JOptionPane.DEFAULT_OPTION);
        }
        
        
//          showDanhSachMonAn();
    }//GEN-LAST:event_bt_SuaMon_MonAn_BepActionPerformed

    private void bt_taothucdonmoi_bepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taothucdonmoi_bepActionPerformed
       int demThucDon=Ketnoi.layThucDon().size();
       String maThucDonString="td"+String.valueOf(demThucDon+1);
       txt_MaThucDonMoi_Bep.setText(maThucDonString);
     DefaultTableModel model=  (DefaultTableModel)tb_BangMonAnTrongThucDon.getModel();
      model.setNumRows(0);
      txt_NgayApDungThucDon_bep.setText("");
        dl_ThucDonMoi.setVisible(true);
        dl_ThucDonMoi.setSize(800, 600);
        cld_ChonNgayThucDon.setVisible(false);
       dl_ThucDonMoi. repaint();
    }//GEN-LAST:event_bt_taothucdonmoi_bepActionPerformed

    private void pn_Menu_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Menu_BepMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_pn_Menu_BepMouseClicked

    private void txt_MaThucDonMoi_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaThucDonMoi_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaThucDonMoi_BepActionPerformed

    private void cbb_ChonMonMenu_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_ChonMonMenu_BepActionPerformed
        // TODO add your handling code here:

//        }

    }//GEN-LAST:event_cbb_ChonMonMenu_BepActionPerformed

    private void bt_themMonVaoThucDon_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themMonVaoThucDon_BepActionPerformed
        // TODO add your handling code here:
        int vt = cbb_ChonMonMenu_Bep.getSelectedIndex();
        DefaultTableModel model = (DefaultTableModel) tb_BangMonAnTrongThucDon.getModel();
//         model.setNumRows(0);
        model.setColumnIdentifiers(new Object[]{
            "STT", "MÃ MÓN", "TÊN MÓN", "SL", "GIÁ"
        });
//     
        MonAn monAn = danhSachMonAn.get(vt);
//            int i=1;
//         for (MonAn monAn : danhSachMonAn) {

        model.addRow(new Object[]{
            tb_BangMonAnTrongThucDon.getRowCount(), monAn.getMaMon(), monAn.getTenMon(), Integer.parseInt(txt_SoLuongMoiMon_ThucDOn_Bep.getText()), monAn.getGiaTien()
        });
////
    }//GEN-LAST:event_bt_themMonVaoThucDon_BepActionPerformed

    private void bt_xoaMonKhoiThucDon_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaMonKhoiThucDon_BepActionPerformed
        // TODO add your handling code here:
        int vt = tb_BangMonAnTrongThucDon.getSelectedRow();

//            int i=1;
//         for (MonAn monAn : danhSachMonAn) {
        DefaultTableModel model = (DefaultTableModel) tb_BangMonAnTrongThucDon.getModel();
        model.removeRow(vt);
        docDuLieu();
//              model.addRow(new Object[]{
//            tb_BangMonAnTrongThucDon.getRowCount(),monAn.getMaMon(),monAn.getTenMon(),monAn.getGiaTien()
//        });
////

    }//GEN-LAST:event_bt_xoaMonKhoiThucDon_BepActionPerformed

    private void tb_DanhSachThucDon_menu_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DanhSachThucDon_menu_BepMouseClicked
        // TODO add your handling code here:
        int vt = tb_DanhSachThucDon_menu_Bep.getSelectedRow();
        ArrayList<pn_ThongTinMonAn> thucDonHienTai = new ArrayList<>();

//        for (MonAn mon : danhSachMonAn) {
//            cbb_Mon_Menu_Bep.addItem(mon.getTenMon());
//            
//        }
        int slmamn = danhSachThucDon.get(vt).getLitsChitietTD().size();
//        System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBep()" + slmamn);
        for (int i = 0; i < slmamn; i++) {
            MonAn ma = new MonAn();
            for (MonAn mon : danhSachMonAn) {
                if (mon.getMaMon().equals(danhSachThucDon.get(vt).getLitsChitietTD().get(i).getMaMon())) {
                    ma = mon;
                    break;
                }
            }

            pn_ThongTinMonAn pn = new pn_ThongTinMonAn();
            pn.setThongTinMonAn(ma);
            thucDonHienTai.add(pn);

        }
        menu_Bep.removeAll();
        for (int i = 0; i < slmamn; i++) {
            menu_Bep.add(thucDonHienTai.get(i));
            thucDonHienTai.get(i).showthongtin();
        }


    }//GEN-LAST:event_tb_DanhSachThucDon_menu_BepMouseClicked

    private void bt_Lich_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Lich_BepActionPerformed
        // TODO add your handling code here:
        if (cld_ChonNgayThucDon.isVisible() == true) {
            cld_ChonNgayThucDon.setVisible(false);
        } else {
            cld_ChonNgayThucDon.setVisible(true);
        }
//        System.out.println("giaoDien.FDangNhap.bt_Lich_BepActionPerformed()");
    }//GEN-LAST:event_bt_Lich_BepActionPerformed

    private void cld_ChonNgayThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cld_ChonNgayThucDonMouseClicked
        // TODO add your handling code here:
//        System.out.println("giaoDien.FDangNhap.bt_Lich_BepActionPerformed()" + cld_ChonNgayThucDon.getDayChooser().getDay() + cld_ChonNgayThucDon.getMonthChooser().getMonth() + cld_ChonNgayThucDon.getYearChooser().getYear());

        String t = String.valueOf(cld_ChonNgayThucDon.getDayChooser().getDay()) + "/" + String.valueOf(cld_ChonNgayThucDon.getMonthChooser().getMonth()+1) + "/" + String.valueOf(cld_ChonNgayThucDon.getYearChooser().getYear());

        txt_NgayApDungThucDon_bep.setText(t);
        cld_ChonNgayThucDon.setVisible(false);
    }//GEN-LAST:event_cld_ChonNgayThucDonMouseClicked

    private void txt_khachNhanHang_khackHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_khachNhanHang_khackHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_khachNhanHang_khackHangActionPerformed

    private void tb_BangMonAnTrongThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_BangMonAnTrongThucDonMouseClicked
        // TODO add your handling code here:

//        System.out.println(tb_BangMonAnTrongThucDon.getModel().getValueAt(vt, 3).toString()); 

    }//GEN-LAST:event_tb_BangMonAnTrongThucDonMouseClicked

    private void bt_TaoThucDonMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TaoThucDonMoiActionPerformed
        // TODO add your handling code here:
        int vt = cbb_buoidung_bep.getSelectedIndex();
        String Matd = txt_MaThucDonMoi_Bep.getText();
        Date date = new Date(cld_ChonNgayThucDon.getYearChooser().getYear() - 1900, cld_ChonNgayThucDon.getMonthChooser().getMonth(), cld_ChonNgayThucDon.getDayChooser().getDay());
        Ketnoi.luuThucDon(date, Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung()), txt_MaThucDonMoi_Bep.getText(), cbb_buoidung_bep.getItemAt(vt));
        for (int i = 0; i < tb_BangMonAnTrongThucDon.getRowCount(); i++) {
            String maMon = (String) tb_BangMonAnTrongThucDon.getModel().getValueAt(i, 1);
            int sl = (int) tb_BangMonAnTrongThucDon.getModel().getValueAt(i, 3);
            System.out.println("giaoDien./" + Matd + "/" + maMon + "/" + sl + "/");
            Ketnoi.luuChiTietThucDon(Matd, maMon, sl);

        }
        docDuLieu();
        khoiTaoDuLieuCacThanhPhanBep();

    }//GEN-LAST:event_bt_TaoThucDonMoiActionPerformed

    private void txt_SDTkhachNhanHang_khackHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SDTkhachNhanHang_khackHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SDTkhachNhanHang_khackHangActionPerformed

    private void pn_ThucDonKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ThucDonKhachHangMouseClicked
        // TODO add your handling code here:
        System.out.println("giaoDien.FDangNhap.pn_ThucDonKhaụuiooooooooooooooooooooooooochHangMouseClicked()");
    }//GEN-LAST:event_pn_ThucDonKhachHangMouseClicked

    private void txt_DiaChikhachNhanHang_khackHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChikhachNhanHang_khackHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChikhachNhanHang_khackHangActionPerformed

    private void cb_MangVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_MangVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_MangVeActionPerformed

    private void cb_dungTaiChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dungTaiChoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_dungTaiChoActionPerformed

    private void bt_BanHan_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BanHan_BanHangActionPerformed
        // TODO add your handling code here:
        
        String maHoaDon = "hd" + String.valueOf(danhSachHoaDon.size() + 1);
        long millis = System.currentTimeMillis();
        java.sql.Date ngayLap = new java.sql.Date(millis);
        String ttd="";
        if(cb_dungTaiCho.isSelected()){
            ttd="dungtaicho";
        }
        if(cb_MangVe.isSelected()){
            ttd="mangve";
        }
        // TODO add your handling code here:
        String maNv="";
        for(NhanVien nv : danhSachNhanVien)
        {
//             System.out.println("giaoDien.FDangNhap.bt_BanHan_BanHangActionPerformed()/"+nv.getEmail()+"/"+nguoidung.getMaNguoiDung()+"/");
            if(nv.getEmail().equals(nguoidung.getMaNguoiDung()))
            {
                 maNv=nv.getMaNhanVien();
                 break;
            }
               
        }
//        System.out.println("giaoDien.FDangNhap.bt_BanHan_BanHangActionPerformed()/"+maNv+"/");
        Ketnoi.luuHoaDon(maHoaDon, ngayLap, maNv, Integer.parseInt(txt_TongthanhToan_BanHang.getText()), "hoàn thành", ttd, null,null , 5, "cho","nv1");
        for (int i = 0; i < tb_MonDaChon_nhanVienBanHang.getRowCount(); i++) {

            Ketnoi.luuChiTietHoaDon(maHoaDon, (String)tb_MonDaChon_nhanVienBanHang.getValueAt(i, 4), (int) tb_MonDaChon_nhanVienBanHang.getValueAt(i, 3));
        }
        System.out.println("da lu xong chi tiet hoa don");
//        String nguoiDung

//        Ketnoi.luuChiTietKhachHang(nguoidung.getMaNguoiDung(), txt_SDTkhachNhanHang_khackHang.getText(), txt_khachNhanHang_khackHang.getText(), maHoaDon, maHoaDon, txt_DiaChikhachNhanHang_khackHang.getText());
//          tb_MonDaChon_KhackHang.set
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        JOptionPane.showMessageDialog(frame,
                "ĐẶT HÀNG THÀNH CÔNG THÀNH CÔNG",
                "",
                JOptionPane.DEFAULT_OPTION);

        DefaultTableModel model = (DefaultTableModel) tb_MonDaChon_nhanVienBanHang.getModel();
        model.setNumRows(0); 
        txt_tongThanhToan_BanHang.setText("");
        docDuLieu();
       
         khoiTaoDuLieuCacThanhPhanBanHang();
    }//GEN-LAST:event_bt_BanHan_BanHangActionPerformed

    private void tb_danhSachDonHang_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_danhSachDonHang_BepMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tb_danhSachDonHang_BepMouseClicked

    private void txt_mahoadonTimKiem_giaoHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mahoadonTimKiem_giaoHangKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           dl_ChiTietDonHang_GiaoHang.setSize(900, 600);
            ChuanHoaDuLieu ChuanHoa = new ChuanHoaDuLieu() ;
       
        String maHoaDon = txt_mahoadonTimKiem_giaoHang.getText();
//        String maNvGiaoHang= Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
        HoaDon hd = Ketnoi.timHoaDontheoma(ChuanHoa.chuanHoa(maHoaDon));
        ChiTietKhachHang ctdh = Ketnoi.timChiTietKhachHang(ChuanHoa.chuanHoa(maHoaDon));
        txt_nguoidat_chitietdonhang_giaoHang.setText(hd.getMaKhachHang());
        String thongtindonhang="Người Nhận: "+ctdh.getTenNguoiNhan()+  "\n"+" SDT: "+ctdh.getSDTNhan()+ "\n"+ "Địa Chỉ:  "+ctdh.getDiaChiNhan()+ "\n"+"Lưu ý: "+ctdh.getGhiChu()+ "\n"+"Người Đặt: "+hd.getMaKhachHang();
        txt_thongTinDonHang_chitietdonhang_giaoHang.setText(thongtindonhang);
        DefaultTableModel md = (DefaultTableModel) tb_ChitietDonHang_ChitietDonHang_GiaoHang.getModel();
       md.setNumRows(0);
       int j=1;
      
        for (ChiTietHoaDon cthoaDon : hd.getLitsChitietHD()) {
            MonAn mon= new MonAn();
            for (MonAn mona: danhSachMonAn) {
                if(mona.getMaMon().equals(cthoaDon.getMaMon()))
                {
                    mon=mona;
                    break;
                }
            }
            md.addRow(new Object[]{
             j++,mon.getTenMon(),cthoaDon.getSoLuong(),""
            });
        }
           dl_ChiTietDonHang_GiaoHang.setVisible(true);
         }
    }//GEN-LAST:event_txt_mahoadonTimKiem_giaoHangKeyPressed

    private void txt_nguoidat_chitietdonhang_giaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nguoidat_chitietdonhang_giaoHangActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_nguoidat_chitietdonhang_giaoHangActionPerformed

    private void bt_ChiTietDonHang_giaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ChiTietDonHang_giaoHangActionPerformed
        // TODO add your handling code here:
          dl_ChiTietDonHang_GiaoHang.setSize(900, 600);
            ChuanHoaDuLieu ChuanHoa = new ChuanHoaDuLieu() ;
       
        String maHoaDon = txt_mahoadonTimKiem_giaoHang.getText();
//        String maNvGiaoHang= Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
        HoaDon hd = Ketnoi.timHoaDontheoma(ChuanHoa.chuanHoa(maHoaDon));
        ChiTietKhachHang ctdh = Ketnoi.timChiTietKhachHang(ChuanHoa.chuanHoa(maHoaDon));
        txt_nguoidat_chitietdonhang_giaoHang.setText(hd.getMaKhachHang());
        String thongtindonhang="Người Nhận: "+ctdh.getTenNguoiNhan()+  "\n"+" SDT: "+ctdh.getSDTNhan()+ "\n"+ "Địa Chỉ:  "+ctdh.getDiaChiNhan()+ "\n"+"Lưu ý: "+ctdh.getGhiChu()+ "\n"+"Người Đặt: "+hd.getMaKhachHang();
        txt_thongTinDonHang_chitietdonhang_giaoHang.setText(thongtindonhang);
        DefaultTableModel md = (DefaultTableModel) tb_ChitietDonHang_ChitietDonHang_GiaoHang.getModel();
       md.setNumRows(0);
       int j=1;
      
        for (ChiTietHoaDon cthoaDon : hd.getLitsChitietHD()) {
            MonAn mon= new MonAn();
            for (MonAn mona: danhSachMonAn) {
                if(mona.getMaMon().equals(cthoaDon.getMaMon()))
                {
                    mon=mona;
                    break;
                }
            }
            md.addRow(new Object[]{
             j++,mon.getTenMon(),cthoaDon.getSoLuong(),""
            });
        }
           dl_ChiTietDonHang_GiaoHang.setVisible(true);
    }//GEN-LAST:event_bt_ChiTietDonHang_giaoHangActionPerformed

    private void bt_xacNhanThanhToan_GiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xacNhanThanhToan_GiaoHangActionPerformed
        // TODO add your handling code here:
        ChuanHoaDuLieu chuanHoa = new ChuanHoaDuLieu();
       String maHoaDon=txt_DonHang_giaohnag.getText();
       Ketnoi.capNhatTrangThaiDonHang(maHoaDon, "dagiaoxong");
      JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "HOÀN THÀNH THANH TOÁN ĐƠN HÀNG :"+maHoaDon,
                    "",
                    JOptionPane.DEFAULT_OPTION);
//                    Ketnoi.capNhatgiaohang(ChuanHoa.chuanHoa(maHoaDon), "giaohoanthanh",maNvGiaoHang );
    txt_DonHang_giaohnag.setText("");
    txt_thongTinDonHang_GiaoHang.setText("");
    int vt= tb_GiaoHang.getSelectedRow();
    DefaultTableModel model =(DefaultTableModel) tb_GiaoHang.getModel();
    model.removeRow(vt);
    }//GEN-LAST:event_bt_xacNhanThanhToan_GiaoHangActionPerformed

    private void tb_GiaoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_GiaoHangMouseClicked
        // TODO add your handling code here:
        ChuanHoaDuLieu ChuanHoa = new ChuanHoaDuLieu() ;
        int vt =tb_GiaoHang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tb_GiaoHang.getModel();
        String maHoaDon = (String) model. getValueAt(vt, 1);
        String maNvGiaoHang= Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
        HoaDon hd = Ketnoi.timHoaDontheoma(ChuanHoa.chuanHoa(maHoaDon));
        ChiTietKhachHang ctdh = Ketnoi.timChiTietKhachHang(ChuanHoa.chuanHoa(maHoaDon));
        txt_DonHang_giaohnag.setText(maHoaDon);
//        txt_thongTinDonHang_GiaoHang.set
        String thongtindonhang="Người Nhận: "+ctdh.getTenNguoiNhan()+  "\n"+" SDT: "+ctdh.getSDTNhan()+ "\n"+ "Địa Chỉ:  "+ctdh.getDiaChiNhan()+ "\n"+"Lưu ý: "+ctdh.getGhiChu()+ "\n"+"Người Đặt: "+hd.getMaKhachHang();
        txt_thongTinDonHang_GiaoHang.setText(thongtindonhang);
    }//GEN-LAST:event_tb_GiaoHangMouseClicked

    private void bt_xoaNhanVien_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaNhanVien_AdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_xoaNhanVien_AdActionPerformed

    private void bt_themnhanVien_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themnhanVien_ADActionPerformed
      dl_ThongTinNhanVien_AD.setVisible(true);
      String maNhanVien="nv";
      int chiSo =Ketnoi.layNhanVien().size();
      maNhanVien=maNhanVien+String.valueOf(chiSo);
      dl_ThongTinNhanVien_AD.setSize(860,420);
      txt_MaNhanVien_ThongTinNhanVien_Ad.setText(maNhanVien);
     cld_lich_thongTinNhanVien_Ad.setVisible(false);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_themnhanVien_ADActionPerformed

    private void bt_ChiTietNhanVien_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ChiTietNhanVien_AdActionPerformed
        // TODO add your handling code here:
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        int vt= tb_DanhSachNhanVien_AD.getSelectedRow();
        String maNhanVien = XuLyChuanHoa.xoakhoangtrong((String )tb_DanhSachNhanVien_AD.getValueAt(vt, 1));
       NhanVien thongTinNhanVien = Ketnoi.timNhanVienTheoMa( maNhanVien);
         dl_ThongTinNhanVien_AD.setVisible(true);
       dl_ThongTinNhanVien_AD.setVisible(true);
       txt_MaNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getMaNhanVien());
       txt_TenNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getMaNhanVien());
       txt_NamSinhNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getNamSinh().toString());
       txt_cmnnNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getCMND());
       txt_EmailNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getEmail());
       txt_SDTNhanVien_ThongTinNhanVien_Ad.setText(thongTinNhanVien.getSDT());
       cbb_phanquyen_NhanVien_Ad.removeAllItems();
       cbb_phanquyen_NhanVien_Ad.addItem(thongTinNhanVien.getPhanQuyen());
       if(ch.chuanHoa(thongTinNhanVien.getGioiTinh()).equals("nam")){
           btNam_NhanVien_ad.setSelected(true);
       }
       else
        bt_nu_nhanvine_ad.setSelected(true);
       cld_lich_thongTinNhanVien_Ad.setVisible(false);
//       HH
if(ch.chuanHoa(thongTinNhanVien.getTinhTrangHoatDong()).equals("hd")){
    bt_hoatdong_nhanvien_ad.setSelected(true);
}else{
    bt_chan_nhanvien_ad.setSelected(true);
}
    }//GEN-LAST:event_bt_ChiTietNhanVien_AdActionPerformed

    private void bt_ngaySinhNhanVien_thongTinNhanVien_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ngaySinhNhanVien_thongTinNhanVien_ADActionPerformed
        // TODO add your handling code here:
        if(cld_lich_thongTinNhanVien_Ad.isVisible()==true)
        {
            cld_lich_thongTinNhanVien_Ad.setVisible(false);
           
            
        }
        else{
            cld_lich_thongTinNhanVien_Ad.setVisible(true);
        
            
         
            
        }
//        com.toedter.calendar.JCalendar cld = new C
    }//GEN-LAST:event_bt_ngaySinhNhanVien_thongTinNhanVien_ADActionPerformed

    private void bt_luunhanvien_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_luunhanvien_adActionPerformed
        // TODO add your handling code here:
        // KIEM TRA THONG TIN SAI+ THONG TIN TRUNG CUA NHAN VIEN
       
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        if(Ketnoi.timNhanVienTheoMa(ch.chuanHoa(txt_MaNhanVien_ThongTinNhanVien_Ad.getText())).getTenNhanVien().length()==0){
              Date date = new Date(cld_lich_thongTinNhanVien_Ad.getYearChooser().getYear(), cld_lich_thongTinNhanVien_Ad.getMonthChooser().getMonth(), cld_lich_thongTinNhanVien_Ad.getDayChooser().getDay());
       String tinhTrangHoatDong ;
       if(bt_chan_nhanvien_ad.isValid())
           tinhTrangHoatDong="chan";
       else
           tinhTrangHoatDong="hd";
       String gioiTinh;
       if(bt_nu_nhanvine_ad.isValid()){
           gioiTinh="nu";
       }
       else
           gioiTinh="nam";
       
        NhanVien nvTam = new NhanVien(ch.chuanHoaDanhTuRieng(txt_MaNhanVien_ThongTinNhanVien_Ad.getText()), ch.chuanHoaDanhTuRieng(txt_TenNhanVien_ThongTinNhanVien_Ad.getText()), txt_SDTNhanVien_ThongTinNhanVien_Ad.getText(),date , txt_cmnnNhanVien_ThongTinNhanVien_Ad.getText(), cbb_phanquyen_NhanVien_Ad.getItemAt(cbb_phanquyen_NhanVien_Ad.getSelectedIndex()), txt_EmailNhanVien_ThongTinNhanVien_Ad.getText(), gioiTinh, tinhTrangHoatDong);
       Ketnoi.luuNhanVien(nvTam.getMaNhanVien(), nvTam.getTenNhanVien(), nvTam.getSDT(), date, nvTam.getCMND(), nvTam.getPhanQuyen(), nvTam.getEmail(), gioiTinh, tinhTrangHoatDong);
       JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "HOÀN THÀNH ĐĂNG KÝ",
                    "",
                    JOptionPane.DEFAULT_OPTION);
           dl_ThongTinNhanVien_AD.setVisible(false);
           showDanhSachNhanVien();
        }
        else{
//            Ketnoi.capnhatnhanvien();
  Date date = new Date(cld_lich_thongTinNhanVien_Ad.getYearChooser().getYear(), cld_lich_thongTinNhanVien_Ad.getMonthChooser().getMonth(), cld_lich_thongTinNhanVien_Ad.getDayChooser().getDay());
       String tinhTrangHoatDong ;
       if(bt_chan_nhanvien_ad.isValid())
           tinhTrangHoatDong="chan";
       else
           tinhTrangHoatDong="hd";
       String gioiTinh;
       if(bt_nu_nhanvine_ad.isValid()){
           gioiTinh="nu";
       }
       else
           gioiTinh="nam";
       
        NhanVien nvTam = new NhanVien(ch.chuanHoaDanhTuRieng(txt_MaNhanVien_ThongTinNhanVien_Ad.getText()), ch.chuanHoaDanhTuRieng(txt_TenNhanVien_ThongTinNhanVien_Ad.getText()), txt_SDTNhanVien_ThongTinNhanVien_Ad.getText(),date , txt_cmnnNhanVien_ThongTinNhanVien_Ad.getText(), cbb_phanquyen_NhanVien_Ad.getItemAt(cbb_phanquyen_NhanVien_Ad.getSelectedIndex()), txt_EmailNhanVien_ThongTinNhanVien_Ad.getText(), gioiTinh, tinhTrangHoatDong);
       Ketnoi.capnhatnhanvien(nvTam.getMaNhanVien(), nvTam.getTenNhanVien(), nvTam.getSDT(), date, nvTam.getCMND(), nvTam.getPhanQuyen(), nvTam.getEmail(), gioiTinh, tinhTrangHoatDong);
       JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    "CẬP NHẬT THÀNH CÔNG",
                    "",
                    JOptionPane.DEFAULT_OPTION);
           dl_ThongTinNhanVien_AD.setVisible(false);
           showDanhSachNhanVien();
            
        }
      
//        nvTam.
    }//GEN-LAST:event_bt_luunhanvien_adActionPerformed
void thongBao(String ThongBao){
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                    ThongBao,
                    "",
                    JOptionPane.DEFAULT_OPTION);
}
    private void txt_cmnnNhanVien_ThongTinNhanVien_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cmnnNhanVien_ThongTinNhanVien_AdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cmnnNhanVien_ThongTinNhanVien_AdActionPerformed

    private void txt_EmailNhanVien_ThongTinNhanVien_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailNhanVien_ThongTinNhanVien_AdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailNhanVien_ThongTinNhanVien_AdActionPerformed

    private void cld_lich_thongTinNhanVien_AdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cld_lich_thongTinNhanVien_AdMouseClicked
        // TODO add your handling code here:
         String t = String.valueOf(cld_lich_thongTinNhanVien_Ad.getDayChooser().getDay()) + "/" + String.valueOf(cld_lich_thongTinNhanVien_Ad.getMonthChooser().getMonth()) + "/" + String.valueOf(cld_lich_thongTinNhanVien_Ad.getYearChooser().getYear());
txt_NamSinhNhanVien_ThongTinNhanVien_Ad.setText(t);
cld_lich_thongTinNhanVien_Ad.setVisible(false);
        
    }//GEN-LAST:event_cld_lich_thongTinNhanVien_AdMouseClicked

    private void FadminWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FadminWindowClosed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_FadminWindowClosed

    private void FadminWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FadminWindowClosing
        // TODO add your handling code here: 
        Ketnoi.thayDoiTrangThaiLamViec(nguoidung.getMaNguoiDung(), 0);
                
    }//GEN-LAST:event_FadminWindowClosing

    private void FGiaoHangWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FGiaoHangWindowClosing
        // TODO add your handling code here:
         Ketnoi.thayDoiTrangThaiLamViec(nguoidung.getMaNguoiDung(), 0);
    }//GEN-LAST:event_FGiaoHangWindowClosing

    private void FBepWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FBepWindowClosing
        // TODO add your handling code here:
         Ketnoi.thayDoiTrangThaiLamViec(nguoidung.getMaNguoiDung(), 0);
    }//GEN-LAST:event_FBepWindowClosing

    private void FBanHangWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FBanHangWindowClosing
        // TODO add your handling code here:
         Ketnoi.thayDoiTrangThaiLamViec(nguoidung.getMaNguoiDung(), 0);
    }//GEN-LAST:event_FBanHangWindowClosing

    private void bt_XoaMon_MonAn_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_XoaMon_MonAn_BepActionPerformed
        // TODO add your handling code here:
       if(Ketnoi.xoaMonAn(txt_MaMon_MonAn_Bep.getText()) ){
           thongBao("Xóa Thành Công");
           showDanhSachMonAn();
       }
       else{
               
               }
    }//GEN-LAST:event_bt_XoaMon_MonAn_BepActionPerformed

    private void txt_MaThucDonMoiChiTiet_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaThucDonMoiChiTiet_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaThucDonMoiChiTiet_BepActionPerformed

    private void tb_BangMonAnTrongThucDonChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_BangMonAnTrongThucDonChiTietMouseClicked
        // TODO add your handling code here:
        ChuanHoaDuLieu ch= new ChuanHoaDuLieu() ;
        int vt= tb_BangMonAnTrongThucDonChiTiet.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tb_BangMonAnTrongThucDonChiTiet.getModel();
        String mon="";
        mon=(String) model.getValueAt(vt, 2);
        mon=ch.chuanHoa(mon);
        cbb_ChonMonMenuChiTiet_Bep.setSelectedItem(mon);
        System.out.println("giaoDien.FDangNhap.tb_BangMonAnTrongThucDonChiTietMouseClicked()"+mon);
        txt_SoLuongMoiMonChiTiet_ThucDOn_Bep.setText(String.valueOf(model.getValueAt(vt, 3)) );
        
        
    }//GEN-LAST:event_tb_BangMonAnTrongThucDonChiTietMouseClicked

    private void cbb_ChonMonMenuChiTiet_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_ChonMonMenuChiTiet_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_ChonMonMenuChiTiet_BepActionPerformed

    private void bt_themMonVaoThucDonChiTiet_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themMonVaoThucDonChiTiet_BepActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tb_BangMonAnTrongThucDonChiTiet.getModel();
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        String monthem ="";
        int slThem=0;
        slThem= Integer.parseInt(txt_SoLuongMoiMonChiTiet_ThucDOn_Bep.getText());
        monthem= cbb_ChonMonMenuChiTiet_Bep.getSelectedItem().toString();
        for (int i=0;i<model.getRowCount()+1;i++){
            if(ch.chuanHoa(monthem).equals(ch.chuanHoa((String) model.getValueAt(i, 2)))){
               model.setValueAt(slThem+ (int)model.getValueAt(i, 3), i, 3);
            }
            if(i==model.getRowCount()){
               MonAn monAn= new MonAn();
//               txt_SoLuongMoiMonChiTiet_ThucDOn_Bep.setText(String.valueOf(cbb_ChonMonMenuChiTiet_Bep.getSelectedIndex()));
System.err.println("giaoDien.FDangNhap.bt_themMonVaoThucDonChiTiet_BepActionPerformed()+"+cbb_ChonMonMenuChiTiet_Bep.getSelectedIndex());
                monAn=Ketnoi.layMonAn().get(cbb_ChonMonMenuChiTiet_Bep.getSelectedIndex());
                model.addRow(new Object[]{
                      tb_BangMonAnTrongThucDonChiTiet.getRowCount(), monAn.getMaMon(), monAn.getTenMon(), Integer.parseInt(txt_SoLuongMoiMon_ThucDOn_Bep.getText()), monAn.getGiaTien()
                });
            }
        }
        
       
    }//GEN-LAST:event_bt_themMonVaoThucDonChiTiet_BepActionPerformed

    private void bt_xoaMonKhoiThucDonChiTiet_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaMonKhoiThucDonChiTiet_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_xoaMonKhoiThucDonChiTiet_BepActionPerformed

    private void bt_LuuThucDonChinhSuaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LuuThucDonChinhSuaChiTietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_LuuThucDonChinhSuaChiTietActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dl_chiTietThucDon_Bep.setSize(700, 600);
        dl_chiTietThucDon_Bep.setVisible(true);
        int vt= tb_DanhSachThucDon_menu_Bep.getSelectedRow();
        ThucDon tdtam = new ThucDon();
        tdtam= Ketnoi.layThucDon().get(vt);
ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        txt_NgayApDungThucDonChiTiet_bep.setText(tdtam.getNgayDung().toString());
        txt_MaThucDonMoiChiTiet_Bep.setText(tdtam.getMaThucDon());
        cbb_buoidungChiTiet_bep.removeAllItems();
        cbb_buoidungChiTiet_bep.addItem("SÁNG");
         cbb_buoidungChiTiet_bep.addItem("TRƯA");
         cbb_buoidungChiTiet_bep.addItem("TỐI");
        cbb_buoidungChiTiet_bep.setSelectedItem(ch.chuanHoa(tdtam.getBuoiDung()));
        cbb_ChonMonMenuChiTiet_Bep.removeAllItems();
       for (MonAn ma:danhSachMonAn){
           cbb_ChonMonMenuChiTiet_Bep.addItem(ma.getTenMon());
       }
       int i=1;
       DefaultTableModel model = (DefaultTableModel) tb_BangMonAnTrongThucDonChiTiet.getModel();
       model.setNumRows(0);
      for (ChiTietThucDon ct : tdtam.getLitsChitietTD()){
      MonAn mon = new MonAn();
         for (MonAn ma: danhSachMonAn){
             if(  ch.chuanHoa(ct.getMaMon()).equals(ch.chuanHoa(ma.getMaMon())))
             {
               
                mon= ma;
                 break;
             }
                 
         }
          model.addRow(new Object[]{
              i++, ct.getMaMon(),mon.getTenMon(),ct.getSoLuong(),mon.getGiaTien()
          });
      }
       
       
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tb_MonDaChon_KhackHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_MonDaChon_KhackHangMouseClicked

        // TODO add your handling code here:
        int vt= tb_MonDaChon_KhackHang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tb_MonDaChon_KhackHang.getModel();
        String t = (String) model.getValueAt(vt,1 );
        txt_monchon_khachHang_khackHang.setText(t);
    }//GEN-LAST:event_tb_MonDaChon_KhackHangMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        
//        Fadmin.setVisible(false);
//        this.setVisible(true);
//         txt_TaiKhoanDangNhap.setText("");
//        txt_MatKhauDangNhap.setText("");
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        // TODO add your handling code here:
//        FGiaoHang.setVisible(false);
//        this.setVisible(true);
//         txt_TaiKhoanDangNhap.setText("");
//     txt_MatKhauDangNhap.setText("");
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked
        // TODO add your handling code here:
//        FKhachHang.setVisible(false);
//         this.setVisible(true);
//        txt_TaiKhoanDangNhap.setText("");
//     txt_MatKhauDangNhap.setText("");
    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void bt_xuatFileDoanhThuNgay_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xuatFileDoanhThuNgay_AdminActionPerformed
        // TODO add your handling code here:
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Phòng trọ cho thuê");
//////            
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
//////            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH PHÒNG TRỌ CHO THUÊ");
//////          
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Tiêu đề");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Số điện thoại tin");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ngày Đăng");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("An Ninh");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Thông Tin Địa Chỉ");
//////            
            for (int i = 0; i < danhSachHoaDon.size(); i++) {
                HoaDon hd =danhSachHoaDon.get(i);
////                ThongTinTin ttt = lay_TinList().get(i);
//////                
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(hd.getMaHoaDon());
                System.out.println("tong thanh toán )"+hd.getTongThanhToan());
                row.createCell(1).setCellValue(hd.getTongThanhToan());
//////                row.createCell(2).setCellValue(ttt.getNgayDang().toString());
//////                row.createCell(3).setCellValue(ttt.getAnNinh());
//////                row.createCell(4).setCellValue(ttt.getThongTinDiaChi());
//////                
            }
//////
            FileOutputStream out = new FileOutputStream(new File("E:/BUG/DATA/data.xlsx"));
            workbook.write(out);
            out.close();
        }
            catch (Exception e) {
            e.printStackTrace();
        }
//////        
//////        JOptionPane.showMessageDialog(this,"Xuất file thành công !");
    }//GEN-LAST:event_bt_xuatFileDoanhThuNgay_AdminActionPerformed

    private void bt_tkDTTheoNgay_DoanhThu_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tkDTTheoNgay_DoanhThu_AdminActionPerformed
        // TODO add your handling code here:
        showdoanhthu();
    }//GEN-LAST:event_bt_tkDTTheoNgay_DoanhThu_AdminActionPerformed

    private void bt_tkDTTheoThang_DoanhThu_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tkDTTheoThang_DoanhThu_AdminActionPerformed
        // TODO add your handling code here:
        showDoanhThuTheoThang();
    }//GEN-LAST:event_bt_tkDTTheoThang_DoanhThu_AdminActionPerformed

    private void bt_tkDTTheoNam_DoanhThu_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tkDTTheoNam_DoanhThu_AdminActionPerformed
        // TODO add your handling code here:
        showDoanhThuTheoNam();
    }//GEN-LAST:event_bt_tkDTTheoNam_DoanhThu_AdminActionPerformed

    private void jTabbedPane7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane7MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabbedPane7MouseClicked

    private void jTabbedPane5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabbedPane5MouseExited

    private void pn_Exit_BepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Exit_BepMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_pn_Exit_BepMouseClicked

    private void jtxtfield_PassMoi_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfield_PassMoi_BepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfield_PassMoi_BepActionPerformed

    private void jBtCapNhapPass_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCapNhapPass_BepActionPerformed
        // TODO add your handling code here:
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        String mKCu = jtxtfield_PassHienTai_Bep.getText();
        String mKMoi = jtxtfield_PassMoi_Bep.getText();
        String xacNhanMK = jtxtfield_XacNhanPass_Bep.getText();
        
        KetNoDuLieu sql = new KetNoDuLieu();
        if((txt_MatKhauDangNhap.getText()).equals(mKCu)){
            if(mKMoi.equals(xacNhanMK)){
                sql.capNhatMatKhau(txt_TaiKhoanDangNhap.getText(), mKMoi);
                JOptionPane.showMessageDialog(panelComponent, "ĐỔI MẬT KHẨU THÀNH CÔNG");
                jtxtfield_PassHienTai_Bep.setText("");
                jtxtfield_PassMoi_Bep.setText("");
                jtxtfield_XacNhanPass_Bep.setText("");
                
            }
            else{
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG KHỚP");
            }
        }else
        {
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU CŨ KHÔNG TRÙNG KHỚP");
        }
    }//GEN-LAST:event_jBtCapNhapPass_BepActionPerformed

    private void jtxtfield_PassMoi_KhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfield_PassMoi_KhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfield_PassMoi_KhachActionPerformed

    private void jBtCapNhapPass_KhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCapNhapPass_KhachActionPerformed
        // TODO add your handling code here:
        String mKCu = jtxtfield_PassHienTai_Khach.getText();
        String mKMoi = jtxtfield_PassMoi_Khach.getText();
        String xacNhanMK = jtxtfield_XacNhanPass_Khach.getText();
        
        KetNoDuLieu sql = new KetNoDuLieu();
        if((txt_MatKhauDangNhap.getText()).equals(mKCu)){
            if(mKMoi.equals(xacNhanMK)){
                sql.capNhatMatKhau(txt_TaiKhoanDangNhap.getText(), mKMoi);
                JOptionPane.showMessageDialog(panelComponent, "ĐỔI MẬT KHẨU THÀNH CÔNG");
                jtxtfield_PassHienTai_Khach.setText("");
                jtxtfield_PassMoi_Khach.setText("");
                jtxtfield_XacNhanPass_Khach.setText("");
                
            }
            else{
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG KHỚP");
            }
        }else
        {
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU CŨ KHÔNG TRÙNG KHỚP");
        }
    }//GEN-LAST:event_jBtCapNhapPass_KhachActionPerformed

    private void jtxtfield_PassMoi_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfield_PassMoi_BanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfield_PassMoi_BanHangActionPerformed

    private void jBtCapNhapPass_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCapNhapPass_BanHangActionPerformed
        // TODO add your handling code here:
        String mKCu = jtxtfield_PassHienTai_BanHang.getText();
        String mKMoi = jtxtfield_PassMoi_BanHang.getText();
        String xacNhanMK = jtxtfield_XacNhanPass_BanHang.getText();
        
        KetNoDuLieu sql = new KetNoDuLieu();
        if((txt_MatKhauDangNhap.getText()).equals(mKCu)){
            if(mKMoi.equals(xacNhanMK)){
                sql.capNhatMatKhau(txt_TaiKhoanDangNhap.getText(), mKMoi);
                JOptionPane.showMessageDialog(panelComponent, "ĐỔI MẬT KHẨU THÀNH CÔNG");
                jtxtfield_PassHienTai_BanHang.setText("");
                jtxtfield_PassMoi_BanHang.setText("");
                jtxtfield_XacNhanPass_BanHang.setText("");
                
            }
            else{
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG KHỚP");
            }
        }else
        {
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU CŨ KHÔNG TRÙNG KHỚP");
        }
    }//GEN-LAST:event_jBtCapNhapPass_BanHangActionPerformed

    private void jtxtfield_PassMoi_GiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfield_PassMoi_GiaoHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfield_PassMoi_GiaoHangActionPerformed

    private void jBtCapNhapPass_GiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCapNhapPass_GiaoHangActionPerformed
        // TODO add your handling code here:
        String mKCu = jtxtfield_PassHienTai_GiaoHang.getText();
        String mKMoi = jtxtfield_PassMoi_GiaoHang.getText();
        String xacNhanMK = jtxtfield_XacNhanPass_GiaoHang.getText();
        
        KetNoDuLieu sql = new KetNoDuLieu();
        if((txt_MatKhauDangNhap.getText()).equals(mKCu)){
            if(mKMoi.equals(xacNhanMK)){
                sql.capNhatMatKhau(txt_TaiKhoanDangNhap.getText(), mKMoi);
                JOptionPane.showMessageDialog(panelComponent, "ĐỔI MẬT KHẨU THÀNH CÔNG");
                jtxtfield_PassHienTai_GiaoHang.setText("");
                jtxtfield_PassMoi_GiaoHang.setText("");
                jtxtfield_XacNhanPass_GiaoHang.setText("");
                
            }
            else{
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG KHỚP");
            }
        }else
        {
            JOptionPane.showMessageDialog(panelComponent, "MẬT KHẨU CŨ KHÔNG TRÙNG KHỚP");
        }

    }//GEN-LAST:event_jBtCapNhapPass_GiaoHangActionPerformed

    private void jBtBoquaPass_GiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBoquaPass_GiaoHangActionPerformed
        // TODO add your handling code here:
        jtxtfield_PassHienTai_GiaoHang.setText("");
        jtxtfield_PassMoi_GiaoHang.setText("");
        jtxtfield_XacNhanPass_GiaoHang.setText("");
    }//GEN-LAST:event_jBtBoquaPass_GiaoHangActionPerformed

    private void jBtBoquaPass_KhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBoquaPass_KhachActionPerformed
        // TODO add your handling code here:
        jtxtfield_PassHienTai_Khach.setText("");
        jtxtfield_PassMoi_Khach.setText("");
        jtxtfield_XacNhanPass_Khach.setText("");
    }//GEN-LAST:event_jBtBoquaPass_KhachActionPerformed

    private void jBtBoquaPass_BepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBoquaPass_BepActionPerformed
        // TODO add your handling code here:
        jtxtfield_PassHienTai_Bep.setText("");
        jtxtfield_PassMoi_Bep.setText("");
        jtxtfield_XacNhanPass_Bep.setText("");
    }//GEN-LAST:event_jBtBoquaPass_BepActionPerformed

    private void jBtBoquaPass_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBoquaPass_BanHangActionPerformed
        // TODO add your handling code here:
        jtxtfield_PassHienTai_BanHang.setText("");
        jtxtfield_PassMoi_BanHang.setText("");
        jtxtfield_XacNhanPass_BanHang.setText("");
    }//GEN-LAST:event_jBtBoquaPass_BanHangActionPerformed

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_jPanel25MouseClicked

    private void btHuyDKkHachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyDKkHachHangActionPerformed
        // TODO add your handling code here:
        dlKhachHangMoi.setVisible(false);
    }//GEN-LAST:event_btHuyDKkHachHangActionPerformed

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void bt_boqua_thongtinnhanvien_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_boqua_thongtinnhanvien_adActionPerformed
        // TODO add your handling code here:
        dl_ThongTinNhanVien_AD.setVisible(false);
    }//GEN-LAST:event_bt_boqua_thongtinnhanvien_adActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tb_DanhSachNhanVien_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DanhSachNhanVien_ADMouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_tb_DanhSachNhanVien_ADMouseClicked

    private void tb_danhSachNhanVienGiaoHang_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_danhSachNhanVienGiaoHang_ADMouseClicked
        // TODO add your handling code here:
       
        DefaultTableModel model = (DefaultTableModel) tb_TongDonHangXuLyGiaoHang_AD.getModel();
        ArrayList<HoaDon> list = new ArrayList<>();
        list= (ArrayList<HoaDon>) Ketnoi.layHoaDoncuaNhanVienGiaoHangHomNay((String)tb_danhSachNhanVienGiaoHang_AD.getValueAt(tb_danhSachNhanVienGiaoHang_AD.getSelectedRow(), 1));
        model.setRowCount(0);
         txt_manhanvientheodoiGiaoHang_Ad.setText((String)tb_danhSachNhanVienGiaoHang_AD.getValueAt(tb_danhSachNhanVienGiaoHang_AD.getSelectedRow(), 1));
        for (HoaDon hd: list){
            model.addRow(new Object[]{
                model.getRowCount()+1,hd.getMaHoaDon(),hd.getNgayLap(),hd.getTongThanhToan(),hd.getTinhTrangDonHang()
            });
        }
// lay don hang cua nahn vien
    }//GEN-LAST:event_tb_danhSachNhanVienGiaoHang_ADMouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
        // TODO add your handling code here:
//               Fadmin.setVisible(false);
//        this.setVisible(true);
//         txt_TaiKhoanDangNhap.setText("");
//        txt_MatKhauDangNhap.setText("");
    }//GEN-LAST:event_jPanel30MouseClicked

    private void tb_danhSachNhanvVienBanHang_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_danhSachNhanvVienBanHang_ADMouseClicked
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) tb_TongDonHangXuLyBanHang_AD.getModel();
        ArrayList<HoaDon> list = new ArrayList<>();
        list= (ArrayList<HoaDon>) Ketnoi.layHoaDoncuaNhanVienBanHangHomNay((String)tb_danhSachNhanvVienBanHang_AD.getValueAt(tb_danhSachNhanvVienBanHang_AD.getSelectedRow(), 1));
        model.setRowCount(0);
        txt_manhanvientheodoibanhang_Ad.setText((String)tb_danhSachNhanvVienBanHang_AD.getValueAt(tb_danhSachNhanvVienBanHang_AD.getSelectedRow(), 1));
        for (HoaDon hd: list){
            model.addRow(new Object[]{
                model.getRowCount()+1,hd.getMaHoaDon(),hd.getNgayLap(),hd.getTongThanhToan(),hd.getTinhTrangDonHang()
            });
        }
    }//GEN-LAST:event_tb_danhSachNhanvVienBanHang_ADMouseClicked

    private void tb_danhSachNhanVienBep_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_danhSachNhanVienBep_ADMouseClicked
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tb_TongDonHangXuLyBep_AD.getModel();
        ArrayList<HoaDon> list = new ArrayList<>();
        list= (ArrayList<HoaDon>) Ketnoi.layHoaDoncuaNhanVienBepHomNay((String)tb_danhSachNhanVienBep_AD.getValueAt(tb_danhSachNhanVienBep_AD.getSelectedRow(), 1));
        model.setRowCount(0);
        txt_manhanvientheodoiBep_Ad.setText((String)tb_danhSachNhanVienBep_AD.getValueAt(tb_danhSachNhanVienBep_AD.getSelectedRow(), 1));
        for (HoaDon hd: list){
            model.addRow(new Object[]{
                model.getRowCount()+1,hd.getMaHoaDon(),hd.getNgayLap(),hd.getTongThanhToan(),hd.getTinhTrangDonHang()
            });
        }
    }//GEN-LAST:event_tb_danhSachNhanVienBep_ADMouseClicked

    private void txt_manhanvientheodoiBep_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_manhanvientheodoiBep_AdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_manhanvientheodoiBep_AdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_doiVaiTroBep_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doiVaiTroBep_ADActionPerformed
FBep.setSize(1300, 680);
FBep.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_doiVaiTroBep_ADActionPerformed

    private void jtxtfield_PassMoi_Bep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfield_PassMoi_Bep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfield_PassMoi_Bep1ActionPerformed

    private void jBtCapNhapPass_Bep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCapNhapPass_Bep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtCapNhapPass_Bep1ActionPerformed

    private void jBtBoquaPass_Bep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBoquaPass_Bep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtBoquaPass_Bep1ActionPerformed

    private void bt_doivaitrogiaohang_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doivaitrogiaohang_adActionPerformed
        // TODO add your handling code here:
        FGiaoHang.setSize(1300, 680);
        FGiaoHang.setVisible(true);
    }//GEN-LAST:event_bt_doivaitrogiaohang_adActionPerformed

    private void bt_doivaitrobanhang_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doivaitrobanhang_adActionPerformed
        // TODO add your handling code here:
        FBanHang.setSize(1300, 680);
        FBanHang.setVisible(true);
    }//GEN-LAST:event_bt_doivaitrobanhang_adActionPerformed

    private void bt_themQuanTriVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themQuanTriVienActionPerformed
    String ma = cbb_lauchonquantrivien_.getItemAt(cbb_lauchonquantrivien_.getSelectedIndex());
    
        try {
         // TODO add your handling code here:
         ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
         Ketnoi.capnhatquyen(ch.chuanHoa(ma),"admin");
            thongBao("Cập Nhật Thành Công ");
     } catch (SQLException ex) {
         Logger.getLogger(FDangNhap.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_bt_themQuanTriVienActionPerformed

    private void bt_DungQuyenQuanTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DungQuyenQuanTriActionPerformed
        // TODO add your handling code here:
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        Ketnoi.capnhatdunghoatdong(ch.chuanHoa(nguoidung.getMaNguoiDung()),"chan");
        thongBao("Cập Nhật Thành Công ");
    }//GEN-LAST:event_bt_DungQuyenQuanTriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDangNhap().setVisible(true);
            }
        });

    }

    void showDanhSachMonAn() {
docDuLieu();
        DefaultTableModel model = (DefaultTableModel) tb_DanhSachMonAn_Bep.getModel();
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[]{
            "STT", "MÃ MÓN", "TÊN MÓN", "GIÁ"
        });
//
//       
        int i = 1;
        for (MonAn monAn : danhSachMonAn) {
//             System.out.println("loat vo ds ");
//             System.out.println(monAn.getMaMon()+"   1111111");
            model.addRow(new Object[]{
                i++, monAn.getMaMon(), monAn.getTenMon(), monAn.getGiaTien()
            });
////
        }
//         System.err.println("3333333333333333333333333333333");
    }

    void showDanhSachThucDon() {
        DefaultTableModel model = (DefaultTableModel) tb_DanhSachThucDon_menu_Bep.getModel();
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[]{
            "STT", "MÃ THỰC ĐƠN", "NGÀY DÙNG", "BUỔI"
        });

//       
        int i = 1;
        for (ThucDon thucDon : danhSachThucDon) {
//             System.out.println("loat vo ds ");
//             System.out.println(monAn.getMaMon()+"   1111111");
            model.addRow(new Object[]{
                i++, thucDon.getMaThucDon(), thucDon.getNgayDung(), thucDon.getBuoiDung()
            });
//
        }

    }

//     void showDanhSachDonHangCanGiao() {
//        DefaultTableModel model = (DefaultTableModel) tb_TongDanhSachDonHang.getModel();
//        model.setNumRows(0);
//        model.setColumnIdentifiers(new Object[]{
//            "STT", "ĐƠN HÀNG", "ĐỊA CHỈ"
//        });
//        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
//       String maNV = Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
//       maNV=ch.chuanHoa(maNV);
//       ArrayList<HoaDon> listDonHangCanGiao = new ArrayList<>();
//       listDonHangCanGiao=(ArrayList<HoaDon>) Ketnoi.layHoaDoncanGiao(maNV);
//        int i = 1;
//        for (HoaDon hoadon : listDonHangCanGiao) {
////             System.out.println("loat vo ds ");
////             System.out.println(monAn.getMaMon()+"   1111111");
//      ChiTietKhachHang ct= Ketnoi.timChiTietKhachHang(hoadon.getMaHoaDon());
//        
//            model.addRow(new Object[]{
//                i++, hoadon.getMaHoaDon(),ct.getDiaChiNhan()
//            });
////
//        }
//
//    }
    public ArrayList<ThucDon> getDanhSachThucDon() {
        return danhSachThucDon;
    }

    public void setDanhSachThucDon(ArrayList<ThucDon> danhSachThucDon) {
        this.danhSachThucDon = danhSachThucDon;
    }

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public ArrayList<MonAn> getDanhSachMonAn() {
        return danhSachMonAn;
    }

    public void setDanhSachMonAn(ArrayList<MonAn> danhSachMonAn) {
        this.danhSachMonAn = danhSachMonAn;
    }

    public ArrayList<KhachHang> getDanhsachKhachHang() {
        return danhsachKhachHang;
    }

    public void setDanhsachKhachHang(ArrayList<KhachHang> danhsachKhachHang) {
        this.danhsachKhachHang = danhsachKhachHang;
    }

    public ArrayList<HoaDon> getDanhSachHoaDon() {
        return danhSachHoaDon;
    }

    public void setDanhSachHoaDon(ArrayList<HoaDon> danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }

    void docDuLieu() {
        setDanhSachMonAn((ArrayList<MonAn>) Ketnoi.layMonAn());
        setDanhSachNhanVien((ArrayList<NhanVien>) Ketnoi.layNhanVien());
        setDanhsachKhachHang((ArrayList<KhachHang>) Ketnoi.layKhachHang());
        setDanhSachThucDon((ArrayList<ThucDon>) Ketnoi.layThucDon());
        setDanhSachHoaDon((ArrayList<HoaDon>) Ketnoi.layHoaDon());

    }

    void khoiTaoDuLieuCacThanhPhanAD() {

    }

    void khoiTaoDuLieuCacThanhPhanBep() {

        showDanhSachMonAn();
        showDanhSachThucDon();
        for (MonAn monan : danhSachMonAn) {
            cbb_ChonMonMenu_Bep.addItem(monan.getTenMon());
            /// CAP HAT SAU KHI THEM MON
        }
//        khoiTaoDuLieuHoatDongBep();
// cap nhat hoat dong
 
//        kkkk
        // khoi tao thuc don;
    }

    void khoiTaoDuLieuCacThanhPhanGiaoHang() {
      
       
     
    }
 
    void khoiTaoDuLieuCacThanhPhanBanHang() {
        cb_dungTaiCho.setSelected(true);
        long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            txt_Ngayhientai_BanHang.setText(date.toString());
           txt_tongThanhToan_BanHang.setText("");
        pn_menu_BanHang.removeAll();
//        System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBanHang()");
        for (ThucDon thucDon : danhSachThucDon) {
            
//            System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBanHang()" + date + thucDon.getNgayDung());
            if (date.getYear() == thucDon.getNgayDung().getYear()) {

                if (date.getMonth() == thucDon.getNgayDung().getMonth()) {

                    if (date.getDay() == thucDon.getNgayDung().getDay()) {
                        System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBanHang() da khoi tao cac mon trong thuc dpon");
                        ArrayList<pn_ThongTinMonAn> thucDonHienTai = new ArrayList<>();

//        for (MonAn mon : danhSachMonAn) {
//            cbb_Mon_Menu_Bep.addItem(mon.getTenMon());
//            
//        }
                        int slmamn = thucDon.getLitsChitietTD().size();
//        System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBep()" + slmamn);
                        for (int i = 0; i < slmamn; i++) {
                            MonAn ma = new MonAn();
                            for (MonAn mon : danhSachMonAn) {
                                if (mon.getMaMon().equals(thucDon.getLitsChitietTD().get(i).getMaMon())) {
                                    ma = mon;
                                    break;
                                }
                            }

                            pn_ThongTinMonAn pn = new pn_ThongTinMonAn();
                            pn.setThongTinMonAn(ma);
                            thucDonHienTai.add(pn);

                        }
                          pn_menu_BanHang.removeAll();
                        for (int i = 0; i < slmamn; i++) {
                            String maMonTam = thucDonHienTai.get(i).thongTinMonAn.getMaMon();
                            thucDonHienTai.get(i).addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    String maMonDaChon = maMonTam;
//                             
                                    formMouseClicked(evt, maMonDaChon);

                                }
                            });
                            pn_menu_BanHang.add(thucDonHienTai.get(i));
                            thucDonHienTai.get(i).showthongtin();
                            System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanBanHang()da them vao thcu don");
                        }

                        
//                        pn_menu_BanHang.removeAll();
//                        for (int i = 0; i < slmamn; i++) {
//                            pn_menu_BanHang.add(thucDonHienTai.get(i));
//                            thucDonHienTai.get(i).showthongtin();
//
//                        }

                    }
                }
            }
        }

    }

    void khoiTaoDuLieuCacThanhPhanKhachHang() {
int gio =java.time.LocalTime.now().getHour();
ThucDon thucdonbuoihomnay = new ThucDon();
thucdonbuoihomnay= null;
ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
for (ThucDon thucDon : danhSachThucDon) {
            long millis = System.currentTimeMillis();
           
            java.sql.Date date = new java.sql.Date(millis);
            
            txt_ngayHienTai_KhachHang.setText(date.toString());
            if (date.getYear() == thucDon.getNgayDung().getYear()) {

//                System.err.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanKhachHang()2");
                if (date.getMonth() == thucDon.getNgayDung().getMonth()) {
//                    System.err.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanKhachHang()3");
                    if (date.getDay() == thucDon.getNgayDung().getDay()) {
                        System.out.println("giaoDien.FDangNhap.khoiTaoDuLieuCacThanhPhanKhachHang()"+gio+"<>"+thucDon.getBuoiDung()+"/");
                       String buoi = ch.chuanHoa(thucDon.getBuoiDung());
                        if(5<gio&&gio<=10 ){
                            if(buoi.equals("SÁNG"))
                                thucdonbuoihomnay=thucDon;
                        }
                        else if(gio<16)
                        {
                              if(buoi.equals("TRƯA"))
                                thucdonbuoihomnay=thucDon;
                        }
                        else if(16<gio&&gio<20){
                              if(buoi.equals("TỐI"))
                                thucdonbuoihomnay=thucDon;
                        }
                        else{
                            
                        }
   if(thucdonbuoihomnay!=null)
   {
    
                        ArrayList<pn_ThongTinMonAn> thucDonHienTai = new ArrayList<>();


                        int slmamn = thucdonbuoihomnay.getLitsChitietTD().size();

                        for (int i = 0; i < slmamn; i++) {
                            MonAn ma = new MonAn();
                            for (MonAn mon : danhSachMonAn) {
                                if (mon.getMaMon().equals(thucdonbuoihomnay.getLitsChitietTD().get(i).getMaMon())) {
                                    ma = mon;
                                    break;
                                }
                            }

                            pn_ThongTinMonAn pn = new pn_ThongTinMonAn();
                            pn.setThongTinMonAn(ma);
                            thucDonHienTai.add(pn);

                        }

                        pn_ThucDonKhachHang.removeAll();
                        for (int i = 0; i < slmamn; i++) {
                            String maMonTam = thucDonHienTai.get(i).thongTinMonAn.getMaMon();
                            thucDonHienTai.get(i).addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    String maMonDaChon = maMonTam;
//                             
                                    formMouseClicked(evt, maMonDaChon);

                                }
                            });
                            pn_ThucDonKhachHang.add(thucDonHienTai.get(i));
                            thucDonHienTai.get(i).showthongtin();
                        }   
   }

                    }
                }
            }
        }

    }

    private void formMouseClicked(java.awt.event.MouseEvent evt, String maMon) {
        ThucDon thucdon = new ThucDon();
        thucdon= Ketnoi.layThucDonTheoThoiGianThuc();
//        ArrayList<ChiTietThucDon> cttd= (ArrayList<ChiTietThucDon>) thucdon.getLitsChitietTD();
        if (nguoidung.getPhanQuyen().equals("khach")) 
        {
//            System.out.println("giaoDien.FDangNhap.formMouseClicked() khach hang dao voa");
            DefaultTableModel model = (DefaultTableModel) tb_MonDaChon_KhackHang.getModel();
            model.setColumnIdentifiers(new Object[]{
                "STT", "MÓN", "GIÁ", "SỐ LƯỢNG", "MÃ MÓN"
            });
            int gia = 0;
            int ThanhToan = 0;
            for (MonAn monAn : danhSachMonAn) {
                if (monAn.getMaMon().equals(maMon)) {

                    gia = monAn.getGiaTien();
                    for (int i = 0; i < tb_MonDaChon_KhackHang.getRowCount(); i++) {
                        if (monAn.getTenMon() == tb_MonDaChon_KhackHang.getValueAt(i, 1)) {
                            for (ChiTietThucDon ct :thucdon.getLitsChitietTD()){
                                if(ct.getMaMon().equals(maMon)){
                                    if(ct.getSoLuong()<(int) tb_MonDaChon_KhackHang.getValueAt(i, 3)+1)
                                    {
                                        thongBao("Hết hàng" + monAn.getTenMon());
                                        return;
                                    }
                                }
                            }
//                            System.out.println("giaoDien.FDangNhap.formMouseClicked(aaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh)");
                            tb_MonDaChon_KhackHang.setValueAt((1 + (int) tb_MonDaChon_KhackHang.getValueAt(i, 3)), i, 3);
                            
                            ThanhToan = Integer.parseInt(txt_tongThanhToan_KhackHang.getText()) + gia;

                            txt_tongThanhToan_KhackHang.setText(String.valueOf(ThanhToan));
                            return;
                        }
                    }
                       for (ChiTietThucDon ct :thucdon.getLitsChitietTD()){
                                if(ct.getMaMon().equals(maMon)){
                                    if(ct.getSoLuong()<1)
                                    {
                                        thongBao("Hết hàng" + monAn.getTenMon());
                                        return;
                                    }
                                }
                            }
                    model.addRow(new Object[]{
                        tb_MonDaChon_KhackHang.getRowCount() + 1, monAn.getTenMon(), monAn.getGiaTien(), 1, monAn.getMaMon()
                    });
                    break;
                }
            }

            if (txt_tongThanhToan_KhackHang.getText().length() == 0) {
                ThanhToan = gia;
            } else {
                ThanhToan = Integer.parseInt(txt_tongThanhToan_KhackHang.getText()) + gia;
            }

            txt_tongThanhToan_KhackHang.setText(String.valueOf(ThanhToan));
        } else {
            DefaultTableModel model = (DefaultTableModel) tb_MonDaChon_nhanVienBanHang.getModel();
            model.setColumnIdentifiers(new Object[]{
                "STT", "MÓN", "GIÁ", "SỐ LƯỢNG", "MÃ MÓN"
            });
//            System.err.println("giaoDien.FDangNhap.formMouseClicked() ban hang da vao");
            int gia = 0;
            int ThanhToan = 0;
            for (MonAn monAn : danhSachMonAn) {
                if (monAn.getMaMon().equals(maMon)) {

                    gia = monAn.getGiaTien();
                    for (int i = 0; i < tb_MonDaChon_nhanVienBanHang.getRowCount(); i++) {
                        if (monAn.getTenMon() == tb_MonDaChon_nhanVienBanHang.getValueAt(i, 1)) {
                            for (ChiTietThucDon ct :thucdon.getLitsChitietTD()){
                                if(ct.getMaMon().equals(maMon)){
                                    if(ct.getSoLuong()<(int) tb_MonDaChon_nhanVienBanHang.getValueAt(i, 3)+1)
                                    {
                                        thongBao("Hết hàng" + monAn.getTenMon());
                                        return;
                                    }
                                }
                            }
//                            System.out.println("giaoDien.FDangNhap.formMouseClicked(aaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh)");
                        
                        tb_MonDaChon_nhanVienBanHang.setValueAt((1 + (int) tb_MonDaChon_nhanVienBanHang.getValueAt(i, 3)), i, 3);
                            ThanhToan = Integer.parseInt(txt_TongthanhToan_BanHang.getText()) + gia;

                            txt_TongthanhToan_BanHang.setText(String.valueOf(ThanhToan));
                            return;
                        }
                    }
                      for (ChiTietThucDon ct :thucdon.getLitsChitietTD()){
                                if(ct.getMaMon().equals(maMon)){
                                    if(ct.getSoLuong()<1)
                                    {
                                        thongBao("Hết hàng" + monAn.getTenMon());
                                        return;
                                    }
                                }
                            }
                    model.addRow(new Object[]{
                        tb_MonDaChon_nhanVienBanHang.getRowCount() + 1, monAn.getTenMon(), monAn.getGiaTien(), 1, monAn.getMaMon()
                    });
                    break;
                }
            }

            if (txt_TongthanhToan_BanHang.getText().length() == 0) {
                ThanhToan = gia;
            } else {
                ThanhToan = Integer.parseInt(txt_TongthanhToan_BanHang.getText()) + gia;
            }

            txt_TongthanhToan_BanHang.setText(String.valueOf(ThanhToan));
            
        }

    }
    void showBangCacDonHangNhanVienDaChon(){
      java.util.List<HoaDon> list = new ArrayList<>();
       String MaNhanVien = Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
       MaNhanVien= XuLyChuanHoa.xoakhoangtrong(MaNhanVien);
       list = Ketnoi.layHoaDoncuaNhanVienDaChon(MaNhanVien);
        System.out.println("giaoDien.FDangNhap.showBangCacDonHangNhanVienDaChon()"+list.size());
       DefaultTableModel model = (DefaultTableModel) tb_GiaoHang.getModel();
       model.setNumRows(0);
       model.setColumnIdentifiers(new Object[]{
           "STT","ĐƠN HÀNG","KHÁCH HÀNG","SĐT","ĐƠN GIÁ","THỜI GIAN"," ĐỊA CHỈ","TÌNH TRẠNG","GHI CHÚ"
       });
           int i=1;
            for (HoaDon hd: list) {
            ChiTietKhachHang ctdonhang = Ketnoi.timChiTietKhachHang(hd.getMaHoaDon());

            model.addRow(new Object[]{
               
                i++,hd.getMaHoaDon(), ctdonhang.getTenNguoiNhan(),ctdonhang.getSDTNhan(),hd.getTongThanhToan(),hd.getNgayLap().toString(),ctdonhang.getDiaChiNhan(),ctdonhang.getGhiChu()
            });
 }
    }
    void khoiTaoDuLieuHoatDongBep()
    {
        ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
        ArrayList <HoaDon> listhoadonchuahoanthanh = new ArrayList<>();
        String maNhanVien = Ketnoi.timMaNhanVienTheoGmail(nguoidung.getMaNguoiDung());
 listhoadonchuahoanthanh= (ArrayList<HoaDon>) Ketnoi.layHoaDoncanhoanthanh(ch.chuanHoa(maNhanVien));
 DefaultTableModel model = (DefaultTableModel) tb_danhSachDonHang_Bep.getModel();
 model.setNumRows(0);
  model.setColumnIdentifiers(new Object[]{
            "STT", "ĐƠN HÀNG", "THỜI GIAN", "LƯU Ý"
        });
//
//       
        int i = 1;
        for (HoaDon hd: listhoadonchuahoanthanh) {
//             System.out.println("loat vo ds ");
//             System.out.println(monAn.getMaMon()+"   1111111");
//           String time
//           hd.getNgayLap().getTime();
System.out.println("ngay voi gio "+hd.getNgayLap().toString() );
            model.addRow(new Object[]{
               
                i++,hd.getMaHoaDon(), hd.getNgayLap().toString() ," "
            });
////
        }

DefaultTableModel md = (DefaultTableModel) tb_ChitietDonHang_Bep.getModel();
md.setNumRows(0);
       int j=1;
       if(listhoadonchuahoanthanh.size()>0)
       {
        for (ChiTietHoaDon cthoaDon : listhoadonchuahoanthanh.get(0).getLitsChitietHD()) {
            MonAn mon= new MonAn();
            for (MonAn mona: danhSachMonAn) {
                if(mona.getMaMon().equals(cthoaDon.getMaMon()))
                {
                    mon=mona;
                    break;
                }
            }
            md.addRow(new Object[]{
             j++,mon.getTenMon(),cthoaDon.getSoLuong(),""
            });
        }
        txt_MaDonHang_Bep.setText(listhoadonchuahoanthanh.get(0).getMaHoaDon());
        txt_trangThaiDungdonhang_bep.setText(listhoadonchuahoanthanh.get(0).getTrangThaiDung());
//        txt_ghichuchodonhang_bep.setText(listhoadonchuahoanthanh.get(0).);
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FBanHang;
    private javax.swing.JFrame FBep;
    private javax.swing.JFrame FGiaoHang;
    private javax.swing.JFrame FKhachHang;
    private javax.swing.JFrame Fadmin;
    private javax.swing.JPanel TinhTrangGiaoKhachHang;
    private javax.swing.JButton btDKKhachHang;
    private javax.swing.JButton btDangKiTaiKhoan;
    private javax.swing.JButton btDangNhap;
    private javax.swing.JButton btHuyDKkHachHang;
    private javax.swing.JRadioButton btNam_NhanVien_ad;
    private javax.swing.JButton btTroLaiTrangChu;
    private javax.swing.JButton bt_BanHan_BanHang;
    private javax.swing.JButton bt_ChiTietDonHang_giaoHang;
    private javax.swing.JButton bt_ChiTietNhanVien_Ad;
    private javax.swing.JButton bt_DatHang_KhachHang;
    private javax.swing.JButton bt_DungQuyenQuanTri;
    private javax.swing.JButton bt_HoanThanhDonHang_Bep;
    private javax.swing.JButton bt_HuyMonDaChon_KhachHang;
    private javax.swing.JButton bt_HuyMon_BanHang;
    private javax.swing.JButton bt_Lich_Bep;
    private javax.swing.JButton bt_LuuThucDonChinhSuaChiTiet;
    private javax.swing.JButton bt_SuaMon_MonAn_Bep;
    private javax.swing.JButton bt_TaoThucDonMoi;
    private javax.swing.JButton bt_ThemMon_MonAn_Bep;
    private javax.swing.JButton bt_XoaMon_MonAn_Bep;
    private javax.swing.JButton bt_boqua_thongtinnhanvien_ad;
    private javax.swing.JButton bt_boquataothucdonMoi;
    private javax.swing.JButton bt_boquataothucdonMoiChiTiet;
    private javax.swing.JRadioButton bt_chan_nhanvien_ad;
    private javax.swing.JButton bt_doiVaiTroBep_AD;
    private javax.swing.JButton bt_doivaitrobanhang_ad;
    private javax.swing.JButton bt_doivaitrogiaohang_ad;
    private javax.swing.JRadioButton bt_hoatdong_nhanvien_ad;
    private javax.swing.JButton bt_luunhanvien_ad;
    private javax.swing.JButton bt_ngaySinhNhanVien_thongTinNhanVien_AD;
    private javax.swing.JRadioButton bt_nu_nhanvine_ad;
    private javax.swing.JButton bt_taothucdonmoi_bep;
    private javax.swing.JButton bt_themMonMoi_Bep;
    private javax.swing.JButton bt_themMonVaoThucDonChiTiet_Bep;
    private javax.swing.JButton bt_themMonVaoThucDon_Bep;
    private javax.swing.JButton bt_themQuanTriVien;
    private javax.swing.JButton bt_themnhanVien_AD;
    private javax.swing.JButton bt_tkDTTheoNam_DoanhThu_Admin;
    private javax.swing.JButton bt_tkDTTheoNgay_DoanhThu_Admin;
    private javax.swing.JButton bt_tkDTTheoThang_DoanhThu_Admin;
    private javax.swing.JButton bt_xacNhanThanhToan_GiaoHang;
    private javax.swing.JButton bt_xoaMonKhoiThucDonChiTiet_Bep;
    private javax.swing.JButton bt_xoaMonKhoiThucDon_Bep;
    private javax.swing.JButton bt_xoaNhanVien_Ad;
    private javax.swing.JButton bt_xuatFileDoanhThuNgay_Admin;
    private javax.swing.JCheckBox cb_MangVe;
    private javax.swing.JCheckBox cb_dungTaiCho;
    private javax.swing.JComboBox<String> cbb_ChonMonMenuChiTiet_Bep;
    private javax.swing.JComboBox<String> cbb_ChonMonMenu_Bep;
    private javax.swing.JComboBox<String> cbb_buoidungChiTiet_bep;
    private javax.swing.JComboBox<String> cbb_buoidung_bep;
    private javax.swing.JComboBox<String> cbb_lauchonquantrivien_;
    private javax.swing.JComboBox<String> cbb_phanquyen_NhanVien_Ad;
    private com.toedter.calendar.JCalendar cld_ChonNgayThucDon;
    private com.toedter.calendar.JCalendar cld_lich_thongTinNhanVien_Ad;
    private javax.swing.JDialog dlKhachHangMoi;
    private javax.swing.JDialog dl_ChiTietDonHang_GiaoHang;
    private javax.swing.JDialog dl_ThongTinNhanVien_AD;
    private javax.swing.JDialog dl_ThucDonMoi;
    private javax.swing.JDialog dl_chiTietThucDon_Bep;
    private javax.swing.JDialog dl_themMon_bep;
    private javax.swing.JDialog dl_xacminhquyenquantriad;
    private javax.swing.ButtonGroup grbt_NamNu_nhanvien_ad;
    private javax.swing.ButtonGroup grbt_tinhtranghoatdong_nhanvien_ad;
    private javax.swing.JLabel hotenAdmin;
    private javax.swing.JButton jBtBoquaPass_BanHang;
    private javax.swing.JButton jBtBoquaPass_Bep;
    private javax.swing.JButton jBtBoquaPass_Bep1;
    private javax.swing.JButton jBtBoquaPass_GiaoHang;
    private javax.swing.JButton jBtBoquaPass_Khach;
    private javax.swing.JButton jBtCapNhapPass_BanHang;
    private javax.swing.JButton jBtCapNhapPass_Bep;
    private javax.swing.JButton jBtCapNhapPass_Bep1;
    private javax.swing.JButton jBtCapNhapPass_GiaoHang;
    private javax.swing.JButton jBtCapNhapPass_Khach;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPThongtinNhanVien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPasswordField jtxtfield_PassHienTai_BanHang;
    private javax.swing.JPasswordField jtxtfield_PassHienTai_Bep;
    private javax.swing.JPasswordField jtxtfield_PassHienTai_Bep1;
    private javax.swing.JPasswordField jtxtfield_PassHienTai_GiaoHang;
    private javax.swing.JPasswordField jtxtfield_PassHienTai_Khach;
    private javax.swing.JPasswordField jtxtfield_PassMoi_BanHang;
    private javax.swing.JPasswordField jtxtfield_PassMoi_Bep;
    private javax.swing.JPasswordField jtxtfield_PassMoi_Bep1;
    private javax.swing.JPasswordField jtxtfield_PassMoi_GiaoHang;
    private javax.swing.JPasswordField jtxtfield_PassMoi_Khach;
    private javax.swing.JPasswordField jtxtfield_XacNhanPass_BanHang;
    private javax.swing.JPasswordField jtxtfield_XacNhanPass_Bep;
    private javax.swing.JPasswordField jtxtfield_XacNhanPass_Bep1;
    private javax.swing.JPasswordField jtxtfield_XacNhanPass_GiaoHang;
    private javax.swing.JPasswordField jtxtfield_XacNhanPass_Khach;
    private javax.swing.JLabel lb_img_MonAn_Bep;
    private javax.swing.JLabel lb_img_MonAn_Bep1;
    private javax.swing.JPanel menu_Bep;
    private javax.swing.JPanel panelComponent;
    private javax.swing.JPanel pn_Exit_Bep;
    private javax.swing.JPanel pn_HeThong_Bep;
    private javax.swing.JPanel pn_HoatDong_Bep;
    private javax.swing.JPanel pn_Menu_Bep;
    private javax.swing.JPanel pn_MonAn_Bep;
    private javax.swing.JPanel pn_ThucDonKhachHang;
    private javax.swing.JPanel pn_bieuDoThuNhapNgay;
    private javax.swing.JPanel pn_menu_BanHang;
    private javax.swing.JTable tb_BangMonAnTrongThucDon;
    private javax.swing.JTable tb_BangMonAnTrongThucDonChiTiet;
    private javax.swing.JTable tb_ChitietDonHang_Bep;
    private javax.swing.JTable tb_ChitietDonHang_ChitietDonHang_GiaoHang;
    private javax.swing.JTable tb_DanhSachMonAn_Bep;
    private javax.swing.JTable tb_DanhSachNhanVien_AD;
    private javax.swing.JTable tb_DanhSachThucDon_menu_Bep;
    private javax.swing.JTable tb_DoanhThu_Admin;
    private javax.swing.JTable tb_GiaoHang;
    private javax.swing.JTable tb_MonDaChon_KhackHang;
    private javax.swing.JTable tb_MonDaChon_nhanVienBanHang;
    private javax.swing.JTable tb_TongDonHangXuLyBanHang_AD;
    private javax.swing.JTable tb_TongDonHangXuLyBep_AD;
    private javax.swing.JTable tb_TongDonHangXuLyGiaoHang_AD;
    private javax.swing.JTable tb_danhSachDonHang_AD;
    private javax.swing.JTable tb_danhSachDonHang_Bep;
    private javax.swing.JTable tb_danhSachNhanVienBep_AD;
    private javax.swing.JTable tb_danhSachNhanVienGiaoHang_AD;
    private javax.swing.JTable tb_danhSachNhanvVienBanHang_AD;
    private javax.swing.JTable tb_dskhachhang_AD;
    private javax.swing.JTextField textDiaChiDK;
    private javax.swing.JTextField textEmailDK;
    private javax.swing.JTextField textGioiTinh;
    private javax.swing.JTextField textSDTDK;
    private javax.swing.JTextField textTenDK;
    private javax.swing.JPasswordField textconfMatKhau;
    private javax.swing.JPasswordField textmatkhauDK;
    private javax.swing.JLabel txtCanhBao;
    private javax.swing.JTextField txt_DiaChikhachNhanHang_khackHang;
    private javax.swing.JTextField txt_DonHang_giaohnag;
    private javax.swing.JTextField txt_EmailNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextField txt_Gia_MonAn_Bep;
    private javax.swing.JTextField txt_Gia_MonAn_Bep1;
    private javax.swing.JTextField txt_MaDonHang_Bep;
    private javax.swing.JTextField txt_MaMon_MonAn_Bep;
    private javax.swing.JTextField txt_MaMon_MonAn_Bep1;
    private javax.swing.JTextField txt_MaNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextField txt_MaThucDonMoiChiTiet_Bep;
    private javax.swing.JTextField txt_MaThucDonMoi_Bep;
    private javax.swing.JPasswordField txt_MatKhauDangNhap;
    private javax.swing.JTextField txt_MonDaChon_BanHang;
    private javax.swing.JTextField txt_NamSinhNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextField txt_NgayApDungThucDonChiTiet_bep;
    private javax.swing.JTextField txt_NgayApDungThucDon_bep;
    private javax.swing.JTextField txt_Ngayhientai_BanHang;
    private javax.swing.JTextField txt_SDTNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextField txt_SDTkhachNhanHang_khackHang;
    private javax.swing.JTextField txt_SoLuongMoiMonChiTiet_ThucDOn_Bep;
    private javax.swing.JTextField txt_SoLuongMoiMon_ThucDOn_Bep;
    private javax.swing.JTextField txt_TaiKhoanDangNhap;
    private javax.swing.JTextField txt_TenMon_MonAn_Bep;
    private javax.swing.JTextField txt_TenMon_MonAn_Bep1;
    private javax.swing.JTextField txt_TenNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextField txt_TongthanhToan_BanHang;
    private javax.swing.JTextField txt_cmnnNhanVien_ThongTinNhanVien_Ad;
    private javax.swing.JTextArea txt_ghichuchodonhang_bep;
    private javax.swing.JTextField txt_khachNhanHang_khackHang;
    private javax.swing.JTextField txt_mahoadonTimKiem_giaoHang;
    private javax.swing.JTextField txt_manhanvientheodoiBep_Ad;
    private javax.swing.JTextField txt_manhanvientheodoiGiaoHang_Ad;
    private javax.swing.JTextField txt_manhanvientheodoibanhang_Ad;
    private javax.swing.JTextField txt_monchon_khachHang_khackHang;
    private javax.swing.JLabel txt_ngayHienTai_KhachHang;
    private javax.swing.JTextField txt_nguoidat_chitietdonhang_giaoHang;
    private javax.swing.JTextArea txt_thongTinDonHang_GiaoHang;
    private javax.swing.JTextArea txt_thongTinDonHang_chitietdonhang_giaoHang;
    private javax.swing.JLabel txt_tongThanhToan_BanHang;
    private javax.swing.JLabel txt_tongThanhToan_KhackHang;
    private javax.swing.JTextField txt_tongdodonhangtrongngay_ad;
    private javax.swing.JTextField txt_trangThaiDungdonhang_bep;
    // End of variables declaration//GEN-END:variables

    private void showDanhSachNhanVien() {
     ArrayList<NhanVien> list = new ArrayList<>();
     list= (ArrayList<NhanVien>) Ketnoi.layNhanVien();
    DefaultTableModel model = (DefaultTableModel) tb_DanhSachNhanVien_AD.getModel();
    model.setNumRows(0);
    int i=1;
       for (NhanVien nv: list){
           model.addRow(new Object[]{
               i++,nv.getMaNhanVien(),nv.getTenNhanVien(),nv.getSDT(),nv.getPhanQuyen(),nv.getEmail()
           });
       }
    }

    private void showdoanhthu() {
       
        ArrayList<Date> listday = new ArrayList<>();
        DefaultTableModel model =(DefaultTableModel) tb_DoanhThu_Admin.getModel();
        String tinhtrang="Tăng";//"Giảm,"
        model.setRowCount(0);
        for (HoaDon hd: danhSachHoaDon){ 
            boolean kt =false;
            for (Date dt :listday){
                if(dt.getDate()==hd.getNgayLap().getDate()&&dt.getMonth()==hd.getNgayLap().getMonth()&&dt.getYear()==hd.getNgayLap().getYear())
                    kt = true;
            }
           if(kt == false){
               listday.add(new Date(hd.getNgayLap().getTime()));
               String ngay="";
               ngay= String.valueOf(hd.getNgayLap().getDate())+"/"+String.valueOf(hd.getNgayLap().getMonth()+1)+"/"+String.valueOf(hd.getNgayLap().getYear()+1900);
             int tongthu=Ketnoi.doanhThuNgay(new Date(hd.getNgayLap().getTime()));
             int luongton=Ketnoi.LuongTonNgay(new Date(hd.getNgayLap().getTime()));
             int tongxuat=tongthu+luongton;
             if(tongthu-luongton>0){
                  tinhtrang="+";
             }
             else{
                
                      tinhtrang="-";
                
             }

             
              model.addRow(new Object[]{
                   model.getRowCount()+1,ngay,tongthu+luongton,tongthu,luongton,tongthu-luongton,tinhtrang
               });
           } 
           
        }
    }

    private void showDoanhThuTheoThang() {
       ArrayList<Date> listday = new ArrayList<>();
        DefaultTableModel model =(DefaultTableModel) tb_DoanhThu_Admin.getModel();
        model.setRowCount(0);
        String tinhtrang="Tăng";//"Giảm,"
        
        for (HoaDon hd: danhSachHoaDon){ 
            boolean kt =false;
            for (Date dt :listday){
                if(dt.getMonth()==hd.getNgayLap().getMonth()&&dt.getYear()==hd.getNgayLap().getYear())
                    kt = true;
            }
           if(kt == false){
               listday.add(new Date(hd.getNgayLap().getTime()));
               String ngay="";
               ngay= String.valueOf(hd.getNgayLap().getMonth())+"/"+String.valueOf(hd.getNgayLap().getYear()+1900);
             int tongthu=Ketnoi.doanhThuThang(new Date(hd.getNgayLap().getTime()).getMonth(),new Date(hd.getNgayLap().getTime()).getYear());
             int luongton=Ketnoi.LuongTonThang(new Date(hd.getNgayLap().getTime()).getMonth(),new Date(hd.getNgayLap().getTime()).getYear());
             int tongxuat=tongthu+luongton;
             if(tongthu-luongton>0){
                  tinhtrang="+";
             }
             else{
                
                      tinhtrang="-";
                
             }

             
              model.addRow(new Object[]{
                   model.getRowCount()+1,ngay,tongthu+luongton,tongthu,luongton,tongthu-luongton,tinhtrang
               });
           } 
           
        }   
    }
     private void showDoanhThuTheoNam() {
       ArrayList<Date> listday = new ArrayList<>();
        DefaultTableModel model =(DefaultTableModel) tb_DoanhThu_Admin.getModel();
        model.setRowCount(0);
        String tinhtrang="Tăng";//"Giảm,"
        
        for (HoaDon hd: danhSachHoaDon){ 
            boolean kt =false;
            for (Date dt :listday){
                if(/*dt.getDate()==hd.getNgayLap().getDate()&&dt.getMonth()==hd.getNgayLap().getMonth()&&*/dt.getYear()==hd.getNgayLap().getYear())
                    kt = true;
            }
           if(kt == false){
               listday.add(new Date(hd.getNgayLap().getTime()));
               String ngay="";
               ngay=String.valueOf(hd.getNgayLap().getYear()+1900);
             int tongthu=Ketnoi.doanhThuNam(new Date(hd.getNgayLap().getTime()).getYear());
             int luongton=Ketnoi.LuongTonNam(new Date(hd.getNgayLap().getTime()).getYear());
             int tongxuat=tongthu+luongton;
             if(tongthu-luongton>0){
                  tinhtrang="+";
             }
             else{
                
                      tinhtrang="-";
                
             }

             
              model.addRow(new Object[]{
                   model.getRowCount()+1,ngay,tongthu+luongton,tongthu,luongton,tongthu-luongton,tinhtrang
               });
           } 
           
        }   
    }
public void setDataToChart2(JPanel jpnItem) {
//        List<LopHocBean> listItem = thongKeService.getListByLopHoc();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
//        if (listItem != null) {
//            for (LopHocBean item : listItem) {
    ArrayList<Date> listday = new ArrayList<>();
        DefaultTableModel model =(DefaultTableModel) tb_DoanhThu_Admin.getModel();
        String tinhtrang="Tăng";//"Giảm,"
        model.setRowCount(0);
        for (HoaDon hd: danhSachHoaDon){ 
            boolean kt =false;
            for (Date dt :listday){
                if(dt.getDate()==hd.getNgayLap().getDate()&&dt.getMonth()==hd.getNgayLap().getMonth()&&dt.getYear()==hd.getNgayLap().getYear())
                    kt = true;
            }
           if(kt == false){
               listday.add(new Date(hd.getNgayLap().getTime()));
               String ngay="";
               ngay= String.valueOf(hd.getNgayLap().getDate())+"/"+String.valueOf(1+hd.getNgayLap().getMonth())+"/"+String.valueOf(hd.getNgayLap().getYear()+1900);
             int tongthu=Ketnoi.doanhThuNgay(new Date(hd.getNgayLap().getTime()));
             int luongton=Ketnoi.LuongTonNgay(new Date(hd.getNgayLap().getTime()));
             int tongxuat=tongthu+luongton;
             if(tongthu-luongton>0){
                  tinhtrang="+";
             }
             else{
                
                      tinhtrang="-";
                
             }
                dataset.addValue(tongthu, ngay, ngay);

             
//              model.addRow(new Object[]{
//                   model.getRowCount()+1,ngay,tongthu+luongton,tongthu,luongton,tongthu-luongton,tinhtrang
//               });
           } 
           
        }
//                dataset.addValue(item.getSo_luong_hoc_vien(), "Học viên", item.getNgay_dang_ky());
//            }
//        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê doanh thu theo ngày".toUpperCase(),
                "Thời gian", "VND",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), jpnItem.getHeight()));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
void tb_TheoDoiDanhSachNhanVienBep(){
    
    ArrayList<NhanVien> list = new ArrayList<>();
    list=(ArrayList<NhanVien>) Ketnoi.layNhanVienTheophanQuyenDangLamViec("bep");
    System.out.println("giaoDien.FDangNhap.tb_TheoDoiDanhSachNhanVienBep() sixw "+ list.size());
    if(list==null)
        System.out.println("giaoDien.FDangNhap.tb_TheoDoiDanhSachNhanVienBep() NULL R");
    else
    {
        for(NhanVien nv:list)
            System.out.println("giaoDien.FDangNhap.tb_TheoDoiDanhSachNhanVienBep()"+nv.getTenNhanVien());
    }
        
        
}
void tb_TheoDoiDanhSachDonHangNhanVienBep(String MaNhanVien){
    
    
}
void tb_TheoDoiDanhSachNhanVienGiaoHang(){
    
    
}
void tb_TheoDoiDanhSachDonHangNhanVienGiaoHang(String MaNhanVien){
    
    
}
void tb_TheoDoiDanhSachNhanVienBanHang(){
    
    
}
void tb_TheoDoiDanhSachDonHangNhanBanHang(String MaNhanVien){
    
    
}
void tb_TheoDoiDanhSachDonHang(){
    
    
}
 void capNhatTinhTrangLamViecCacNhanVien(){
     ChuanHoaDuLieu ch = new ChuanHoaDuLieu();
  DefaultTableModel mode1=(DefaultTableModel) tb_danhSachDonHang_AD.getModel();
  mode1.setRowCount(0);
  DefaultTableModel mode2=(DefaultTableModel)tb_danhSachNhanVienBep_AD.getModel();
  mode2.setRowCount(0);
  DefaultTableModel mode3=(DefaultTableModel)tb_danhSachNhanvVienBanHang_AD.getModel();
  mode3.setRowCount(0);
        DefaultTableModel mode4 = (DefaultTableModel) tb_danhSachNhanVienGiaoHang_AD.getModel();
        mode4.setRowCount(0);
//ColorRenderer clRenderer = new ColorRenderer();
//   danhSachHoaDon
ArrayList<HoaDon> listhoadonhomnay = new ArrayList<>();
listhoadonhomnay=(ArrayList<HoaDon>) Ketnoi.layHoaDonhonay();
txt_tongdodonhangtrongngay_ad.setText(String.valueOf(listhoadonhomnay.size()));
for (HoaDon hd: listhoadonhomnay){
    mode1.addRow(new Object[]{
      mode1.getRowCount()+1,hd.getMaHoaDon(),hd.getMaNhanVienBep(), hd.getMaNhanVienGiaoHang(),hd.getMaNhanVien(),hd.getNgayLap(),hd.getTongThanhToan()
    });
}
        for (NhanVien nv : danhSachNhanVien) {
            if (ch.chuanHoa(nv.getPhanQuyen()).equals("bep")) {
             if(ch.chuanHoa(nv.getTinhTrangHoatDong()).equals("hd")){
                 
                 if(nv.getLamviec()==1){
                     int sl=Ketnoi.layHoaDoncuaNhanVienBepHomNay(nv.getMaNhanVien()).size();
                 int tongsl=Ketnoi.laytonghoadonngayhomnay();
                 String sanluong = " "+String.valueOf(sl)+" / "+String.valueOf(tongsl);
                     mode2.insertRow(0, new Object[]{
                         mode2.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),sanluong
                             
                     });
                 }
                 else{
                     
                      mode2.insertRow(0, new Object[]{
                           mode3.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),"Nghỉ"
                     });

                 }
             }
            }
            if (ch.chuanHoa(nv.getPhanQuyen()).equals("banhang")) {
if(ch.chuanHoa(nv.getTinhTrangHoatDong()).equals("hd")){
                 if(nv.getLamviec()==1){
                 int sl=Ketnoi.layHoaDoncuaNhanVienBanHangHomNay(nv.getMaNhanVien()).size();
                 int tongsl=Ketnoi.laytonghoadonngayhomnay();
                 String sanluong = " "+String.valueOf(sl)+" / "+String.valueOf(tongsl);
                     mode3.insertRow(0, new Object[]{
                         mode3.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),sanluong
                             
                     });
                 }
                 else{
                     
                      mode3.insertRow(0, new Object[]{
                         mode3.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),"Nghỉ"
                     });

                 }
             }
            }
            if (ch.chuanHoa(nv.getPhanQuyen()).equals("giaohang")) {
if(ch.chuanHoa(nv.getTinhTrangHoatDong()).equals("hd")){
                 if(nv.getLamviec()==1){
                     int sl=Ketnoi.layHoaDoncuaNhanVienGiaoHangHomNay(nv.getMaNhanVien()).size();
                 int tongsl=Ketnoi.laytonghoadonngayhomnay();
                 String sanluong = " "+String.valueOf(sl)+" / "+String.valueOf(tongsl);
                     mode4.insertRow(0, new Object[]{
                         mode4.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),sanluong
                     });
                 }
                 else{
                     
                      mode4.insertRow(0, new Object[]{
                         mode4.getRowCount(),nv.getMaNhanVien(),nv.getTenNhanVien(),"Nghỉ"
                     });

                 }
             }
            }
        }

    }
 void showDanhSachKhachHang(){
     DefaultTableModel model = (DefaultTableModel) tb_dskhachhang_AD.getModel();
     model.setNumRows(0);
     ArrayList<KhachHang> list = new ArrayList<>();
     list =(ArrayList<KhachHang>) Ketnoi.layKhachHang();
     for (KhachHang kh :list){
         model.addRow(new Object[]{
             model.getRowCount()+1,kh.getTenKhachHang(),kh.getSDT(),kh.getDiaChi(),kh.getEmail()
         });
     }
 }
 void khoitaoQuyenAD(){
     cbb_lauchonquantrivien_.removeAllItems();
     for (NhanVien nv: danhSachNhanVien){
         cbb_lauchonquantrivien_.addItem(nv.getMaNhanVien()+" : "+nv.getTenNhanVien());
     }
     khoiTaoDuLieuCacThanhPhanBanHang();
     khoiTaoDuLieuCacThanhPhanBep();
     khoiTaoDuLieuCacThanhPhanGiaoHang();
 }
}

 class ColorRenderer extends DefaultTableCellRenderer {
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setForeground(new Color(153, 0, 0));
        super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
        return this;
    }
}