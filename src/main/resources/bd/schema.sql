CREATE TABLE comunidad_autonoma (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE provincia (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE,
    comunidad_autonoma_id BIGINT NOT NULL,
    CONSTRAINT fk_comunidad FOREIGN KEY (comunidad_autonoma_id) REFERENCES comunidad_autonoma(id)
);

CREATE TABLE localidad (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE,
    provincia_id BIGINT NOT NULL,
    CONSTRAINT fk_provincia FOREIGN KEY (provincia_id) REFERENCES provincia(id)
);
