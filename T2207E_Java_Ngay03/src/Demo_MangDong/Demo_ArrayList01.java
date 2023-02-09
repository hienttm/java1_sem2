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
public class Demo_ArrayList01 {
    public static void main(String[] args) {
        //khai báo và khởi tạo đối tượng ArrayList
        // là đối tượng để quản lý mảng động
        ArrayList arr = new ArrayList();
        Integer i=10;
        Double d=5.5;
        String str="java";
        Sinhvien sv=new Sinhvien();
        //
        arr.add(i);//thêm 1 đối tượng Integer vào vị trí 0
        arr.add(d);// thêm 1 đối tượng Double vào vị trí 1
        arr.add(str); //thêm 1 chuỗi vào vị trí 2
        arr.add(2,sv); //thêm đối tượng sv vào vị trí 2, str sẽ lùi về vị trí 3
        // số phần tử mảng
        int n=arr.size();
        System.out.println("Số phần tử: "+n);
        //lấy phần tử ở vị trí thứ 3 
        String s=(String)arr.get(3); // phải ép kiểu về kiểu ban đầu
        System.out.println("arr[3]= "+s);
        Sinhvien sv2=(Sinhvien)arr.get(2);
        sv2.Hienthi();
        
    }
}
