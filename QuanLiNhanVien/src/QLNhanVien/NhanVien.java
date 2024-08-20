package QLNhanVien;

import java.util.Objects;
import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private int MaNhanVien;
    private String TenNhanVien;
    private int TuoiNhanVien;
    private double Luong;
    private String PhongBan;

    public NhanVien(int maNhanVien, String tenNhanVien, int tuoiNhanVien, double luong, String phongBan) {
        MaNhanVien = maNhanVien;
        TenNhanVien = tenNhanVien;
        TuoiNhanVien = tuoiNhanVien;
        Luong = luong;
        PhongBan = phongBan;
    }
    public NhanVien(int maNhanVien){
        super();
        MaNhanVien = maNhanVien;
    }
    public NhanVien() {}

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public int getTuoiNhanVien() {
        return TuoiNhanVien;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public double getLuong() {
        return Luong;
    }

    public void setMaNhanVien(int maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        TenNhanVien = tenNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        TuoiNhanVien = tuoiNhanVien;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public void setPhongBan(String phongBan) {
        PhongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNhanVien=" + MaNhanVien +
                ", TenNhanVien='" + TenNhanVien + '\'' +
                ", TuoiNhanVien=" + TuoiNhanVien +
                ", Luong=" + Luong +
                ", PhongBan='" + PhongBan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return MaNhanVien == nhanVien.MaNhanVien && TuoiNhanVien == nhanVien.TuoiNhanVien && Double.compare(Luong, nhanVien.Luong) == 0 && Objects.equals(TenNhanVien, nhanVien.TenNhanVien) && Objects.equals(PhongBan, nhanVien.PhongBan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaNhanVien, TenNhanVien, TuoiNhanVien, Luong, PhongBan);
    }

    public void NhapDuLieu() {
        System.out.print("Nhap vao Ma Nhan Vien: ");
        this.MaNhanVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao Ten Nhan Vien: ");
        this.TenNhanVien = sc.nextLine();
        System.out.print("Nhap vao Tuoi Nhan Vien: ");
        this.TuoiNhanVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao Luong: ");
        this.Luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap vao Ten Phong Ban: ");
        this.PhongBan = sc.nextLine();
    }

    public void XuatDuLieu() {
        System.out.println("MaNhanVien: " + MaNhanVien);
        System.out.println("TenNhanVien: " + TenNhanVien);
        System.out.println("TuoiNhanVien: " + TuoiNhanVien);
        System.out.println("Luong: " + Luong);
        System.out.println("PhongBan: " + PhongBan);
    }


}
