
public class BoardPlot implements Plot{
	private int abscisse;
	private int ordonnee;
	
	public BoardPlot(int abscisse, int ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	@Override
	public int getAbscisse() {
		// TODO Auto-generated method stub
		return this.abscisse;
	}

	@Override
	public int getOrdonnee() {
		// TODO Auto-generated method stub
		return this.ordonnee;
	}

	@Override
	public Plot getPlotTo(Direction d) {
		// TODO Auto-generated method stub
		switch(d) {
		case NORTH : 
			return new BoardPlot(this.abscisse+1, this.ordonnee);
		case SOUTH : 
			return new BoardPlot(this.abscisse-1, this.ordonnee);
		case EAST :
			return new BoardPlot(this.abscisse, this.ordonnee+1);
		case WEST :
			return new BoardPlot(this.abscisse, this.ordonnee-1);
			default :
				return new BoardPlot(0,0);
				
		}
	}
	

}
