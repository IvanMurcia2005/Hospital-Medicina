package com.adso.SitioSalud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence. Id;



@Entity
public class ingreso {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="id_ingreso", nullable= false, length = 36)
	private String id_ingreso;

	@Column(name="habitacion", nullable= false, length = 2)
	private String habitacion;

	@Column(name="cama", nullable= false, length = 11)
	private int cama;

	@Column(name="paciente", nullable= false, length = 20)
	private String paciente;

	@Column(name="medico", nullable= false, length = 20)
	private String medico;

	@Column(name="fecha_ingreso", nullable= false, length = 20)
	private String fecha_ingreso;
	
	@Column(name="fecha_salida", nullable= false, length = 20)
	private String fecha_salida;

	@Column(name="estado", nullable= false, length = 20)
	private String estado;

	@Column(name="telefono", nullable= false, length = 15)
	private String telefono;

	@Column(name="correo", nullable= false, length = 200)
	private String correo;

	@Column(name="direccion", nullable= false, length = 100)
	private String direccion;
	
	@Column(name="nombre_persona_contacto", nullable= false, length = 100)
	private String nombre_persona_contacto;
	
	@Column(name="telefono_persona_contacto", nullable= false, length = 100)
	private String telefono_persona_contacto;

	public ingreso() {
		super();
	}

	public ingreso(String id_ingreso, String habitacion, int cama, String paciente, String medico, String fecha_ingreso,
			String fecha_salida, String estado, String telefono, String correo, String direccion,
			String nombre_persona_contacto, String telefono_persona_contacto) {
		super();
		this.id_ingreso = id_ingreso;
		this.habitacion = habitacion;
		this.cama = cama;
		this.paciente = paciente;
		this.medico = medico;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_salida = fecha_salida;
		this.estado = estado;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.nombre_persona_contacto = nombre_persona_contacto;
		this.telefono_persona_contacto = telefono_persona_contacto;
	}

	public String getId_ingreso() {
		return id_ingreso;
	}

	public void setId_ingreso(String id_ingreso) {
		this.id_ingreso = id_ingreso;
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public int getCama() {
		return cama;
	}

	public void setCama(int cama) {
		this.cama = cama;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre_persona_contacto() {
		return nombre_persona_contacto;
	}

	public void setNombre_persona_contacto(String nombre_persona_contacto) {
		this.nombre_persona_contacto = nombre_persona_contacto;
	}

	public String getTelefono_persona_contacto() {
		return telefono_persona_contacto;
	}

	public void setTelefono_persona_contacto(String telefono_persona_contacto) {
		this.telefono_persona_contacto = telefono_persona_contacto;
	}

	
	
	
	
	
}