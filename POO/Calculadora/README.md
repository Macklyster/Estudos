#Explicação do Projeto

O projeto foi desenvolvido de modo que, caso queremos adicionar novas operações à calculadora, ele será capaz de fazer tranquilamente a função.

##Pacotes
No projeto existem quatro pacotes, cada um tem uma função importante para o funcionamento do projeto.

###Pacote App
O pacote app ficará localizado o nosso programa, onde iremos executar os testes. Só para adiantar o entendimento desse arquivo,  foi criado três atributos que iremos usar como parâmetro dentro do método, para que ele realize o teste de acordo com os valores passado. Com isso facilita, deixando mais limpo o nosso código e também mais organizado e fácil de entender.

**OBS:** _Comece a ler o código pela interface que está localizado no pacote interfaces._

###Pacote Classes
Este pacote é o nosso pacote mais importante, pois é nele que iremos criar as classes de cada operação que queremos que a nossa calculadora tenha. Para um melhor entendimento desse pacote leia primeiro a classe **CalculoMatematico.java**, nele contem alguns comentários referente aos métodos.

###Pacote Fabricas
Este pacote contem um arquivo chamado **FabricaCalculos**, caso adicione uma nova operação, é nessário acrescentar a condição dentro deste arquivo, para que ele funcione corretamente, pois o nosso programa primeiro cria uma calculadora instanciada de FabricaCalculos, para só depois ele criar um novo calculo matemático que é instanciado do arquivo **CalculoMatematico**.

##Pacote Interfaces
Este pacote é o que será necessário iniciar a leitura e saber o conceito dele para que o restante das classes funcione perfeitamente. Lembre-se, interface é como se fosse um contrato, ou seja, delimitamos regras que o nosso programa obrigatoriamente irá conter quando criado.


>Bons Estudos :)