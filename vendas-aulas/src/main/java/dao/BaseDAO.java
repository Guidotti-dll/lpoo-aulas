package dao;


public class BaseDAO {
    public static Connection getConnection() {

        try {
            //a string com a url para o banco de dados
            //sintaxe: protocolo:tecnologia://domínioDoServidor:porta/database
            final String url = "jdbc:mariadb://localhost:3306/vendas";
            //argumentos: url para o banco, usuário, senha.
            //retorna um objeto da classe Connection (do pacote java.sql -> que segue a especificação JDBC).
            return DriverManager.getConnection(url, "mariadb-user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            return null; //se não conectar, retorna null.
        }
    }

    //um main para testar a conexão com o servidor do MariaDB
    public static void main(String[] args) {
        System.out.println(BaseDAO.getConnection());
    }

}
