Alura Oracle One - Challenge Backend #01

Desafio final do primeiro módulo de JAVA POO da formação BackEnd da turma 06 com parceria da Alura Oracle ONE

O desafio proposto foi criar uma API de conversor de moeda

API sugerida: https://www.exchangerate-api.com/

Estrutura
O projeto seguiu uma arquitetura simples MVC, porém substituida a camada controller, pela camada menu, visto que a aplicação roda em console

Pacote API
Realiza comunicação externa com a API, utiliza de uma interface para facilitar a implementação de outras API's caso seja necessário mudar

Pacote ENUMS
Possui um enum com todas as Currencies(moedas) que existem na documentação da API

OBS: É PRECISO CONFIGURAR SUA API KEY NO PACOTE RESOURCES PARA REALIZAR CHAMADAS A API EXTERNA
Como realizar a configuração, abra o arquivo external-resources-example.properties e coloque a sua chave da API na linha correspondente após isso, renomeie o arquivo para 'external-resources.properties'
