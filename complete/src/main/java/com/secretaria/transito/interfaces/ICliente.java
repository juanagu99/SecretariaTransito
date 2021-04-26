package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends JpaRepository<Cliente,Integer> {
}