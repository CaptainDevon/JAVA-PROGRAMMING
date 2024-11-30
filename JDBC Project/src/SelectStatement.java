import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import javax.swing.JOptionPane;

public class SelectStatement {
    private static String url = "jdbc:mysql://localhost:3306/sampledb";
    private static String userName = "root";
    private static String password = "Bla Bla";  // i know the password just not showing

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            String query = "select * from students";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("   ID   " + "   name   " + "   age    " + "   marks   ");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("   " + id + "   " + "   " + name + "   " + "   " + age + "    " + "   " + marks + "   ");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
