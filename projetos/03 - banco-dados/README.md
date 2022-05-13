# BANCO DE DADOS - POSTGRES

#### Jornada

1. Criação da tabela `tab_cadastro`  contendo os campos: Id (pk-auto increment), Nome, Email, Telefone, Endereco (Logradouro, Numero, Bairro, Cidade, Estado), Profissão, Valor de Renda Mensal, Número de dependentes, Estrangeiro;
1. Descrever como o banco de dados escolhido trata os tipos de dados em questão;
1. Apresentar todo o conteúdo em um arquivo .sql destacando as observações como comentário no script. (ver padrão de comentários no banco de dados selecionado).

##### DDL

1. Criar a tabela citada acima contemplando os campos destacados, desconsiderando inicialmente o campo `profissao`;
1. Alterar a tabela para a inclusão do campo `profissao`;
1. Alterar a coluna `email` para que ela possa suportar até 100 caracteres;

##### DML

1. Realizar um insert com 10 registros de cadastros - SEM INFORMAR O VALOR DA COLUNA PROFISSÃO e RENDA MENSAL ;
1. alterar individualmente os campos de profissão e renda mensal via `update` nos registros inseridos;
1. Excluir todos os registros que o campo `estrangeiro` for considerado verdadeiro;
1. O cadastro de Id=3 deverá residir no endereco: Logradouro='PRACA DA SE', Numero = 'S/N', Bairro = 'CENTRO', Cidade = 'SAO PAULO', Estado = 'SP';

##### DQL

1. Retornar uma lista de cadastros contendo os campos: Nome, Email, Profissao (nome) e Renda Mensal ordenado por Profissão (nome) e Nome do cadastro;
1. Retornar uma lista contendo os campos: Nome, Email, Profissao e Renda Mensal ordenado por Profissão e Renda Mensal do maior para o menor;
1. Retornar uma lista com a seguinte informação concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO;
1. Retornar uma lista contendo o nome da profissão e a quantidade de registros da profissão.
1. Retornar o registro com a menor renda mensal;
1. Retornar se existir o registro com a seguinte condição: Nome parecido com 'MARCOS PAULO' e Renda Mensal `maior que` 1200 e Renda Mensal `menor ou igual que` 2000 e que o Estado esteja `dentro de` SP, RJ, SC.
