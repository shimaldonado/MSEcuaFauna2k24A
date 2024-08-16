-- database: ../MSDataBase/SMEcuaFauna.db
/*
Autor: Maldonado Shirley
Fecha: 16.agosto.2024
Script: Insertar Datos
*/
INSERT INTO MSPais (nombre) VALUES ('Ecuador');

INSERT INTO MSRegion (nombre, paisID) VALUES ('Costa', 1);
INSERT INTO MSRegion (nombre, paisID) VALUES ('Sierra', 1);
INSERT INTO MSRegion (nombre, paisID) VALUES ('Oriente', 1);
INSERT INTO MSRegion (nombre, PaisID) VALUES ('Galápagos', 1);

-- Costa
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Guayas', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Manabí', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Esmeraldas', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('El Oro', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Los Ríos', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Santa Elena', 1);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Santo Domingo de los Tsáchilas', 1);

-- Sierra
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Pichincha', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Azuay', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Imbabura', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Loja', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Carchi', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Cotopaxi', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Chimborazo', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Tungurahua', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Bolívar', 2);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Cañar', 2);

-- Oriente
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Pastaza', 3);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Napo', 3);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Morona Santiago', 3);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Orellana', 3);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Sucumbíos', 3);
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Zamora Chinchipe', 3);

-- Galápagos
INSERT INTO MSProvincia (nombre, regionID) VALUES ('Galápagos', 4);

INSERT INTO MSAlimento (genoAlimento, ingestaNativa) VALUES ('X', 'Carnívoro');
INSERT INTO MSAlimento (genoAlimento, ingestaNativa) VALUES ('XX', 'Herbívoro');
INSERT INTO MSAlimento (genoAlimento, ingestaNativa) VALUES ('XY', 'Omnívoro');
INSERT INTO MSAlimento (genoAlimento, ingestaNativa) VALUES ('YY', 'Insectívoros');

INSERT INTO MSSexo (nombre) VALUES ('Macho');
INSERT INTO MSSexo (nombre) VALUES ('Hembra');
INSERT INTO MSSexo (nombre) VALUES ('Asexual');

INSERT INTO Users (username, password) VALUES ('pat_mic', '123456'); -- '123456' hashed
