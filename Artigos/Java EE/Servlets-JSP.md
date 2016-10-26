#Servlet e JSP (Java Server Pages)

Um Servlet é uma classe escrita em Java, os objetos dessa classe tem como objetivo em gerar documentos em HTML. Com isso, implica que os Web Designer tenha a obrigação de saber Java, porém, são raros que aĺém de fazer a parte de Designer entendam também a linguagem Java, para isso entra o JSP.

Uma página escrita em JSP, é uma página escrita em HTML com pequenas códigos em Java, evitando assim, que o Web Designer, tenha que escrever alguma linha de Java.

#Exemplo

Se fossemos usar apenas o Servlet para fazer uma página, simples, com HTML, ficaria dessa forma:

```
protected void service(HttpServletRequest request,
HttpServletResponse response) {

// log
System.out.println("Tentando criar um novo contato...");

// acessa o bean
Contato contato = new Contato();
// chama os setters
...
// adiciona ao banco de dados
ContatoDao dao = new ContatoDao();
dao.adiciona(contato);

// ok.... visualização
out.println("<html>");
out.println("<body>");
out.println("Contato " + contato.getNome() +
" adicionado com sucesso");
out.println("</body>");
out.println("</html>");

}
```
Observe que temos que dar um **println** em cada linha escrevendo o nosso HTML, dessa forma fica muito feio, certo?

Para isso o JSP surgiu, podemos extrair essa parte do HTML, criando um arquivo com a extensão .jsp e simplesmente fazer dessa maneira:

```
<html>
<body>
    Contato ${param.nome} adicionado com sucesso
</body>
</html>

```

Poderiamos deduzir que o Cliente dentro da página JSP faça uma ação **(por exemplo, que seja necessário ir a um banco de dados, para retornar um valor)**, o JSP se comunica com o Servlet e ele fica encarregado de ir no Banco, pegar o Valor que o cliente quer e trazer para o JSP, mostrando no final para o Cliente o resultado.