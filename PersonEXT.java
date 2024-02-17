/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personmain;

/**
 *
 * @author ACER
 */
public class PersonEXT {

    String name;
    int age;

    PersonEXT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void isAdult() {
        if (age >= 18 && age < 60) {
            System.out.println(name + " is an adult.");
        } else if (age >= 60) {
            System.out.println(name + " is not an adult. " + name + " is a senior citizen.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }
}
