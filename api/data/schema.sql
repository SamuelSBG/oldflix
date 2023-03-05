DROP TABLE IF EXISTS filme CASCADE;

CREATE TABLE filme (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
	titulo VARCHAR(50) NOT NULL,
	descricao TEXT NOT NULL,
	disponivel BOOLEAN NOT NULL,
	categoria VARCHAR(20) NOT NULL,
	responsavel VARCHAR(100),
	data_retirada TIMESTAMP,
	imagem TEXT NOT NULL,
	CONSTRAINT pk_filme PRIMARY KEY (id),
	CONSTRAINT ck_filme_categoria CHECK (categoria in ('BRONZE', 'PRATA', 'OURO'))
);

\c oldflix

INSERT INTO filme
(titulo, descricao, categoria, disponivel, imagem) VALUES ('Avatar', 'Quando seu irmão é morto em um assalto, o paraplégico fuzileiro naval Jake Sully decide assumir seu lugar em uma missão no distante mundo de Pandora. Lá, ele descobre as intenções gananciosas de Parker Selfridge de expulsar o humanóide nativo Na''vi para minerar o precioso material espalhado por sua rica floresta. Em troca da cirurgia na coluna que consertará suas pernas, Jake reúne conhecimento sobre a raça indígena e sua cultura para a unidade militar cooperativa liderada pelo entusiasmado coronel Quaritch, enquanto simultaneamente tenta se infiltrar no povo Na''vi com o uso de de uma identidade avatar. Enquanto Jake começa a se relacionar com a tribo nativa e rapidamente se apaixona pela bela alienígena Neytiri,— As gêmeas Massie', 'OURO', true, 'https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_FMjpg_UX1000_.jpg');
