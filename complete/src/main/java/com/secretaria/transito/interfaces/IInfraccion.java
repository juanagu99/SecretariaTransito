package com.secretaria.transito.interfaces;

import com.secretaria.transito.model.Infraccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInfraccion extends JpaRepository<Infraccion,Long> {
}
