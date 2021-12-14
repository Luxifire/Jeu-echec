public class Roi extends Piece 
{

    public Roi(boolean couleur, Plateau pla) 
	{
        super(couleur,pla);
    }

    public boolean sedeplacer(Case depart, Case arrivee){
    
		int LigneDepart = depart.getLigne();
		int LigneArrivee = arrivee.getLigne();
		int ColonneDepart = depart.getColonne();
		int ColonneArrivee = arrivee.getColonne();

		if (arrivee.getPiece() != null && depart.getPiece().getCouleur() == arrivee.getPiece().getCouleur()){
			return false;
		}
		else if(arrivee.getPiece() != null && depart.getPiece().getCouleur() != arrivee.getPiece().getCouleur()){
            System.out.println("La piece "+ arrivee.getPiece() + " a ete prise par "+ depart.getPiece() );
        }
		

		if(LigneDepart+1 == LigneArrivee && ColonneDepart-1 == ColonneArrivee) {return true;}
		if(LigneDepart+1 == LigneArrivee && ColonneDepart+1 == ColonneArrivee) {return true;}
		if(LigneDepart-1 == LigneArrivee && ColonneDepart-1 == ColonneArrivee) {return true;}
		if(LigneDepart-1 == LigneArrivee && ColonneDepart+1 == ColonneArrivee) {return true;}
		if(LigneDepart+1 == LigneArrivee && ColonneDepart == ColonneArrivee) {return true;}
		if(LigneDepart-1 == LigneArrivee && ColonneDepart == ColonneArrivee) {return true;}
		if(LigneDepart == LigneArrivee && ColonneDepart-1 == ColonneArrivee) {return true;}
		if(LigneDepart == LigneArrivee && ColonneDepart+1 == ColonneArrivee) {return true;}
		return false;
	}

	public String toString(){
        return ("R"+super.toString());
    }
	public boolean deplacementok(Case depart, Case arrivee){
        return true;
    }
}