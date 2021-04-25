/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.factory;


import edu.neu.csye6200.model.Person;
import edu.neu.csye6200.model.Teacher;

/**
 *
 * @author divyavijendragirase
 */
public abstract class AbstractTeacherFactory extends AbstractPersonFactory {

  public abstract Person getObject();
    
}
