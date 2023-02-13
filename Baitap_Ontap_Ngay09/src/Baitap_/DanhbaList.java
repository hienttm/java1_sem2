/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class DanhbaList {
    ArrayList<Danhba> list=new ArrayList();

    public DanhbaList() {
    }
    
    public void input(){
        Danhba db=new Danhba();
        db.nhap();
        for(int i=0;i<list.size();i++){
            if(list.get(i).PhoneNumber.equalsIgnoreCase(db.PhoneNumber)==true){
                System.out.println("Số điện thoại này đã tồn tại!");
                return;
            }
        }
        list.add(db);
        System.out.println("Thêm liên hệ thành công!");
        
    }
    public void display(){
        int k=list.size();
        System.out.println("Có "+k+" liên hệ trong danh bạ");
        for(int i=0;i<list.size();i++){
            list.get(i).hienthi();
        }
    }
    public void find(){
        Scanner sc=new Scanner(System.in);
        String key;
        System.out.println("Vui lòng nhập từ khoá: ");
        key=sc.nextLine();
        int k=0;
        for(int i=0;i<list.size();i++){
            
            if(list.get(i).Name.contains(key)==true){
                list.get(i).hienthi();
                k++;
            }
        }
        if(k==0){
            System.out.println("Không tồn tại tên này trong danh bạ!");
        }
    }
    public void delete(){
        Scanner sc=new Scanner(System.in);
        String key;
        System.out.println("Vui lòng nhập từ tên hoặc sđt cần xoá: ");
        key=sc.nextLine();
        int k=0;
        for(int i=list.size()-1;i>=0;i--){
            
            if(list.get(i).Name.equalsIgnoreCase(key)==true|| list.get(i).PhoneNumber.equalsIgnoreCase(key)==true){
                list.remove(i);
                k++;
            }
        }
        if(k==0){
            System.out.println("Liên hệ này không tồn tại trong danh bạ!");
        }else{
            System.out.println("Đã xoá"+k+" liên hệ thành công!");
        }
    }
    public void fix(){
        Scanner sc=new Scanner(System.in);
        String key;
        System.out.println("Vui lòng nhập tên cần sửa: ");
        key=sc.nextLine();
        int k=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).Name.equalsIgnoreCase(key)==true){
                
                list.get(i).hienthi();
                System.out.println("Sửa sđt thành:");
                String newphone;
                newphone=sc.nextLine();
                // kiểm tra sđt mới có trùng sđt trong danh bạ k
                for(int j=0;j<list.size();j++){
                    if(list.get(j).PhoneNumber.equalsIgnoreCase(newphone)){
                        System.out.println("SDT này đã tồn tại, vui lòng nhập sđt khác");
                        return;
                    }
                }
                //
                list.get(i).setPhoneNumber(newphone);
                k++;
            }
        }
        if(k==0){
            System.out.println("Liên hệ này không tồn tại trong danh bạ");
        }else
            System.out.println("Đã sửa thành công!");
    }
}
