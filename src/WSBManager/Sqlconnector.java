package WSBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Sqlconnector {
	/**
	 * Konstruktor domyœlny 
	 * @param prop 
	 */
	public Sqlconnector(Properties prop) {
		String driver = prop.getProperty(WSBproperties.PROP_DB_DRIVER);
		String path = prop.getProperty(WSBproperties.PROP_DB_PATH);
		String name = prop.getProperty(WSBproperties.PROP_DB_NAME);
		
		if (driver.equals("sqlite")) {
			driver = "jdbc:sqlite";
		}
		
		String url = driver+path+name;
		System.out.println(url);
		connect(url);
	}
	
	/**
	 * 
	 * @param url
	 */
	public static void connect(String url) {

        Connection conn = null;  
        try {    
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        }  
    }
	
}
