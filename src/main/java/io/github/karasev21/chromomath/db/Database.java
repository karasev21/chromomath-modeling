package io.github.karasev21.chromomath.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

  private static final String URL =
   "jdbc:postgresql://localhost:5432/chromomath-modeling-db";
  public static final String USER = "postgres";
  public static final String PASSWORD = "1234";
  
  public static Connection getConnection(){
    Connection connection = null;
    try {
      connection = DriverManager
      .getConnection(URL, USER, PASSWORD);
      System.out.println("Connection succed!");
    }
    catch (SQLException e){
      System.out.println("Connection failed!" + e.getMessage());
    }
    return connection;
  }

  public static void fillDatabase(){

  }

}
