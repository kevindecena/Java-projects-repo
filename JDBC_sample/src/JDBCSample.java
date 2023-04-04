import java.sql.*;

public class JDBCSample {
    public static void main(String[] args) {

        try {
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Sample","root", "root1234");
                Statement stmt = conn.createStatement();


            String strSelect = "select Distinct FirstName from person";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);


            System.out.println("First names are (No duplicates): ");
            int rowCount = 0;


            while (rset.next()) {
                String name = rset.getString("FirstName");
                System.out.println(name);
                ++rowCount;
            }

        }  catch(SQLException ex) {
        ex.printStackTrace();
    }

}



}