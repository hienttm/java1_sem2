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
public class Demo_Treemap1 {
    public static void main(String[] args) {
        TreeMap tudien= new TreeMap();
        tudien.put("Cat","Con mèo");
        tudien.put("Home","Ngôi nhà");
        int n=tudien.size();
        System.out.println("Số phần tử:"+n);
        String v=(String) tudien.get("Cat"); //phải ép kiểu vì gtri sẽ trả về kiểu bất kỳ
        System.out.println("Value của Cat là: "+v);
        //duyệt tất cả các Key, Value trong Treemap:
        //lấy tập hợp các Key
        for(Object key : tudien.keySet())//lặp từng phần tử lưu vào key
        {
            String value = (String)tudien.get(key);
            System.out.println(key + " : " + value);
        }
        
    }
}
