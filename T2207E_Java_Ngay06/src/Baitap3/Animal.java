/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap3;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Animal {
    String name;
    public Animal() {
        
    }

    public Animal(String name) {
        this.name = name;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        System.out.println("Nhập tên Animal:");
        
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
    }
    public void hienthi(){
        System.out.println("Hi, my name is "+name);
    }
}
