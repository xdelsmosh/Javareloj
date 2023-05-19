# Javareloj
reloj que necesita conexión  a base de datos
base de datos:
CREATE DATABASE IF NOT EXISTS db_tiendae;
use db_tiendae;

CREATE TABLE reloj
(
id int not null auto_increment,
nombre_cliente varchar (30),
rut_clientte varchar (30),
ventas int not null,
correo varchar (30),
primary key(id)
);
