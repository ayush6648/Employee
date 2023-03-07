package main.java;


import main.testdemo.constants.EmpConstants;

public abstract class Employee implements Salary {
    String name, email;
    int age;
    private int empID;
    char gender;
    private long mobile_no;


    public Employee(String name, String email, int age, int empID, char gender, long mobile_no) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.empID = empID;
        this.gender = gender;
        this.mobile_no = mobile_no;
    }
//Getter and Setter

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getEmpID() {
        return empID;
    }

    public char getGender() {
        return gender;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmpInfo() {
        //System.out.println("Employee details - ");
        return (EmpConstants.EMP_ID +" - "+ this.empID + "\n" + EmpConstants.NAME +" - "+ this.name + "\n" + EmpConstants.AGE +" - "+ this.age + "\n" + EmpConstants.GENDER +" - "+ this.gender + "\n" + EmpConstants.EMAIL+" - "+ this.email + "\n" + EmpConstants.MOB +" - "+ this.mobile_no + "\n");
    }

//   Salary interface implementation
    @Override
    public double calculatePay(){
        return salary;
    }
    public abstract boolean checkPromotionEligiblity();

    @Override
    public double bonus() {
        return 0;
    }
}

