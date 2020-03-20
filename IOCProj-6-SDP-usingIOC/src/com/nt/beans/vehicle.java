package com.nt.beans;

public class vehicle 
{
	private engine eng;

	public vehicle() 
	{
		System.out.println("vehicle.vehicle()Zero Parm-Cons");
	}

	public void setEng(engine eng)
	{
		System.out.println("vehicle.setEng()--setterInjuction");
		this.eng = eng;
	}
	public void jurney(String source,String dest)
	{
		System.out.println("vehicle.jurney()");
		eng.start();
		System.out.println("jurney started from :::"+source);
		System.out.println("\n\njurney going.......\n\n");
		eng.stop();
		System.out.println("jurney ended:::"+dest);
		
	}
	

}
