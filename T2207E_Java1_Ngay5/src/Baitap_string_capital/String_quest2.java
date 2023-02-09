/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_string_capital;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class String_quest2 {
    public static void main(String[] args) {
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập chuỗi bất kỳ: ");
        str1=sc.nextLine();
        StringBuilder str2=new StringBuilder(str1.toUpperCase());
        System.out.println("Chuỗi đã nhập ở dạng CHỮ HOA: "+str2);
        // xử lý chuỗi về dạng mong muốn
        
        for(int i=2;i<str2.length();i++){
            char c=str2.charAt(i);
            char before=str2.charAt(i-1);
            if(before!=' '){
                char c_low=Character.toLowerCase(c);
                str2.setCharAt(i, c_low);
            }
        }
        System.out.println("Chuỗi sau khi chuyển đổi là: "+str2);
    }
}
