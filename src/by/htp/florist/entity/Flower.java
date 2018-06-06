package by.htp.florist.entity;

public class Flower extends Component {
	public String freshness;
	public int lengthOfStem;
	
	public Flower() {
	}
	
	public Flower (String freshness,int lengthOfStem, int price) {
		super(price);
		this.freshness = freshness;
		this.lengthOfStem =lengthOfStem;
		
	}
	
	public int getLengthOfStem() {
		return lengthOfStem;
	}

	public void setLengthOfStem(int lengthOfStem) {
		this.lengthOfStem = lengthOfStem;
	}

	public String getFreshness() {
		return this.freshness;
	}

	public void setFreshness(String freshness) {
		this.freshness = freshness;
	}

	@Override
	public String toString() {
		return "Flower [freshness=" + freshness + ", lengthOfStem=" + lengthOfStem + super.toString() + "]";
	}


	
	
	

}
