//dependent class
package com.nt.beans;

public class PHPAY implements PaymentOption 
{
	

	public PHPAY() 
	{
		System.out.println("PHPAYs::ZERO-Parm-Cons-->PHPAY()");
	}

	@Override
	public String pay(int oid)
	{
		
		return "PHPAY is USED TO PAY THE AMOUNT FOR OID::::"+oid;
	}

}
