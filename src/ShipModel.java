
public enum ShipModel {
	Carrier(5),Battleship(4),Cruiser(3),Submarin(3),Destroyer(2);
	
private final int taille;
	
	private ShipModel(int taille){
			this.taille = taille;		
		}
	public int getsize(){
		return this.taille;
	}	
}
