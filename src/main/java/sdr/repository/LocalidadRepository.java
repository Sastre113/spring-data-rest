package sdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdr.entity.Localidad;

public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
}
