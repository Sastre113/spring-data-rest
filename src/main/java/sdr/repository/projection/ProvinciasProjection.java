package sdr.repository.projection;

import org.springframework.data.rest.core.config.Projection;
import sdr.entity.Provincia;

@Projection(name = "completa", types = Provincia.class)
public interface ProvinciasProjection {

  Long getId();

  String getNombre();

}
