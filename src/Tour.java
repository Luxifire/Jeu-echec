
public class Tour extends Piece
{

    public Tour(boolean couleur, Plateau pla)
    {
        super(couleur, pla);
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
        
        for (int t=0;t<=8;t++){
            if        (LigneDepart + t == LigneArrivee && ColonneDepart ==ColonneArrivee)   {return true;}
            else if (LigneDepart - t == LigneArrivee && ColonneDepart ==ColonneArrivee)   {return true;}
            }

        for (int p=0;p<=8;p++){
            if         (ColonneDepart + p ==  ColonneArrivee && LigneDepart == LigneArrivee){return true;}
            else if (ColonneDepart - p ==  ColonneArrivee && LigneDepart == LigneArrivee){return true;}
            }
              
        return false;
        }

    

    public boolean deplacementok(Case depart, Case arrivee){
        int LigneDepart = depart.getLigne();
        int LigneArrivee = arrivee.getLigne();
        int ColonneDepart = depart.getColonne();
        int ColonneArrivee = arrivee.getColonne();

        if(ColonneDepart != ColonneArrivee && LigneDepart == LigneArrivee){
            if(ColonneDepart>ColonneArrivee){
                for(int i=ColonneDepart-1; i>ColonneArrivee;i--){
                    if(this.getPlateau().existePiece( LigneArrivee,i )!= true ){
                        return false;
                    }
                    
                }
                return true;
            }
            if(ColonneDepart<ColonneArrivee){
                for(int i=ColonneDepart+1; i<ColonneArrivee;i++){
                    if(this.getPlateau().existePiece(LigneArrivee,i )!= true ){
                        return false;
                    }
                    
                }
                return true;
            }

        }
        if(ColonneDepart == ColonneArrivee && LigneDepart != LigneArrivee){
            if(LigneDepart>LigneArrivee){
                for(int i=LigneDepart-1; i>LigneArrivee;i--){
                    if(this.getPlateau().existePiece( i,ColonneArrivee )!= true ){
                        return false;
                    }
                    
                }
                return true;
            }
            if(LigneDepart<LigneArrivee){
                for(int i=LigneDepart+1; i<LigneArrivee;i++){
                    if(this.getPlateau().existePiece( i,ColonneArrivee )!= true ){
                        return false;
                    }
                    
                }
                return true;
            }

        }
        
        return false;

    }
   
   
   
    public String toString(){
        return ("T"+super.toString());
    }

}