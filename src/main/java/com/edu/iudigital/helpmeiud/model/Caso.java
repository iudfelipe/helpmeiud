package com.edu.iudigital.helpmeiud.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "casos")
@Getter
@Setter 
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Caso implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "fecha_hora")
  LocalDateTime fechaHora;
  
  @Column
  Float latitud;

  @Column
  Float longitud;
  
  @Column
  Float altitud;

  @Column
  String descripcion;

  @Column(name = "es_visible")
  Boolean esVisible;

  @Column(name = "url_map")
  String urlMap;

  @Column(name = "rmi_url")
  String rmiUrl;

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  Usuario usuario;

  @ManyToOne
  @JoinColumn(name = "delito_id")
  Delito delito;

  @PrePersist
  public void prePersist() {
    if(Objects.isNull(fechaHora)) {
      fechaHora = LocalDateTime.now();
    }
  }
}
