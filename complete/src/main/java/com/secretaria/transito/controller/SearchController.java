package com.secretaria.transito.controller;

import com.secretaria.transito.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
