/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Zoo  {
    ArrayList<Animal> list=new ArrayList();
    public void add(){
        Animal a=new Animal();
            a.input();
            for(int i=0;i<list.size();i++){
                if(list.get(i).name.equalsIgnoreCase(a.name)==true){

                    System.out.println("Tên này đã tồn tại");
                    System.out.println("th3");
                    return;
                }
            }
            list.add(a);
            System.out.println("th2");
            
    }
        
    
    public void remove(){
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập tên cần xoá");
        name=sc.nextLine();
        int dem=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).name.equalsIgnoreCase(name)==true){
                list.remove(i);
                dem++;
                System.out.println("Đã xoá thành công");
            }
        }
        if(dem==0){
            System.out.println("Không tồn tại tên này trong danh sách");
        }
    }
    public void display(){
        int k;
        k= list.size();
        System.out.println("có "+k+" con vật trong danh sách");
        for(int i=0;i<list.size();i++){
            list.get(i).hienthi();
        }
        
    }
    
}
