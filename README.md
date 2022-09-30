# ProjetoFinalPOO
## Atividade Final da cadeira de Programação Orientada a Objetos
### Objetivo
Esse é o projeto final da cadeira de Programação Orientada a Objetos do curso 
Análise e Desenvolvimento de Sistemas. Nesse trabalho, simulamos que 
estávamos participando do processo seletivo de estágio da Google, e a empresa 
avaliaria o nível da implementação do projeto por parte dos candidatos.  Para isso, 
ela gostaria que cada um dos candidatos escolhesse uma temática de sistema que 
deseja desenvolver. Pensando nisso, nosso objetivo foi criar um sistema de 
registro de Carros e Motos que funcionasse como uma "Garagem" e pudesse ser 
utilizado por pessoas e lojas de automóveis seguindo todos os requisitos presentes 
no trabalho da forma mais simples possível.


### Tecnologias utilizadas
O trabalho foi feito todo na linguagem Java e a IDEA usada foi o Intellij, foram usadas as bibliotecas java.io e java.util.



### Funcionalidades
Em nosso trabalho foram implementadas 4 subclasses ([CarroEsportivo](src/CarroEsportivo.java), [CarroPasseio](src/CarroPasseio.java), 
[MotoEsportiva](src/MotoEsportiva.java) e [MotoPasseio](src/MotoPasseio.java)) com  seus respectivos modificadores  
de acesso, construtores e métodos get e set.  Então, criamos a classe abstrata [Carro](src/Carro) que serve como  
superclasse das classes CarroEsportivo e CarroPasseio, assim como a classe abstrata [Moto](src/Moto.java)  que serve 
como  superclasse  das classes MotoEsportiva e MotoPasseio.  Em seguida, criamos a interface [Motor](src/Motor.java) 
com os  métodos getMarcaMotor() e getCapacidade().

Além disso, criamos manualmente os arquivos [entrada1.txt](entrada1.txt) e [entrada2.txt](entrada2.txt) que possuem 
valores de atributos para 4 entidades cada.

Então, na [classe Principal](src/Principal.java), elaboramos o código que faz a leitura dos arquivos "entrada.txt", 
instancia as entidades presentes em cada um dos arquivos empregando polimorfismo e os armazena em ArrayList. 
Também fizemos tratamento de duas Exceptions e, para finalizar, manipulamos sobre os objetos dos ArrayList com as 
entidades, um algoritmo fundamental e escrevemos a saída nos arquivos resultado.txt ([resultado1.txt](resultado1.txt) 
e [resultado2.txt](resultado2.txt))

### Utilização
Para o programa funcionar, basta criar uma linha nos arquivos entrada1.txt (para carros) ou entrada2.txt (para motos) e 
preencher, separando por  vírgulas, os atributos referentes a um carro ou moto novos que serão adicionados a 
"garagem" e rodar o arquivo referente a classe Principal.  
A ordem dos atributos é essa:
- **Carro Esportivo**: Tipo, Modelo, Ano, Cor, Marca do Motor, Capacidade  
(Ex.: Esportivo, Lamborghini Gallardo, 2021, Vermelha, Volkswagen, 2.6)


- **Carro de Passeio**: Tipo, Modelo, Ano, Cor, Número de assentos  
(Ex.: Passeio, Siena, 2001, Cinza, 5)


- **Moto Esportiva**: Tipo, Modelo, Ano, Cor, Marca do Motor, Capacidade  
(Ex.: Esportiva, Kawasaki Ninja, 2020, Verde, Cawu, 2.0)


- **Moto de Passeio**: Tipo, Modelo, Ano, Cor, Velocidade Máxima  
(Passeio, Yamaha Fazer 250, 2010, Vermelha, 120)


Depois de rodar o projeto, será "*printado*" no terminal todos os objetos instanciados e o código irá atualizar os 
arquivos resultado1.txt e resultado2.txt com os algorítimos fundamentais escolhidos (Média de ano dos carros e 
Ano de fabricação da moto mais nova, respectivamente.)


### Colaboradores
Caio Moretti De Macedo - [Github Caio-Moretti](https://github.com/Caio-Moretti) (Matrícula: 2213905)  
Lucas Aguiar Marques - [Github lucasaguiar-dev](https://github.com/lucasaguiar-dev) (Matrícula: 2124701)
