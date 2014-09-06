package learning.beer;

public enum BeerAttributesEnum {
	
	LIGHT_LAGER_MALT(1,1,"Low Malt Character."),
	LIGHT_LAGER_SWEETNESS(1,2,"Dry to slight sweetness."),
	LIGHT_LAGER_HOPS(1,2,"Zero to low hop character."),
	LIGHT_LAGER_BODY(1,3,"Light to medium body."),
	LIGHT_LAGER_BITTERNESS(1,1,"Low bitterness"),
	LIGHT_LAGER_ALCOHOL(3,6,"Low alcohol content, and no alcolol taste or heat."),
	
	PILSNER_MALT(1,3,"Low"),
	PILSNER_SWEETNESS(1,1,"SOMETHING"),
	PILSNER_HOPS(1,4,""),
	PILSNER_BODY(1,3,""),
	PILSNER_BITTERNESS(4,5,""),
	PILSNER_ALCOHOL(4,6,""),
	
	EUROPEAN_AMBER_LAGER_MALT(4,5,""),
	EUROPEAN_AMBER_LAGER_SWEETNESS(1,2,""),
	EUROPEAN_AMBER_LAGER_HOPS(1,3,""),
	EUROPEAN_AMBER_LAGER_BODY(3,3,""),
	EUROPEAN_AMBER_LAGER_BITTERNESS(3,3,""),
	EUROPEAN_AMBER_LAGER_ALCOHOL(4,6,""),

	DARK_LAGER_MALT(4,5,""),
	DARK_LAGER_SWEETNESS(1,3,""),
	DARK_LAGER_HOPS(1,1,""),
	DARK_LAGER_BODY(1,3,""),
	DARK_LAGER_BITTERNESS(1,3,""),
	DARK_LAGER_ALCOHOL(4,6,""),

	BOCK_MALT(5,5,""),
	BOCK_SWEETNESS(1,2,""),
	BOCK_HOPS(1,1,""),
	BOCK_BODY(3,5,""),
	BOCK_BITTERNESS(3,3,""),
	BOCK_ALCOHOL(6,10,""),

	LIGHT_HYBRID_MALT(1,2,""),
	LIGHT_HYBRID_SWEETNESS(3,3,""),
	LIGHT_HYBRID_HOPS(1,1,""),
	LIGHT_HYBRID_BODY(1,3,""),
	LIGHT_HYBRID_BITTERNESS(1,1,""),
	LIGHT_HYBRID_ALCOHOL(4,6,""),

	AMBER_HYBRID_MALT(1,3,""),
	AMBER_HYBRID_SWEETNESS(3,3,""),
	AMBER_HYBRID_HOPS(1,5,""),
	AMBER_HYBRID_BODY(3,4,""),
	AMBER_HYBRID_BITTERNESS(3,5,""),
	AMBER_HYBRID_ALCOHOL(4,6,""),

	SCOTTISH_IRISH_ALE_MALT(1,3,""),
	SCOTTISH_IRISH_ALE_SWEETNESS(1,2,""),
	SCOTTISH_IRISH_ALE_HOPS(2,4,""),
	SCOTTISH_IRISH_ALE_BODY(2,4,""),
	SCOTTISH_IRISH_ALE_BITTERNESS(3,5,""),
	SCOTTISH_IRISH_ALE_ALCOHOL(3,6,""),

	ENGLISH_PALE_ALE_MALT(4,5,""),
	ENGLISH_PALE_ALE_SWEETNESS(3,3,""),
	ENGLISH_PALE_ALE_HOPS(1,2,""),
	ENGLISH_PALE_ALE_BODY(2,4,""),
	ENGLISH_PALE_ALE_BITTERNESS(1,2,""),
	ENGLISH_PALE_ALE_ALCOHOL(3,6,""),

	ENGLISH_BROWN_ALE_MALT(4,5,""),
	ENGLISH_BROWN_ALE_SWEETNESS(1,3,""),
	ENGLISH_BROWN_ALE_HOPS(2,3,""),
	ENGLISH_BROWN_ALE_BODY(1,3,""),
	ENGLISH_BROWN_ALE_BITTERNESS(1,3,""),
	ENGLISH_BROWN_ALE_ALCOHOL(3,5,""),

