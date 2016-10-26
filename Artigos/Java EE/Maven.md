#O que é Maven?

O Maven é uma ferramenta de gerenciamento, construção e implementação de projetos, ele ajuda no processo de dependência e no de build, geração de relatórios e de documentação. Muitas empresas que tem sites grandes utilizam ele, por exemplo a Caelum - um site voltado a cursos.

#Onde fazer o Download?

http://maven.apache.org/download.cgi

#Como funciona?

A unidade básica de configuração do Maven é um arquivo chamado **pom.xml**, ele fica na raiz do projeto. Ele é um arquivo conhecido como Project Object Model: lá você declara a estrutura, dependências e características do seu projeto. Por padrão o pom.xml vem com a seguinte estrutura:

```
<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>br.com.projeto</groupId>
  <artifactId>teste</artifactId>
  <version>1.0</version>
</project>
```

Contem apenas a identificação do projeto. Para muitos a utilidade mais útil do Maven é o controle de dependências, por exemplo, para especificarmos que o log4j 1.2.15 é uma dependência da aplicação, basta acrescentar dessa maneira:

```
<project>

    <dependencies>
        <dependency>
          <groupId>log4j</groupId>
          <artifactId>log4j</artifactId>
          <version>1.2.15</version>
      </dependency>
  </dependencies>

</project>
```

Quando necessário, o Maven irá baixar o jar do log4j 1.2.15 e todas as suas dependências e irá aplicar dentro do projeto.

