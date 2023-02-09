/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Treemap;

import java.util.TreeMap;

/**
 *
 * @author tranthimaihien
 */
public class Demo_Treemap2 {
    public static void main(String[] args) {
        //xác định kiểu dữ liêuj cụ thể của tưngf phần tử
        TreeMap<String,Integer> cart=new TreeMap();
        cart.put("SP01",2);
        cart.put("SP02",3);
        cart.put("SP03",5);
        cart.put("SP01",5); //update số lượng giỏ hàng của sp01 thành 5
        System.out.println("Hiển thị giỏ hàng");
        for(String masp:cart.keySet()){
            int soluong=cart.get(masp);
            System.out.println(masp+" có số lượng là: "+ soluong );
        }
        String checkmasp= "SP04";
        boolean b=cart.containsKey(checkmasp);
        if(b){
            System.out.println("Có mã sản phẩm "+checkmasp);
        }
        System.out.println("Không có mã sản phầm "+checkmasp);
    }
}
