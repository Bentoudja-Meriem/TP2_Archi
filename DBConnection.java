import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  // ajout de patron singleton 

	    private static DBConnection instance ;
		
	   
		private BDD = "nomBD";
		private url = "jdbc:mysql://localhost:3306/" + BDD;
		private user = "root";
		private passwd = "";
	    public Connection conn;

        private DBConnection(){}

		public static DBConnection getInstance(){
			if (instance == null){
				instance= new DBConnection();
			}
		}

		public Connection getConn(){
			return conn=DriverManager.getConnection();
		}
		
	       

		}

	    
	   /* public Connection getConn() {
			return conn;
		}*/

 /*public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);*/
		
	
}
