
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository {
	IJournal journal;
	private DBConnection BD; 
	public UniversiteRepository( DBConnection BD){
		this.BD=new DBConnection();
	}
	private Universite u ;
	public UniversiteRepository(Universite u){
		this.u=new Universite();
	}
	
	
	Universite GetById(int universityId) throws SQLException {
		
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		journal.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		journal.outPut_Msg("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}	
	
}
