package com.example.entity;

public class Alumno {
	private int idalumno;
	private String nombres;
	private String apellidos;
	private String codigo;
	private String foto;
	public Alumno() {
	}
	public Alumno(int idalumno, String nombres, String apellidos, String codigo, String foto) {
		super();
		this.idalumno = idalumno;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.codigo = codigo;
		this.foto = foto;
	}
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
