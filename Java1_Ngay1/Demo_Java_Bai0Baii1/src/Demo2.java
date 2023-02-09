/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tranthimaihien
 */
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        String hoten; //khai báo biển kiểu chuỗi
        int tuoi;  //khai báo biển kiểu số nguyên
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ tên");
        hoten=sc.nextLine(); //dừng màn hình đợi nhập chuột
        System.out.println("Nhập tuổi");
        tuoi=sc.nextInt();// nhập số nguyên
        System.out.println("Họ tên: "+ hoten);
        System.out.println("Tuổi: "+ tuoi);
            
       
    }
    
   
    
}
