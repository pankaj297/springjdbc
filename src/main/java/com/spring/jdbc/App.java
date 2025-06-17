package com.spring.jdbc;

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
        
        Student student = new Student();
        student.setId(109);
        student.setName("Ganesh");
        student.setCity("Pune");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added "+ result);
        
    }
}
