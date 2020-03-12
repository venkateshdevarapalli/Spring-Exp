//target class
package com.nt.beans;


	import java.util.Arrays;
	import java.util.Random;

	public class flipcart 
	{
		private PaymentOption po=null;
		
		
		public void setPo(PaymentOption po) {
			this.po = po;
		}

		Random ran;
		int orderid=0;
		float bill=0.0f;
		
		
		public flipcart() 
		{
			System.out.println("flipcart::Zero-parm-cons is -->flipcart()");
			
		}
		
		public String shopping(String items[],float price[])
		{
			for(float amount:price)
			{
				bill=bill+amount;
			}
			ran=new Random();
			orderid=ran.nextInt(1000);
			
			String status=po.pay(orderid);
			System.out.println(status);
			
			return "OrderId id-->"+orderid
					+"--> Items List"+Arrays.toString(items)
					+"--->Price"+Arrays.toString(price)
					+"BillAmount-->"+bill;
			
			
		}
		

}
