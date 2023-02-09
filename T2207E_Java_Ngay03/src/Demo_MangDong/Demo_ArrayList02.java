/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_MangDong;

import java.util.ArrayList;

/**
 *
 * @author tranthimaihien
 */
public class Demo_ArrayList02 {
    public static void main(String[] args) {
        //khai báo mảng chỉ chứa đối tượng Sinhvien
        ArrayList<Sinhvien> arr=new ArrayList();
        arr.add(new Sinhvien("SV01","A",9));
        arr.add(new Sinhvien("SV02","B",8));
        arr.add(new Sinhvien("SV03","C",10));
        //hiển thị các sinh viên
        for(int i=0;i<arr.size();i++){
            arr.get(i).Hienthi();
        }
        System.out.println("sử dụng for..each");
        for(Sinhvien sv:arr){
            sv.Hienthi();
        }
    }
}
