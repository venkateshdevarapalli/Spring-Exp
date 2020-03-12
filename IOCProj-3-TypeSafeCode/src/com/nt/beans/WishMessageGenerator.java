package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator
{
	 private Date date;

	public WishMessageGenerator(Date date) 
	{
		super();
		this.date = date;
		
	}
	
	public String wishMessage(String user)
	{
		int hours=0;
		hours=date.getHours();
		if(hours<12) 
		{
			return  "Good moring::::"+user;
		}
		else if(hours<16)
		{
			return "Good Afternoon::::"+user;
		}
		else if(hours<20)
		{
			return "Good Evening::::"+user;
		}
		return "Good Night:::::"+user;
		
	}

}
