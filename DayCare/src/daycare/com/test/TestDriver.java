package daycare.com.test;

import daycare.com.console.DayCare;
import daycare.com.gui.StartWindows;

public class TestDriver {
    public static void main(String[] args){
        GUITest();
//        dataInputTest();
//        dataOutputTest();
    }
    public static void dataInputTest(){
        DayCare dayCare=new DayCare();
        dayCare.demo2();
    }

    public static void dataOutputTest(){
        DayCare dayCare=new DayCare();
        dayCare.demo();
        System.out.println("A" ) ;
    }

    public static void GUITest(){
        DayCare dayCare = new DayCare();
        dayCare.readFromFile();
        new StartWindows(dayCare);
    }
}
