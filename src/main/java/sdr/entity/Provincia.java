package sdr.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Provincia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "comunidad_autonoma_id", nullable = false)
  private ComunidadAutonoma comunidadAutonoma;

  @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Localidad> localidades;

}
