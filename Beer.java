package learning.beer;

public class Beer extends Style{
		
		private String beerName;
		private String beerBrewery;
		private double percentAlcohol;
		private String beerDescription;
		
	Beer(Styles styleName, String beerName, String brewery, double percent, String description){
		super(styleName);
		this.beerName = beerName;
		this.beerBrewery = brewery;
		this.percentAlcohol = percent;
		this.beerDescription = description; 
		
	}
	
	public void addFlavor(Flavors flavor){
		super.setFlavor(flavor);
	}

	public String getBeerName(){
		return this.beerName;
	}
	
	public String getBrewery(){
		return this.beerBrewery;
	}
	
	public String getBeerDescription(){
		return this.beerDescription;
	}
	
	public double getPercentAlcohol(){
		return this.percentAlcohol;
	}
	
	
	public static void main(String args[]){
		
	}
}
