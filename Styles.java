package learning.beer;

public enum Styles {
	
	AMERICAN_ALE("American Ale", BeerAttributesEnum.AMERICAN_ALE_MALT, BeerAttributesEnum.AMERICAN_ALE_SWEETNESS, BeerAttributesEnum.AMERICAN_ALE_HOPS, BeerAttributesEnum.AMERICAN_ALE_BODY, BeerAttributesEnum.AMERICAN_ALE_BITTERNESS, BeerAttributesEnum.AMERICAN_ALE_ALCOHOL,""),

	LIGHT_LAGER("Light Lager",BeerAttributesEnum.LIGHT_LAGER_MALT, BeerAttributesEnum.LIGHT_LAGER_SWEETNESS, BeerAttributesEnum.LIGHT_LAGER_HOPS, BeerAttributesEnum.LIGHT_LAGER_BODY, BeerAttributesEnum.LIGHT_LAGER_BITTERNESS, BeerAttributesEnum.LIGHT_LAGER_ALCOHOL,""),

	PILSNER("Pilsner",BeerAttributesEnum.PILSNER_MALT, BeerAttributesEnum.PILSNER_SWEETNESS, BeerAttributesEnum.PILSNER_HOPS, BeerAttributesEnum.PILSNER_BODY, BeerAttributesEnum.PILSNER_BITTERNESS, BeerAttributesEnum.PILSNER_ALCOHOL,""),

	EUROPEAN_AMBER_LAGER("European Amber Lager",BeerAttributesEnum.EUROPEAN_AMBER_LAGER_MALT, BeerAttributesEnum.EUROPEAN_AMBER_LAGER_SWEETNESS, BeerAttributesEnum.EUROPEAN_AMBER_LAGER_HOPS, BeerAttributesEnum.EUROPEAN_AMBER_LAGER_BODY, BeerAttributesEnum.EUROPEAN_AMBER_LAGER_BITTERNESS, BeerAttributesEnum.EUROPEAN_AMBER_LAGER_ALCOHOL,""),

	DARK_LAGER("Dark Lager",BeerAttributesEnum.DARK_LAGER_MALT, BeerAttributesEnum.DARK_LAGER_SWEETNESS, BeerAttributesEnum.DARK_LAGER_HOPS, BeerAttributesEnum.DARK_LAGER_BODY, BeerAttributesEnum.DARK_LAGER_BITTERNESS, BeerAttributesEnum.DARK_LAGER_ALCOHOL,""),

	BOCK("Bock",BeerAttributesEnum.BOCK_MALT, BeerAttributesEnum.BOCK_SWEETNESS, BeerAttributesEnum.BOCK_HOPS, BeerAttributesEnum.BOCK_BODY, BeerAttributesEnum.BOCK_BITTERNESS, BeerAttributesEnum.BOCK_ALCOHOL,""),

	LIGHT_HYBRID("Light Hybrid",BeerAttributesEnum.LIGHT_HYBRID_MALT, BeerAttributesEnum.LIGHT_HYBRID_SWEETNESS, BeerAttributesEnum.LIGHT_HYBRID_HOPS, BeerAttributesEnum.LIGHT_HYBRID_BODY, BeerAttributesEnum.LIGHT_HYBRID_BITTERNESS, BeerAttributesEnum.LIGHT_HYBRID_ALCOHOL,""),

	AMBER_HYBRID("Amber Hybrid",BeerAttributesEnum.AMBER_HYBRID_MALT, BeerAttributesEnum.AMBER_HYBRID_SWEETNESS, BeerAttributesEnum.AMBER_HYBRID_HOPS, BeerAttributesEnum.AMBER_HYBRID_BODY, BeerAttributesEnum.AMBER_HYBRID_BITTERNESS, BeerAttributesEnum.AMBER_HYBRID_ALCOHOL,""),

	SCOTTISH_IRISH_ALE("Scottish & Irish Ale",BeerAttributesEnum.SCOTTISH_IRISH_ALE_MALT, BeerAttributesEnum.SCOTTISH_IRISH_ALE_SWEETNESS, BeerAttributesEnum.SCOTTISH_IRISH_ALE_HOPS, BeerAttributesEnum.SCOTTISH_IRISH_ALE_BODY, BeerAttributesEnum.SCOTTISH_IRISH_ALE_BITTERNESS, BeerAttributesEnum.SCOTTISH_IRISH_ALE_ALCOHOL,""),

	ENGLISH_PALE_ALE("English Pale Ale",BeerAttributesEnum.ENGLISH_PALE_ALE_MALT, BeerAttributesEnum.ENGLISH_PALE_ALE_SWEETNESS, BeerAttributesEnum.ENGLISH_PALE_ALE_HOPS, BeerAttributesEnum.ENGLISH_PALE_ALE_BODY, BeerAttributesEnum.ENGLISH_PALE_ALE_BITTERNESS, BeerAttributesEnum.ENGLISH_PALE_ALE_ALCOHOL,""),

	ENGLISH_BROWN_ALE("English Brown Ale",BeerAttributesEnum.ENGLISH_BROWN_ALE_MALT, BeerAttributesEnum.ENGLISH_BROWN_ALE_SWEETNESS, BeerAttributesEnum.ENGLISH_BROWN_ALE_HOPS, BeerAttributesEnum.ENGLISH_BROWN_ALE_BODY, BeerAttributesEnum.ENGLISH_BROWN_ALE_BITTERNESS, BeerAttributesEnum.ENGLISH_BROWN_ALE_ALCOHOL,""),

