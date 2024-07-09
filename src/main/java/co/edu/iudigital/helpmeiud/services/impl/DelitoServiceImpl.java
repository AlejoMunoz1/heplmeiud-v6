package co.edu.iudigital.helpmeiud.services.impl;

import co.edu.iudigital.helpmeiud.models.Delito;
import co.edu.iudigital.helpmeiud.repositories.IDelitoRepository;
import co.edu.iudigital.helpmeiud.services.iface.IDelitoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
public class DelitoServiceImpl implements IDelitoService { //Como lo voy a hacer

    @Autowired
    private IDelitoRepository delitoRepository;

    @Override
    public Delito creaDelito(Delito delito) {
        log.info("crearDelito DelitoService");
        return delitoRepository.save(delito);
    }

    @Transactional
    @Override
    public Delito actualizarDelitoPorID(Long id, Delito delito) {
        log.info("actualizarDelitoPorId DelitoService");
        Delito delitoBD = delitoRepository.findById(id).orElseThrow(RuntimeException::new);
        delitoBD.setNombre(delito.getNombre());
        delitoBD.setDescripcion(delito.getDescripcion());
        return delitoRepository.save(delitoBD);
    }

    @Override
    public void eliminarDelitoPorID(Long id) {
        log.info("eliminarDelitoPorId DelitoService");
        delitoRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Delito consultarDelitoPorID(Long id) {
        log.info("consultarDelitoPorId DelitoService");
        return delitoRepository.findById(id).orElseThrow(RuntimeException::new); // TODO: EXCEPCIONES PERSONALIZADAS
     }

    @Override
    public List<Delito> consultarDelitos() {
        log.info("consultarDelitos DelitoService");
        return delitoRepository.findAll();
    }
}
