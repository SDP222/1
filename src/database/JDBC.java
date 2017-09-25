package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    static String field1 = "[\n" +
            "[3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1]@\n" +
            "[2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,2]@\n" +
            "[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3]]";
    static String obj1 = "[\n" +
            "[0,0,0,0,0,0,9,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,7,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,11,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,4,5,0,0,3,0,2,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n" +
            "]";
    static String field2 = "[\n" +
            "[0,3,0,0,3,2,2,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,3,2,2,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,3,2,2,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,3,2,2,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,3,0,0,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,3,0,3,3,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,3,3,3,0,3,3,3,0,3,3,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]]";
    static String obj2 = "[\n" +
            "[0,0,0,0,0,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,5,0,0,3,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,4,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n" +
            "]";
    static String field3 = "[\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,3,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0]@\n" +
            "[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]]";
    static String obj3 = "[\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]@\n" +
            "[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n" +
            "]";

    static void connectDB() {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    static void createDB() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "CREATE TABLE player " +
                    "(ID INTEGER PRIMARY KEY autoincrement," +
                    " message        TEXT     NOT NULL) ";
            stmt.executeUpdate(sql);
            stmt.close();
            stmt = c.createStatement();
            sql = "CREATE TABLE levels " +
                    "(ID INTEGER PRIMARY KEY autoincrement," +
                    " field        TEXT     NOT NULL," +
                    " obj        TEXT     NOT NULL) ";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    static void insertDB() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "INSERT INTO player (message) " +
                    "VALUES" +
                    " ('[1,1,0,0,0,10,10,10,0]');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            sql = "INSERT INTO levels (field, obj) " +
                    "VALUES" +
                    " ('" + field1 + "','" + obj1 + "');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            sql = "INSERT INTO levels (field, obj) " +
                    "VALUES" +
                    " ('" + field1 + "','" + obj1 + "');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            sql = "INSERT INTO levels (field, obj) " +
                    "VALUES" +
                    " ('" + field2 + "','" + obj2 + "');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            sql = "INSERT INTO levels (field, obj) " +
                    "VALUES" +
                    " ('" + field3 + "','" + obj3 + "');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public static void main(String args[]) {
      /*  connectDB();
        createDB();
        insertDB();*/
        String[] gg = selectDBfield(3);
        String f = selectDBplayer();
        System.out.println();
        // selectDB();
        //updateDB();
        //deleteDB();
    }

    static String[] selectDBfield(int stage) {
        Connection c = null;
        Statement stmt = null;
        String[] result = new String[2];
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
            c.setAutoCommit(false);
            //   System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM levels WHERE ID=" + stage + ";");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("field");
                String message = rs.getString("obj");
                result[0] = name;
                result[1] = message;
              /*  System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Message : " + message);
                System.out.println();*/
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //   System.out.println("Operation done successfully");
        return result;
    }

    static String selectDBplayer() {
        Connection c = null;
        Statement stmt = null;
        String result = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM player;");
            while (rs.next()) {
                int id = rs.getInt("id");
                result = rs.getString("message");
              /*  System.out.println("ID : " + id);
                System.out.println("Name : " + result);
                System.out.println();*/
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        // System.out.println("Operation done successfully");
        return result;
    }

    public static void savePosDB(String playerS, String fieldS, String objS) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:game.sqlite");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "UPDATE player set message = '" + playerS + "' where ID=1;";
            stmt.executeUpdate(sql);
            c.commit();
            sql = "UPDATE levels set field = '" + fieldS + "', obj= '" + objS + "' where ID=1;";
            stmt.executeUpdate(sql);
            c.commit();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
