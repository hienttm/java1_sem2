/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap1;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Triangle {
    public int a;
    public int b;
    public int c;

    public Triangle() {
        
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
    }
    public  int perimeter(){
        int P=a+b+c;
        return P;
        
    }
    public double area(){
        double p;
        p=(double)(a+b+c)/2;
        double S= (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        return S;
    }
}
