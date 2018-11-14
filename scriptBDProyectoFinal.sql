CREATE TABLE STUDENT(
    id INT NOT NULL auto_increment, 
    name TEXT NOT NULL,
    entering_date DATE NOT NULL,
    nationality TEXT NOT NULL,
    code VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE EMPLEADO (
	id INT NOT NULL auto_increment,
	code VARCHAR(30),
	nombres TEXT,
	apellidos TEXT,
	direccion TEXT,
	correo TEXT,
	telefono TEXT,
	departamento TEXT,
	cargo TEXT,
	PRIMARY KEY (id)
);

CREATE TABLE INCIDENTE (
	id INT NOT NULL auto_increment,
	code VARCHAR(30),
	descripcion TEXT,
	fecha DATE,
	PRIMARY KEY (id)
);

CREATE TABLE LECCION(
	id INT NOT NULL auto_increment,
	code VARCHAR(30),
	nombre TEXT,
	descripcion TEXT,
	incidente VARCHAR(30),
	PRIMARY KEY (id)
);

CREATE TABLE NOTIFICACION(
	id INT NOT NULL auto_increment,
	code VARCHAR(30),
	descripcion TEXT,
	PRIMARY KEY (id)
);




















