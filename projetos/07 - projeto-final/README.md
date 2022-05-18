# MJV Projeto Final
Repositório contendo o código fonte de projeto IAPOI BANKING

#### Autor

- [Victor Henrique](https://github.com/viccttor)


##### IAPOI BANKING
Utilizando os conhecimentos absorvidos no curso, desenvolver uma API Rest, documentada utilizando o Swagger e com pelo menos 3 testes unitários.

* OBS: Em desenvolvimento
  * Objetivo:
    * Cadastros - Cliente|Endereco, Conta
      * Alteracao de endereco 
    * Adicionar receita e despesa na conta
       * Realizar saque
       * Trasnferência entre contas
    * Listar - Contas, movimentações e as movimentações por cliente 
    


###### Tecnologias

* Java
* JPA Hibernate
* Postgre SQL
* Spring Boot
* Swagger

###### Apresentação

1. Cadastro de cliente
2. Alteração de endereço
3. Inclusão de Movimentação 
4. Inclusão de pedidos

###### JSON - Cadastros

* Cadastrando Cliente - 01

```
{
  "nome": "Victor Henrique",
  "cpf": "11111111111",
  "endereco": {
    "id": 0,
    "cep": "55800-021",
    "cidade": "Campinas",
    "estado": "SP",
    "bairro": "Centro",
    "logradouro": "Rua Noruega",
    "numero": "120"
  }
}
```
* Cadastrando Cliente - 02

```
{
  "nome": "Gleyson Sampaio",
  "cpf": "22222222222",
  "endereco": {
    "id": 0,
    "cep": "64000-320",
    "cidade": "Teresina",
    "estado": "PI",
    "bairro": "Centro",
    "logradouro": "Rua Alvorada",
    "numero": "129"
  }
}
```
* Cadastrando Cliente - 03

```
{
  "nome": "Henrique",
  "cpf": "33333333333",
  "endereco": {
    "id": 0,
    "cep": "01034-030",
    "cidade": "São Paulo",
    "estado": "SP",
    "bairro": "Centro",
    "logradouro": "Rua Abelardo Pinto Piolin",
    "numero": "45"
  }
}
```

* Cadastrando Cliente - 04

```
{
  "nome": "string",
  "cpf": "string",
  "endereco": {
    "id": 0,
    "cep": "string",
    "cidade": "string",
    "estado": "string",
    "bairro": "string",
    "logradouro": "string",
    "numero": "string"
  }
}

```

###### Deletar

* Deletendo o cliente - 04

```
id: 4

```

###### Buscar 

* Buscando Todos os Clientes

* Buscando Todos os Endereços

###### Alterando 

* Alterando o endereço do cliente - 01

```
{
  "id": 1,
  "cep": "55819-700",
  "cidade": "Carpina",
  "estado": "PE",
  "bairro": "Centro",
  "logradouro": "Rua dos Tamarindos ",
  "numero": "180"
}

```

* Buscando Endereço - Por id

```
  CLiente 01 - id: 1
  CLiente 02 - id: 2
  CLiente 03 - id: 3

```

###### Movimentações

* Gerando uma movimentação - Receita | CLiente 01

```
{
  "idConta": 1,
  "descricao": "Salário ",
  "valor": 3000.00,
  "formaMovimentacao": "TRANSFERENCIA",
  "tipoMovimentacao": "RECEITA"
 }
 
```

* Gerando uma movimentação - Receita | CLiente 02

```
{
  "idConta": 2,
  "descricao": "Salário ",
  "valor": 15000.00,
  "formaMovimentacao": "TRANSFERENCIA",
  "tipoMovimentacao": "RECEITA"
 }
 
```
* Gerando uma movimentação - Despesa | CLiente 01

```
{
  "idConta": 1,
  "descricao": "TEMIDO BOLETO - FATURA",
  "valor": 1000.00,
  "formaMovimentacao": "PAGAMENTO",
  "tipoMovimentacao": "DESPESA"
 }
 
```
* Gerando uma movimentação - Despesa | CLiente 02

```
{
  "idConta": 2,
  "descricao": "NOVO CONTRATO DE INTERNE",
  "valor": 2000.00,
  "formaMovimentacao": "TRANSFERENCIA",
  "tipoMovimentacao": "DESPESA"
 }

```

* Gerando uma movimentação - Transferência entre contas | CLiente 02

```
{
  "valor": 1000.00,
  "idContaPagadora": 2,
  "idContaRecebedora": 1,
  "descricaoPagador": "EMPRESTANDO DINHEIRO - VICTOR",
  "descricaoRecebedor": "DE GLEYSON - VICTOR, SEGUE O DINHEIRO SOLICITADO. 10 DIAS"
}

```

* Gerando uma movimentação - Transferência entre contas | CLiente 01

```
{
  "valor": 1000.00,
  "idContaPagadora": 1,
  "idContaRecebedora": 2,
  "descricaoPagador": "DEVOLVENDO DINHEIRO EMPRESTADO - GLEYSON",
  "descricaoRecebedor": "DE VICTOR - DEVOLUÇÃO, MESMO SABENDO QUE NÃO PRECISA :)"
}

```

* Buscando Movimentações - Por id

```
  CLiente 01 - id: 1
  CLiente 02 - id: 2
  CLiente 03 - id: 3

```

* Buscando Saldo da Conta por id

```
  CLiente 01 - id: 1
  CLiente 02 - id: 2
  CLiente 03 - id: 3

```

* Buscando Cliente por cpf

```
  CLiente 01 | cpf: 11111111111
  CLiente 02 | cpf: 22222222222
  CLiente 03 | cpf: 33333333333
  cpf - 11111111111
  cpf - 22222222222

```

###### SAQUE

* Gerando uma movimentação - SAQUE | CLiente 01

```
  id: 1
  valor: 500
  
```




