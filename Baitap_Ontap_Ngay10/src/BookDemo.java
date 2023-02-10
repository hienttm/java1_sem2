/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tranthimaihien
 */
public class BookDemo {
    public static void main(String[] args) {
        Author a=new Author("Russel","Winderand");
        Book b=new Book("Developing Java Software", a.firstName+" "+a.lastName, 79.75 );
        System.out.println(b.toString());
    }
}
