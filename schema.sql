USE academia;
-- Tabela: Clientes
CREATE TABLE clientes (
    client_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),
    data_nascimento DATE,
    genero VARCHAR(20),
    telefone VARCHAR(20),
    email VARCHAR(100),
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabela: Planos de Treinamento
CREATE TABLE planostreinamento (
    plano_id INT PRIMARY KEY AUTO_INCREMENT,
    nome_plano VARCHAR(100),
    descricao TEXT,
    duracao_semanas INT,
    preco DECIMAL(10, 2)
);

-- Tabela: Instrutores
CREATE TABLE instrutores (
    instrutor_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

-- Tabela: Aulas
CREATE TABLE aulas (
    aula_id INT PRIMARY KEY AUTO_INCREMENT,
    nome_aula VARCHAR(100),
    descricao TEXT,
    horario VARCHAR(20),
    dia_semana VARCHAR(20),
    instrutor_id INT,
    FOREIGN KEY (instrutor_id) REFERENCES instrutores(instrutor_id)
);

-- Tabela: Inscricoes
CREATE TABLE inscricoes (
    inscricao_id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    plano_id INT,
    data_inscricao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_vencimento DATE,
    status_pagamento VARCHAR(20),
    FOREIGN KEY (client_id) REFERENCES clientes(client_id),
    FOREIGN KEY (plano_id) REFERENCES planostreinamento(plano_id)
);
