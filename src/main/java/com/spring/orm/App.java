package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student=new Student(5,"Priyanshu", "abc");
//        int r=studentDao.insert(student);
//        System.out.println(r+" Rows Inserted...");	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for add new student");
			System.out.println("Press 2 for display all student");
			System.out.println("Press 3 for detail of 1 student");
			System.out.println("Press 4 for delete student");
			System.out.println("Press 5 for EXIT");
			try {

				int input = Integer.parseInt(br.readLine());
//        	if(input==1) {
//        		
//        	}else if(input==2) {
//        		
//        	}

				switch (input) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					go = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thanku for using my application...");
	}
}
