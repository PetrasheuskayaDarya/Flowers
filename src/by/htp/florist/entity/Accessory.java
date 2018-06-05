package by.htp.florist.entity;

public class Accessory extends Component {
	
public String color;
	
	public Accessory() {
	}
	
	public Accessory ( String color) {
		
		this.color = color;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
}