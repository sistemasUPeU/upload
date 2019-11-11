package com.example.dao;

import com.example.entity.Alumno;

public interface AlumnoDao {
	Alumno read(int id);
	int update(Alumno a);
}
