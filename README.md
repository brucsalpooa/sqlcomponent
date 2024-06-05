# Componente SQL

Este é um componente de software criada para uma avaliação da disciplina de Programação Orientada a Objetos Avançada, responsável por fornecer funcionalidades relacionadas à geração de consultas SQL.

## Descrição
Este componente contém uma classe chamada `SqlQueryBuilder`, que é capaz de construir consultas SQL de forma dinâmica com base em determinados critérios.

## Configuração do Maven
Certifique-se de incluir este componente como uma dependência em seu projeto Maven. Aqui está um exemplo de como adicionar a dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>sqlcomponent</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
##Uso
Você pode usar a classe SqlQueryBuilder para construir consultas SQL em seu próprio código Java. Aqui está um exemplo de como usá-lo:

import com.example.SqlQueryBuilder;

public class Main {
    public static void main(String[] args) {
        SqlQueryBuilder builder = new SqlQueryBuilder();
        // Use os métodos da classe SqlQueryBuilder para construir consultas SQL
    }
}

##Documentação
A documentação Javadoc está disponível no diretório target/site/apidocs após a compilação do projeto. Você pode gerar a documentação usando o comando Maven mvn javadoc:javadoc.
