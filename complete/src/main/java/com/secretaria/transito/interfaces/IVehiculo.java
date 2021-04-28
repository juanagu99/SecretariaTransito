package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculo extends JpaRepository<Vehiculo,String> {
}