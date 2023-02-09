/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2;

/**
 *
 * @author tranthimaihien
 */
public class Main {
    public void show(Animal a){
        a.sayHello();
    }
    public static void main(String[] args) {
        Animal a=new Animal("Animal 01");
        Dog b=new Dog("Kiki");
        Cat d=new Cat("KATTY");
        a.sayHello();
        b.sayHello();
        d.sayHello();
        
    }
}
