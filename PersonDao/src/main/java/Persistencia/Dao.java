package Persistencia;


import java.net.URL;
import java.sql.*;

//logica clase principal conexion base de datos
public class Dao {
    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultSet;

    private final String USER= "root";
    private final String PASSWORD= "root";
    private final String DRIVER = "com.mysql.cj.Driver";
    private final String URL= "jdbc:mysql://localhost:3306/jdbc?userSSL=false";


    //metodo de conexion
    protected void conexiondatabase() throws Exception{
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException SQLException e){
            throw new Exception("error al conectar");
        }
    }

    //metodo de desconexion
    protected void disconectdatabase() throws Exception{
        try{
            if (connection != null) {
                statement.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
    }catch (SQLException e){
            throw new Exception("error al conectar");
        }
    }

    //metodo de consulta
    public void queryDatabase(String sql) throws Exception{
        try {

            conexiondatabase();
            statement= connection.createStatement();//consultas
            resultSet=statement.executeQuery(sql);

        }catch (SQLException e){
            throw new Exception("error al consultar");

        }
    }
}
