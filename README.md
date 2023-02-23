# Gerenciador de Tarefas

Estou iniciando esse projeto com intuito de por em prática os aprendizados que tive no decorrer do Bootcampo OrangeTech da DIO.

Para ser mais especificos vou aplicar aqui conceitos de Spring Boot, JPA, Rest, H2 e também farei a documentação com o Swagger.
 
## Skills

- Java
- Spring Boot
- Spring Data JPA (Java Persistence API)
- H2 DataBase
- Swagger2
- Spring Web(Rest)

## Como o projeto foi desenvolvido

O projeto foi desenvolvido como uma aplicação para ser entregue em um desafio de projeto do bootcamp OrangeTech da DIO.

Foram aplicados os padrões de projeto: Singleton, strategy e facade.

Na pasta model encontram-se os objetos da minha aplicação como o Titulo, Data de criação e o Id para localização dos Gerenciadores.
O projeto ainda não estão totalmente concluido, pois não incrementei a adição de tarefas para cada gerenciador criado.

A configuração do Swagger está localizado no package "doc".

Os controllers da aplicação contam com a possibilidade de Buscar Todos, Buscar por ID, Atualizar, Criar novos gerenciadores, Deletar os existentes.

Os metodos que aplicados nesse controllers se encontram no package "service.impl".

Fui utilizado para o armazenamento o banco em memoria h2. Inclusive foi configurado no "Application.properties" o acesso a esse banco de dados.