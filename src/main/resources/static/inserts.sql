--ROLES
INSERT INTO roles (id, nombre, descripcion)
VALUES (1, 'ADMIN', 'Usuario administrador');

INSERT INTO roles (id, nombre, descripcion)
VALUES (2, 'USER', 'Usuario normal');

--USUARIOS
INSERT INTO usuarios
(id, username, nombre, apellido, password, fecha_nacimiento, enabled, red_social, image)
VALUES
(1, 'alejandro.munoz@est.iudigital.edu.co', 'Alejandro', 'Muñoz',
 '', '2002-11-02', 1, 0,
 'https://definicion.de/wp-content/uploads/2019/07/perfil-de-usuario.png');

--ASIGNAR ROL A USER
INSERT INTO roles_usuarios(usuarios_id, roles_id)
VALUES
(1, 1);
INSERT INTO roles_usuarios(usuarios_id, roles_id)
VALUES
(1, 2);