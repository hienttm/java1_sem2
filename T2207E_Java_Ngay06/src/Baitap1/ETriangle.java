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
public class ETriangle extends Triangle {
    public ETriangle(){
        super();
    }
    @Override
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác đều: ");
        a=sc.nextInt();
    }
    @Override
    public int perimeter(){
       
        int P;
        P=a*3;
        return P;
    }
    @Override
    public double area(){
        double S;
        S = (double)a*a*Math.sqrt(3) / 4;
        return S;
    }
}
