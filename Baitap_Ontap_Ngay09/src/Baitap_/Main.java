/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Main {
    public static int menu(){
        int chon;
        Scanner sc=new Scanner(System.in);
        System.out.println("------MENU------");
        System.out.println("Vui lòng chọn 1 mục:");
        System.out.println("1.Thêm danh bạ");
        System.out.println("2.Hiển thị danh bạ");
        System.out.println("3.Tìm liên hệ theo Tên");
        System.out.println("4.Xoá liên hệ ");
        System.out.println("5.Sửa liên hệ");
        System.out.println("6.Thoát");
        chon=sc.nextInt();
        return chon;
        
    }
    public static void main(String[] args) {
        int chon;
        DanhbaList dblist=new DanhbaList();
        do{
            chon=menu();
            switch(chon){
                case 1:
                    dblist.input();
                    break;
                case 2:
                    dblist.display();
                    break;
                case 3: 
                    dblist.find();
                    break;
                case 4: 
                    dblist.delete();
                    break;
                case 5:
                    dblist.fix();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-6: ");
            }
        }while (chon!=6);
    }
}
