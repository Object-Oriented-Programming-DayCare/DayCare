/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.model;

/**
 *
 * @author divyavijendragirase
 */
public class Student extends Person{

    private int grade;
  
    public Student(String name, int age, String phone, int grade) {
        super(name, age, phone);
        this.grade = grade;
    }

    public Student() {
        super();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "grade=" + grade + '}';
    }
 
}
