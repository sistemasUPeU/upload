package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.AlumnoDao;
import com.example.entity.Alumno;

@SpringBootTest
class UploadApplicationTests {
	@Autowired
	AlumnoDao alumnoDao;
	@Test
	void contextLoads() {
		assertTrue(alumnoDao.read(1)!=null);
	}
	@Test
	void modificar() {
		Alumno a = new Alumno();
		a.setIdalumno(1);
		a.setFoto("83efb426-81ad-4477-a2b8-faab5816f370_imagen.jpg");
		assertTrue(alumnoDao.update(a)==1);
	}

}
