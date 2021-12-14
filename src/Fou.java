public class Fou extends Piece
{
	public Fou(boolean couleur, Plateau pla)
	{
		super(couleur, pla);
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
		
		for(int i=0; i<= 8; i++)
		{
			if(LigneDepart == LigneArrivee+i && ColonneDepart == ColonneArrivee+i)
			{
				return true;
			}
			if(LigneDepart == LigneArrivee+i && ColonneDepart == ColonneArrivee-i)
			{
				return true;
			}
			if(LigneDepart == LigneArrivee-i && ColonneDepart == ColonneArrivee+i)
			{
				return true;
			}
			if(LigneDepart == LigneArrivee-i && ColonneDepart == ColonneArrivee-i)
			{
				return true;
			}
			
		}
		
		return false;
		
	}

	public String toString(){
        return ("F"+super.toString());
    }
	public boolean deplacementok(Case depart, Case arrivee){
        int LigneDepart = depart.getLigne();
        int LigneArrivee = arrivee.getLigne();
        int ColonneDepart = depart.getColonne();
        int ColonneArrivee = arrivee.getColonne();

		if(ColonneArrivee> ColonneDepart && LigneArrivee > LigneDepart){
			while(ColonneDepart != (ColonneArrivee-1) && LigneDepart != (LigneArrivee-1)){

				if(this.getPlateau().existePiece((LigneArrivee-1),(ColonneArrivee-1) )!= true){
					return false;
				}
				ColonneArrivee--;
				LigneArrivee--;

			}
			return true;
		}
		if(ColonneArrivee < ColonneDepart && LigneArrivee > LigneDepart){
			while(ColonneDepart != (ColonneArrivee+1) && LigneDepart != (LigneArrivee-1)){

				if(this.getPlateau().existePiece((LigneArrivee-1), (ColonneArrivee+1) )!= true){
					return false;
				}
				ColonneArrivee++;
				LigneArrivee--;

			}
			return true;
		}
		if(ColonneArrivee > ColonneDepart && LigneArrivee < LigneDepart){
			while(ColonneDepart != (ColonneArrivee-1) && LigneDepart != (LigneArrivee+1)){

				if(this.getPlateau().existePiece( (LigneArrivee+1),(ColonneArrivee-1))!= true){
					return false;
				}
				ColonneArrivee--;
				LigneArrivee++;

			}
			return true;
		}
		if(ColonneArrivee < ColonneDepart && LigneArrivee < LigneDepart){
			while(ColonneDepart != (ColonneArrivee+1) && LigneDepart != (LigneArrivee+1)){

				if(this.getPlateau().existePiece((LigneArrivee+1), (ColonneArrivee+1))!= true){
					return false;
				}
				ColonneArrivee++;
				LigneArrivee++;

			}
			return true;
		}
	return false;

    }
}