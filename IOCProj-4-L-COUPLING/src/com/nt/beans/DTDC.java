package com.nt.beans;

public class DTDC implements courier 
{
	
	public DTDC() 
	{
		
		System.out.println("DTDC::: Zero-parm-cons-->DTDC(--)");
		
	}

	@Override
	public String delivery(int oid) 
	{
		
		return "DTDC is REDY TO  DELIVERY THE PRODUCT :ORDER ID"+oid;
	}

}
