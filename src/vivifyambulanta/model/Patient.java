/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta.model;

import java.util.Calendar;

/**
 *
 * @author Sergej
 */
public class Patient extends Person{
    // Required for task (to log)
    AmbulanceLogger logger = new AmbulanceLogger();
    Calendar cal = Calendar.getInstance();
    
    private Doctor doctor;
    
    public Patient (String firstName, String lastName, String JMBG, int cardNumber) {
        super (firstName, lastName, JMBG, cardNumber);
                logger.addLog("Created patient " + firstName + " " + lastName + ", JMBG: " + JMBG + ", number: " + cardNumber);

    }
    
    // Set doctor, if is already set remind that you can only have one doctor set
    public void setDoctor (Doctor doctor) {
        if (this.doctor == null) {
            this.doctor = doctor;
            doctor.addPatient(this);
        } else {
            System.out.println("Doctor " + this.doctor.firstName + " is already set as " + this.firstName + "'s doctor");
        }
    }
}
