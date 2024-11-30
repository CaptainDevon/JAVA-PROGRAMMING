import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement 
{
    private static String url = "jdbc:mysql://localhost:3306/sampledb";
    private static String userName = "root";
    private static String password = "BLA BLA";           //i know the password juts not showing it 

    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Connection connection=DriverManager.getConnection(url, userName, password);
            Statement statement=connection.createStatement();
            String query="delete from students where id=1";
            int rowsAffected=statement.executeUpdate(query);
            System.out.println(rowsAffected+" rows affected");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
