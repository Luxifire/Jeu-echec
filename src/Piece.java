public abstract class Piece
{
	private boolean couleur;
	private Piece p;
	private Plateau plat;
	
	public Piece(boolean uneCouleur, Plateau pla )
	{
		this.couleur = uneCouleur;
		this.plat =pla;
	}
	
	public boolean getCouleur()
	{
		return this.couleur;
	}
	
	public Plateau getPlateau(){
		return this.plat;
	}

	public Piece getPiece()
	{
		return this.p;
	}
	
	public int getLigne(){
        return this.getLigne();
    }

    public int getColonne(){
        return this.getColonne();
    }

	
	public String getNomCouleur()
	{
		if(couleur) return "B";
		else return "N";
	}
	
	public String toString()
	{
		return this.getNomCouleur();
	}
	
	public abstract boolean sedeplacer(Case depart ,Case arrivee);
	public abstract boolean deplacementok(Case depart ,Case arrivee);
}

