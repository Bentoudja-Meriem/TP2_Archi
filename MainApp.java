import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	EtudiantService et =new EtudiantService(new UniversiteRepository());
	EtudiantService es =new EtudiantService(new EtudiantRepository());
	UniversiteRepository uni=new UniversiteRepository(new Universite(0, null, null));
	EtudiantRepository er=new EtudiantRepository(new Etudiant(0, null, null, null, null, 0));
	// is not visible EtudiantRepository ep=new EtudiantRepository(new DBConnection());
	


}
