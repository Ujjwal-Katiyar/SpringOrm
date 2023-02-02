package Orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDao;
import Entity.Student;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException {
		 //TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("OrmConfig.xml");
		StudentDao student1 = context.getBean("studentDao", StudentDao.class);
		Student s = new Student();
		s.setRollNo(1);
		s.setName("ujjwal");
		s.setFatherName("sachin");
		System.out.println(student1.insert(s));
	
	}

}
