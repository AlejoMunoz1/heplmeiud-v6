package co.edu.iudigital.helpmeiud.repositories;

import co.edu.iudigital.helpmeiud.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICasoRepository extends JpaRepository<Caso, Long> {

    List<Caso> findAllByLatitud(Float latitud);

    Boolean setVisible(Boolean visible, Long id);
}
