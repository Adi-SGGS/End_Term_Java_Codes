import java.sql.*; 

public static class jdbcexample {  
    
    public static void main(String args[])
    {  
        try{ 
            // load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost3000:/username","root","root");  
            //here 'username' is database name, 'root' is username and password  
            Statement stmt = con.createStatement();  
            ResultSet rs=stmt.executeQuery("CREATE TABLE studrnts;");  
            /* Code to be executed after querry */
        }catch(Exception e){ System.out.println(e);} 
    } 
} 
