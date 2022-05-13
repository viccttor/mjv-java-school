## Open Bank


O Banco Central requisitou aos bancos e financeiras que diariamente fosse enviado um arquivo contendo as movimentações de clientes contendo as seguintes informações: Data da Movimentação, Cpf / Cnpj e Nome Cliente, Valor e Tipo da Movimentação e se a Movimentação foi estornada.



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

