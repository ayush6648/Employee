package main.java;


class Programmer extends Employee implements CanDoCoding{

     private int experience;

    Programmer(String name, String email, int age, int empID, char gender, long mobile_no, int experience) {
        super(name, email, age, empID, gender, mobile_no);
        this.experience = experience;

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    /*
    Level 0 --> Intern
    level 1 --> SDE-1
    level 2 --> SDE-2
    level 3 --> SDE-3
    */

    @Override
    public int calculateLevel(){
        return experience/3;
    }
    @Override
    public double calculatePay() {
        return ((2 + calculateLevel()) / 3.0f) * salary;
    }
    @Override
    public boolean checkPromotionEligiblity(){
        if (calculatePay() > salary) return true;
        return false;
    }
    @Override
    public double bonus() {
        if(checkPromotionEligiblity()){
            return .15*calculatePay();
        }
        return .10*calculatePay();
    }

}