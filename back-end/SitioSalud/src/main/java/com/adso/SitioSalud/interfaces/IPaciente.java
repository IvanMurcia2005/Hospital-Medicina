package com.adso.SitioSalud.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adso.SitioSalud.models.paciente;

@Repository

public interface IPaciente extends CrudRepository<paciente,String>{
}
