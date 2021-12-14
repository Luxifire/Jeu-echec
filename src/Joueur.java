public class Joueur{

    private String nom;
    private String prenom;


    public Joueur(String unNom, String unPrenom){

        this.nom = unNom;
        this.prenom = unPrenom;

    }

    public String getNom(){
        return this.nom;

    }
    public String getPrenom(){
        return this.prenom;
    }

    public String toString(){
        return  getNom() +" "+ getPrenom();
    }

}