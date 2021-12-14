public class Cavalier extends Piece
{
	public Cavalier(boolean couleur, Plateau pla)
	{
		super(couleur,pla);
	}
	
	public boolean sedeplacer(Case depart,Case arrivee)
	{
		
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

		if(LigneDepart == LigneArrivee-2 && ColonneDepart == ColonneArrivee-1 )
		{
			return true;
		}
		if(LigneDepart == LigneArrivee-2 && ColonneDepart == ColonneArrivee+1 ) 
		{
			return true;
		}
		if(LigneDepart == LigneArrivee+2 && ColonneDepart == ColonneArrivee-1 )
		{
			return true;
		}
		if(LigneDepart == LigneArrivee+2 && ColonneDepart == ColonneArrivee+1)
		{
			return true;
		}
		if(LigneDepart == LigneArrivee-1 && ColonneDepart == ColonneArrivee-2 )
		{
			return true;
		}
		if(LigneDepart == LigneArrivee-1 && ColonneDepart == ColonneArrivee+2 )
		{
			return true;
		}
		if(LigneDepart == LigneArrivee+1 && ColonneDepart == ColonneArrivee-1 )
		{
			return true;
		}
		if(LigneDepart == LigneArrivee+1 && ColonneDepart == ColonneArrivee+2 )
		{
			return true;
		}
		
		return false;
	}
	public String toString(){
        return ("C"+super.toString());
    }
	public boolean deplacementok(Case depart, Case arrivee){
        return true;
    }
}