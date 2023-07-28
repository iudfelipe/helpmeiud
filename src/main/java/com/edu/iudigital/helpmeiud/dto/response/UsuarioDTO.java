package com.edu.iudigital.helpmeiud.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTO {

  String username;

  String nombre;

  String apellido;

  Boolean redSocial;

  LocalDate fechaNacimiento;

  Boolean enabled;

  String image;

  Long roleId;
}
