package com.cwj.dubbo;

import com.cwj.inter.DemoService;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello:"+name);
		return "hello,"+name;
	}
	
}
