package com.spring.jdbc.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

@Component("stdDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Insert
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		//insert Query
        String query="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
    //Update
	@Override
	public int change(Student student) {
		//Updateing query
		String query="update student set name=?, city=? where id=?";
	    int r =	this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	
	//Delete
	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

    //Selecting table single row Data

	@Override
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
	    Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	// Selecting all table data
	@Override
	public List<Student> getAllStudents() {
		String query="select * from student";
	    List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
	
   //getter and setter 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
 
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

     
}
