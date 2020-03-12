package com.nt.beans;

public class BDART implements courier 
{
	
	public BDART() 
	{
		System.out.println("BDART::Zero-parm-Cons of-->BDART()");
	}

	@Override
	public String delivery(int oid)
	{
		
		return "BDART IS REDY TO DELIVER THE PRODUCRT WITH ORDER ID:: "+oid;
	}

}
