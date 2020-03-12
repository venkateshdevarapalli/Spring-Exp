//dependent class
package com.nt.beans;

public class PAYTM implements PaymentOption
{

	public PAYTM() 
	{
		System.out.println("PAYTMs::: Zero-Parm-Cons-->PAYTM()");
		
	}

	@Override
	public String pay(int oid) 
	{
		return "PAYTM is USED to PAY THE AMOUNT FOR OID:::"+oid;
		
	}

}
