/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_QuanLySinhvien;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Sinhvien {
    public String Masv;
    public String Hoten;
    public double Diem;

    public Sinhvien() {
        this.Masv="";
        this.Hoten="";
        this.Diem=0;
    }

    public Sinhvien(String Masv, String Hoten, double Diem) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Diem = Diem;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Mã sinh viên: ");
        this.Masv= sc.nextLine();
        System.out.println("Họ tên sinh viên");
        this.Hoten=sc.nextLine();
        System.out.println("Điêm sinh viên:");
        this.Diem=sc.nextDouble(); 
    }
    public void Hienthi(){
        System.out.println("Mã SV: "+this.Masv+", họ tên:"+this.Hoten+", điểm:"+this.Diem);
    }
    
}
