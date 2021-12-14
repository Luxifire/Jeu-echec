public class Case 
{

    private Piece piece;
    private int ligne;
    private int colonne;


    public Case( int unecolonne, int uneligne){
        this.ligne = uneligne;
        this.colonne = unecolonne;
       
    }
    public Case( Piece piece){
        this.piece = piece;
    }
	
	public Case(){
        this.piece = null;
    }

    public Piece getPiece(){
        return this.piece;
    }
    
    public void setPiece(Piece p)
	{
		this.piece = p;
	}


    public int getLigne(){
        return this.ligne;
    }

    public int getColonne(){
        return this.colonne;
    }

    public String getNomColonne(){

        switch (this.colonne) {
            case 1:
                return "A";
                
            case 2:
                return "B";
                
            case 3:
                return "C";
               
            case 4:
                return "D";
                 
            case 5:
                return "E";
               
            case 6:
                return "F";
               
            case 7:
                return "G";
               
            case 8:
                return "H";
             

            default:
                 return "?";
               
        }
    }
	
	public String getNomLigne(){

        switch (this.ligne) {
            case 1:
                return "1";
                
            case 2:
                return "2";
                
            case 3:
                return "3";
               
            case 4:
                return "4";
                 
            case 5:
                return "5";
               
            case 6:
                return "6";
               
            case 7:
                return "7";
               
            case 8:
                return "8";
             

            default:
                 return "?";
               
        }
    }

    public String toString(){
        String s ="";
        if(this.getPiece()== null)
		{
            s+="  ";
        }
        else
		{
            s+=this.getPiece();
        }
        return s;
    }

}
