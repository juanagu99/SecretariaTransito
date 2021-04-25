package com.secretaria.transito.controller;

import com.secretaria.transito.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsertController {

    @GetMapping("/insert")
    public String home() {
        return "insert";
    }

    @PostMapping("/post")
    public ModelAndView post(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        ModelAndView mav = new ModelAndView("redirect:"+"/"); //por el momento se redirecciona a la pagina de inicio
        mav.addObject("vehiculo",vehiculo);
        System.out.println(vehiculo.toString());
        //Aqui se debe de hacer la insercíon de la BD
        return mav;
    }


}
