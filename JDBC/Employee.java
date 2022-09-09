import java.sql.*;
 
public class GFG {
 
    // Step1: Main driver method
    public static void main(String[] args)
    {
        // Step 2: Making connection using
        // Connection type and inbulit function on
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
 
        con = connection.connectDB();
 
        // Try block to catch exception/s
        try {
 
            // SQL command data stored in String datatype
            String sql = "select * from cuslogin";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("id\t\tname\t\temail");
 
            // Condiion check
            while (rs.next()) {
 
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + "\t\t" + name
                                   + "\t\t" + email);
            }
        }
 
        // Catch block to handle exception
        catch (SQLException e) {
 
            // Print exception pop-up on scrreen
            System.out.println(e);
        }
    }
}