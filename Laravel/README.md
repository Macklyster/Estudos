#Como instalar o Laravel no Ubuntu

##Instalando o Composer

```
curl -sS https://getcomposer.org/installer | php
sudo mv composer.phar /usr/local/bin/composer
```
##Criando projeto Laravel

```
cd localhost
sudo composer create-project laravel/laravel nomeDoArquivo --prefer-dist
sudo chmod -R 777 work
```

#Executando a aplicação no servidor de desenvolvimento do PHP

Primeiro entre na pasta do projeto, em seguida digite o comando abaixo:

```
php artisan serve
```
**OBS**: Para saber que funcionou, irá aparecer a seguinte mensagem:

```
Laravel development server started on http://localhost:8000/

```


Para acessar no navegador, digite:
```
localhost:8000
```

###O que é o Artisan?

O artisan é uma ferramenta de linha de comando, com ela temos uma série de comandos úteis para tornar nosso desenvolvimento mais produtivos, uma delas é alterar o nome do namespace que o padrão é **app**.

Para alterar o nome do namespace, basta digitar o comando abaixo:

```
php artisan app:name nomeDoProjeto
```

Para saber se a alteração ocorreu corretamente, aparecerá uma mensagem:

>Application namespace set!

##Criando Classes para model, via artisan

As vezes precisaremos criar uma estrutura na pasta **app** que será a nossa classe de modelo. Se fossemos fazer na mão, teríamos que criar um novo arquivo dentro de **app** e escrever o código abaixo, como exemplo:

```

namespace estoque;

use Illuminate\Database\Eloquent\Model;

class Produto extends Model
{

}
```

Fica trabalho, ter que inserir o namespace, o use e também classe extendendo o nosso Model, não é mesmo? Para isso o artisan nos ajuda, ele não é apenas capaz de subir nosso servidor, ele também nos ajuda nesses detalhes.

Basta abrir o terminal e digitar o seguinte comando:

>php artisan make:model nomeDoArquivo -m

Após iniciar esse comando o artisan irá criar uma classe dentro de app já com o código pronto, fácil não?

>O make:model é o que cria a nossa estrutura de modelo.

>O **-m** cria dentro da pasta database -> migrations um arquivo com o nome da tabela, ele que será responsável por ensinar ao Laravel como criar, atualizar ou recuperar o estado anterior do esquema do banco de dados. Os Migrations, trabalham como um controle de versão do banco de dados. Observe que no nome do arquivo ele começa com uma data em que foi criada, é dessa maneira que ele consegue saber exatamente a ordem em que elas devem ser executadas.

Obs: Dentro do arquivo que foi gerado na pasta migration, temos que colocar as colunas da tabela que queremos dentro do método **up**, por exemplo, suponhamos que seja uma tabela de produtos, o método poderia ser da seguinte maneira:

```
public function up() {
Schema::create('produtos', function (Blueprint $table) {
$table->increments('id');
$table->string('nome');
$table->decimal('valor', 5, 2);
$table->string('descricao');
$table->integer('quantidade');
$table->timestamps();
});
}
```

Agora, podemos executar um comando no terminal do artisan que irá migrar esse resultado para o nosso banco de dados, vejamos:

>php artisan migrate

O retorno da mensagem: **Migrated: 2016_10_23_132352_create_produtos_table
**

Caso precisar alterar algo no banco, por exemplo alterar o tipo de uma coluna, após mexer no arquivo de migração, basta digitar o comando abaixo:

>php artisan migrate:rollback

E em seguida digitar novamente o comando abaixo:
>php artisan migrate

- Pronto, a tabela é atualizada.

Agora se a gente acessar o banco de dados, observe que foi criado a tabela com as colunas que existe dentro do método.

#Mexendo na pasta seeds

Um seeder é uma classe que popula o banco de dados com algumas informações iniciais, normalmente são informações apenas para testes. Toda a mágica acontece dentro do arquivo **DatabaseSeeder.php**, presente no diretorio **database/seeds**.

