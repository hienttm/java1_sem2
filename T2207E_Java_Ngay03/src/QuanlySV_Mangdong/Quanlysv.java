/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanlySV_Mangdong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Quanlysv {
    ArrayList<Sinhvien> arr=new ArrayList();
    Scanner sc=new Scanner(System.in);
    int n;
    public void NhapDSSV(){
        do {
            System.out.println("Vui long nhap so sinh vien (1-30):");
            n=sc.nextInt();
        }while (n<1||n>30);
        
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin SV thứ "+(i+1)+":");
            Sinhvien nhap=new Sinhvien();
            nhap.Nhap();
            arr.add(nhap);
        }
    
    }
    public void HienthiDSSV(){
        for(int i=0;i<arr.size();i++){
            arr.get(i).Hienthi();
        }
    }
    public void SapxepDiemGiamDan(){
        for(int i=0;i<arr.size()-1;i++){
           
        }
    }
}
