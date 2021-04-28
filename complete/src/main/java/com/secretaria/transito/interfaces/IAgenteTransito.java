package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.AgenteTransito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAgenteTransito extends JpaRepository<AgenteTransito,String> {
}
