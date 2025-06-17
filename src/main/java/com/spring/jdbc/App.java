package com.spring.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Progaram started...!" );
        //spring jdbc => Jdbc tamplate
        
      
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       

        StudentDao studentDao = context.getBean("stdDao", StudentDao.class);
        
        
        //INSERT DATA
        
//        Student student = new Student();
//        student.setId(109);
//        student.setName("Ganesh");
//        student.setCity("Pune");
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println("student added "+ result);
        
        
        
        //UPDATE DATA
        
//        Student student = new Student();
//        student.setId(103);
//        student.setName("Vivek chavan");
//        student.setCity("Nashik");
//        
//        
//        int result = studentDao.change(student);
//        
//        System.out.println("Data Changed "+ result);
        
        
        
         //Dalete Data
        System.out.println("Enter The Student Id for delete : ");
         Scanner sc = new Scanner(System.in);
         int id = sc.nextInt();
         
         //int result = studentDao.delete(108);
         int result = studentDao.delete(id);
      
         System.out.println("Student Deleteded " + result);
        
        
    }
}
