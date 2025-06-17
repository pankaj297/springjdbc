package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class jdbcconfig {

	@Bean(name = {"ds" })
	public DataSource getDataSource() 
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("PN1807@mysql");
		return ds;
	}
	
	@Bean(name = {"jdbcT" })
	public JdbcTemplate getTemplate() 
	{
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	
//	@Bean(name = {"stdDao" })
//	public StudentDao getStudentDao() {
//		StudentDaoImpl std = new StudentDaoImpl();
//		std.setJdbcTemplate(getTemplate());
//		return std;
//	}
//this code don't need beacuse of autowired
}
