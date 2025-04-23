import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.core.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    @Autowired
    private ISeleccionServicio servicio;

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Seleccion> listar(){
        return servicio.listar();
    }

}
