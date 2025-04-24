package campeonatosfifa.api.presentacion.controladores;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.core.servicios.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    @Autowired
    private ISeleccionServicio servicio;

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Seleccion> listar(){
        return servicio.listar();
    }
   
    @GetMapping("/obtener/{id}")
    public Seleccion obtener(@PathVariable int id){
        return servicio.obtener(id);
    }

    @GetMapping("/buscar/{nombre}")
    public List<Seleccion> buscar(@PathVariable String nombre){
        return servicio.buscar(nombre);
    }

}
