package co.edu.iudigital.helpmeiud.repositories;

import co.edu.iudigital.helpmeiud.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICasoRepository extends JpaRepository<Caso, Long> {


    @Query("UPDATE Caso c SET c.visible= ?1 WHERE c.id = ?2")
    Boolean setVisible(Boolean visible, Long id);

    List<Caso> findAllByUsuarioUsername(String username);

    List<Caso> findAllByVisibleTrue();
}
