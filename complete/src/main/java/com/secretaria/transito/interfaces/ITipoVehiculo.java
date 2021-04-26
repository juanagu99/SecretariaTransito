package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculo extends JpaRepository<Vehiculo,Integer> {
}