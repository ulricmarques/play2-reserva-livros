# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  senha                     varchar(255),
  constraint pk_admin primary key (id))
;

create table livro (
  id                        bigint auto_increment not null,
  titulo                    varchar(255),
  autor                     varchar(255),
  editora                   varchar(255),
  ano                       varchar(255),
  edicao                    varchar(255),
  genero                    varchar(255),
  constraint pk_livro primary key (id))
;

create table reserva (
  id                        bigint auto_increment not null,
  user                      varchar(255),
  data_devolucao            varchar(255),
  data_reserva              varchar(255),
  constraint pk_reserva primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_usuario primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_usuario primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table admin;

drop table livro;

drop table reserva;

drop table usuario;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

