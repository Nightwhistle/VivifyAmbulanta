/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivifyambulanta.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergej
 */
public class AmbulanceLogger {

    private File ambLog;

    public AmbulanceLogger() {
        try {
            ambLog = new File("D:/log.txt");
            ambLog.createNewFile(); // if file already exists will do nothing
        } catch (IOException ex) {
            Logger.getLogger(AmbulanceLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addLog(String line) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy kk:mm");
        String formattedDate = sdf.format(date);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream(ambLog,true));

            writer.println("[" + formattedDate + "] " + line);
            System.out.println("[" + formattedDate + "] " + line);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AmbulanceLogger.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
    }

}
