package com.adso.SitioSalud.intefaceService;

import java.util.List;
import java.util.Optional;

import com.adso.SitioSalud.models.medico;

public interface IMedicoService {

	
	public String save(medico medico);
    public List <medico> findAll();
	public Optional<medico> findOne(String id);
	public int delete (String id);
	
}