	PORTER_MALT(4,5,""),
	PORTER_SWEETNESS(3,3,""),
	PORTER_HOPS(1,2,""),
	PORTER_BODY(2,4,""),
	PORTER_BITTERNESS(2,3,""),
	PORTER_ALCOHOL(4,10,""),

	STOUT_MALT(5,5,""),
	STOUT_SWEETNESS(1,3,""),
	STOUT_HOPS(1,3,""),
	STOUT_BODY(3,5,""),
	STOUT_BITTERNESS(3,5,""),
	STOUT_ALCOHOL(4,12,""),

	INDIA_PALE_ALE_MALT(1,3,""),
	INDIA_PALE_ALE_SWEETNESS(1,2,""),
	INDIA_PALE_ALE_HOPS(4,5,""),
	INDIA_PALE_ALE_BODY(2,3,""),
	INDIA_PALE_ALE_BITTERNESS(5,5,""),
	INDIA_PALE_ALE_ALCOHOL(5,10,""),

	GERMAN_WHEAT_RYE_MALT(3,3,""),
	GERMAN_WHEAT_RYE_SWEETNESS(4,5,""),
	GERMAN_WHEAT_RYE_HOPS(1,3,""),
	GERMAN_WHEAT_RYE_BODY(2,4,""),
	GERMAN_WHEAT_RYE_BITTERNESS(1,3,""),
	GERMAN_WHEAT_RYE_ALCOHOL(4,8,""),

	BELGIAN_FRENCH_MALT(3,5,""),
	BELGIAN_FRENCH_SWEETNESS(1,3,""),
	BELGIAN_FRENCH_HOPS(1,3,""),
	BELGIAN_FRENCH_BODY(1,5,"The body of Belgian and French Ales can vary widely depending on the specific style and method of production."),
	BELGIAN_FRENCH_BITTERNESS(1,5,"As with the body of Belgian and French Ales, the bitterness can also vary widely."),
	BELGIAN_FRENCH_ALCOHOL(4,8,""),

	SOUR_ALE_MALT(3,3,""),
	SOUR_ALE_SWEETNESS(1,1,""),
	SOUR_ALE_HOPS(1,1,""),
	SOUR_ALE_BODY(1,3,""),
	SOUR_ALE_BITTERNESS(1,1,""),
	SOUR_ALE_ALCOHOL(3,8,""),

	BELGIAN_STRONG_ALE_MALT(5,5,""),
	BELGIAN_STRONG_ALE_SWEETNESS(3,4,""),
	BELGIAN_STRONG_ALE_HOPS(1,3,""),
	BELGIAN_STRONG_ALE_BODY(3,3,""),
	BELGIAN_STRONG_ALE_BITTERNESS(1,2,""),
	BELGIAN_STRONG_ALE_ALCOHOL(6,11,""),

	STRONG_ALE_MALT(3,5,""),
	STRONG_ALE_SWEETNESS(3,4,""),
	STRONG_ALE_HOPS(3,5,""),
	STRONG_ALE_BODY(4,5,""),
	STRONG_ALE_BITTERNESS(3,5,""),
	STRONG_ALE_ALCOHOL(6,12,""),
	
	AMERICAN_ALE_MALT(3,5,""),
	AMERICAN_ALE_SWEETNESS(2,3,""),
	AMERICAN_ALE_HOPS(1,3,""),
	AMERICAN_ALE_BODY(2,4,""),
	AMERICAN_ALE_BITTERNESS(3,4,""),
	AMERICAN_ALE_ALCOHOL(4,6,"");
	
	
	private final int low;
	private final int high;
	private final String description;
	BeerAttributesEnum(int low, int high, String description){
		this.low = low;
		this.high = high;
		this.description = description;
	}
	public int getLow(){
		return this.low;
	}
	
	public int getHigh(){
		return this.high;
	}
	
	public String getDescription(){
		return this.description;
	}
}
