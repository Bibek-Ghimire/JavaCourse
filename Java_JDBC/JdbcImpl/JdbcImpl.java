package Java_JDBC.JdbcImpl;


import Java_JDBC.DbUtil.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcImpl {

    static String insertSql = "INSERT INTO students (id, name, age) VALUES (1, 'Sanjeet', 20),(2, 'Samir', 19),(3, 'Sushim', 21);\n";
    static String selectSql = "select * from students";
    static String updateSql = "update students set name='Raman' where id=3";
    static String deleteSql = "delete from students where id=3";


    public static void main(String[] args){
        DbConfig db = DbConfig.getInstance();
        Connection connection = db.getConnection();
        PreparedStatement ps;
        ResultSet resultSet;
        try {

             // Inserrt Query
//
//            System.out.println("Inserting data into the students table...");
//            ps = connection.prepareStatement(insertSql);
//            int rows = ps.executeUpdate();
//            System.out.println(rows + " affected");



            // Select Query

            System.out.println("Retrieving data from the students table...");
            ps = connection.prepareStatement(selectSql);
            resultSet  = ps.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                System.out.println("The data from table are :: ");
                System.out.println("Id: " + id + " Name: " + name + " Age: " + age );
            }


            // Update Query

            System.out.println("updating data in the students table...");
            ps = connection.prepareStatement(updateSql);
            int updatedRows  = ps.executeUpdate();
            System.out.println(updatedRows + " rows affected...");



            //  Delete Query

            System.out.println("Deleting data from the students table...");
            ps = connection.prepareStatement(deleteSql);
            int deletedRows  = ps.executeUpdate();
            System.out.println(deletedRows + " rows affected...");


            connection.close();
            System.out.println("Connection is closed...");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

