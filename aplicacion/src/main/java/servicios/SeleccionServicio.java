package campeonatosfifa.api.aplicacion.servicios;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.core.servicios.*;
import campeonatosfifa.api.infraestructura.repositorios.*;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    @Autowired
    private ISeleccionRepositorio repositorio;

    public List<Seleccion> listar(){
        return repositorio.findAll();
    }

    public Seleccion obtener(int id){
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    public List<Seleccion> buscar(String nombre){
        return repositorio.buscar(nombre);
    }

    public Seleccion agregar(Seleccion pais){
        pais.setId(0);
        return repositorio.save(pais);
    }

    public Seleccion modificar(Seleccion pais){
        if(repositorio.findById(pais.getId()).isEmpty())
            return null;
        return repositorio.save(pais);
    }

    public boolean eliminar(int id){
        try{
            repositorio.deleteById(id);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
