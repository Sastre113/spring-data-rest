
# Proyecto de Ejemplo: Spring Data REST con Proyecciones

Este proyecto es un ejemplo práctico para aprender y experimentar con **Spring Data REST**, mostrando cómo exponer entidades JPA como endpoints RESTful, trabajar con proyecciones y resolver problemas relacionados, como el **problema del N+1**.

---

## Características

- Exposición automática de repositorios JPA como endpoints RESTful con Spring Data REST.
- Uso de **proyecciones** para personalizar las respuestas REST.
- Resolución del **problema N+1** con estrategias como `@EntityGraph`.
- Ejemplo de estructura básica de entidades relacionadas: **Comunidades Autónomas**, **Provincias** y **Localidades**.
- Configuración de relaciones `OneToMany` con carga optimizada de datos.
- Documentación Swagger/OpenAPI para interactuar con los endpoints.

---

## Tecnologías Utilizadas

- **Java 17**: Lenguaje principal.
- **Spring Boot 3.x**: Framework para la creación de aplicaciones.
- **Spring Data JPA**: Acceso a bases de datos relacionales con JPA.
- **Spring Data REST**: Exposición de repositorios como APIs RESTful.
- **H2 Database**: Base de datos en memoria para pruebas.
- **Springdoc OpenAPI**: Documentación automática de APIs.

---

## Estructura del Proyecto

### Entidades

- **ComunidadAutonoma**: Representa una comunidad autónoma.
- **Provincia**: Representa una provincia relacionada con una comunidad autónoma.
- **Localidad**: Representa una localidad relacionada con una provincia.

### Relación entre Entidades

- **ComunidadAutonoma**: `@OneToMany` → **Provincia**.
- **Provincia**: `@OneToMany` → **Localidad**.

---

## Proyecciones

1. **ComunidadAutonomaProjection**:
   - Muestra el nombre de la comunidad autónoma y las provincias asociadas.
   - Ejemplo:
     ```json
     {
       "nombre": "Andalucía",
       "provincias": [
         { "nombre": "Sevilla" },
         { "nombre": "Córdoba" }
       ]
     }
     ```

2. **ProvinciasProjection**:
   - Muestra información básica de las provincias relacionadas con la comunidad autónoma.

---

## Resolución del Problema N+1

El problema N+1 ocurre cuando Hibernate realiza múltiples consultas para cargar relaciones. En este proyecto se resuelve mediante:
- **Uso de `@EntityGraph`**: Carga todas las relaciones necesarias en una sola consulta optimizada.
- **Consultas personalizadas con `@Query`**: Mejora el control de las consultas y evita cargas innecesarias.

---

## Instalación y Uso

### Prerrequisitos
- Java 17
- Maven 3.8+

### Pasos para Ejecutar
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/spring-data-rest-ejemplo.git
   cd spring-data-rest-ejemplo
   ```
2. Compila y ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```
3. Accede a la aplicación en tu navegador:
   - Swagger UI: [http://localhost:8113/swagger-ui.html](http://localhost:8113/swagger-ui.html)
   - H2 Console: [http://localhost:8113/h2-console](http://localhost:8113/h2-console)

---

## Endpoints Principales

### Endpoints RESTful
- **Comunidades Autónomas**:
  - `GET /comunidadAutonomas`: Lista todas las comunidades autónomas.
  - `GET /comunidadAutonomas?projection=completa`: Devuelve comunidades autónomas con sus provincias embebidas.
- **Provincias**:
  - `GET /provincias`: Lista todas las provincias.

### OpenAPI/Swagger
Accede a la documentación de la API en [http://localhost:8113/swagger-ui.html](http://localhost:8113/swagger-ui.html).

---

## Problemas Resueltos

### Problema N+1
El proyecto muestra cómo usar `@EntityGraph` para evitar múltiples consultas y optimizar la carga de relaciones.

---

## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes ideas o encuentras problemas, no dudes en abrir un **issue** o un **pull request**.

---

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

¡Explora el código y experimenta con Spring Data REST! 🚀
[[
