/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt_QLSV_quest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class chuongtrinh {
    public static void main(String[] args) {
        sinhvienlist svlist=new sinhvienlist();
        svlist.inputlist();
        svlist.displaylist();
        svlist.sapxeptheoten();
        svlist.displaylist();
        svlist.sapxeptheodiem();
        svlist.displaylist();
        Scanner sc=new Scanner(System.in);
        String tensv_check;
        System.out.println("Mời nhập tên sinh viên cần check:");
        tensv_check= sc.nextLine();
        svlist.checktensv(tensv_check);
    }
}
