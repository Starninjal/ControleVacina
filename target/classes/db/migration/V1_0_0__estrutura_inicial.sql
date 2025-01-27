CREATE TABLE IF NOT EXISTS BAIRRO (
    ID SERIAL PRIMARY KEY,
    NOME VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS VACINA (
    ID SERIAL PRIMARY KEY,
    NOME VARCHAR(200),
    DOENCAS_EVITADAS VARCHAR(300)
);

CREATE TABLE IF NOT EXISTS VACINA_BAIRRO (
    ID SERIAL PRIMARY KEY,
    VACINA_ID INTEGER,
    BAIRRO_ID INTEGER,
    DATA_APLICACAO DATE,
    FOREIGN KEY (VACINA_ID) REFERENCES VACINA(ID),
    FOREIGN KEY (BAIRRO_ID) REFERENCES BAIRRO(ID)
);

CREATE TABLE IF NOT EXISTS USUARIO (
    ID SERIAL PRIMARY KEY,
    LOGIN VARCHAR(100),
    SENHA VARCHAR(50),
    CARGO VARCHAR(100)
);
