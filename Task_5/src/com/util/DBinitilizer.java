package Task_5.src.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinitilizer {
    // use sqlite as a jdbc
    private static final String dbURL = "jdbc:sqlite:students.db";

    public static void createDatabace(){
        try(Connection conn = DriverManager.getConnection(dbURL)){
            String sql ="""
                    CREATE TABLE IF NOT EXISTS students (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        rollNumber TEXT NOT NULL,
                        name TEXT NOT NULL,
                        grade TEXT NOT NULL,
                        contactNumber INTEGER NOT NULL,
                        email TEXT NOT NULL
                    );
                    """;
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Db Initialized");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection connectDB() throws SQLException{
        return DriverManager.getConnection(dbURL);
    }

}
