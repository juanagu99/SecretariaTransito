package com.secretaria.transito.controller;

import com.secretaria.transito.interfaces.IInfraccion;
import com.secretaria.transito.interfaces.IVehiculo;
import com.secretaria.transito.model.Credencial;
import com.secretaria.transito.model.Infraccion;
import com.secretaria.transito.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoInfoController {

    @Autowired
    private IVehiculo refVehiculo;

    @Autowired
    private IInfraccion refInfraccion;

    @GetMapping("/vehiculo")
    public String vehiculoInfo(@ModelAttribute("credencial") Credencial credencial, Model model) {

        if (credencial != null) {

            if (refVehiculo.findById(credencial.getIdentificacion()).isPresent()){
                Vehiculo vehiculo = refVehiculo.findById(credencial.getIdentificacion()).get();
                List<Infraccion> infracciones = refInfraccion.findAll();
                List<Infraccion> infraccionesVehiculo = new ArrayList<Infraccion>();
                for (Infraccion inf : infracciones) {
                    if (inf.getVehiculo().equals(vehiculo)) {
                        infraccionesVehiculo.add(inf);
                    }
                }
                model.addAttribute("vehiculo", vehiculo);
                model.addAttribute("infracciones", infraccionesVehiculo);
                return "vehiculoInfo";
            }
        }
        return "search";
    }
}
