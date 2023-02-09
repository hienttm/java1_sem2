/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap1;

/**
 *
 * @author tranthimaihien
 */
public class Main {
    public static void main(String[] args) {
        ETriangle tamgiac = new ETriangle();
        tamgiac.input();
        int p;
        p=tamgiac.perimeter();
        double s;
        s=tamgiac.area();
        System.out.println("Chu vi tam giac la: "+p+", diệc tích tam giác là: "+s);
        Triangle tg=new Triangle();
        tg.input();
        int cv;
        cv=tg.perimeter();
        double dt;
        dt=tg.area();
        System.out.println("chu vi tam giác thường là: "+ cv+", diện tích là: "+dt);
    }
}
