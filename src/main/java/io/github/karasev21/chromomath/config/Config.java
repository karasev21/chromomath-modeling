package io.github.karasev21.chromomath.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
  private static Properties properties = new Properties();
  
  static {
    try (InputStream input = Config.class.getClassLoader().getResourceAsStream("config.properties")){
      if(input == null){
        throw new IllegalArgumentException("Unable to find config.properties");
      }
      properties.load(input);
    }
    catch (IOException e){
      e.printStackTrace();
    }
  }

  public static String getDbUrl() {
    return properties.getProperty("db.url");
  }

  public static String getDbUsername() {
    return properties.getProperty("db.username");
  }

  public static String getDbPassword() {
    return properties.getProperty("db.password");
  }

}


