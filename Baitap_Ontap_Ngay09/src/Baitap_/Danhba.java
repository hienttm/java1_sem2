/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Danhba {
    String Name;
    String PhoneNumber;

    public Danhba() {
    }

    public Danhba(String Name, String PhoneNumber) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên:");
        Name=sc.nextLine();
        System.out.println("Nhập sđt: ");
        PhoneNumber=sc.nextLine();
    }
    public void hienthi(){
        System.out.println("Tên: "+Name+", Sđt: "+PhoneNumber);
    }
}
