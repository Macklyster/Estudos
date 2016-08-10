#Explicação dos conteudos usados nessa aula


## Pasta Usuário -> create.xhtml e pacote validator e converter
''''
Esse arquivo foi adicionado duas novas tags, **f:converter** e **f:validator**. Esses dois são baseados nos pacotes **converter** e **validator**. Eles ficam encarregados de converter ou validar os campos da forma que queremos, digamos que nos possibilita em criar as regras para ser aceito no Banco de Dados.

Observe que nos arquivos dentro dos pacotes, ele tem uma anotação **@FacesConverter** e **@FacesValidator**, com ele podemos aplicar um nome que será atribuido nas tag de **f:converter** e **f:validator**.

''''

##Pacote Mb
''''
Os arquivos desse pacote são os ManagedBean - funciona como uma classe que “delega” funções específicas para cada View na sua aplicação.
As nossas views são as pastas **usuario**, **professor** e **aluno**.
''''