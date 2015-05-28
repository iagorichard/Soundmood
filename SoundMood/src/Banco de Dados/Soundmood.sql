--tabela para Humor
CREATE TABLE MOOD (
id INT,
nometag VARCHAR(20),
descricao VARCHAR(50),

PRIMARY KEY(id)
);

--descrição está sendo usada? 
--tabela para status
CREATE TABLE STATUS (
id INT,
nometag VARCHAR(20),
descricao VARCHAR(50),

PRIMARY KEY(id)
);
--tabela referente ao usuário
CREATE TABLE USUARIO (
id int,
username VARCHAR(20),
tipo VARCHAR(10),
nome VARCHAR(50),
email VARCHAR(50),
senha VARCHAR(10),
senhadica VARCHAR(20),

tagmoodid INT, 
tagstatusid INT,

PRIMARY KEY(id,username),
FOREIGN KEY (tagmoodid) REFERENCES MOOD (id) ON DELETE CASCADE,
FOREIGN KEY (tagstatusid) REFERENCES STATUS (id) ON DELETE CASCADE

);
--tabela referente a música 

CREATE TABLE MUSICA(
id INT,
nome VARCHAR(20),
artista VARCHAR(20),
pathurl VARCHAR(100),

PRIMARY KEY(id)
);

--tabela referente ao cálculo feito para gerar playlist
CREATE TABLE CALCULA(
musicaid INT,
moodid INT, 
statusid INT, 

FOREIGN KEY (musicaid) REFERENCES MUSICA (id) ON DELETE CASCADE,
FOREIGN KEY (moodid) REFERENCES MOOD (id) ON DELETE CASCADE,
FOREIGN KEY (statusid) REFERENCES STATUS (id) ON DELETE CASCADE,

PRIMARY KEY(musicaid)

);

CREATE SEQUENCE SEQ_ID_USER INCREMENT BY 1 START WITH 1;



 