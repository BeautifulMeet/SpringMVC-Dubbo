package com.cwj.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProvider.xml");
		context.start();
		
		System.out.println("-----dubbo开启-----");
		
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟

	}


}
