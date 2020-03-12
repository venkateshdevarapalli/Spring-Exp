package com.nt.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.flipcart;

public class LCOU_Test
{

	public static void main(String[] args) 
	{
		flipcart fp=null;
		Resource res=null;
		BeanFactory fact=null;
		
		res=new ClassPathResource("com/nt/cfg/applicationcontext.xml");
		fact=new XmlBeanFactory(res);
		fp=fact.getBean("fpk",flipcart.class);
    	String billmsg=fp.shopping(new String[]{"bat","ball","pad"}, new float[]{1000.0f,500.0f,1500.0f});
		System.out.println("BILLMESSAGE:::"+billmsg);
		
		
		
		
		

	}

}
