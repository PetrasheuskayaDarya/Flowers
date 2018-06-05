package by.htp.florist.entity;

public class Flower extends Component {
	public String freshness;
	
	public Flower() {
	}
	
	public Flower (String freshness, int price) {
		super(price);
		this.freshness = freshness;
		
	}
	
	public String getFreshness() {
		return this.freshness;
	}
	
	

}
