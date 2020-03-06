package com.nt.beans;
import java.util.*;

public class WishMessageGenerate 
{
	private Date date;

	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public String wishmessagegenerate(String user)
	{
		int hour=0;
		hour=date.getHours();
		if(hour<12)
		{
			return "GM:::"+user;
		}
		else if(hour<16)
		{
			return "GFN:::"+user;
		}
		else if(hour<20)
		{
			return "GEVE:::"+user;
		}
		else
		return "GN::::"+user;
		
	}
	
	
	

}
