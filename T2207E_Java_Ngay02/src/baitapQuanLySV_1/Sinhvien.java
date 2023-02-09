/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapQuanLySV_1;

import java.util.Scanner;


/**
 *
 * @author tranthimaihien
 */
public class Sinhvien {
    //khai báo các thuộc tính của lớp sinh viên
    private String MaSV;
    private String HoTenSV;
    private double Diem;
    //xây dựng các hàm tạo (constructor)
    //hàm tạo trùng tên class và không cần phương thức void. các hàm khác phải 
    public Sinhvien() {
        this.MaSV="";
        this.HoTenSV="";
        this.Diem=0;
    }
    // overload (nạp chồng)
    public Sinhvien(String MaSV, String HoTenSV, double Diem) {
        this.MaSV = MaSV;
        this.HoTenSV = HoTenSV;
        this.Diem = Diem;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTenSV() {
        return HoTenSV;
    }

    public void setHoTenSV(String HoTenSV) {
        this.HoTenSV = HoTenSV;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    //xây dụng các phương thức của lớp Sinhvien
    public void Nhap() //nhập thông tin sv từ bàn phím
    {
        Scanner sc=new Scanner(System.in);
        // nên gọi trong này vì nếu gọi trong class sinhvien thì có 100sv ~ 100sc, tốn bộ nhớ
        System.out.print("MaSV: ");
        this.MaSV=sc.nextLine();
        System.out.print("Họ tên: ");
        this.HoTenSV=sc.nextLine();
        System.out.print("Điểm: ");
        this.Diem=sc.nextDouble(); 
    }
    public void Hienthi()
    {
        System.out.println("Mã SV: "+this.MaSV+", họ tên:"+this.HoTenSV+", điểm:"+this.Diem);
    }
     
}
