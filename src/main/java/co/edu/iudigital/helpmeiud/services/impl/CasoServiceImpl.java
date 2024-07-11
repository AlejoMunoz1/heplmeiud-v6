package co.edu.iudigital.helpmeiud.services.impl;

import co.edu.iudigital.helpmeiud.dtos.Casos.CasoRequestDTO;
import co.edu.iudigital.helpmeiud.dtos.Casos.CasoResponseDTO;
import co.edu.iudigital.helpmeiud.exceptions.ErrorDto;
import co.edu.iudigital.helpmeiud.exceptions.InternalServerErrorException;
import co.edu.iudigital.helpmeiud.exceptions.RestException;
import co.edu.iudigital.helpmeiud.models.Caso;
import co.edu.iudigital.helpmeiud.repositories.ICasoRepository;
import co.edu.iudigital.helpmeiud.services.iface.ICasoService;
import co.edu.iudigital.helpmeiud.utils.CasoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CasoServiceImpl implements ICasoService {

    @Autowired
    private ICasoRepository casoRepository;
    @Autowired
    private CasoMapper casoMapper;

    @Override
    public List<CasoResponseDTO> consultarCasos() throws RestException {
        log.info("consultarCasos CasoServiceImpl");
        try {
            final List<Caso> casos = casoRepository.findAll();
            final List<CasoResponseDTO> casoResponseDTOList =
                    casoMapper.toCasoResponseDTOList(casos);
            return casoResponseDTOList;
        }catch (Exception e) {
            throw new InternalServerErrorException(
                    ErrorDto.builder()
                            .error("Error general")
                            .status(500)
                            .message(e.getMessage())
                            .date(LocalDateTime.now())
                            .build()
            );
        }
    }


    @Override
    public List<CasoResponseDTO> consultarCasosVisibles() throws RestException {
        return null;
    }

    @Override
    public List<CasoResponseDTO> consultarCasosPorUsuario(String username) throws RestException {
        return null;
    }

    @Override
    public CasoRequestDTO consultarCasoPorId(Long id) throws RestException {
        return null;
    }

    @Override
    public CasoRequestDTO guardarCaso(CasoRequestDTO caso) throws RestException {
        return null;
    }

    @Override
    public Boolean visibilizar(Boolean visible, Long id) throws RestException {
        return null;
    }
}
