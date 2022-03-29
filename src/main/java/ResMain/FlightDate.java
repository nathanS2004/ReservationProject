/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResMain;

/**
 *
 * @author Ian
 */
public class FlightDate {
    private String month;
    private int dayOfFlight;
    private String TOD;
    private String TOA;
    
    public FlightDate(String month, int dayOfFlight, String TOD, String TOA){
        this.month=month;
        this.dayOfFlight=dayOfFlight;
        this.TOD=TOD;
        this.TOA=TOA;
    }

    public String getMonth() {
        return month;
    }

    public int getDayOfFlight() {
        return dayOfFlight;
    }

   
    public String getTOD() {
        return TOD;
    }


    public String getTOA() {
        return TOA;
    }

   
    
}
