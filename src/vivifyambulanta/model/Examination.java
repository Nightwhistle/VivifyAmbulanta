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
public abstract class Examination {
    
    // Required for task (to log)
    AmbulanceLogger logger = new AmbulanceLogger();
    Calendar cal = Calendar.getInstance();
    
    private Calendar date;
    private Doctor doctor;
    private Patient patient;
    private String type;
    
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    
    void simulate() {
        throw new UnsupportedOperationException("This method must be overriden");
    }
}
