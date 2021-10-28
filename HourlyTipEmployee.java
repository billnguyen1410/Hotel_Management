package javaapplication9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Nguyen
 */
public class HourlyTipEmployee extends Employee implements Payable {
    private double wages; // wages per hour
    private double hours; // hours per month
    
    
    // five argument constructor
    public HourlyTipEmployee (int id, String fname, String lname, String ssn,
            double hourlyWage, double hoursWorked){
        super(id, fname, lname, ssn);
        setWage (hourlyWage); // validate and store wage
        setHour (hoursWorked); // validate and store hour worked
    }
    
    //set wage
    public void setWage( double hourlyWage){
        wages = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
    }
    //return wage
    public double getWage () {
        return wages;
    }
    
    //set hours
    public void setHour( double hoursWorked){
        hours = ( (hoursWorked >= 0.0) && (hoursWorked <= 168.0) ) ? hoursWorked : 0.0;
    }
    //return hours
    public double getHour() {
        return hours;
    }
    
    //calculate earning
    public double earnings () {
    if (getHour() <= 40) //no overtime
        return getWage() * getHour();
    else 
        return getWage() * 40 + ( getHour() - 40) * getWage() * 1.5;
    } //end method
    
    //return String represent HourlyTipEmployee
    @Override
    public String toString() {
    return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "hourly wage", getWage(), 
         "hours worked", getHour() );
    }

    @Override
    public double getEarnings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

