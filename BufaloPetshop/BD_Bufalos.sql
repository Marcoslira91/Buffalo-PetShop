create database BuffalosPet;
Use BuffalosPet;

Create table Pet(
idPet int primary key Auto_Increment,
nome VARCHAR (50) NOT NULL,
tipo varchar (20),
raca varchar (20) NOT NULL,
sexo varchar (1) NOT NULL,
cor varchar (20),
dataNascimento date,
pedigree VARCHAR (50)
);

Create table Cliente(
idCliente int primary key Auto_Increment,
nome VARCHAR (50) NOT NULL,
cpf long,
sexo VARCHAR(1) NOT NULL,
telefone long,
email VARCHAR (50) NOT NULL,
endereco VARCHAR(50) NOT NULL,
idPet int,
foreign key (idPet) REFERENCES Pet (idPet)
);

Create table Veterinario(
idVeterinario int primary key Auto_Increment,
CRMV int (8),
nome VARCHAR (50) NOT NULL,
cpf long,
sexo VARCHAR(1) NOT NULL,
telefone long,
email VARCHAR (50) NOT NULL,
endereço VARCHAR(50) NOT NULL
);

Create table Sevico(
idServico int primary key Auto_Increment,
banho boolean,
tosa boolean,
atendimentoMedico boolean,
observacao text
);

Create table Atendente(
idAtendente int primary key Auto_Increment,
nome VARCHAR (50) NOT NULL,
cpf long,
sexo VARCHAR(1) NOT NULL,
telefone long,
email VARCHAR (50) NOT NULL,
endereço VARCHAR(50) NOT NULL,
idPet int,
idCliente int,
idVeterinario int,
foreign key (idPet) REFERENCES Pet (idPet),
foreign key (idCliente) REFERENCES Cliente (idCliente),
foreign key (idVeterinario) REFERENCES Veterinario (idVeterinario)
);

DESCRIBE Cliente;
DESCRIBE Pet;
DESCRIBE Veterinario;
DESCRIBE Sevico;
DESCRIBE Atendente;

/*Drop  table Cliente;*/

insert into Pet values
(default, 'Malu', 'Cadela', 'Vira Lata', 'F', 'caramelo', 20201207, 'Sem Pedigree');

insert into Cliente values /*(IdCliente, Nome, CPF, Sexo, Fone, Endereço, IdPet)*/
(default, 'Tamires', '10285697402', 'F', 81998637456, 'Tamires@gmail.com', 'Rua Joaquina da Conceição Azevedo', 1);



SELECT * FROM Pet;
SELECT * FROM Cliente;

