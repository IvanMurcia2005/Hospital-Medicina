package com.adso.SitioSalud.intefaceService;

import java.util.List;
import java.util.Optional;

import com.adso.SitioSalud.models.paciente;

public interface IPacienteService {

	
	public String save(paciente paciente);
    public List <paciente> findAll();
	public Optional<paciente> findOne(String id);
	public int delete (String id);
	
}
