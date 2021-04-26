package com.secretaria.transito.controller;

import com.secretaria.transito.interfaces.*;
import com.secretaria.transito.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Controller
public class InsertController {

    /*..
        Referencias a las tablas de la base de datos
      .*/
    @Autowired
    private IVehiculo refVehiculo;
    @Autowired
    private ITipoVehiculo refTipoVehiculo;
    @Autowired
    private IMarcaVehiculo refMarcaVehiculo;
    @Autowired
    private ICliente refCliente;
    @Autowired
    private ITipoDocumento refTipoDocumento;

    /*..
       @author: Juan Pablo Agudelo
       @param: Model -> corresponde a el modelo que se le enviará a la vista al llamar el controlador insert
       @return: View
       .*/
    @GetMapping("/insert")
    public String home(Model model) {
        model.addAttribute("tipo_documento",refTipoDocumento.findAll());
        model.addAttribute("tipo_vehiculo",refTipoVehiculo.findAll());
        model.addAttribute("marcas",refMarcaVehiculo.findAll());
        return "insert";
    }

    /*..
       @author: Juan Pablo Agudelo
       @param: ModelAttribute -> corresponde a el nombre del modelo en la vista
       @param: RegistroAutomovil -> corresponde a el objeto al que se va bindiar la información del modelo
       @return: ModelAndView
       .*/
    @PostMapping("/post")
    public ModelAndView post(@ModelAttribute("registro") RegistroAutomovil registro) {
        ModelAndView mav = new ModelAndView("redirect:"+"/"); //se utiliza para redireccionar el usuario al inicio de pagina
        mav.addObject("registro",registro);//se bindea el ModelAttribute con el objeto registro
        /*..
        Se obtiene cada uno de los valores de la base de datos (Tipo de vehiculo,marca del vehiculo,
        tipo del documento)
        .*/
        TipoVehiculo tipoVehiculo = refTipoVehiculo.getOne(Integer.parseInt(registro.getTipoVehiculo()));
        MarcaVehiculo marcaVehiculo = refMarcaVehiculo.getOne(Integer.parseInt(registro.getIdMarcaVehiculo()));
        TipoDocumento tipoDocumento = refTipoDocumento.getOne(Integer.parseInt(registro.getIdTipoDocumento()));
        /*..
        Se crea el cliente y seguidamente se crea el vehiculo
        .*/
        Cliente cliente = new Cliente();
        cliente.setTipoDocumentoCliente(tipoDocumento);
        cliente.setIdentificacion(registro.getIdentificacion());
        cliente.setNombre(registro.getNombre());
        cliente.setDireccion(registro.getDireccion());
        refCliente.save(cliente);
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca(registro.getPlaca());
        vehiculo.setTipoVehiculo(tipoVehiculo);
        vehiculo.setMarca(marcaVehiculo);
        vehiculo.setFechaMatricula(registro.getFechaMatricula());
        vehiculo.setCliente(cliente);
        System.out.println(vehiculo.toString());
        refVehiculo.save(vehiculo);
        /*..
        Se retorna una vista
        .*/
        return mav;
    }

}
