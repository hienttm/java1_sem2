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
public class baitap4 {
    public static void main(String[] args) {
        float [] arr4=new float[100];
        int n;
        float min;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử của mảng (1-100): ");
            n=sc.nextInt();
        }while(n<1||n>100);
        // duyệt mảng
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+" :");
            arr4[i]=sc.nextFloat();
        }
        min=arr4[0];
        for(int i=1;i<arr4.length;i++){
            if(arr4[i]<min){
                min=arr4[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+ min);
    }
}
