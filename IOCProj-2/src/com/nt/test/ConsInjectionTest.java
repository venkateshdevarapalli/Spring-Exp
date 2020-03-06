package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConsInjectionTest {

	public static void main(String[] args)
	{
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator gen=null;
		Object obj=null;
		
		res=new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml");
		
		factory=new XmlBeanFactory(res);
		
		obj=factory.getBean("msg");
		
		gen=(WishMessageGenerator)obj;
		
		System.out.println("Result is :::"+gen.wishMessage("venkatesh"));
		
		
		

	}

}
