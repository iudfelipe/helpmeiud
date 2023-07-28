package com.edu.iudigital.helpmeiud.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "usuarios")
@Getter
@Setter 
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Usuario implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "username", unique = true, length = 120, nullable = false)
  String username;

  @Column(name = "nombre", nullable = false, length = 120)
  String nombre;

  @Column(name = "apellido", length = 120)
  String apellido;

  @Column
  String password;

  @Column(name = "red_social")
  Boolean redSocial;

  @Column(name = "fecha_nacimiento")
  LocalDate fechaNacimiento;

  @Column
  Boolean enabled;

  String image;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "roles_usuarios",
    joinColumns = {@JoinColumn(name = "usuarios_id")},
    inverseJoinColumns = {@JoinColumn(name = "roles_id")}
  )
  List<Role> roles;
}
