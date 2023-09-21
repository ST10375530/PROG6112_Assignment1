/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10375530_sectiona;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class student {
    
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;
    
    public student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }  
   
}