package com.adso.SitioSalud.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adso.SitioSalud.models.medico;

@Repository

public interface IMedico extends CrudRepository<medico,String>{
}
