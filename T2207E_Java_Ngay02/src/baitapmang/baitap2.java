/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapmang;

/**
 *
 * @author tranthimaihien
 */
//Viết chương trình nhập một dãy N số thực, với N <=100 do người dùng nhập. Đếm các số âm và in ra màn hình
import java.util.Scanner;
public class baitap2 {
    public static void main(String[] args) {
        float [] arr=new float[100];
        int n;
        int dem=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử n (1-100):");
            n = sc.nextInt();
        }while(n<1 || n>100);
        System.out.println("Nhập các phần tử của mảng");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                dem=dem+1;
                System.out.println("phần tử âm trong mảng là:"+arr[i]);
            }
        }
        if(dem>0){
            System.out.println("Mảng có "+dem+" số âm");
        }else System.out.println("Mảng không có số âm nào");
    }
}
