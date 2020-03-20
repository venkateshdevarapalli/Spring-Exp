package com.nt.beans;

public class dengine implements engine 
{
	

	public dengine() 
	{
		System.out.println("dengine.dengine() Zero-param-Constrecutre");
	}

	@Override
	public void start() 
	{
		System.out.println("dengine.start()--->Engine start");
	}

	@Override
	public void stop() 
	{
		System.out.println("dengine.stop()--->Engine Stop");
	}

}
