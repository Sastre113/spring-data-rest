package sdr.repository;

import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sdr.entity.ComunidadAutonoma;
import sdr.repository.projection.ComunidadAutonomaProjection;

@RepositoryRestResource(excerptProjection = ComunidadAutonomaProjection.class)
public interface ComunidadAutonomaRepository extends JpaRepository<ComunidadAutonoma, Long> {

  @EntityGraph("ComunidadAutonoma.provincias")
  List<ComunidadAutonoma> findAll();
}
