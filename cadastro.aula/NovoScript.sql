CREATE TABLE dadosPessoais (
							RGM INT NOT NULL,
                            nomeAluno VARCHAR (100),
                            nascAluno DATE DEFAULT '1200-01-01',
					        CPF INT,
							emailAluno VARCHAR (100),
                            endAluno VARCHAR (100),
                            munAluno VARCHAR (100),
							ufAluno CHAR (2),
                            celAluno INT,
                            CONSTRAINT PK_RGM PRIMARY KEY (RGM)
                            
);

CREATE TABLE curso (
					
							cursoAluno VARCHAR(100), 
							campusAluno VARCHAR (100),
							perAluno VARCHAR (100)
					

);

CREATE TABLE notasFaltas(
				
                
							discAluno VARCHAR (100),
							semAluno VARCHAR (100),
							notaAluno VARCHAR (2),
							falAluno INT
						
); 