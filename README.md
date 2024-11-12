# Java-Projeto-Teatro

## Enunciado: 

Os proprietários do teatro MackTheater desejam um sistema para gerenciar a venda de entradas para seus espetáculos. O espaço é composto por uma única sala com apresentações em diversos horários ao longo da semana. A sala possui 50 lugares organizados em 5 fileiras de 10 cadeiras cada. Cada cliente do teatro pode comprar a quantidade de entradas desejada. As entradas são vendidas de acordo com os critérios da tabela abaixo.

![image](https://github.com/user-attachments/assets/3a21950c-4084-4607-9caf-06eceacf63f4)

Os donos do teatro desejam que o sistema tenham as seguintes funcionalidades iniciais:

1. Cadastrar um espetáculo: para cadastrar um espetáculo o usuário deve informar o nome, a data, a hora e o valor do espetáculo para a entrada inteira.
2. Cadastrar um cliente: para cadastrar um cliente o usuário deve informar o nome e o CPF do cliente.
3. Vender entradas para um espetáculo: cada cliente pode comprar a
quantidade de entradas desejada para um espetáculo. Ao final da compra das entradas o sistema deve apresentar o valor total a ser pago. As entradas compradas devem ficar associadas ao cliente que as comprou.

O objetivo do projeto é desenvolver um sistema, utilizando a linguagem Java, de acordo com as funcionalidades definidas pelos donos do teatro. As próxima seções apresentam dicas para auxiliar no desenvolvimento do projeto.

## Diagramas UML: 

"O analista de sistema do projeto desenvolveu o diagrama de classes inicial abaixo. Este diagrama contém as principais classes do projeto que devem ser implementadas. O grupo tem a liberdade de adicionar novas classes no projeto, caso julguem necessário.

![image](https://github.com/user-attachments/assets/e222967a-5f7d-4bc2-9d76-d87f46b8090b)

Desenvolveu-se também o diagrama que sequência abaixo, que apresenta os passos necessários para que o atendente realize a venda de entradas de um espetáculo para um cliente.
![image](https://github.com/user-attachments/assets/348a290e-e68b-4c9f-a426-bd90f6229b2d)
![image](https://github.com/user-attachments/assets/5ae281df-f426-44b9-b932-2988922bf5d6)

## Exemplo de Execução do Programa: 

Nesta seção é apresentada como deve ser a interface com o usuário do programa. A iniciar o programa deve ser apresentado ao usuário o menu abaixo. O usuário poderá escolher umas das três opções para continuar com a execução do programa ou ainda, selecionar a opção para sair o programa.

![image](https://github.com/user-attachments/assets/9cc56513-1ffd-4d90-810a-5d3439afac02)

## Cadastrar Espetáculo:

Quando o usuário selecionar a opção 1) do menu, o sistema deve solicitar as informações necessárias para cadastrar um novo espetáculo no sistema. Após o usuário informar todos os dados necessários o espetáculo é cadastrado no sistema e retorna para o menu principal. A seguir é apresentado um exemplo de execução desta opção.

![image](https://github.com/user-attachments/assets/5f1b0fed-a1c0-4330-8d9b-0191808cd3ff)

## Cadastrar Cliente:

Quando o usuário selecionar a opção 2) do menu, o sistema deve solicitar as informações necessárias para cadastrar um novo cliente no sistema. Após o usuário informar todos os dados necessários o cliente é cadastrado no sistema e retorna para o menu principal. A seguir é apresentado um exemplo de execução desta opção.

![image](https://github.com/user-attachments/assets/4a9f1f74-841b-4831-b6d3-47c81fc6c722)

## Compra de Entradas

Quando o usuário selecionar a opção 3) do menu, o sistema deve seguir os seguintes passos para a venda de entradas ao cliente.
1. Apresentar a lista de espetáculos cadastradas no sistema. Cada espetáculo deve ser identificado por um número único. Utilizar o valor da posição (indice) que o espetáculo está armazenado na lista de espetáculos.
2. Solicitar ao usuário que selecione um espetáculo. Quando o usuário informar o número do espetáculo, apresentar a lista de assentos disponíveis, conforme exemplo abaixo. Quando o assento estiver disponível deve-se mostrar o número do assento. Quando o assento não estiver disponivel deve-se mostrar xx.
3. Para cada entrada que o usuário desejar comprar deve-se: solicitar o número do assento desejado e o tipo de entrada. Os tipos de entradas são: 1. Inteira, 2. Meia e 3. Professor. Ao final, verificar se o usuário deseja comprar uma nova entrada. Em caso positivo, repetir o processo de solicitar o número do assento e o tipo de entrada.
4. Quando o usuário não desejar mais entradas, o sistema solicita o CPF do cliente que esta comprando as entradas.
5. O sistema então apresenta o valor total a ser pago pelo cliente.
6. Ao final, o sistema retorna para o menu principal.

A seguir é apresentado um exemplo de execução desta opção.

![image](https://github.com/user-attachments/assets/6caea91c-9455-4b05-a3c1-cc08e64c1a77)
![image](https://github.com/user-attachments/assets/41726ed1-e3b5-4734-9ad1-eff2c3067e11)


