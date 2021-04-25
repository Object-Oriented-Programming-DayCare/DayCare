/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.factory;

import edu.neu.csye6200.model.Person;
import edu.neu.csye6200.model.Student;

/**
 *
 * @author divyavijendragirase
 */
public class StudentFactory extends AbstractStudentFactory{
    private static StudentFactory instance;
    
    public static StudentFactory getInstance() {
        if(instance == null) {
            instance=new StudentFactory();
        }
        return instance;
    }
    
    @Override
    public Person getObject() {
        return new Student();
    }
    
    
    
}
