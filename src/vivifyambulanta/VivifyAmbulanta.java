/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta;

import vivifyambulanta.model.AmbulanceLogger;
import vivifyambulanta.model.BloodPressure;
import vivifyambulanta.model.Doctor;
import vivifyambulanta.model.Examination;
import vivifyambulanta.model.Patient;
import vivifyambulanta.model.Sugar;

/**
 *
 * @author Sergej
 */
public class VivifyAmbulanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating log file
        AmbulanceLogger logger = new AmbulanceLogger();
        
        // Creating new doctor
        Doctor milan = new Doctor("Milan", "Peric", "0211970830000", 133);
        
        // Creating new patient
        Patient dragan = new Patient("Dragan", "Miskovic", "2303954830013", 3094);
        
        // Patient chosing doctor
        dragan.setDoctor(milan);
        
        // Creating new exams
        Examination sugarExam = new Sugar("21.03.2016 17:00");
        Examination bloodPressureExam = new BloodPressure();
        
        // Doctor booking exams
        // Date must be in day.month.year hour:minute format!
        milan.addExamination(dragan, sugarExam, "22.03.2016 07:30");
        milan.addExamination(dragan, bloodPressureExam, "24.03.2016 15:20");
        
        // Doctor perform examinations
        milan.doExaminations();
        
        
    }
    
}
