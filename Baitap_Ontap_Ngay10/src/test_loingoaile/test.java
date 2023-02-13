/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_loingoaile;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class test {

    public static void main(String[] args) {
        try {
            int a, b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("a chia b= " + (a / b));

        }
        catch(java.lang.ArithmeticException e1){
            System.out.println("loi chia cho 0");
        }
        catch(Exception e){
            System.out.println("co loi ngoai le");
        }

    }

}
