package com.secretaria.transito.controller;

import com.secretaria.transito.interfaces.IAgenteTransito;
import com.secretaria.transito.interfaces.IInfraccion;
import com.secretaria.transito.interfaces.IVehiculo;
import com.secretaria.transito.model.AgenteTransito;
import com.secretaria.transito.model.Infraccion;
import com.secretaria.transito.model.RegistroInfraccion;
import com.secretaria.transito.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class InfraccionesController {

    @Autowired
    private IVehiculo refVehiculo;

    @Autowired
    private IAgenteTransito refAgenteTransito;

    @Autowired
    private IInfraccion refInfraccion;

    @GetMapping("/infracciones")
    public String infracciones() {
        return "infracciones";
    }

    @PostMapping("/addInfraccion")
    public ModelAndView agregarInfraccion(@ModelAttribute("infraccion") RegistroInfraccion registro) {
        ModelAndView mav = new ModelAndView("redirect:"+"/");
        mav.addObject("registro",registro);

        Optional<Vehiculo> vehiculo = refVehiculo.findById(registro.getPlacaVehiculo());
        Optional<AgenteTransito> agenteTransito = refAgenteTransito.findById(registro.getIdentificacionAgenteTransito());

        if (!vehiculo.isPresent()) {

            Infraccion infraccion = new Infraccion();
            infraccion.setFechaInfraccion(registro.getFechaInfraccion());
            infraccion.setVehiculo(vehiculo.get());

            if (!agenteTransito.isPresent()) {

                // TODO: presenta problemas por el estado anterior del método, limpiar la base de datos y volver a intentar

                AgenteTransito agenteTransitoNuevo = new AgenteTransito(
                        registro.getIdentificacionAgenteTransito(),
                        registro.getNombreAgenteTransito()
                );
                refAgenteTransito.save(agenteTransitoNuevo);
                infraccion.setAgenteTransito(agenteTransitoNuevo);
            } else {
                infraccion.setAgenteTransito(agenteTransito.get());
            }

            refInfraccion.save(infraccion);
        }

        return mav;
    }

}
