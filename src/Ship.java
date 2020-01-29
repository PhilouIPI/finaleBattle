import java.util.List;

public class Ship {
Plot coordonnee;
ShipModel model;
Direction direction;

	List<Plot> listCases;

	public Ship(Plot c, ShipModel m, Direction d) {
		this.coordonnee = c;
		this.model = m;
		this.direction = d;
		
	}
	public boolean isOnPlot(Plot p) {
		if (this.listCases.contains(p)) {
			return true;
	} 
		else { 
			return false;
		}
	}
	
}

