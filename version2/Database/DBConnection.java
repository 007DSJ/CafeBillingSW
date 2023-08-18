package Database;

import java.sql.*;

public class DBConnection {

    public static void main(String args[]) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "root123";

        try {
            Class.forName("com.mysql.jdbc.Driver");  
            // Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/Maulik","root","root"); 
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            statement.executeQuery("USE cafesw;");
            String sqlQuery = "SELECT * FROM details;";
            resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                String personName = resultSet.getString("personName");
                String address = resultSet.getString("address");
                String gender = resultSet.getString("gender");
                System.out.println(" personName = "+personName+"\taddress = "+address+"\tgender = "+gender);
                
            }

        } catch (Exception e) {
               e.printStackTrace();
        }
        finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
