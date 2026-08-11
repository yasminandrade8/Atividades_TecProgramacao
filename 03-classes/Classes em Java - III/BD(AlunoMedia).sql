CREATE DATABASE Notas;
USE Notas;
DROP TABLE Aluno;

CREATE TABLE Aluno(
	matricula INT PRIMARY KEY,
    nomeAluno VARCHAR(100),
    nota1 DECIMAL(10,2),
    nota2 DECIMAL(10,2),
    mediaFinal DECIMAL(10,2),
    stat VARCHAR(10)
);
SELECT matricula AS Matrícula, nomeAluno AS Aluno, nota1 AS P1, nota2 AS P2, mediaFinal AS Média, stat AS Situação
FROM Aluno;