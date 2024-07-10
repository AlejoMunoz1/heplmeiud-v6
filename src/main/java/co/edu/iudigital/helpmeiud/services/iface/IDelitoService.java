package co.edu.iudigital.helpmeiud.services.iface;

import co.edu.iudigital.helpmeiud.exceptions.NotFoundException;
import co.edu.iudigital.helpmeiud.exceptions.RestException;
import co.edu.iudigital.helpmeiud.models.Delito;

import java.util.List;

public interface IDelitoService { //Que voy a hacer

     Delito crearDelito(Delito delito) throws RestException;

     Delito actualizarDelitoPorID(Long id, Delito delito) throws RestException;

     void eliminarDelitoPorID(Long id) throws RestException;

     Delito consultarDelitoPorID(Long id) throws RestException;

     List<Delito> consultarDelitos() throws RestException;

}
