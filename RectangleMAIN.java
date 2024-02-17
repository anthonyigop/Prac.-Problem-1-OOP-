/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rectanglemain;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class RectangleMAIN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the W and H of a rectangle");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        RectangleEXT rektanggol = new RectangleEXT(width, height);

        double area = rektanggol.GetArea();

        System.out.println("Rectangle's Area: " + area);
    }
}
