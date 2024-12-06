package mysql.examples;

import java.sql.*;


// todo: use this to run the the code java -cp /Path/To/Jar/mysql-connector-j-9.1.0/mysql-connector-j-9.1.0.jar JDBC_Example_1.java


public class JDBC_Example_1 {


    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            String username = System.getenv("MYSQL_USERNAME");
            String password = System.getenv("MYSQL_PASSWORD");

            if (username == null || password == null) {
                throw new RuntimeException("MySQL username or password environment variables are not set.");
            }

            String connectionString = "jdbc:mysql://localhost/college?"
                + "user=" + username + "&password=" + password
                + "&useSSL=false&allowPublicKeyRetrieval=true";

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from college.courses");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int units = resultSet.getInt("units");

                // print out the result
                System.out.println("Course ID: " + id + " is " + name + " and has " + (units + units));
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}