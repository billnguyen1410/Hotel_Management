/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Long Nguyen
 */
public class ShortTerm extends Customer implements Receivable 
{
	private double perDay;
	private double guestRoomRate;
	private double limitedService;
	private double limitedServiceRate;
	
	public ShortTerm(String firstName, String lastName, int id, double perDays, 
		double guestRoomRates, double limitedServices, double limitedServiceRates)
	{
		super(firstName, lastName, id);
		setPerDay(perDays);
		setGuestRoomRate(guestRoomRates);
		setLimitedService(limitedServices);
		setLimitedServiceRate(limitedServiceRates);
	}
	
	public void setPerDay(double perDays)
	{
		perDay = perDays;
	}
	public void setGuestRoomRate(double guestRoomRates)
	{
		guestRoomRate = guestRoomRates;
	}
	public void setLimitedService(double limitedServices)
	{
		limitedService = limitedServices;
	}
	public void setLimitedServiceRate(double limitedServiceRates)
	{
		limitedServiceRate = limitedServiceRates;
	}
	
	public double getPerDay()
	{
		return perDay;
	}
	public double getGuestRoomRate()
	{
		return guestRoomRate;
	}
	public double getLimitedService()
	{
		return limitedService;
	}
	public double getLimitedServiceRate()
	{
		return limitedServiceRate;
	}
	public double getReceivablePayment()
	{
		return (getLimitedService() * getLimitedServiceRate()) + (getPerDay() * getGuestRoomRate());
	}
        public String toString()
    {
        return String.format( "short term customer: %s\n%s: %,.2f; %s: $%,.2f; %s: %,.2f; %s: $%,.2f", 
           super.toString(), "how many nights spent", getPerDay(), "cost per day" , getGuestRoomRate(),
		   "how many limited services were provided", getLimitedService(), "cost per service", getLimitedServiceRate() );
    } // end method toString
       
}