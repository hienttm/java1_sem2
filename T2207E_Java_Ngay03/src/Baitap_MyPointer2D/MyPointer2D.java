/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_MyPointer2D;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class MyPointer2D {
    public double x;
    public double y;
    
    public MyPointer2D(){
    this.x=0;
    this.y=0;
    }

    public MyPointer2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void display(){
        System.out.println("Toạ độ: x: "+x+", y: "+y);
    }
    public static double distance(){
        double dodaiAB;
        MyPointer2D[] arr = new MyPointer2D[2];
        for(int i=0;i<2;i++){
            arr[i]=new MyPointer2D();
            System.out.println("Vui lòng nhập toạ độ điểm thứ "+(i+1)+":");
            Scanner sc =new Scanner(System.in);
            System.out.println("Nhập toạ độ x của điểm thứ "+(i+1)+":");
            arr[i].x=sc.nextDouble();
            System.out.println("Nhập toạ độ x của điểm thứ "+(i+1)+":");
            arr[i].y=sc.nextDouble();
            
        }
        dodaiAB=Math.sqrt(Math.pow((arr[0].x - arr[1].x), 2) + Math.pow((arr[0].y - arr[1].y), 2));
        return dodaiAB;
        
    }
    public static void main(String[] args) {
         MyPointer2D a =new MyPointer2D();
        a.x= 1.2;
        a.y=5.3;
        a.display();
        
        double kc;
        kc=distance();
        System.out.println("khoảng cách 2 điểm là: "+kc);
    }
}

