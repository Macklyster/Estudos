#Explicação dos códigos usados no projeto da segunda aula

Para uma melhor organização do nosso projeto, dentro da pasta **Páginas Web**, criamos uma nova pasta chamada **usuario** e dentro dessa pasta, criamos um arquivo XHTML chamada de **cadastro**.

##Arquivo Cadastro

No **h:panelGrid** colocamos 3 colunas, para inserir a mensagem de erro - nesse caso usamos o h:message para esta situação. Observe que o atributor **for** referece ao **for** da tag **h:outputLabel**.

Dentro da tag **inputText**, colocamos a tag **f:validateLenght**, ela serve para tratar o campo em questão. Nesse caso colocamos o número mínimo de caracteres de 5 e no máximo 10. Caso o usuário escreva fora dessa regra, aparecerá uma mensagem de erro, informando o motivo.

Dentro do campo de **nascimento**, colocamos a tag **f:converterDateTime**, com ela conseguimos tratar o formato das datas - existem outros atributos que podem ser adicionados.

No campo de **Email**, usamos a tag **f:validateRegex**, ela serve para tratar o campo com **Expressões Regulares**. Nesse caso estamos criando uma regra de como deve ser preenchido este campo, para que todos os e-mails tenha um padrão no sistema.

No **Pacote de Códigos-fonte, criamos duas **packages**, vamos analisar primeiro o pacote **mb**. Este mb significa **ManagedBean**, ficará a nossa regra de negócio. Nela contém um arquivo chamado **UsuarioCadastrar.java**. Ela é uma classe, que terá as nossas regras de negocio, para o arquivo de **Cadastro** lá do nosso **usuário**. Essa classe tem um atribuito, que é instânciado da classe **Usuário** - __Essa classe usuário está localizada na pasta de__ **Bibliotecas**. Essa classe UsuarioCadastrar tem também o Getter e o Setter e foi criado um método para salvar.

Agora vamos analisar o package **listener**. Este package executa quando ele percebe que é necessário a executação de uma determinada tarefa. Podemos perceber que temos um arquivo chamado de **Conexão.java**. Ela fica encarregada de saber quando iniciar uma conexão.