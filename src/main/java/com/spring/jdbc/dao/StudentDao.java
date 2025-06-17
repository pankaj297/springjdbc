package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
  //Insert 	
  public int insert(Student student);
  //Update / Change Data
  public int change(Student student);
  //Delete Data
  public int delete(int studentId);
  //get table row data
  public Student getStudent(int studentId);
  
  //get all table data
  public List<Student>  getAllStudents();
  
}
