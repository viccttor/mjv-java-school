## Open Bank


O Banco Central requisitou aos bancos e financeiras que diariamente fosse enviado um arquivo contendo as movimentações de clientes contendo as seguintes informações: Data da Movimentação, Cpf / Cnpj e Nome Cliente, Valor e Tipo da Movimentação e se a Movimentação foi estornada.

| Ordem | Campo | Tamanho  | Valor Real  | Valor Formatado  |
| ---- | -------- | ------- | ------- | ------- |
| 01         | Data| 08 | 16/04/2022	 | 20220416 |
| 02       | CPF\CNPJ	| 14	 | 135.217.791-18	 | 00013521779118 |
| 03       | Nome| 30	 | RAIMUNDO NONATO LOUREIRO CASTELO BRANCO	 | RAIMUNDO NONATO LOUREIRO CASTE |
| 04   | Valor | 10 | 1.275,48	 | 0000127548 |
| 05       | Tipo Mov.	 | 1 | RECEITA / DESPESA	 | R ou D |
| 06    | Estornado | 1 | true / false	 | 1 ou 0 |




### Case 1


* Cada linha de movimentação deverá ter a estrutura conforme ilustração seguir:
    * 2022041600013521779118RAIMUNDO NONATO LOUREIRO CASTE0000127548R0

* O conteúdo deverá ser disponibilizado via arquivo chamado de AAAA-MM-DD_movimentacao.txt no diretório c:\estudos\banco_central\movimentacoes


### Case 2

1. Criar o projeto Maven gerador_arquivo para converter as movimentações em texto e gerar o arquivo;
2. Criar o projeto Maven leitor_arquivo para ler o arquivo e converter em objetos.
* Depois das funcionalidades estarem funcionando, deverá ter uma nova funcionalidade para converter as movimentações no padrão layout delimitado, exemplo:
  * 20220416;00013521779118;RAIMUNDO NONATO LOUREIRO CAST;0000127548;R;0

* Depois gerar o arquivo chamado de AAAA-MM-DD_movimentacao.csv no diretório c:\estudos\banco_central\movimentacoes
* Realizar a leitura do arquivo csv para também converter em movimentações

