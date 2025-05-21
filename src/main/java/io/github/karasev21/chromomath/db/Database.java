package io.github.karasev21.chromomath.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  
  public static Connection getConnection(String url, String user, String password){
    Connection connection = null;
    try {
      connection = DriverManager
      .getConnection(url, user, password);
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
