/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapmang;

/**
 *
 * @author tranthimaihien
 */
//1.  Viết chương trình nhập một dãy N số nguyên, với N <=100 do người dùng nhập. Tính tổng các số lẻ và in ra màn hình.
import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
        int [] a;
        a = new int [100];
        int n;
        int s=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Nhập số phần tử n (1-100):");
            n = sc.nextInt();
        }while(n<1 || n>100);
        System.out.println("Nhập các phần tử cho mảng: ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                s=s+a[i];
            }
        }
        System.out.println("Tổng các số lẻ trong mảng là: "+s);
    }
    
}
