package learning.beer;
import java.util.ArrayList;

public class Style{
	
	private String styleName;
	private String description;
	private BeerAttribute styleMalt;
	private BeerAttribute styleSweetness;
	private BeerAttribute styleHops;
	private BeerAttribute styleBody;
	private BeerAttribute styleBitterness;
	private BeerAttribute styleAlcohol;
	private ArrayList<Flavors> flavors;
	
	
	
	
	Style(Styles style){
		this.styleName = style.getStyleName();
		this.description = style.getDescription();
		this.styleMalt = style.getMalt();
		this.styleSweetness = style.getSweetness();
		this.styleHops = style.getHops();
		this.styleBody = style.getBody();
		this.styleBitterness = style.getBitterness();
		this.styleAlcohol = style.getAlcohol();
				
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setAttribute(BeerAttribute attribute, int low, int high, String description){
		attribute = new BeerAttribute(low ,high, description);
	}
	
	public void setMalt(BeerAttribute malt, int low, int high, String description){
		setAttribute(malt, low, high, description);
		this.styleMalt = malt;
	}
	
	public void setSweetness(BeerAttribute sweetness, int low, int high, String description){
		setAttribute(sweetness, low, high, description);
		this.styleSweetness = sweetness;
	}
	
	public void setHops(BeerAttribute hops, int low, int high, String description){
		setAttribute(hops, low, high, description);
		this.styleHops = hops;
	}
	
	public void setBody(BeerAttribute body, int low, int high, String description){
		setAttribute(body, low, high, description);
		this.styleBody = body;
	}
	public void setBitterness(BeerAttribute bitterness, int low, int high, String description){
		setAttribute(bitterness, low, high, description);
		this.styleBitterness = bitterness;
	}
	public void setAlcohol(BeerAttribute alcohol, int low, int high, String description){
		setAttribute(alcohol, low, high, description);
		this.styleAlcohol = alcohol;
	}
	
	public String getStyleName(){
		return this.styleName;
	}
	
	public BeerAttribute getMalt(){
		return this.styleMalt;
	}
	
	public BeerAttribute getSweetness(){
		return this.styleSweetness;
	}
	
	public BeerAttribute getHops(){
		return this.styleHops;
	}
	
	public BeerAttribute getBody(){
		return this.styleBody;
	}
	
	public BeerAttribute getBitterness(){
		return this.styleBitterness;
	}
	
	public BeerAttribute getAlcohol(){
		return this.styleAlcohol;
	}
	public void setFlavor(Flavors flavor){
		flavors.add(flavor);
	}
	
	public ArrayList<Flavors> getFlavors(){
		return flavors;
	}
}

