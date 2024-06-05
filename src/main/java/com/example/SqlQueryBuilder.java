package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe para construir consultas SQL usando o padrao Builder
 **/
public class SqlQueryBuilder {

    private String table;
    private String condition;
    private List<String> columns = new ArrayList<>();

    /**
     * Define o nome da tabela pra consulta SQL
     * 
     * @param table o nome da tabela
     * @return a instancia atual de SqlQueryBuilder
     */
    public SqlQueryBuilder table(String table) {

        this.table = table;
        return this;
    }

    /**
     * Define a condição WHERE pra consulta SQL
     * 
     * @param condition a condição WHERE
     * @return a instancia atual de SqlQueryBuilder
     */
    public SqlQueryBuilder where(String condition) {

        this.condition = condition;
        return this;
    }

    /**
     * Define as colunas a serem selecionadas na consulta SQL
     * 
     * @param columns as colunas a serem selecionadas
     * @return a instancia atual de SqlQueryBuilder
     */
    public SqlQueryBuilder select(String... columns) {

        this.columns.addAll(Arrays.asList(columns));
        return this;
    }

    /**
     * Constrói a consulta SQL com base nos parâmetros fornecidos
     * 
     * @return a consulta SQL como uma string
     */
    public String build() {
        StringBuilder sql = new StringBuilder("SELECT ");
        if (columns.isEmpty()) {
            sql.append("*");
        } else {
            sql.append(String.join(", ", columns));
        }
        sql.append(" FROM ").append(table);
        if (condition != null) {
            sql.append(" WHERE ").append(condition);
        }
        return sql.toString();
    }
}