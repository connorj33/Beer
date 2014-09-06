package learning.beer;

public class BeerAttribute{
	
	private int lowAttribute;
	private int highAttribute;
	private String description;
	
	BeerAttribute(int low, int high, String description){
		this.lowAttribute = low;
		this.highAttribute = high;
		this.description = description;
	}
	
	public int getLow(){
		return this.lowAttribute;
	}
	
	public int getHigh(){
		return this.highAttribute;
	}
	
	public String getDescription(){
		return this.description;
	}
	

}
