package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.vehicle;

public class engineTest {

	public static void main(String[] args)
	{
		vehicle veh=null;
		Resource res=null;
		BeanFactory fact=null;
		
		res= new ClassPathResource("com/nt/cfg/applicationcontext.xml");
		
		fact=new XmlBeanFactory(res);
		
		veh=fact.getBean("vehicle",vehicle.class);
		
		veh.jurney("hyd", "bapatla");
		

	}

}
