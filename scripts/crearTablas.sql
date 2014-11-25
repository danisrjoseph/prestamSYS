CREATE TABLE Clientes
( clienteID INTEGER NOT NULL PRIMARY KEY,
  cedula VARCHAR(15) NOT NULL, 
  primerNombre VARCHAR(20) NOT NULL,
  primerApellido VARCHAR(20) NOT NULL,
  direccion VARCHAR(30) NOT NULL,
  telefono VARCHAR(14) NOT NULL, 
  fecha VARCHAR(23) NOT NULL, 
  ingresosMensual DECIMAL(10,2) NOT NULL, 
  activo VARCHAR(4) NOT NULL 
);
                                
CREATE TABLE Garantes
( garanteID INTEGER NOT NULL PRIMARY KEY,
  cedula VARCHAR(15) NOT NULL,
  primerNombre VARCHAR(20) NOT NULL, 
  primerApellido VARCHAR(20) NOT NULL,
  direccion VARCHAR(30) NOT NULL,
  telefono VARCHAR(14) NOT NULL,
  fecha VARCHAR(23) NOT NULL, 
  ingresosMensual DECIMAL(10,2) NOT NULL 
) ;

                
CREATE TABLE Prestamos
( prestamoID INTEGER NOT NULL PRIMARY KEY,
  clienteID INTEGER NOT NULL CONSTRAINT CLINUM_FK REFERENCES Clientes,
  garanteID INTEGER NOT NULL CONSTRAINT GARNUM_FK REFERENCES Garantes,
  gestionadorID INTEGER NOT NULL, 
  tipoGestionador VARCHAR(10) NOT NULL,                  
  monto DECIMAL(10,2) NOT NULL,
  tasa DECIMAL(10,2) NOT NULL, 
  tipo VARCHAR(10) NOT NULL,
  montoCuota DECIMAL(10,2) NOT NULL, 
  numCuotas INTEGER NOT NULL, 
  cuotasPendientes INTEGER NOT NULL, 
  montoPendiente DECIMAL(10,2) NOT NULL, 
  fecha VARCHAR(23) NOT NULL 
);

                
CREATE TABLE Agentes
( agenteID INTEGER NOT NULL PRIMARY KEY,
  password VARCHAR(10) NOT NULL, 
  cedula VARCHAR(15) NOT NULL, 
  primerNombre VARCHAR(20) NOT NULL,
  primerApellido VARCHAR(20) NOT NULL,
  direccion VARCHAR(30) NOT NULL, 
  telefono VARCHAR(14) NOT NULL, 
  horario VARCHAR(15) NOT NULL, 
  fecha VARCHAR(23) NOT NULL,                               
  salario DECIMAL(10,2) 
);

                
CREATE TABLE Ejecutivos
( ejecutivoID INTEGER NOT NULL PRIMARY KEY,
  password VARCHAR(10) NOT NULL, 
  cedula VARCHAR(15) NOT NULL, 
  primerNombre VARCHAR(20) NOT NULL,
  primerApellido VARCHAR(20) NOT NULL, 
  direccion VARCHAR(30) NOT NULL,
  telefono VARCHAR(14) NOT NULL, 
  cargo VARCHAR(15) NOT NULL, 
  fecha VARCHAR(23) NOT NULL,                        
  salario DECIMAL(10,2) 
);

                
CREATE TABLE Cobros
( cobroID INTEGER NOT NULL PRIMARY KEY,
  prestamoID INTEGER NOT NULL CONSTRAINT PRENUM_FK REFERENCES Prestamos, 
  cobradorID INTEGER NOT NULL,
  tipoCobrador VARCHAR(20) NOT NULL, 
  monto DECIMAL(10,2) NOT NULL, 
  fecha VARCHAR(23) NOT NULL 
) ; 
                                