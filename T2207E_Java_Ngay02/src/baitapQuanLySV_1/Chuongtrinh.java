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
public class Chuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            System.out.println("Nhập số sinh viên (1-30):  ");
            n=sc.nextInt();
        } while (n<1 || n>30);
        Sinhvien[] svArr= new Sinhvien[n];
        for (int i=0;i<svArr.length;i++){
            svArr[i]=new Sinhvien();
        }
        for (int i=0;i<svArr.length;i++){
            System.out.println("Nhập sinh viên: "+i);
            svArr[i].Nhap();
        }
        for(int i=0;i<svArr.length;i++){
            System.out.println("Hiển thị thông tin sinh viên "+i+":");
            svArr[i].Hienthi();
        }
    }
}
