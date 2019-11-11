package com.example.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AlumnoDao;
import com.example.entity.Alumno;
import com.example.service.AlumnoService;
@Service
public class AlumnoServiceImp implements AlumnoService{
	@Autowired
	private AlumnoDao alumnoDao;
	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		return  alumnoDao.read(id);
	}

	@Override
	public int update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoDao.update(a);
	}
	
}
