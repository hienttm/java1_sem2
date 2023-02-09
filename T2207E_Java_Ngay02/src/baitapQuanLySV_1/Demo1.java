/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapQuanLySV_1;

/**
 *
 * @author tranthimaihien
 */
public class Demo1 {
    public static void main(String[] args) {
        // kiểu dữ liệu tham chiếu
        Sinhvien sv; //sv=null - chưa tham chiếu tới Sinhvien nào
        //lệnh sv.MaSV="SV01" lỗi do chưa tạo đối tượng gán cho sv
        //sv.MaSV="SV01";
        sv= new Sinhvien();
        //new để gọi Constructor của lớp Sinhvien để tạo đối tượng (Object/Instance) Sinhvien gán cho sv
        sv.setMaSV("SV01");
        sv.setHoTenSV("Nguyễn Văn Dũng");
        sv.setDiem(9.5);
        sv.Hienthi();

        sv=new Sinhvien("SV02","Lê Thị Hiền",8.5);
        sv.Hienthi();//hiển thị đối tượng mới
        //thông thường khai báo và khới tạo đối tượng cùng 1 dòng
        Sinhvien sv2=new Sinhvien();
        System.out.println("Nhập sv2: ");
        sv2.Nhap();
        System.out.println("Thông tin sv2: ");
        sv2.Hienthi();
        Sinhvien sv3=sv2; //gán đối tượng của sv2 đang tham chiếu cho sv3
        System.out.println("Thông tin sv3: ");
        sv3.Hienthi();
    }
 
}
