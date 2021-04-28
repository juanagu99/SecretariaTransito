package com.secretaria.transito.controller;

import com.secretaria.transito.interfaces.ICliente;
import com.secretaria.transito.interfaces.IVehiculo;
import com.secretaria.transito.model.Cliente;
import com.secretaria.transito.model.Credencial;
import com.secretaria.transito.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
