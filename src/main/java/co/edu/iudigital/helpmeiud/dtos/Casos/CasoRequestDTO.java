package co.edu.iudigital.helpmeiud.dtos.Casos;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
public class CasoRequestDTO {

    LocalDateTime fechaHora;

    Float latitud;

    Float longitud;

    Float altitud;

    String descripcion;

    String urlMapa;

    String rmiUrl;

    @NotNull(message = "usuario ID requerido")
    Long usuarioId;

    @NotNull(message = "delito ID requerido")
    Long delitoId;
}
