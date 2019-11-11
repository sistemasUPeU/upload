package com.example.service;

import com.example.entity.Alumno;

public interface AlumnoService {
	Alumno read(int id);
	int update(Alumno a);

}
