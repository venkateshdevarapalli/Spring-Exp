package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.flipcart;

public class Payment_Test {

	public static void main(String[] args) 
	{
		flipcart fp=null;
		Resource res=null;
		BeanFactory fact=null;
		
		//creating resource object to hold the location and name of the bean-cfg file
		res=new ClassPathResource("com/nt/cfg/applicationcontext.xml");
		
		//creating IOC -container  with xml-bean-factory method
		fact=new XmlBeanFactory(res);
		
		//Getting the dependent class object by calling the getBean()method
		fp=fact.getBean("fpk",flipcart.class);
		
		//calling the target class-method with dynamic array initialization
    	String billmsg=fp.shopping(new String[]{"bat","ball","pad"}, new float[]{1000.0f,500.0f,1500.0f});
    	
    	//printing the bill-detials
		System.out.println("BILLMESSAGE:::"+billmsg);
		
	}

}
