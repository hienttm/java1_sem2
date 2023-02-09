/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap3;

import java.util.Scanner;



/**
 *
 * @author tranthimaihien
 */
public class Main {
    public static int menu(){
        int chon;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời chọn một mục");
        System.out.println("1.Nhập tên Animal");
        System.out.println("2.Hiển thị danh sách Animal");
        System.out.println("3.Xoá tên Animal");
        System.out.println("4.Thoát");
        System.out.println("Mời chọn số từ 1-4:");
        chon=sc.nextInt();
        return chon;
               
    }
    public static void main(String[] args) {
        Zoo list =new Zoo();
        int chon;
        do{
            chon=menu();
            switch (chon){
                case 1 -> list.add();
                case 2 -> list.display();
                case 3 -> list.remove();
                case 4 -> System.out.println("Kết thúc");
                default -> System.out.println("Vui lòng chọn từ 1-4!");
            }
                    
        } while (chon!=4); 
    }
}

