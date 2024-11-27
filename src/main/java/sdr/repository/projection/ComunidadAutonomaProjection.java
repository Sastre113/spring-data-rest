package sdr.repository.projection;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;
import sdr.entity.ComunidadAutonoma;
import sdr.entity.Provincia;

@Projection(name = "completa", types = ComunidadAutonoma.class)
public interface ComunidadAutonomaProjection {

  Long getId();

  String getNombre();

  List<Provincia> getProvincias();
}
