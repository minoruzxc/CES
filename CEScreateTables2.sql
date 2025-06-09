create database if not exists ces;
use ces;

create table if not exists acesso(
	id int not null auto_increment primary key,
    nivel varchar(30) not null,
    comentario varchar(100)
);
create table if not exists usuario(
	id int not null auto_increment primary key,
    nome varchar(45) not null,
    senha varchar(45),
    acesso_id int not null,
    foreign key (acesso_id) references acesso(id)
);

create table if not exists produto(		
	id int not null auto_increment primary key,
	nomeproduto varchar(45) not null,
    quantidade int not null,
    descricao varchar(255)
);


