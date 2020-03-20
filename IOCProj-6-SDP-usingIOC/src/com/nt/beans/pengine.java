package com.nt.beans;

public class pengine implements engine 
{
	

	public pengine() 
	{
		System.out.println("pengine.pengine() Zero Parm-Constrecture");
		
	}

	@Override
	public void start() 
	{
		System.out.println("pengine--->start()Engine Started");

	}

	@Override
	public void stop() 
	{
		System.out.println("pengine--->stop() Engine Stoped");

	}

}
