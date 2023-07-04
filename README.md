# JavaCodigos

Exercícios - Capítulos 4 e 6

1. Crie a classe Cachorro com os atributos raca e nome (Strings). Os atributos
devem ser privados, com métodos get( ) e set( ) para cada um. Crie três
construtores:
a. O primeiro sem parâmetros
b. O segundo deve receber apenas o nome. Neste caso, inicie a raca
como “indeterminada”.
c. O terceiro recebe raca e nome.
Crie um método latir( ), que não recebe parâmetros e imprime na tela a
mensagem “auau”. Crie o método latirRepetido( ) que recebe um inteiro como
parâmetro, correspondente ao número de vezes que será impresso na tela a
mensagem “auau”. Restrições: se o parâmetro for menor que zero, a
mensagem deve ser “bugou”; se for maior que 100, a mensagem deve ser
“parâmetro inválido”.
Crie o método main( ) em uma classe separada para testar.

3. Crie uma classe chamada Container, com os atributos:
a. capacidade (double): capacidade do container em metros quadrados
b. ocupado (boolean): se está ocupado ou não
Os atributos devem ser privados, com métodos get( ) e set( ) para cada um.
Crie dois construtores:
a. um que não recebe argumentos: inicia capacidade com 0.0 e ocupado
com false
b. um que recebe os valores para os atributos.
Crie o método ocupar( ), que recebe a medida (em m2

) do conteúdo. O

método deve:
a. mudar o valor de ocupado para true e retornar true, caso a medida
seja menor ou igual a capacidade e o container não esteja ocupado;
b. retornar false, caso a medida seja superior à capacidade ou o
container já esteja ocupado.

3. Crie uma classe BombaDeGasolina, com os atributos reservatorio (inicia com
5000), precoLitro (inicia em 5.20), litrosVendidos (inicia em 0), valorVendas
(inicia em 0). Crie o método abatecerPorLitro( ), que recebe a quantidade de
litros que o cliente quer abastecer, retira esta quantidade do reservatório,
adiciona em litrosVendidos e calcula e incrementa o valorVendas. Crie o
método abatecerPorDinheiro( ), que recebe a quantidade em reais que o

cliente quer abastecer, incrementa o valorVendas, faz o cálculo de quantos
litros vão ser retirados, retira esta quantidade do reservatório e adiciona em
litrosVendidos. Crie o método status( ), que retorna quantos litros tem no
reservatório. Para testar, instancie uma bomba de gasolina, faça uma venda
por litros, uma venda por quantidade de reais e depois mostre o status da
bomba. (Atributos devem ser privados com get( ) e set( ) para cada um)

4. [Métodos static] Crie uma classe chamada Util com os métodos:
a. ehPar( ): recebe um inteiro e retorna verdadeiro, se o número for par,
ou falso, se for ímpar.
b. ehNegativo( ): recebe um inteiro e retorna verdadeiro se ele for menor
que zero, ou falso, caso contrário.
c. maior( ): recebe dois números do tipo double e retorna o maior deles.
5. [varargs] Crie um método com parâmetros de quantidade variável (inteiros).
O método deve retornar o maior dos elementos. Crie o método main( ) para
testar.

7. Crie a classe “Paciente” com os atributos “codigo” (numérico), “nome” e
“dataNascimento” (LocalDate). Crie a classe “Consulta” com os atributos
“data” (LocalDate) e paciente (atributo do tipo Paciente). Crie o programa
para instanciar (criar) um objeto do tipo Paciente e atribua valores para os
campos. Depois, crie um objeto do tipo Consulta e atribua o paciente criado
ao campo “paciente” da consulta.
Obs. Para criar um objeto LocalDate:
LocalDate data = LocalDate.of(ano, mes, dia);
Para obter a data do sistema:
LocalDate hoje = LocalDate.now( );
9. Café é um produto muito apreciado por programadores. Sabendo disso, a empresa
ProgExpress lançou uma máquina de café que trabalha com cartões pré-pagos. O
sistema funciona da seguinte maneira: o cliente adquire um cartão, inicialmente com
10 unidades (10 cafés). A cada café retirado da máquina, o saldo do cartão é
decrementado. O cliente pode comprar mais cafés (carregar o cartão) com uma
quantidade qualquer de unidades.
a) Crie uma classe chamada Cartao, com o atributo saldo.
b) Crie um construtor vazio para a classe Cartao que inicialize o atributo saldo com
10.
c) Crie um método chamado carregar( ) que recebe como parâmetro um inteiro
correspondente à quantidade de créditos que estão sendo carregados. O método
soma estes créditos ao saldo anterior.

d) Crie um método chamado utilizar( ) que decrementa o saldo em uma unidade.
e) Crie um programa com casos de teste
