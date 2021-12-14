import java.util.Scanner;

public class Partie 
{
    public static void main( String[] args )
    {
        boolean gameover = false;
        boolean toursdejeux = true;
        boolean Tours = true;
        Scanner user_input = new Scanner(System.in);
        Plateau plateau = new Plateau();
        System.out.println("Voulez vous demarrer une partie ? (O) pour oui\n ");
        String rep = user_input.nextLine();


        if(rep.equals("O") || rep.equals("o")){

            System.out.println("Bonjour vous serrez le joueur 1.Entrer votres nom puis entrer votres prenom: ");
            String prenom = user_input.nextLine();
            String nom = user_input.nextLine();
            Joueur joueur1= new Joueur(nom,prenom);
            System.out.println("Bonjour vous serrez le joueur 2.Entrer votres nom puis entrer votres prenom: ");
            String prenom2 = user_input.nextLine();
            String nom2 = user_input.nextLine();
            Joueur joueur2= new Joueur(nom2,prenom2);

            
            System.out.println("C'est au tour des blanc a vous monsieur "+ joueur1.toString());
            while (gameover == false) { 

                if (toursdejeux == true){
                plateau.affichage();
                System.out.println("Choisir la case de depart ");
                System.out.println("saisir La colonne de depart (exemple = A) : ");

                String dep = user_input.next();
                int depC = plateau.getIntColonne(dep);
                System.out.println("saisir La Ligne de depart (exemple = 1) : ");
                int depi = user_input.nextInt();
                int depL= depi - 1;
                System.out.println("Choisir la case de depart ");
                System.out.println("saisir La colonne de d arrive (exemple = B) : ");
                String arr = user_input.next();
                int arrC =  plateau.getIntColonne(arr);
                System.out.println("saisir La Lignede d arrive (exemple = 2) : ");
                int arri = user_input.nextInt();
                int arrL= arri - 1;

                plateau.deplacement(depC, depL, arrC, arrL, Tours);
                System.out.println("C'est au tour des noir a vous monsieur "+ joueur2.toString());
                toursdejeux = false;
                Tours=false;
                }      
                
                else{
                System.out.println("Choisir la case de depart ");
                System.out.println("saisir La colonne de depart (exemple = A) : ");

                String dep = user_input.next();
                int depC = plateau.getIntColonne(dep);
                System.out.println("saisir La Ligne de depart (exemple = 1) : ");
                int depi = user_input.nextInt();
                int depL= depi - 1;
                System.out.println("Choisir la case de depart ");
                System.out.println("saisir La colonne de d arrive (exemple = B) : ");
                String arr = user_input.next();
                int arrC =  plateau.getIntColonne(arr);
                System.out.println("saisir La Lignede d arrive (exemple = 2) : ");
                int arri = user_input.nextInt();
                int arrL= arri - 1;

                plateau.deplacement(depC, depL, arrC, arrL, Tours);
                System.out.println("C'est au tour des blanc a vous monsieur "+ joueur1.toString());
                toursdejeux = true;
                Tours=true;

                }
              
            }
        }
        
    }

}