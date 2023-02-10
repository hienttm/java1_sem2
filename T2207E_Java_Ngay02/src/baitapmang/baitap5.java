/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapmang;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class baitap5 {
    public static void main(String[] args) {
        int [] arr5=new int [100];
        int dem=0;
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Nhập số lượng phần tử trong mảng (1-100):");
            n=sc.nextInt();
        }while(n<1||n>100);
        //duyệt mảng
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+" :");
            arr5[i]=sc.nextInt();
        }
        for(int a:arr5){
            for(int i=1;i<=a;i++){
                if(pow(i,2)==a){
                    dem++;
                    System.out.println(a+ " là số chính phương");
                }
            }
        }
        if (dem==0){
            System.out.println("Mảng không có số chính phương nào");
        }else
            System.out.println("Có "+dem+" số chính phương trong mảng");
    }
}
