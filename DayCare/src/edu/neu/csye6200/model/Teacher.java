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
public class Teacher extends Person {
    private int credit;

    public Teacher() {
        super();
    }
        
    public Teacher(int credit, String name, int age, String phone) {
        super(name, age, phone);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Teacher{" + "credit=" + credit + '}';
    }
    
}
