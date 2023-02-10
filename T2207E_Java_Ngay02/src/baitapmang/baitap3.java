/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapmang;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
//Viết chương trình nhập một dãy N số thực, với N <=100 do người dùng nhập. Tìm số lớn nhất trong các số đã nhập.
public class baitap3 {
    public static void main(String[] args) {
        float [] arr3 =new float[100];
        int n;
        float max;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Vui lòng nhập số phần tử của mảng (1-100): ");
            n=sc.nextInt();
        } while (n<1||n>100);
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+":");
            arr3[i]=sc.nextFloat();
        }
        max=arr3[0];
        for(int i=1;i<arr3.length;i++){
            if(arr3[i]>max){
                max=arr3[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng trên là: "+ max);
    }
}
