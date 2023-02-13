/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi_Exam;

/**
 *
 * @author tranthimaihien
 */
public class Complex {
    public double realPart;
    public double imaginaryPart;

    public Complex() {
        realPart=0;
        imaginaryPart=0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex add (Complex otherNumber){
        double newrealPart= this.realPart+otherNumber.realPart;
        double newimaginaryPart=this.imaginaryPart+otherNumber.imaginaryPart;
        return new Complex(newrealPart,newimaginaryPart);
    }
    public Complex subtract(Complex otherNumber){
        double newrealPart= this.realPart-otherNumber.realPart;
        double newimaginaryPart=this.imaginaryPart-otherNumber.imaginaryPart;
        return new Complex(newrealPart,newimaginaryPart); 
    }
    public Complex multiply (Complex otherNumber){
        double newrealPart= this.realPart*otherNumber.realPart-this.imaginaryPart*otherNumber.imaginaryPart;
        double newimaginaryPart=this.realPart*otherNumber.imaginaryPart+otherNumber.realPart*this.imaginaryPart;
        return new Complex(newrealPart,newimaginaryPart);
    }
    public Complex divide (Complex otherNumber){
        double denominator = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
        double newrealPart = ((this.realPart * otherNumber.realPart) + (this.imaginaryPart * otherNumber.imaginaryPart)) / denominator;
        double newimaginaryPart = ((this.imaginaryPart * otherNumber.realPart) - (this.realPart * otherNumber.imaginaryPart)) / denominator;
        return new Complex(newrealPart, newimaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return this.realPart + " + "+ this.imaginaryPart+"i";
    }
    
}
