package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculo extends CrudRepository<Vehiculo,Integer> {
}
