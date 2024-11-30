import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateDB {
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String userName = "root";
    private static String password = "blabla";   // i know the pass just i not showing 
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
                 
            String databaseName = "SampleDb";
            connection = DriverManager.getConnection(url, userName, password);

            String sql = "CREATE DATABASE " + databaseName;

            statement = connection.createStatement();
            statement.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Database created successfully: " + databaseName);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } 
        finally 
        {
            try 
            {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error while closing resources: " + e.getMessage());
            }
        }
    }
}
