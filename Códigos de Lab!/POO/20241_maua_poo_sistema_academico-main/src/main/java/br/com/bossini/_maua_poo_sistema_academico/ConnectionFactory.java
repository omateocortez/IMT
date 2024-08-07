
package br.com.bossini._maua_poo_sistema_academico;

import java.sql.DriverManager;
import java.sql.Connection;


public class ConnectionFactory {
    private static String host = "mysql-36663a53-omateocortez.h.aivencloud.com";
    private static String porta = "22705";
    private static String db = "defaultdb";
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_4uqkQNgN7CjEMNhUpVB";
        

    public static Connection obterConexao () throws Exception{
        String url = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, porta, db
        );
        return DriverManager.getConnection(url, usuario, senha);

    }
}