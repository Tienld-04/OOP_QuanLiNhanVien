package QLNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class RuncodeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsNhanVien ds = new dsNhanVien();
        int lc = 0;
        do {
        System.out.println("-----------MENU------------\n"
                +"1. Thêm nhân viên vào ds.\n"
                +"2. In ds nhân viên ra màn hình. \n"
                +"3. Sửa thông tin nhân viên theo mã. \n"
                +"4. Xóa một nhân viên theo mã nhân viên. \n"
                +"5. Sắp xếp nhân viên giảm dần theo lương. \n"
                +"6. Tìm kiếm nhân viên theo khoảng lương. \n"
                +"7. Tính và in ra lương trung bình của một phòng ban. \n"
                +"8. Hiển thị các thông tin nhân viên có lương có lương cao nhất trong một phòng ban. \n"
                +"0. Thoát. \n");
        System.out.println("Mời nhập lựa chọn của bạn: ");
        lc = sc.nextInt();
        if(lc == 1){
            System.out.println("Nhập vào thông tin các nhân viên: ");
            NhanVien nv = new NhanVien();
            sc.nextLine();
            nv.NhapDuLieu();
            ds.ThemNhanVien(nv);
        }
        if(lc == 2){
            System.out.println("Thông tin các nhân viên: ");
            ds.inThongTinNhanVien();
        }
        if(lc == 3){
            System.out.println("Nhập vào mã nhân viên cần sửa: ");
            int maNhanVien = sc.nextInt();
            ds.suaNhanVien(maNhanVien, sc);
        }
        if(lc == 4){
            System.out.println("Nhập vào mã nhân viên cần xóa: ");
            int maNhanVien = sc.nextInt();
            ds.xoaNhanVien(maNhanVien);
        }
        if(lc == 5){
            System.out.println("Thông tin các nhân viên sau khi sắp xếp giảm dần theo lương: ");
            ds.sapXepNhanVien();
            ds.inThongTinNhanVien();
        }
        if(lc == 6){
            System.out.println("Nhập vào khoảng lương: ");
            System.out.println("Lương x = ");
            Double x = sc.nextDouble();
            System.out.println("Lương y = ");
            Double y = sc.nextDouble();
            ds.timKiemNhanVien(x,y);
        }
        if(lc == 7){
            sc.nextLine();
            System.out.println("Nhập vào tên phòng ban cần tính trung bình: ");
            String tenPhongBan = sc.nextLine();
            ArrayList<NhanVien> nhanVienPhongBan = new ArrayList<>();
            ds.luongTrungBinh(tenPhongBan, nhanVienPhongBan);
            Double tongLuong = 0.0;
            int i = 0;
            for(NhanVien nv : nhanVienPhongBan){
                i++;
                tongLuong += nv.getLuong();
            }
            System.out.println("Lương trung bình của phòng ban: "+tenPhongBan+" là: "+tongLuong/i);
        }
        if(lc == 8){
            sc.nextLine();
            System.out.println("Nhập vào tên phòng ban để tìm nhân viên: ");
            String tenPhongBan = sc.nextLine();
            ArrayList<NhanVien> dsluongMax = new ArrayList<>();
            ds.nhanVienLuongMax(tenPhongBan, dsluongMax);
            for(NhanVien nv : dsluongMax){
                System.out.println(nv);
            }
        }
        }while (lc != 0);

        sc.close();
    }

}