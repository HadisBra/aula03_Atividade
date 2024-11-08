Projeto CRUD com Spring Boot e JSF
Descrição
Este projeto é uma aplicação web simples construída com Spring Boot para o backend e JSF (com a biblioteca PrimeFaces) para a interface de usuário. A aplicação implementa as operações básicas de um sistema CRUD (Create, Read, Update, Delete) para gerenciar dados de uma entidade, como produtos, clientes ou tarefas.

Este repositório inclui uma baseline completa para iniciar o desenvolvimento do projeto, incluindo configuração de ambiente, dependências, estrutura de diretórios e instruções para execução.

# Aula02

Demo project for Spring Boot

## Requisitos

- Java 21
- Maven 3.6.3 ou superior
- IDE (IntelliJ IDEA ou Eclipse são recomendados)
- Git para controle de versão
## Tecnologias Utilizadas

- Spring Boot 3.2.2
- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot DevTools
- H2 Database
- Spring Boot Starter Data JPA
- Spring Boot Starter Test

## Configuração do Projeto

Configurar o Ambiente
IDE: Recomenda-se o uso do IntelliJ IDEA ou Eclipse.
Banco de Dados: Para desenvolvimento, utiliza-se o banco de dados em memória H2.

Executar o Projeto
Certifique-se de ter o Maven instalado.
Para iniciar a aplicação, execute:
bash
Copiar código
mvn spring-boot:run

Acesse a aplicação no navegador em: http://localhost:8080

Configuração de Banco de Dados

O banco de dados H2 está configurado como padrão. Veja as configurações no arquivo application.properties:
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Dependências
As dependências principais estão configuradas no pom.xml:

Spring Boot Starter Web
Spring Boot Starter Data JPA
PrimeFaces
H2 Database
Lombok


Contribuição
Faça um fork do repositório.
Crie uma branch para sua feature (git checkout -b minha-feature).
Commit suas alterações (git commit -m 'Adiciona nova funcionalidade').
Envie para o branch (git push origin minha-feature).
Abra um Pull Request.

Contato
Para dúvidas ou sugestões, entre em contato com [guilherme.lima4@estudante.ifto.edu.br].




