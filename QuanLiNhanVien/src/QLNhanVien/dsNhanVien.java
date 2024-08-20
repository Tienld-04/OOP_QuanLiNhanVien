package QLNhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class dsNhanVien {
    private ArrayList<NhanVien> ds;

    public dsNhanVien(){
        ds = new ArrayList<>();
    }
    public ArrayList<NhanVien> getDs() {
        return ds;
    }
    public void setDs(ArrayList<NhanVien> ds) {
        this.ds = ds;
    }
    //1. Thêm Nhân viên
    public void ThemNhanVien(NhanVien nv){
        this.ds.add(nv);
    }
    //2. in ra danh sách nhân viên
    public void inThongTinNhanVien(){
        int i = 1;
        for(NhanVien nv : ds) {
            System.out.println("Thông tin Nhân viên thứ "+i);
            nv.XuatDuLieu();
            //System.out.println(nv);
            i++;
        }
    }
    //3. sửa tt nhân viên theo mã
    public void suaNhanVien(int maNhanVien, Scanner sc){
        for(NhanVien nv : ds){
            if(nv.getMaNhanVien() == maNhanVien){
                System.out.print("Nhap thong tin moi cho nhan vien: ");
                nv.NhapDuLieu();
                return;
            }
        }
    }
    //4. xóa một nhân viên theo mã
    public void xoaNhanVien(int maNhanVien) {
        boolean removed = ds.removeIf(nv->nv.getMaNhanVien() == maNhanVien);
        if (removed) {
            System.out.println("Đã xóa nhân viên có mã: " + maNhanVien);
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
        }
    }

    //5. sắp xếp nhân viên giảm dần theo lương
    public void sapXepNhanVien(){
        Collections.sort(this.ds, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien n1, NhanVien n2) {
                return Double.compare(n2.getLuong(), n1.getLuong());
            }
        });
    }
    //6. tìm kiếm nhân viên theo khoảng lương
    public void timKiemNhanVien(Double luong1, Double luong2){
        for(NhanVien nv : ds){
            if(nv.getLuong() >= luong1 && nv.getLuong() <= luong2){
                System.out.println(nv);
            }
        }
    }
    //7. Tính và in ra lương trung bình của một phòng ban.
    public void luongTrungBinh(String tenPhongBan, ArrayList<NhanVien> nhanVienPhongBan){
        for(NhanVien nv : ds){
            if(nv.getPhongBan().equals(tenPhongBan)){
                nhanVienPhongBan.add(nv);
            }
        }

    }

    //8. hiển thị các nhân viên có lương cao nhất trong một phòng ban
    public void nhanVienLuongMax(String tenPhongBan, ArrayList<NhanVien> nvLuongMax) {
        Double luongMax = null;
        for (NhanVien nv : ds) {
            if (nv.getPhongBan().equals(tenPhongBan)) {
                if (luongMax == null || nv.getLuong() > luongMax) {
                    luongMax = nv.getLuong();
                    nvLuongMax.clear();
                    nvLuongMax.add(nv);
                } else if (nv.getLuong() == luongMax) {
                    nvLuongMax.add(nv);
                }
            }
        }
    }


}
