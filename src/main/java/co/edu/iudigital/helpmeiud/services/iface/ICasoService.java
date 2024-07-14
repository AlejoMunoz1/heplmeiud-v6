package co.edu.iudigital.helpmeiud.services.iface;

import co.edu.iudigital.helpmeiud.dtos.Casos.CasoRequestDTO;
import co.edu.iudigital.helpmeiud.dtos.Casos.CasoResponseDTO;
import co.edu.iudigital.helpmeiud.exceptions.RestException;

import java.util.List;

public interface ICasoService {

    List<CasoResponseDTO> consultarCasos() throws RestException;

    List<CasoResponseDTO> consultarCasosVisibles() throws RestException;

    List<CasoResponseDTO> consultarCasosPorUsuario(String username) throws RestException;

    CasoRequestDTO consultarCasoPorId(Long id) throws RestException;

    CasoResponseDTO guardarCaso(CasoRequestDTO caso) throws RestException;

    Boolean visibilizar(Boolean visible, Long id) throws RestException;


}
