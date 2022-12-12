import java.sql.*; 

public static class jdbcexample {  
    
    public static void main(String args[])
    {  
        try{ 
            // load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");  
            // Opening the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost3000:/username","root","root");  
            //here 'username' is database name, 'root' is username and password  
            
            // Creating a statment
            Statement stmt = con.createStatement();  
            
            // Execute the statment
            ResultSet rs = stmt.executeQuery("CREATE TABLE studrnts;");  
            
            /* Code to be executed after querry */
            
            // closing the connection
            con.close();
        }catch(Exception e){ System.out.println(e);} 
    } 
} 
