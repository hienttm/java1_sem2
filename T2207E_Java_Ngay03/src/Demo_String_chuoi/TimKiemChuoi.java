/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_String_chuoi;

/**
 *
 * @author tranthimaihien
 */
public class TimKiemChuoi {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bc";
        //tìm vị trí của s2 trong s1
        int i;
        i=s1.indexOf(s2); // tìm thấy s2 trong s1 tại vị trí 1
        System.out.println("i= "+i);
        s1="abcd";
        s2="ab";
        i=s1.indexOf(s2); // tìm thấy s2 trong s1 tại vị trí 0
        System.out.println("i= "+i);
        s1="abcd";
        s2="xy"; //
        i=s1.indexOf(s2); //i=-1 =>s2 không có trong s1
        System.out.println("i= "+i);
    }
}
