import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService extends livre{
	IJournal journal;

	
	
	boolean inscription (int matricule, String nom, String prénom, Email email,String pwd, int id_universite) throws SQLException	
	{
		// EtudiantRepository StudRep= new EtudiantRepository();
		private EtudiantRepository StudRep;
		public EtudiantService(EtudiantRepository StudRep){
			this.StudRep=new EtudiantRepository();
		}


	    // UniversiteRepository UnivRep= new UniversiteRepository();
		private UniversiteRepository UnivRep;
		public EtudiantService(UniversiteRepository UnivRep){
			this.UnivRep=new UniversiteRepository();
		}
	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    journal.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
	   /*  if(email == null || email.length() == 0)
	    {
	    	return false;
	    }*/
		 return email.verifieremail(email);
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
		 /*if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }         
		 
		  void ajouterbonus(int bonus){
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(5+bonus);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(5*2+bonus);
	     }    
	     }*/ 
		 StudRep.add(stud);
		 journal.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
