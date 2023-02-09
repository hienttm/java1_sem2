/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tranthimaihien
 */
//khai báo lớp Student để chứa các thông tin và hành động của sinh 
public class Student {
    //khai báo các thuộc tính
    public String Hoten;
    public int Tuoi;
    //hàm tạo: Constructor là hàm dùng sau new để khởi tạo đối tương
    //hàm tạo: Constructor cho phép đặt các lệnh được tự động chạy khi 1 đối tượng
    // hàm tạo phải là public và không có kiểu trả về kể cả void 
    
    public Student() {
        Hoten="";
        Tuoi =0;
    }
    //Overload (nạp chồng) thêm 1 hàm tạo nữa với 2 tham số 
    public Student(String Hoten, int Tuoi) {
        // this là con trỏ để truy cập tới các thành phần nội bộ của lớp 
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
    }
    // xây dựng các phương thức cho lớp
    public void Display()
    {
        System.out.println("Họ tên: "+ Hoten+", Tuổi:"+Tuoi);
        
    }

    
}
