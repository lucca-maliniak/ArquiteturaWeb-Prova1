# CRUD com Spring Boot e MariaDB

Este projeto implementa uma aplicação CRUD utilizando Spring Boot e MariaDB, com funcionalidades de persistência de dados, criação de entidades, configuração de relacionamento entre entidades, e exposição de endpoints REST.

## Passos para Rodar a Aplicação

### 1. Configuração do Ambiente

#### a. Instalar e Configurar MariaDB

1. **Baixe e instale o MariaDB**:
   - Utilize o [MariaDB](https://mariadb.org/) para o banco de dados. Uma opção é usar o XAMPP, que já vem com o MariaDB.
2. **Crie o banco de dados**:
   - Crie um banco de dados chamado `alunos` no MariaDB para persistir os dados da aplicação.

#### b. Criar o Projeto Spring Boot

1. Crie um projeto Spring Boot com as seguintes dependências:
   - **Spring Data JPA**: Para interagir com o banco de dados.
   - **Spring Web**: Para criar APIs REST.
   - **Lombok**: Para simplificação do código.
   - **DevTools**: Para facilitar o desenvolvimento com reinício automático.

### 2. Configuração do Banco de Dados

1. No arquivo `application.yml`, configure as credenciais de conexão com o MariaDB (usuário, senha e URL de conexão) caso precise.
   
   Exemplo:
   - **URL**: `jdbc:mariadb://localhost:3306/alunos`
   - **Driver**: `org.mariadb.jdbc.Driver`
   - **Usuário**: `root`
   - **Senha**: 

### 3. Rodando a Aplicação

Para rodar a aplicação, rode pelo modulo da extensão `SPRING BOOT DASHBOARD`:

![image](https://github.com/user-attachments/assets/4c0fa728-6c5a-4307-af60-a488f55bc6c2)

### 4. Testando os Endpoints

Use ferramentas como **Postman** ou **Insomnia** para testar os seguintes endpoints REST:

- `GET /aluno`: Listar todos os estudantes.
- `POST /aluno`: Criar um novo estudante.
- `PUT /aluno/{id}`: Atualizar um estudante existente.
- `DELETE /aluno/{id}`: Excluir um estudante.

- `GET /curso`: Listar todos os cursos.
- `POST /curso`: Criar um novo curso.
- `PUT /curso/{id}`: Atualizar um curso existente.
- `DELETE /curso/{id}`: Excluir um curso.

### Requisitos Funcionais

- O relacionamento entre as entidades **Aluno** e **Curso** deve estar corretamente configurado no banco de dados MariaDB.
- CRUD completo funcional para ambas as entidades.

### Dependências

- **Spring Data JPA**: Para o mapeamento das entidades no banco de dados.
- **Spring Web**: Para criar APIs REST.
- **Lombok**: Para reduzir a verbosidade do código, gerando automaticamente getters, setters e outros métodos comuns.
- **MariaDB Java Client**: Para conectar e interagir com o banco MariaDB.
- **DevTools**: Para reinício automático da aplicação durante o desenvolvimento.
