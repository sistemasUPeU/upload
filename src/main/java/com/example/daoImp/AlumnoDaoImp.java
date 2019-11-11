package com.example.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.AlumnoDao;
import com.example.entity.Alumno;
@Repository
public class AlumnoDaoImp implements AlumnoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM alumno WHERE idalumno =?"; 
		return (Alumno)jdbcTemplate.queryForObject(SQL, new Object[]{id}, BeanPropertyRowMapper.newInstance(Alumno.class));
	}

	@Override
	public int update(Alumno a) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE alumno SET foto=? WHERE idalumno=?";
		return jdbcTemplate.update(SQL,a.getFoto(), a.getIdalumno());
	}

}
