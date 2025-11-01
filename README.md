RM556325 - Felipe Camargo

RM555997 - Caio Marques

RM558640 - Caio Amarante

## 💡 Objetivo do Projeto

Este projeto consiste na criação de uma API REST utilizando Java com Spring Boot que suporta a solução para o desafio proposto pela FIAP no sprint de Java Advanced.

A API é responsável por gerenciar entidades relacionadas ao controle de motos em filiais, incluindo funcionalidades completas de CRUD para pelo menos duas entidades, além de implementar:

   - Uso do Spring Web para criação da API RESTful
   - Integração com banco de dados Oracle ou H2 via Spring Data JPA
   - Relacionamentos entre entidades conforme modelo relacional fornecido
   - Validação de campos utilizando Bean Validation
   - Implementação de paginação, ordenação e busca por parâmetros para resultados
   - Utilização de cache para otimizar requisições
   - Aplicação de boas práticas de design REST
   - Tratamento centralizado de erros para maior robustez da API
   - Uso de DTOs para transferência segura e eficiente dos dados

Este projeto busca atender os requisitos técnicos e critérios de avaliação definidos para o sprint, entregando uma solução organizada, inovadora e aderente ao desafio proposto.

---

## 🏍️ Atributos das Entidades do Projeto     

A entidade `Pais` possui os seguintes atributos:

- `cod_pais` (Integer)
- `nome_pais` (String)

A entidade `Estado` possui os seguintes atributos:

- `cod_estado` (Integer)
- `nome_estado` (String)
- `cod_pais` (Integer)

A entidade `Cidade` possui os seguintes atributos:

- `cod_cidade` (Integer)
- `nome_cidade` (String)
- `cod_estado` (Integer)

A entidade `Filial` possui os seguintes atributos:

- `cod_filial` (Integer)
- `nome_filial` (String)
- `cod_cidade` (Integer)
- `tamanho_patio` (Integer)

A entidade `Moto` possui os seguintes atributos:

- `cod_moto` (Integer)
- `modelo` (String)
- `ano_fabricacao` (Integer)
- `categoria` (String)
- `cod_cliente` (Integer)

A entidade `Usuario` possui os seguintes atributos:

- `cod_usuario` (Integer)
- `nome_usuario` (String)
- `email` (String)
- `tipo_acesso` (String)
- `cod_filial` (Integer)
- `funcao_usuario` (String)

A entidade `Movimentacao-Moto` possui os seguintes atributos:

- `cod_movimento` (Integer)
- `cod_moto` (Integer)
- `cod_filial` (Integer)
- `tipo_movimento` (String)
- `data_movimento` (LocalDateTime)
- `manutencao_necessaria` (String)

A entidade `Manutencao-Moto` possui os seguintes atributos:

- `cod_manutencao` (Integer)
- `cod_moto` (Integer)
- `tipo_manutencao` (String)
- `data_manutencao` (LocalDateTime)

A entidade `Localizacao-Moto` possui os seguintes atributos:

- `cod_localizacao` (Integer)
- `cod_moto` (Integer)
- `cod_filial` (Integer)
- `box_posicao` (String)
- `status` (String)
- `data_entrada` (LocalDateTime)
- `data_saida` (LocalDateTime)

A entidade `Sensor-Moto` possui os seguintes atributos:

- `cod_sensor` (Integer)
- `cod_filial` (Integer)
- `tipo_sensor` (String)
- `local_instalacao` (String)
- `cod_moto` (Integer)

---

## 🔗 Endpoints da API

| Método | Endpoint       | Descrição                 |
| ------ | -------------- | ------------------------- |
| POST   | `/paises`      | Criar um novo país        |
| GET    | `/paises`      | Listar todos os países    |
| PUT    | `/paises/{id}` | Atualizar um país pelo ID |
| DELETE | `/paises/{id}` | Deletar um país pelo ID   |

| Método | Endpoint        | Descrição                   |
| ------ | --------------- | --------------------------- |
| POST   | `/estados`      | Criar um novo estado        |
| GET    | `/estados`      | Listar todos os estados     |
| PUT    | `/estados/{id}` | Atualizar um estado pelo ID |
| DELETE | `/estados/{id}` | Deletar um estado pelo ID   |

| Método | Endpoint        | Descrição                   |
| ------ | --------------- | --------------------------- |
| POST   | `/clientes`     | Criar um novo cliente       |
| GET    | `/clientes`     | Listar todos os clientes    |
| PUT    | `/clientes/{id}`| Atualizar um cliente pelo ID|
| DELETE | `/clientes/{id}`| Deletar um cliente pelo ID  |

