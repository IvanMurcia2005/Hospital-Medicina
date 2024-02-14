package com.adso.SitioSalud.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adso.SitioSalud.models.ingreso;

@Repository

public interface IIngreso extends CrudRepository<ingreso,String>{
}
