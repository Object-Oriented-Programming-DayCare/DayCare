/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.controller.abstraction.AbstractSchoolAPI;
import edu.neu.csye6200.model.Person;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author divyavijendragirase
 */
public class SchoolBase extends AbstractSchoolAPI {

    List<Person> studentlist = new ArrayList<Person>();
    List<Person> teacherList = new ArrayList<Person>();
    
    @Override
    public void addStudent(Person student) {
        this.studentlist.add(student);
    }

    @Override
    public void addTeacher(Person teacher) {
        this.teacherList.add(teacher);
    }
    
}
