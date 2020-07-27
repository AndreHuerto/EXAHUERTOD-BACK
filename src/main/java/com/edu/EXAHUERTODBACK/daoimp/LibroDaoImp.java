package com.edu.EXAHUERTODBACK.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edu.EXAHUERTODBACK.dao.LibroDao;
import com.edu.EXAHUERTODBACK.entity.Libro;
@Repository
public class LibroDaoImp implements LibroDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Libro> readAll() {
		
		return jdbctemplate.query("select * from libros",  BeanPropertyRowMapper.newInstance(Libro.class));
	}

}
