package com.edu.iudigital.helpmeiud.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTORequest {
  @NotNull(message = "Nombre no puede ser nulo")
  @NotEmpty(message = "Nombre no puede ser nulo")
  String nombre;

  String descripcion;

  @NotNull(message = "Debe proporcionar el ID del usuario")
  @JsonProperty("usuario_id")
  Long usuarioId;
}
