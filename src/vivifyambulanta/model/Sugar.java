/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Sergej
 */
public class Sugar extends Examination {

    private double value;
    private Calendar lastMeal;

    public Sugar(String date) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy kk:mm");
        try {
            cal.setTime(sdf.parse(date));
            lastMeal = cal;
        } catch (ParseException ex) {
            System.out.println("----[ERROR]---- Date is not in day.month.year hour:minute format");
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Calendar getLastMeal() {
        return lastMeal;
    }

    public void setLastMeal(Calendar lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public void simulate() {
        // Took limit values from random Google site
        // simulating sugar level in range of 4-9;
        double valueSim = (Math.random() * (9 - 4)) + 4;
        this.value = valueSim;
        String logFormating = String.format("Sugar log for patient %s set on: %s // value: [%.2f]",
                this.getPatient().getFirstName(),
                this.getDate().getTime().toString(),
                this.value);

        System.out.println(logFormating);
        logger.addLog(logFormating);
    }
}
