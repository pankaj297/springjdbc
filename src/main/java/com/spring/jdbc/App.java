package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        
      
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//       
        

		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);
       

        StudentDao studentDao = context.getBean("stdDao", StudentDao.class);
        
        
        //INSERT DATA
        
        Student student = new Student();
        student.setId(10101);
        student.setName("Pankaj Naik");
        student.setCity("Malkheda");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added "+ result);
        
        
        
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
//        System.out.println("Enter The Student Id for delete : ");
//         Scanner sc = new Scanner(System.in);
//         int id = sc.nextInt();
//         
//         //int result = studentDao.delete(108);
//         int result = studentDao.delete(id);
//      
//         System.out.println("Student Deleteded " + result);
        
        
          //Selecting One row data
//           Student student = studentDao.getStudent(107);
//           System.out.println(student);
//        
        
           //Selecting all data
           List<Student> students = studentDao.getAllStudents();
           for(Student s:students) {
        	   System.out.println(s);
           }
        
    }
}
