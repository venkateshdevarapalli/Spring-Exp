package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerate;

public class setterinjectiontest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerate generate=null;
		
		res=new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml");
		factory =new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		//type-casting 
		generate=(WishMessageGenerate)obj;
		System.out.println("result is::"+generate.wishmessagegenerate("venkatesh"));
		
	}

}
