Autômato Finito Determinístico (AFD) Simulator

Este é um programa em Java que simula o funcionamento de um Autômato Finito Determinístico (AFD). Um AFD é um modelo matemático usado para representar linguagens regulares. O programa permite a entrada de informações sobre um AFD, incluindo os estados, o alfabeto, o estado inicial, os estados de aceitação e as funções de transição. Em seguida, ele aceita uma cadeia de símbolos e determina se essa cadeia é aceita ou rejeitada pelo AFD, de acordo com suas regras de transição.

Como usar o programa:
Digite os estados do AFD: Forneça os estados do AFD, separados por vírgula.

Digite o alfabeto do AFD: Forneça o alfabeto do AFD, composto por até dois símbolos e separados por vírgula.

Selecione o estado inicial: Escolha o estado inicial do AFD.

Selecione os estados de aceitação: Escolha os estados de aceitação do AFD, separados por vírgula.

Digite as funções de transição: Insira as funções de transição no formato estado_atual/simbolo/proximo_estado. Digite "fim" para encerrar a entrada das funções de transição.

Digite uma cadeia de símbolos: Insira uma cadeia de símbolos para verificar se ela é aceita pelo AFD. Digite "fim" para encerrar o programa.

Exemplos de utilização:

Exemplo 1:

Digite os estados do AFD, separados por vírgula:
q0,q1,q2
Digite o alfabeto do AFD, separados por vírgula e composto por até 2 símbolos:
0,1
Selecione o estado inicial:
q0
Selecione os estados de aceitação, separados por vírgula:
q2
Digite as funções de transição no seguinte formato: estado_atual/simbolo/proximo_estado
Digite 'fim' para encerrar.
q0/0/q1
q1/1/q2
fim
Digite uma cadeia de símbolos:
Digite 'fim' para encerrar.
101
A cadeia foi rejeitada.
01
A cadeia foi aceita.

Exemplo 2:

Digite os estados do AFD, separados por vírgula:
A,B,C
Digite o alfabeto do AFD, separados por vírgula e composto por até 2 símbolos:
a,b
Selecione o estado inicial:
A
Selecione os estados de aceitação, separados por vírgula:
C
Digite as funções de transição no seguinte formato: estado_atual/simbolo/proximo_estado
Digite 'fim' para encerrar.
A/a/B
B/b/C
fim
Digite uma cadeia de símbolos:
Digite 'fim' para encerrar.
ab
A cadeia foi aceita.
abb
A cadeia foi rejeitada.

Exemplo 3:

Digite os estados do AFD, separados por vírgula: 
q0,q1,q2
Digite o alfabeto do AFD, separados por vírgula e composto por até 2 símbolos: 
a,b
Selecione o estado inicial: 
q0
Selecione os estados de aceitação, separados por vírgula: 
q2
Digite as funções de transição no seguinte formato: estado_atual/simbolo/proximo_estado
Digite 'fim' para encerrar.
q0/a/q0
q0/b/q1
q1/a/q0
q1/b/q2
q2/a/q1
q2/b/q2
fim
Digite uma cadeia de símbolos: 
Digite 'fim' para encerrar.
abaabba
A cadeia foi rejeitada.
abaabbab
A cadeia foi aceita.

Observações:
Certifique-se de fornecer as entradas corretas de acordo com as especificações do AFD desejado.
O programa só aceitará cadeias de símbolos do alfabeto definido para o AFD.
O programa indicará se a cadeia fornecida é aceita ou rejeitada pelo AFD.