| Método | Endpoint        | Descrição                    |
| ------ | --------------- | ---------------------------- |
| POST   | `/cidades`      | Criar uma nova cidade        |
| GET    | `/cidades`      | Listar todas as cidades      |
| PUT    | `/cidades/{id}` | Atualizar uma cidade pelo ID |
| DELETE | `/cidades/{id}` | Deletar uma cidade pelo ID   |

| Método | Endpoint        | Descrição                    |
| ------ | --------------- | ---------------------------- |
| POST   | `/filiais`      | Criar uma nova filial        |
| GET    | `/filiais`      | Listar todas as filiais      |
| PUT    | `/filiais/{id}` | Atualizar uma filial pelo ID |
| DELETE | `/filiais/{id}` | Deletar uma filial pelo ID   |

| Método | Endpoint      | Descrição                  |
| ------ | ------------- | -------------------------- |
| POST   | `/motos`      | Criar uma nova moto        |
| GET    | `/motos`      | Listar todas as motos      |
| PUT    | `/motos/{id}` | Atualizar uma moto pelo ID |
| DELETE | `/motos/{id}` | Deletar uma moto pelo ID   |

| Método | Endpoint         | Descrição                    |
| ------ | ---------------- | ---------------------------- |
| POST   | `/usuarios`      | Criar um novo usuário        |
| GET    | `/usuarios`      | Listar todos os usuários     |
| PUT    | `/usuarios/{id}` | Atualizar um usuário pelo ID |
| DELETE | `/usuarios/{id}` | Deletar um usuário pelo ID   |

| Método | Endpoint           | Descrição                      |
| ------ | ------------------ | ------------------------------ |
| POST   | `/movimentacao-moto`      | Criar um novo movimento        |
| GET    | `/movimentacao-moto`      | Listar todos os movimentos     |
| PUT    | `/movimentacao-moto/{id}` | Atualizar um movimento pelo ID |
| DELETE | `/movimentacao-moto/{id}` | Deletar um movimento pelo ID   |

| Método | Endpoint            | Descrição                        |
| ------ | ------------------- | -------------------------------- |
| POST   | `/manutencao-moto`      | Criar uma nova manutenção        |
| GET    | `/manutencao-moto`      | Listar todas as manutenções      |
| PUT    | `/manutencao-moto/{id}` | Atualizar uma manutenção pelo ID |
| DELETE | `/manutencao-moto/{id}` | Deletar uma manutenção pelo ID   |

| Método | Endpoint             | Descrição                         |
| ------ | -------------------- | --------------------------------- |
| POST   | `/localizacao-moto`      | Criar uma nova localização        |
| GET    | `/localizacao-moto`      | Listar todas as localizações      |
| PUT    | `/localizacao-moto/{id}` | Atualizar uma localização pelo ID |
| DELETE | `/localizacao-moto/{id}` | Deletar uma localização pelo ID   |

| Método | Endpoint         | Descrição                   |
| ------ | ---------------- | --------------------------- |
| POST   | `/sensor-moto`      | Criar um novo sensor        |
| GET    | `/sensor-moto`      | Listar todos os sensores    |
| PUT    | `/sensor-moto/{id}` | Atualizar um sensor pelo ID |
| DELETE | `/sensor-moto/{id}` | Deletar um sensor pelo ID   |

## 🚀 Como Iniciar a Aplicação

### Pré-requisitos

- Java JDK 11 ou superior  
- Maven  
- IntelliJ IDEA  
- Postman (ou ferramenta equivalente para testes de API)  

### 1. Clonar o repositório

```bash
git clone <URL_DO_REPOSITÓRIO>
cd <NOME_DO_DIRETÓRIO>
```

### 2. Abrir no IntelliJ IDEA

- Inicie o IntelliJ IDEA.  
- Selecione **File > Open...**  
- Navegue até a pasta do projeto e clique em **OK**.  
- Aguarde a importação do Maven.  

### 3. Configurar o banco de dados

- **H2 (padrão)**: não requer configuração adicional.  
- **Oracle**: edite o arquivo `src/main/resources/application.properties`:

  ```properties
  spring.datasource.url=jdbc:oracle:thin:@//HOST:PORT/SERVICENAME
  spring.datasource.username=SEU_USUARIO
  spring.datasource.password=SUA_SENHA
  ```

### 4. Executar a aplicação

- No IntelliJ, abra a classe principal e clique no ícone **Run**.  
- Ou via terminal:

  ```bash
  mvn spring-boot:run
  ```

### 5. Testar a API com o Postman

- **Base URL**: `http://localhost:8080`  
- Importe a coleção, se houver, ou crie requests manualmente:  
  - **GET** `/paises`  
  - **POST** `/paises`  

    ```json
    {
      "nomePais": "Brasil"
    }
    ```  
  - Outros endpoints conforme definido acima.

---
