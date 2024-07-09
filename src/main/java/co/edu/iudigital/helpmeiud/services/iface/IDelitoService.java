package co.edu.iudigital.helpmeiud.services.iface;

import co.edu.iudigital.helpmeiud.models.Delito;

import java.util.List;

public interface IDelitoService { //Que voy a hacer

     Delito creaDelito(Delito delito);

     Delito actualizarDelitoPorID(Long id, Delito delito);

     void eliminarDelitoPorID(Long id);

     Delito consultarDelitoPorID(Long id);

     List<Delito> consultarDelitos();

}
