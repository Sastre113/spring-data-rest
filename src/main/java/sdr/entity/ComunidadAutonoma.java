package sdr.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedAttributeNode;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Getter
@Setter
// No esta funcionado realmente.
@NamedEntityGraph(
    name = "ComunidadAutonoma.provincias",
    attributeNodes = @NamedAttributeNode("provincias")
)
public class ComunidadAutonoma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String nombre;

  @OneToMany(mappedBy = "comunidadAutonoma", cascade = CascadeType.ALL)
  //@RestResource(exported = false)
  private List<Provincia> provincias;

}
