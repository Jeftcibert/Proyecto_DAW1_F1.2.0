 -- borra la BD si exite --
 DROP DATABASE IF EXISTS bdVeterinaria;
 -- creamos la bases de datos
 CREATE DATABASE bdVeterinaria;
 Use bdVeterinaria;
 
 -- Creacion de las tablas para el login --
 create table tb_tipUsuario
 (
 Tip_usua int not null,	
 nomTip_usua varchar(255),
 primary key (Tip_usua)
 );
 
 create table tb_rol
 (
 cod_rol int (4),
 nomb_rol varchar(255),
 primary key (cod_rol)
 );
 
 create table tb_usuario
 (
 id int auto_increment,
 nom_usu varchar(255),
 ape_usu varchar(255),
 username_usu varchar(155),
 password_usu varchar(150) not null,
 fechRegis_usu date,
 cod_rol int(4),
 email_usu varchar(255),
 Tip_usua int,
 primary key (id),
 constraint fk_tipo foreign key (Tip_usua) references tb_tipUsuario(Tip_usua),
 constraint fk_rol foreign key (cod_rol) references tb_rol(cod_rol)
 );
 -- cobro -- 
 create table tb_cobro(
 id_cobro varchar(15),
 fecha date,
 cliente int,
 valor_total decimal(7,7),
 estado bool,
 usuario int,
 observaciones varchar(255),
 decuento decimal(7,7),
 id int,
 primary key ( id_cobro),
 constraint fk_usu foreign key (id) references tb_usuario(id)
 );
 -- cobro_detalle -- 
create table tb_cobro_detalle(
id int ,
cobro varchar(15),
producto_servicio int ,
cantidad int,
id_cobro varchar(15),
primary key (id),
constraint fk_id foreign key (id_cobro) references tb_cobro(id_cobro)
	);
-- fin --
-- ***** --
-- 1 --
-- cliente --
create table tb_cliente(
id int auto_increment,
doc_ident varchar (13),
nomb_clie varchar(50),
apel_clie varchar(50),
fech_naci date,
esta_clie bool,
direc_clie varchar(150),
telef_cli varchar(25),
correo_clie varchar(150),
genero_clie varchar(55),
fech_ingre date,
primary key (id)
);


-- especie --
create table tb_especie(
 id int auto_increment,
 descr_espe varchar (255),
 estado bool,
 primary key (id)
);

-- raza --
create table tb_raza(
id int auto_increment,
especie int,
descr_raza varchar (255),
fech_ingreso date,
primary key (id),
constraint fk_espcie foreign key(especie) references tb_especie (id)
);

create table tb_color(
id int auto_increment,
descr_color varchar (255),
primary key (id)
);

 -- mascota --
 create table tb_mascota (
 id int auto_increment,
 raza  int,
 cliente int,
 nombre varchar (155),
 fecha_nac date,
 sexo varchar(155),
 color int,
 estado bool,
 fech_ingre date,
 foto long,
 primary key(id),
 constraint fk_clie foreign key (cliente) references tb_cliente (id),
 constraint fk_raza foreign key (raza) references tb_raza (id),
 constraint fk_color foreign key (color) references tb_color(id)
 );
 -- agenda
 create table tb_agenda (
 id int auto_increment,
 fecha datetime(6),
 mascota int,
 fech_ingre datetime(6),
 estado int,
 medico int,
 primary key (id),
 constraint fk_agenda foreign key (mascota) references tb_mascota (id)
 );
 
 -- historial clinico 
 create table tb_historial_clinica (
 id int auto_increment,
 mascota int, 
 medico int,
 motivo_consul varchar(255),
 peso varchar(15),
 diagnostico varchar(350),
 prescripcion varchar(350),
 fech_ingreso datetime(6),
 usuario int, 
 estado int,
 cobro_detalle int, 
 agenda int,
 indicaciones varchar (350),
 proxima_cita datetime(6),
 primary key (id),
 constraint fk_historial foreign key (agenda) references tb_agenda (id)
 );
 
 -- tipo de vacuna
create table tb_tip_vacuna(
id int auto_increment,
descripcion varchar (255),
estado bool,
primary key (id)
);
 
 -- historial vacuna 
create table tb_historial_vacuna(
id int auto_increment,
historia_clinica int ,
vacuna int,
obsevacion varchar(255),
estado bool,
primary key (id),
constraint fk_vacuna foreign key (vacuna) references tb_tip_vacuna (id),
constraint fk_historial_clinica foreign key (historia_clinica) references tb_historial_clinica (id)
);
 
 
  use bdlaboratorio;
 
 select * from tb_usuarios;
 
 
 insert into tb_usuarios values('2','huayta','123456','jefer@gmail.com','activado','20/06/2002/','jeferson','1');
 
 
 
 
 
