# Projeto Cardápio Digital

Este é um projeto de cardápio digital desenvolvido por Teófilo Nicolau. O projeto utiliza Spring Boot para o backend, PostgreSQL como banco de dados e React para o frontend.

## Requisitos

- Java 17

- PostgreSQL
- Maven
- Git

## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL chamado `food`.
2. Configure as credenciais do banco de dados no arquivo `application.properties` no diretório `src/main/resources`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/food
spring.datasource.username=postgres
spring.datasource.password=root1234

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
![image](https://github.com/teofilonicolau/cardapio_bdata/assets/97030160/ce10af29-0041-4b0a-a891-ad1590fd2b6d)


Abra o terminal e navegue até o diretório cardapio.
Execute o comando mvn spring-boot:run para iniciar o servidor backend.

O backend estará disponível em http://localhost:8080.

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests para melhorar este projeto.