Para popularmos o nosso banco de dados, podemos criar nesse mesmo arquivo uma classe, por exemplo: 

```
class ProdutoTableSeeder extends Seeder {
public function run() {

}
}

```

Dentro do método **run**, iremos fazer as nossas inserções para o banco, vejamos um exemplo do arquivo completo:

```
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class DatabaseSeeder extends Seeder {
/**
* Run the database seeds.
*
* @return void
*/
public function run() {
$this->call('ProdutoTableSeeder');
}
}

class ProdutoTableSeeder extends Seeder {
public function run() {
DB::insert('insert into produtos
(nome, quantidade, valor,  descricao)
values(?,?,?,?)',
array('Geladeira', 2, 590, 'Side by Side com gelo na porta'));

DB::insert('insert into produtos
(nome, quantidade, valor,  descricao)
values(?,?,?,?)',
array('Fogão', 5, 950.00, 'Painel automatico e forno elétrico'));

DB::insert('insert into produtos
(nome, quantidade, valor,  descricao)
values(?,?,?,?)',
array('Microondas', 1, 1500, 'Manda SMS quando termina de esquentar'));
}
}
```

Observe que informamos ao arquivo seguinte comando:
>use Illuminate\Support\Facades\DB;

Pois precisamos acessar o nosso banco de dados, certo?

Veja tambem que dentro da classe **DatabaseSeeder**, colocamos dentro do método run o call com o parâmetro ProdutoTableSeeder da nossa classe de inserção.

Pronto está tudo configurado, basta rodar o seed, digitando no console o comando abaixo:

>php artisan db:seed

E pronto, basta verificar no banco que os dados foram inseridos. A mensagem que será mostrada no console será:

>Seeded: ProdutoTableSeeder


#Configurando as Rotas

Quando iniciamos o projeto com Laravel a página padrão é as boas vindas do FrameWork, esse processo quem trabalha é a parte de rotas. 

Observe que existe uma pasta chamada routes e dentro dela existe um arquivo chama web. Podemos analisar que ele está levando para uma página de bem vindo, podemos alterar, criando nossas próprias rotas, substituindo apenas por essa função:

```
Route::get('/', function () {
return 'Primeira lógica com Laravel';
});

```

Podemos também além de inserir a barra, colocar um nome, por exemplo:

```
Route::get('/index', function () {
return view('index');
});

```
**Obs**: Para que a index abra, temos que criar um arquivo com o nome **index** na pasta **view**, ela fica dentro de **app**

#Observações Adicionais após criar um projeto e interagir com o Banco

>Abra o arquivo .env e coloque as informações de conexão com o banco de dados, além é claro do arquivo **database.php** localizado na pasta **database**

#Trabalhando com a View

Para criar uma view, o arquivo deve ficar em **resources** -> **views**. 
Lembre-se que nossa view não pode ter acesso ao banco de dados, isso não é o trabalho dela, quem faz isso é o controller, nesse caso podemos fazer um exemplo, criando um arquivo listagem.php dentro da view:

```
<!DOCTYPE html>
<html lang="en">

<body>
    <h1>Listagem de produtos</h1>

    <table>
       foreach ($produtos as $p):?>
       <tr>
        <td><?=$p->nome?></td>
        <td><?=$p->valor?></td>
        <td><?=$p->descricao?></td>
        <td><?=$p->quantidade?></td>
    </tr>
    endforeach?>
</table>
</body>
</html>
```

Agora, em nosso controller podemos acessar o banco e informar para a view os dados:

```
public function lista() {
$produtos = DB::select('select * from produtos');

return view('listagem')->with('produtos', $produtos);
}
```

observe o método **with**, ele fica encarregado de declarar nossa variável dentro da view, se não colocarmos esse método surgirá um erro dizendo que a variável não foi definida.

##Configurando as mensagens de erro

Em nosso arquivo **.env** pode ser colocado a seguinte linha:

>APP_DEBUG=TRUE

Com isso, os erros serão mais detalhados pelo Laravel, quando é acessado pelo navegador.

