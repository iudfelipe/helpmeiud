INSERT INTO usuarios (username, nombre, apellido, password, fecha_nacimiento, enabled, image)
VALUES
(
  'facevedo',
  'Felipe', 
  'Acevedo', 
  '', 
  '1995-04-01', 
  1, 
  'https://images.ecestaticos.com/XpHlnlxZu162wj1Gpt87N8xcW8o=/0x16:987x534/600x315/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F62c%2Fe5d%2F314%2F62ce5d3141c0b670144a692b7f6a21fa.jpg'
);

INSERT INTO roles (nombre, descripcion)
VALUE ('ROLE_ADMIN', 'administrador');

INSERT INTO roles (nombre, descripcion)
VALUE ('ROLE_USER', 'usuario normal');

INSERT INTO roles_usuarios (usuarios_id, roles_id)
VALUE (1, 1);

INSERT INTO roles_usuarios (usuarios_id, roles_id)
VALUE (1, 2);

INSERT INTO delitos (nombre, descripcion, usuario_id)
VALUES ('hurto', 'Personas ajenas despojan a alguien de sus pertenencias', 1);

INSERT INTO delitos (nombre, descripcion, usuario_id)
VALUES ('homicidio', 'Una persona toma la vida de otra', 1);