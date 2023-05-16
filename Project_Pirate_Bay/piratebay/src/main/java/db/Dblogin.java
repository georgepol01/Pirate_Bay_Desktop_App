package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Dblogin {
    
    public  static String driverClassName = "org.postgresql.Driver" ;
    public  static String  url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it134050" ;
    public  static Connection dbConnection = null;
    public  static String  username = "it134050";
    public  static String  passwd = "904766";
    public  static Statement st = null;
    public  static PreparedStatement prst = null;
    public  static ResultSet rs = null;
    
}
