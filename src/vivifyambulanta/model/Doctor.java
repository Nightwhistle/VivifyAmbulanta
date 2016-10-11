/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Sergej
 */
public class Doctor extends Person {

    // Required for task (to log)
    AmbulanceLogger logger = new AmbulanceLogger();
    Calendar cal = Calendar.getInstance();
    
    private List<Person> listPatients = new ArrayList();
    private List<Examination> examinations = new ArrayList();
    

    public Doctor(String firstName, String lastName, String JMBG, int cardNumber) {
        super(firstName, lastName, JMBG, cardNumber);
        
        // Logging (task)
        logger.addLog("Created doctor " + firstName + " " + lastName + ", JMBG: " + JMBG + ", number: " + cardNumber);
    }
    
    public void addPatient(Person person) {
        listPatients.add(person);
    }

    public void addExamination(Patient patient, Examination examination, String date) {
        // parsing date String
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy kk:mm");
        try {
            cal.setTime(sdf.parse(date));
        } catch (ParseException ex) {
            System.out.println("----[ERROR]---- Date is not in day.month.year hour:minute format");
        }
        
        examination.setPatient(patient);
        examination.setDate(cal);
        examinations.add(examination);
        logger.addLog("Doctor " + this.firstName + " booked for patient " + patient.getFirstName() + " ");

    }

    public void doExaminations() {
        if (examinations.isEmpty()) {
            System.out.println("Doctor " + this.firstName + " has no examinations schaduled");
            return;
        }
        for (Examination exam : examinations) {
            //Simulating random results
            exam.simulate();
        }
    }
}
