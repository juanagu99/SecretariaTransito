package com.secretaria.transito.controller;

import com.secretaria.transito.interfaces.ICliente;
import com.secretaria.transito.interfaces.IVehiculo;
import com.secretaria.transito.model.Credencial;
import com.secretaria.transito.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class VehiculoInfoController {

    @Autowired
    private IVehiculo refVehiculo;

    @GetMapping("/vehiculo")
    public String vehiculoInfo(@ModelAttribute("credencial") Credencial credencial, Model model) {
        if (credencial != null) {
            if (refVehiculo.findById(credencial.getIdentificacion()).isPresent()){
                Vehiculo vehiculo = refVehiculo.findById(credencial.getIdentificacion()).get();
                model.addAttribute("vehiculo", vehiculo);
            }
        }
        return "vehiculoInfo";
    }
}
