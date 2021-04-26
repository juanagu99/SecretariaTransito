package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.TipoDocumento;
import com.secretaria.transito.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumento extends JpaRepository<TipoDocumento,Integer> {
}