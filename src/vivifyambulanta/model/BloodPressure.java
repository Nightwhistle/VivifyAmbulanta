/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta.model;

/**
 *
 * @author Sergej
 */
public class BloodPressure extends Examination {

    private double highPoint;
    private double lowPoint;
    private double pulse;
    private String type = "Blood pressure";

    public double getHighPoint() {
        return highPoint;
    }

    public void setHighPoint(double highPoint) {
        this.highPoint = highPoint;
    }

    public double getLowPoint() {
        return lowPoint;
    }

    public void setLowPoint(double lowPoint) {
        this.lowPoint = lowPoint;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    @Override
    public void simulate() {
        // Took limit values from random Google site
        // simulating low pressure in range of 40-100;
        double lowSim = (Math.random() * (100 - 40)) + 40;
        this.lowPoint = lowSim;

        // simulating high pressure in range 70-190;
        double highSim = (Math.random() * (190 - 70)) + 70;
        this.highPoint = highSim;

        // simulating pulse in range 60-150;
        double pulseSim = (Math.random() * (190 - 70)) + 70;
        this.pulse = pulseSim;

        String logFormating = String.format("Bloodpressure log for patient %s set on: %s // lowPoint: [%.2f], highPoint: [%.2f], pulse: [%.2f]",
                this.getPatient().getFirstName(),
                this.getDate().getTime().toString(),
                this.lowPoint,
                this.highPoint,
                this.pulse);
        System.out.println(logFormating);
        logger.addLog(logFormating);

    }
}
