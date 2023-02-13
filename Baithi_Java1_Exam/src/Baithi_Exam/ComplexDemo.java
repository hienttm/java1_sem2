/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi_Exam;

/**
 *
 * @author tranthimaihien
 */
public class ComplexDemo {
    public static void main(String[] args) {
        Complex a=new Complex(11,8);
        Complex b=new Complex(3,7);
        System.out.println("Complex a: "+a);
        System.out.println("Complex b: "+b);
        
        Complex sum=a.add(b);
        System.out.println("a+b= "+sum);
        
        Complex hieu=a.subtract(b);
        System.out.println("a-b="+hieu);
        
        Complex tich=a.multiply(b);
        System.out.println("a*b= "+tich);
        
        Complex thuong=a.divide(b);
        System.out.println("a/b= "+thuong);
        
        a.setRealPart(10);
        a.setImaginaryPart(9);
        System.out.println("new complex a: ="+a);
        double a1=a.getRealPart();
        double a2=a.getImaginaryPart();
        System.out.println("the real part of this complex = "+a1 + ", imaginary part ="+a2);
    }
}
