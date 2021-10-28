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
public class SalaryEmployee extends Employee implements Payable {
    private double weeklysalary;
    
    //four argument constructor
    public SalaryEmployee (int id, String fname, String lname, String ssn, double salary){
        super (id, fname, lname, ssn); // pass to Employee 
        setWeeklySalary ( salary ); // validate and store salary
    }
    
    //set salary
    public void setWeeklySalary ( double salary ){
        weeklysalary = salary < 0.0 ? 0.0 : salary;
    }
    //return salary
    public double getWeeklySalary () {
        return weeklysalary;
    }
    
    //calculate earnings
    public double earnings() {
        return getWeeklySalary();
    }//end method
    
    //return String represent SalaryEmployee
    public String toString (){
        return String.format("Salary employee: %s\n%s: $%,.2f",
        super.toString(), "weekly salary", getWeeklySalary());
    }//end method

    @Override
    public double getEarnings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