	PORTER("Porter",BeerAttributesEnum.PORTER_MALT, BeerAttributesEnum.PORTER_SWEETNESS, BeerAttributesEnum.PORTER_HOPS, BeerAttributesEnum.PORTER_BODY, BeerAttributesEnum.PORTER_BITTERNESS, BeerAttributesEnum.PORTER_ALCOHOL,""),

	STOUT("Stout",BeerAttributesEnum.STOUT_MALT, BeerAttributesEnum.STOUT_SWEETNESS, BeerAttributesEnum.STOUT_HOPS, BeerAttributesEnum.STOUT_BODY, BeerAttributesEnum.STOUT_BITTERNESS, BeerAttributesEnum.STOUT_ALCOHOL,""),

	INDIA_PALE_ALE("India Pale Ale",BeerAttributesEnum.INDIA_PALE_ALE_MALT, BeerAttributesEnum.INDIA_PALE_ALE_SWEETNESS, BeerAttributesEnum.INDIA_PALE_ALE_HOPS, BeerAttributesEnum.INDIA_PALE_ALE_BODY, BeerAttributesEnum.INDIA_PALE_ALE_BITTERNESS, BeerAttributesEnum.INDIA_PALE_ALE_ALCOHOL,""),

	GERMAN_WHEAT_RYE("German Wheat & Rye",BeerAttributesEnum.GERMAN_WHEAT_RYE_MALT, BeerAttributesEnum.GERMAN_WHEAT_RYE_SWEETNESS, BeerAttributesEnum.GERMAN_WHEAT_RYE_HOPS, BeerAttributesEnum.GERMAN_WHEAT_RYE_BODY, BeerAttributesEnum.GERMAN_WHEAT_RYE_BITTERNESS, BeerAttributesEnum.GERMAN_WHEAT_RYE_ALCOHOL,""),

	BELGIAN_FRENCH("Belgian & French Ale",BeerAttributesEnum.BELGIAN_FRENCH_MALT, BeerAttributesEnum.BELGIAN_FRENCH_SWEETNESS, BeerAttributesEnum.BELGIAN_FRENCH_HOPS, BeerAttributesEnum.BELGIAN_FRENCH_BODY, BeerAttributesEnum.BELGIAN_FRENCH_BITTERNESS, BeerAttributesEnum.BELGIAN_FRENCH_ALCOHOL,""),

	SOUR_ALE("Sour Ale",BeerAttributesEnum.SOUR_ALE_MALT, BeerAttributesEnum.SOUR_ALE_SWEETNESS, BeerAttributesEnum.SOUR_ALE_HOPS, BeerAttributesEnum.SOUR_ALE_BODY, BeerAttributesEnum.SOUR_ALE_BITTERNESS, BeerAttributesEnum.SOUR_ALE_ALCOHOL,""),

	BELGIAN_STRONG_ALE("Belgian Strong Ale",BeerAttributesEnum.BELGIAN_STRONG_ALE_MALT, BeerAttributesEnum.BELGIAN_STRONG_ALE_SWEETNESS, BeerAttributesEnum.BELGIAN_STRONG_ALE_HOPS, BeerAttributesEnum.BELGIAN_STRONG_ALE_BODY, BeerAttributesEnum.BELGIAN_STRONG_ALE_BITTERNESS, BeerAttributesEnum.BELGIAN_STRONG_ALE_ALCOHOL,""),

	STRONG_ALE("Strong Ale",BeerAttributesEnum.STRONG_ALE_MALT, BeerAttributesEnum.STRONG_ALE_SWEETNESS, BeerAttributesEnum.STRONG_ALE_HOPS, BeerAttributesEnum.STRONG_ALE_BODY, BeerAttributesEnum.STRONG_ALE_BITTERNESS, BeerAttributesEnum.STRONG_ALE_ALCOHOL, "");
	
	private final String styleName;
	private final BeerAttribute malt;
	private final BeerAttribute sweetness;
	private final BeerAttribute hops;
	private final BeerAttribute body;
	private final BeerAttribute bitterness;
	private final BeerAttribute alcohol;
	private final String description;
	
	Styles(String styleName, BeerAttributesEnum malt, BeerAttributesEnum sweetness, BeerAttributesEnum hops, BeerAttributesEnum body, BeerAttributesEnum bitterness, BeerAttributesEnum alcohol, String description){
		this.styleName = styleName;
		this.malt = new BeerAttribute(malt.getLow(), malt.getHigh(), malt.getDescription());
		this.sweetness = new BeerAttribute(sweetness.getLow(), sweetness.getHigh(), sweetness.getDescription());
		this.hops = new BeerAttribute(hops.getLow(), hops.getHigh(), hops.getDescription());
		this.body = new BeerAttribute(body.getLow(), body.getHigh(), body.getDescription());
		this.bitterness = new BeerAttribute(bitterness.getLow(), bitterness.getHigh(), bitterness.getDescription());
		this.alcohol = new BeerAttribute(alcohol.getLow(), alcohol.getHigh(), alcohol.getDescription());
		this.description = description;
	}
	
	public String getStyleName(){
		return this.styleName;
	}
	
	public BeerAttribute getMalt(){
		return this.malt;
	}
	
	public BeerAttribute getSweetness(){
		return this.sweetness;
	}
	
	public BeerAttribute getHops(){
		return this.hops;
	}
	
	public BeerAttribute getBody(){
		return this.body;
	}
	
	public BeerAttribute getBitterness(){
		return this.bitterness;
	}
	
	public BeerAttribute getAlcohol(){
		return this.alcohol;
	}
	
	public String getDescription(){
		return this.description;
	}
}

