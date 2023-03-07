package main.java;


import main.testdemo.constants.EmpConstants;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static java.util.logging.Logger Logger = java.util.logging.Logger.getLogger("Log");
    public static void init(){
        FileHandler fh;
        try{
            fh = new FileHandler("src/main/java/mylog.log");
            Logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            //Logger.info("Initialised");
        }
        catch (Exception e){
            Logger.log(Level.WARNING, "Exception :: " ,e);
        }
    }
    public static void main(String[] args) {
        // String name, String email, int age, int empID, char gender, long mobile_no, int team_size
        Manager m = new Manager("sumuk", "manager@gmail.com", 25, 1222,'M',  789798797, 10);

        //m.getSalary();
        init();
        Logger.log(Level.INFO, m.getEmpInfo());
        Logger.info("End");
        //m.getEmpInfo();
        Programmer p = new Programmer("Ayush", "ayush@gmail.com", 22, 12221,'M',  8987648, 10);
    }
}