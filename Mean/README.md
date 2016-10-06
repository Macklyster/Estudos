#Estudo sobre Mean

Todo contéudo que eu estudar ou fazer testes que envolvam Mean, eu irei publicar aqui.


##Instalando Mongo-Hacker no Ubuntu

O mongo-hacker é uma extensão para o terminal que adiciona algumas funcionalidades a mais, uma delas é deixando os comandos coloridos e dando a opção de identar o código dentro do terminal - deixando mais fácil o entendimento do código.

Esses dias eu acessei o repositório do TylerBrock para instalar o [mongo-hacker](https://github.com/TylerBrock/mongo-hacker).

Nele, contém o comando necessário para essa instalação:
>npm install -g mongo-hacker

Porém, no meu caso, começou a dar um erro e através de muitas pesquisas, descobri a solução. Antes de digitar o comando acima, digite:
>sudo chown -R $(whoami) $(npm config get prefix)/{lib/node_modules,bin,share}
>[Link da Explicação](https://docs.npmjs.com/getting-started/fixing-npm-permissions)

Após digitar este código, tente novamente o primeiro, no meu funcionou perfeitamente. Lembrando que foi para o Ubuntu!


##Iniciando serviço MongoDb no Ubuntu

Atualmente venho tendo alguns problemas com a inicialização do MondoDb, bastar fazer a sequencia a baixo que rodará normal com todos os bancos já usados anteriormente.

####Start MongoDB:

>$ sudo service mongod start
mongod start/running, process XXXXX

####Check the Status:

>$ sudo service mongod status
mongod start/running, process XXXXX

####Stop MongoDB:

>$ sudo service mongod stop
mongod stop/waiting
