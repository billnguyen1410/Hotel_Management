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
public class LongTerm extends Customer implements Receivable 
{
	private double fullService;
	private double fullServiceRate;
	private double perDay;
	private double timeshare;
	private double suiteRoomRate;
	
	public LongTerm(String firstName, String lastName, int id, double fullServices, 
		double fullServiceRates, double day, double timeshareHold, double suiteRoomRates)
	{
		super(firstName, lastName, id);
		setFullService(fullServices);
		setFullServiceRate(fullServiceRates);
		setPerDay(day);
		setTimeshare(timeshareHold);
		setSuiteRoomRate(suiteRoomRates);
	}
		
	public void setFullService(double fullServices)
	{
		fullService = fullServices;
	}
	public void setFullServiceRate(double fullServiceRates)
	{
		fullServiceRate = fullServiceRates;
	}
	public void setPerDay(double day)
	{
		perDay = day;
	}
	public void setTimeshare(double timeshareHold)
	{
		timeshare = timeshareHold;
	}
	public void setSuiteRoomRate(double suiteRoomRates)
	{
		suiteRoomRate = suiteRoomRates;
	}	
	public double getFullService()
	{
		return fullService;
	}
	public double getFullServiceRate()
	{
		return fullServiceRate;
	}
	public double getPerDay()
	{
		return perDay;
	}
	public double getTimeshare()
	{
		return timeshare;
	}
	public double getSuiteRoomRate()
	{
		return suiteRoomRate;
	}
	public double getReceivablePayment()
	{
		return getTimeshare() + (getFullService() * getFullServiceRate()) + (getPerDay() * getSuiteRoomRate());
	}
}
