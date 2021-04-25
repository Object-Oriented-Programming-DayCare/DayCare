/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.controller.abstraction;

import edu.neu.csye6200.model.Person;

/**
 *
 * @author divyavijendragirase
 */
public abstract class AbstractSchoolAPI {
    public abstract void addStudent(Person student);
    public abstract void addTeacher(Person employee);
}
