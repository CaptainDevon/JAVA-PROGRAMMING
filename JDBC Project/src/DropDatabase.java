import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DropDatabase {
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String userName = "root";
    private static String password = "BLA BLA";   // i know the pass just i not showing 
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
                 
            String databaseName = "sampleDb";
            connection = DriverManager.getConnection(url, userName, password);

            String sql = "DROP DATABASE " + databaseName;

            statement = connection.createStatement();
            statement.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Database Deleted successfully: " + databaseName);
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
