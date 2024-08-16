-- database: ../MSDataBase/SMEcuaFauna.db
/*
Autor: Maldonado Shirley
Fecha: 16.agosto.2024
Script: Insertar Datos
*/
DROP TABLE IF EXISTS MSPais;

DROP TABLE IF EXISTS MSRegion;

DROP TABLE IF EXISTS MSProvincia;

DROP TABLE IF EXISTS MSAlimento;
DROP TABLE IF EXISTS MSSexo;

DROP TABLE IF EXISTS MSHormiga;

-- Tabla Pais
CREATE TABLE MSPais (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Tabla Region
CREATE TABLE MSRegion (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    paisId INTEGER,
    FOREIGN KEY (paisId) REFERENCES Pais(id)
);

-- Tabla Provincia
CREATE TABLE MSProvincia (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    regionId INTEGER,
    FOREIGN KEY (regionId) REFERENCES Region(id)
);

-- Tabla Sexo
CREATE TABLE MSSexo (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Tabla GenoAlimento
CREATE TABLE MSGenoAlimento (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Tabla IngestaNativa
CREATE TABLE MSIngestaNativa (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Tabla Hormiga
CREATE TABLE MSHormiga (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tipoHormiga TEXT NOT NULL,
    ubicacionId INTEGER,
    sexoId INTEGER,
    genoAlimentoId INTEGER,
    ingestaNativaId INTEGER,
    estado TEXT NOT NULL,
    FOREIGN KEY (ubicacionId) REFERENCES Provincia(id),
    FOREIGN KEY (sexoId) REFERENCES Sexo(id),
    FOREIGN KEY (genoAlimentoId) REFERENCES GenoAlimento(id),
    FOREIGN KEY (ingestaNativaId) REFERENCES IngestaNativa(id)
);
CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL
);

