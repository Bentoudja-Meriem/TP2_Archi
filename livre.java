abstract class livre{
    private Universite univ;
    private Etudiant stud;
    private int bonus;
     
     void init_nb_livre(String type_package,Etudiant stud){
        if(type_package="standard"){
            stud.setNbLivreMensuel_Autorise(10);
        }
        else
        {
            stud.setNbLivreMensuel_Autorise(10*2);
        }
    }
    void ajoutbon(Etudiant stud,int bonus,String type_package ){
        if(type_package="standard"){
            stud.setNbLivreMensuel_Autorise(5+bonus);
        }
        else
        {
            stud.setNbLivreMensuel_Autorise(5*2+bonus);
        }

    }
}