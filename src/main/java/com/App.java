package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AuthorBean;
import com.bean.BookBean;
import com.bean.StudentBean;
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		BookBean b1 = context.getBean("bookBean",BookBean.class);
		BookBean b2 = context.getBean("bookBean",BookBean.class);
		
		System.out.println(b1);
		System.out.println(b2);
		
//		System.out.println(context);
//		StudentBean s1 = context.getBean("studentBean",StudentBean.class);
//		StudentBean s2 = context.getBean("studentBean",StudentBean.class);
//
//		System.out.println(s1);
//		System.out.println(s2);
	}
}
