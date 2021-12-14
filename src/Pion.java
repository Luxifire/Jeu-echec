public class Pion extends Piece
{
	
	private boolean tour;
	
    public Pion(boolean couleur, Plateau pla)
    {
        super(couleur, pla);
        this.tour = true;
    }
    
    public void setpremierCoup(boolean b) {this.tour = b;}
    public boolean sedeplacer(Case depart, Case arrivee){

	

        int ColonneDepart = depart.getColonne();
        int ColonneArrivee = arrivee.getColonne();
        int LigneDepart = depart.getLigne();
        int LigneArrivee = arrivee.getLigne();
				
        	if(ColonneDepart +1 == ColonneArrivee && LigneDepart == LigneArrivee )
			{
        		this.setpremierCoup(false);
				return true;
			}
			if(ColonneDepart -1 == ColonneArrivee && LigneDepart == LigneArrivee )
			{
				this.setpremierCoup(false);
				return true;
			}
			
			if(tour==true) {
			if(ColonneDepart +2 == ColonneArrivee && LigneDepart == LigneArrivee)
			{
				this.setpremierCoup(false);
				return true;
			}
			if(ColonneDepart -2 == ColonneArrivee && LigneDepart == LigneArrivee)
			{
				this.setpremierCoup(false);
				return true;
			}
			}
			System.out.println("MIAOU !");
			
			if(arrivee.getPiece() != null && depart.getPiece().getCouleur() != arrivee.getPiece().getCouleur()){
				if(ColonneDepart - ColonneArrivee ==  1 && LigneDepart - LigneArrivee ==  1) {
					System.out.println("La piece "+ arrivee.getPiece() + " a ete prise par "+ depart.getPiece() );
					return true;}
	            else if(ColonneDepart - ColonneArrivee ==  1 && LigneDepart - LigneArrivee == -1){
					System.out.println("La piece "+ arrivee.getPiece() + " a ete prise par "+ depart.getPiece() );
					return true;}
	            else if(ColonneDepart - ColonneArrivee == -1 && LigneDepart - LigneArrivee ==  1){
					System.out.println("La piece "+ arrivee.getPiece() + " a ete prise par "+ depart.getPiece() );
					return true;}
	            else if(ColonneDepart - ColonneArrivee == -1 && LigneDepart - LigneArrivee == -1){
					System.out.println("La piece "+ arrivee.getPiece() + " a ete prise par "+ depart.getPiece() );
					return true;}
				
	        }
			
		
		return false;
		
	}

	
	
	/*public void setDejaJoue(boolean dejaJoue) {
		boolean Dejajoue=false;
		Dejajoue = dejaJoue;
	}*/

	public String toString(){
        return ("P"+super.toString());
    }
    public boolean deplacementok(Case depart, Case arrivee){
        return true;
    }

}