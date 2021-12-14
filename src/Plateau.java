public class Plateau{

	private Boolean Jeu;
    public Case[][] plateau;
    public Roi roiNoir;
    public Roi roiBlanc;
    public Plateau(){
        this.plateau = new Case[8][8];
        
        for(int i=0; i<plateau.length; i++) {
			for(int j=0; j<plateau[i].length; j++) {
				plateau[i][j] = new Case(i,j);
			}
		}
        
        this.plateau[0][0].setPiece(new Tour(true,this));
        this.plateau[0][1].setPiece(new Cavalier(true,this));
        this.plateau[0][2].setPiece(new Fou(true,this));
        this.plateau[0][3].setPiece(new Dame(true,this));
        this.plateau[0][4].setPiece(new Roi(true,this));
        this.plateau[0][5].setPiece(new Fou(true,this));
        this.plateau[0][6].setPiece(new Cavalier(true,this));
        this.plateau[0][7].setPiece(new Tour(true,this));
        
       
        this.plateau[1][0].setPiece(new Pion(true,this));
        this.plateau[1][1].setPiece(new Pion(true,this));
        this.plateau[1][2].setPiece(new Pion(true,this));
        this.plateau[1][3].setPiece(new Pion(true,this));
        this.plateau[1][4].setPiece(new Pion(true,this));
        this.plateau[1][5].setPiece(new Pion(true,this));
        this.plateau[1][6].setPiece(new Pion(true,this));
        this.plateau[1][7].setPiece(new Pion(true,this));
        
       

        this.plateau[6][0].setPiece(new Pion(false,this));
        this.plateau[6][1].setPiece(new Pion(false,this));
        this.plateau[6][2].setPiece(new Pion(false,this));
        this.plateau[6][3].setPiece(new Pion(false,this));
        this.plateau[6][4].setPiece(new Pion(false,this));
        this.plateau[6][5].setPiece(new Pion(false,this));
        this.plateau[6][6].setPiece(new Pion(false,this));
        this.plateau[6][7].setPiece(new Pion(false,this));

       
        this.plateau[7][0].setPiece(new Tour(false,this));
        this.plateau[7][1].setPiece(new Cavalier(false,this));
        this.plateau[7][2].setPiece(new Fou(false,this));
        this.plateau[7][3].setPiece(new Dame(false,this));
        this.plateau[7][4].setPiece(new Roi(false,this));
        this.plateau[7][5].setPiece(new Fou(false,this));
        this.plateau[7][6].setPiece(new Cavalier(false,this));
        this.plateau[7][7].setPiece(new Tour(false,this));
        
        Jeu = true;
    }
    


    
    public Boolean getJeu() 
    {
        return this.Jeu;
    }


    public void setCase(Case c){
        this.plateau[c.getLigne()][c.getColonne()]=c;

    }

    public Case getCase(int l, int c) 
    {
        return this.plateau[l][c];
    }
    
    
    public boolean existePiece(int l, int c) 
    {
		if (this.plateau[l][c].getPiece()==null) return true;
		return false;
	}
    
    public void retirePiece(Piece p) {
		if (this.plateau[p.getLigne()][p.getColonne()]!=null) this.plateau[p.getLigne()][p.getColonne()]=null;
	}
    
    
    public void deplacement(int depC, int depL,int arrC, int arrL, boolean tour ){
        if(this.plateau[depL][depC].getPiece().getCouleur() == true &&   tour == true && 
        		this.plateau[depL][depC].getPiece().sedeplacer(this.plateau[depL][depC],this.plateau[arrL][arrC]) == true 
        		
        		
        		)
        {
           this.plateau[arrL][arrC].setPiece(this.plateau[depL][depC].getPiece());
           this.plateau[depL][depC].setPiece(null);
            
           affichage();
        
            System.out.println("La piece "+ this.plateau[arrL][arrC].getPiece() + " en position "+ colon(depC) + (depL+1) + " est maintenant en position " + colon(arrC) + (arrL+1) );
          
           
        }
       else if( this.plateau[depL][depC].getPiece().getCouleur() == false && tour == false &&
                this.plateau[depL][depC].getPiece().sedeplacer(this.plateau[depL][depC],this.plateau[arrL][arrC]) == true 

                 ){

            this.plateau[arrL][arrC].setPiece(this.plateau[depL][depC].getPiece());
            this.plateau[depL][depC].setPiece(null);
             
            affichage();
         
            System.out.println("La piece "+ this.plateau[arrL][arrC].getPiece() + " en position "+ colon(depC) + (depL+1) + " est maintenant en position " + colon(arrC) + (arrL+1) );
           
         }
        else{
         System.out.println("Vous ne pouvez pas effectuer ce coup");

        }
     
     }
     public int getIntColonne(String z)
     {
         switch(z)
         {
             case "A"  : return 0 ;
             case "B"  : return 1 ;
             case "C"  : return 2 ;
             case "D"  : return 3 ;
             case "E"  : return 4 ;
             case "F"  : return 5 ;
             case "G"  : return 6 ;
             case "H"  : return 7 ;
             case "a"  : return 0 ;
             case "b"  : return 1 ;
             case "c"  : return 2 ;
             case "d"  : return 3 ;
             case "e"  : return 4 ;
             case "f"  : return 5 ;
             case "g"  : return 6 ;
             case "h"  : return 7 ;
             default   : return 0 ;
         }
     }
 
    
    /*public Piece getPieceCase(int i, int j){        
        return this.plateau[i][j].getPiece();        
    }*/
    
    /*public void setRois(){
        for(int i = 0; i < this.plateau.length; i++){
            for(int j = 0; j < this.plateau[i].length; j++){
                if(this.plateau[i][j].getPiece() != null && this.plateau[i][j].getPiece().getNom() == "Roi")
                {
                    if(this.plateau[i][j].getPiece().getCouleur() == false){
                        this.roiNoir = (Roi)this.plateau[i][j].getPiece();
                    }else if(this.plateau[i][j].getPiece().getCouleur() == true){
                        this.roiBlanc = (Roi)this.plateau[i][j].getPiece();
                    }
                }
            }
        }
    }*/
    
    /*public boolean estEchec(){
        ArrayList<Piece> test = this.getAllPiece();
        for(Piece pi : test){
            if(pi.getPlateau().existePiece(pi.getLigne(),pi.getColonne()) != true) {
                if(pi.sedeplacer(this.plateau[pi.getLigne()-1][pi.getColonne()-1], this.plateau[this.roiBlanc.getLigne()-1][this.roiBlanc.getColonne()-1])
                		&& pi.deplacementok(this.plateau[pi.getLigne()-1][pi.getColonne()-1], this.plateau[this.roiBlanc.getLigne()-1][this.roiBlanc.getColonne()-1]))
                {
                    if(this.roiBlanc.getCouleur() == true && pi.getCouleur() == false){
                    	System.out.println("dKFLJF");
                        return true;
                    }
                    if(this.roiBlanc.getCouleur() == false && pi.getCouleur() == true){
                    	System.out.println("dKFLJF");
                    	return true;
                    }
                }
            }
        }
        return false;

    }
    
    public ArrayList<Piece> getAllPiece(){
        ArrayList<Piece> p = new ArrayList<Piece>();
        for(int i=0; i<plateau.length;i++){
            for(int j=0; j<plateau.length;j++){
                if(this.plateau[i][j] != null)
                {
                    if(this.plateau[i][j].getPiece().getNom() != "Roi") 
                    {
                       p.add(this.getCase(i,j).getPiece());
                    }
                }
            }
        }
   return p;
 }
    
    public void setRois(){
        for(int i = 0; i < this.plateau.length; i++){
            for(int j = 0; j < this.plateau[i].length; j++){
                if(this.plateau[i][j].getPiece() != null && this.plateau[i][j].getPiece().getNom() == "Roi"){
                    if(this.plateau[i][j].getPiece().getCouleur() == false){
                        this.roiNoir = (Roi)this.plateau[i][j].getPiece();
                    }else if(this.plateau[i][j].getPiece().getCouleur() == true){
                        this.roiBlanc = (Roi)this.plateau[i][j].getPiece();
                    }
                }
            }
        }
    }
    
    /*public ArrayList<Piece> getAllPiece(){
        ArrayList<Piece> p = new ArrayList<Piece>();
        for(int i=0; i<plateau.length;i++){
            for(int j=0; j<plateau.length;j++){
                if(this.getCase() != null){
                    if(this.plateau[this.getColonne()][this.getLigne()].getPiece().getNom() != "Roi") {
                    p.add(this.getCase(this.plateau[getColonne()][getLigne()]).getPiece());
                    }
                }
            }
        }
   return p;
 }*/
     
    

    
    

    public void affichage(){
       
        System.out.println("  -----------------------------------------");
        for (int i=7; i>=0; i--){
            System.out.print( (i+1)+" ");
            for(int j=0 ; j<8 ;j++){
                
                if (plateau[i][j] != null){
                    System.out.print("| "+ plateau[i][j].toString() + " " );
                }
                else{
                    System.out.print( "|    ");
                }
                
                
            }
            
            System.out.println("| ");
            System.out.println("  -----------------------------------------");
            
        }
        System.out.println("    A    B    C    D    E    F    G    H ");
    }


    public String colon( int col){
        String d = "";
        if(col == 0){
            d = "A";
        }
        else if(col == 1){
            d = "B";
        }
        else if(col == 2){
            d = "C";
        }
        else if(col == 3){
            d = "D";
        }
        else if(col == 4){
            d = "E";
        }
        else if(col== 5){
            d = "F";
        }
        else if(col == 6){
            d = "G";
        }else if(col == 7){
            d = "H";
        }
        return d;
    }
    
    public int colonint( String col){
        int d = 0;
        if(col == "A"){
            d = 0;
        }
        else if(col == "B"){
            d = 1;
        }
        else if(col == "C"){
            d = 2;
        }
        else if(col == "D"){
            d = 3;
        }
        else if(col == "E"){
            d = 4;
        }
        else if(col== "F"){
            d = 5;
        }
        else if(col =="G"){
            d = 6;
        }else if(col == "H"){
            d = 7;
        }
        return d;
    }

    
    /*public void setDeplace(int depC, int depL){

		//si la piece jou�e est le pion
		if (plateau[depL][depC].getPiece() instanceof Pion) {
			Pion pion = (Pion) plateau[depL][depC].getPiece();
			pion.setDejaJoue(true);	
		}
	}*/
    
    

    


}