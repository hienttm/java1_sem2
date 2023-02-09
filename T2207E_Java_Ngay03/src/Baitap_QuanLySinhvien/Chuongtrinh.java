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
public class Chuongtrinh {
    public static int Menu(){
        int chon;
        Scanner sc=new Scanner(System.in);
        System.out.println("------MENU-------");
        System.out.println("1.Nhập danh sách sinh viên");
        System.out.println("2.Hiển thị DSSV");
        System.out.println("3.Sắp xếp theo điểm giảm dần");
        System.out.println("4.Thoát");
        chon=sc.nextInt();
        return chon;
    }
    public static void main(String[] args) {
        QuanlySV list=new QuanlySV();
        int chon;
        do{
            chon=Menu();// Hiển thị menu và trả về số chọn
            //xử lý menu
            switch(chon){
                case 1:
                    list.NhapDSSV();
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    list.HienthiDSSV();
                    break;
                case 3:
                    System.out.println("Danh sach sinh vien da sap xep:");
                    list.SapxepDiemGiamDan();
                    list.HienthiDSSV();
                    break;
                case 4:
                    System.out.println("Ket Thuc!");
                    break;
                default:
                    System.out.print("Moi nhap lai (1-4):");
            } 
        }while (chon!=4);
    }
}
