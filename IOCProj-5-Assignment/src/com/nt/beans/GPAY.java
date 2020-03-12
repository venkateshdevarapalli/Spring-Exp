//Dependent class
package com.nt.beans;

public class GPAY implements PaymentOption 
{
	

	public GPAY()
	{
		System.out.println("GPAYs::::Zero-parm-cons--> GPAY()");
		
	}

	@Override
	public String pay(int oid)
	{
		return "GPAY IS  USED TO PAY BILL FOR:::"+oid;
		
				
			
	}

}
