/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2;

/**
 *
 * @author tranthimaihien
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("Woof, woof, my name is "+name);
    }
}
