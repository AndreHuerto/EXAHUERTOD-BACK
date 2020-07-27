package com.edu.EXAHUERTODBACK.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.EXAHUERTODBACK.dao.LibroDao;
import com.edu.EXAHUERTODBACK.entity.Libro;
import com.edu.EXAHUERTODBACK.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao libroDao;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return libroDao.readAll();
	}
	
}
