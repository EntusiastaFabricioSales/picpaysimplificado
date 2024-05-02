# Authentication API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Esse projeto é uma API construída usando **Java, Java Spring, H2 como banco de dados.** 

Essa API [PicPay Backend Challenge](https://github.com/PicPay/picpay-desafio-backend) é baseada em um desafio do PicPay  using Java Spring.

## Índice

- [Instalação](#Instalação)
- [Configuração](#configuracao)
- [Uso](#Uso)
- [API Endpoints](#api-endpoints)
- [Banco de dados](#database)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/EntusiastaFabricioSales/picpaysimplificado.git
```

2. Instale as dependências com o Maven

3. Clone o [Email service](https://github.com/Fernanda-Kipper/desafio-backend-uber) repositório e siga o processo de instalação

```bash
git clone https://github.com/EntusiastaFabricioSales/email-service.git
```

4. Ajuste o Email Service application.properties para rodar na porta `8090`

```yaml
server.port=8090
```

5. Execute ambos microsserviços
## Uso

1. Inicie a aplicação com o Maven
2. A API pode ser acessada em http://localhost:8080


## API Endpoints
The API fornece os seguintes Endpoints:

**GET USERS**
```markdown
GET /users - Retorna uma lista de todos os usuários.
```
```json
[
    {
        "id": 1,
        "firstName": "Pedro",
        "lastName": "Silva",
        "document": "123456787",
        "email": "pedro@example.com",
        "password": "senha",
        "balance": 20.00,
        "userType": "MERCHANT"
    },
    {
        "id": 4,
        "firstName": "Luckas",
        "lastName": "Silva",
        "document": "123456783",
        "email": "luckas@example.com",
        "password": "senha",
        "balance": 0.00,
        "userType": "COMMON"
    }
]
```

**POST USERS**
```markdown
POST /users - Registra um novo usuário no app
```
```json
{
    "firstName": "Lucas",
    "lastName": "Silva",
    "password": "senha",
    "document": "123456783",
    "email": "lucas@example.com",
    "userType": "COMMON",
    "balance": 10
}
```

**POST TRANSACTIONS**
```markdown
POST /transactions - Registra uma nova transação entre usuários (COMMON to COMMON or COMMON to MERCHANT)
```

```json

{
  "senderId": 4,
  "receiverId": 1,
  "value": 10
}
```

## Database
O projeto utiliza [H2 Database](https://www.h2database.com/html/tutorial.html) como banco de dados. 
