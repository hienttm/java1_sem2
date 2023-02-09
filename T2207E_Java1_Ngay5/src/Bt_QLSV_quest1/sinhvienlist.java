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
public class sinhvienlist {
    
        ArrayList<sinhvien> svArr=new ArrayList();
        public sinhvienlist(){
            
        }
        public void inputlist(){
            System.out.println("Vui lòng nhập danh sách 5 sinh viên:");
        //Nhập danh sách sinh viên
            for(int i=0;i<5;i++){
            sinhvien sv =new sinhvien();
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1)+":");
            sv.input();
            svArr.add(sv);
            }
        }
        public void displaylist(){
            System.out.println("Hiển thị danh sách 5 sinh viên:");
            for(int i=0;i<svArr.size();i++){
                svArr.get(i).display();
            }
        }
        public void sapxeptheoten(){
            for(int i=0;i<svArr.size()-1;i++){
                for(int j=i+1;j<svArr.size();j++){
                    sinhvien doi;
                    if(svArr.get(i).name.compareToIgnoreCase(svArr.get(j).name)>0){
                        doi=svArr.get(i);
                        svArr.set(i, svArr.get(j));
                        svArr.set(j ,  doi);
                    }
                }
            }
        }
        public void sapxeptheodiem(){
            for(int i=0;i<svArr.size()-1;i++){
                for(int j=i+1;j<svArr.size();j++){
                    sinhvien doi;
                    if(svArr.get(i).score<svArr.get(j).score){
                        doi=svArr.get(i);
                        svArr.set(i, svArr.get(j));
                        svArr.set(j ,  doi);
                    }
                }
            }
        }
        public void checktensv(String tensv_check){
        
            int dem=0;
            for(int i=0;i<svArr.size();i++){
                if(svArr.get(i).name.equalsIgnoreCase(tensv_check)){
                    System.out.println("Thông tin sinh viên cần check là:");
                    svArr.get(i).display();
                    dem++;
                }
            }
            if (dem==0){
                System.out.println("Không có sinh viên này trong danh sách");
            }
        }
    }
    

