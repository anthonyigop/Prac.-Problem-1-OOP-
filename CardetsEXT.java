/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardetsmain;

/**
 *
 * @author ACER
 */
class CardetsEXT {

    String make;
    String model;
    int year;

    CardetsEXT(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void PrintDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
