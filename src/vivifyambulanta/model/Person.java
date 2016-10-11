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
public abstract class Person {

    protected String firstName;
    protected String lastName;
    
    // Too large for int and it can start with 0 so I chose to use String here
    protected String JMBG;
    protected int cardNumber;

    public Person (String firstName, String lastName, String JMBG, int cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.JMBG = JMBG;
        this.cardNumber = cardNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

}
