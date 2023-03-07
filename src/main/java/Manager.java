package main.java;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;



class Manager extends Employee {
    //private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int team_size;

    public int getTeam_size() {
        return team_size;
    }

    public void setTeam_size(int team_size) {
        this.team_size = team_size;
    }


    public Manager(String name, String email, int age, int empID, char gender, long mobile_no, int team_size) {
        super(name, email, age, empID, gender, mobile_no);
        this.team_size = team_size;
    }

    float multiplier = 1;
    public double rate(){

        if(team_size>15) multiplier = 3;
        else if(team_size>10 && team_size<=15){
            multiplier = 2.5f;
        }
        else if (team_size>5 && team_size<10){
            multiplier = 2;
        }
        return multiplier;
    }

    @Override
    public double calculatePay() {
        return salary*rate();
    }
    @Override
    public boolean checkPromotionEligiblity(){
        if (calculatePay() > 2*salary) return true;
        return false;
    }
    @Override
    public double bonus() {
        if(checkPromotionEligiblity()){
            return .20*calculatePay();
        }
        return .10*calculatePay();
    }

}
