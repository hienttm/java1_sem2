/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt_QLSV_quest1;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class sinhvien {
    public String rollNo;
    public String name;
    public int age;
    public int score;

    public sinhvien() {
        this.rollNo="";
        this.name="";
        this.age=0;
        this.score=0;
    }

    public sinhvien(String rollNo, String name, int age, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void input(){
        Scanner sc=new Scanner(System.in );
        System.out.println("Nhập mã sv:");
        rollNo=sc.nextLine();
        System.out.println("Nhập tên sv:");
        name=sc.nextLine();
        System.out.println("Nhập tuổi:");
        age=sc.nextInt();
        System.out.println("Nhập điểm:");
        score=sc.nextInt();
    }
    public void display(){
        System.out.println("Mã sinh viên: "+ rollNo+", tên: "+name+", tuổi: "+age+",điểm: "+score);
    }
    
}
