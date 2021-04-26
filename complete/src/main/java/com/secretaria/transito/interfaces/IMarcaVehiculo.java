package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.MarcaVehiculo;
import com.secretaria.transito.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaVehiculo extends JpaRepository<MarcaVehiculo,Integer> {
}