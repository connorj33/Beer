package learning.beer;

public enum Flavors {

		BREADY("Bready","Fresh bread or crust."),
		NUTTY("Nutty","Almond, Hazelnut, or Walnut flavors"),
		CHOCOLATE("Chocolate","Sweet or bitter "),
		CARAMEL("Caramel",""),
		SWEET("Sweet",""),
		BITTER("Bitter",""),
		SOUR("Sour",""),
		DRY("Dry",""),
		YEASTY("Yeasty",""),
		FRUITY("Fruity",""),
		SPICY("Spicy",""),
		GRAINY("Grainy",""),
		CRISP("Crisp",""),
		SMOOTH("Smooth",""),
		HEAVY("Heavy",""),
		LIGHT("Light",""),
		ALCOHOLIC("Alcoholic",""),
		ROASTED("Roasted",""),
		TOASTY("Toasty",""),
		WHEATY("Wheaty",""),
		MALTY("Malty",""),
		WOODY("Woody","");
		
		private String description;
		private String flavor;
		Flavors(String flavor, String description){
			this.description = description;
			this.flavor = flavor;
		}
		
		public String getFlavor(){
			return this.flavor;
		}
		
		public String getDescription(){
			return this.description;
	}
}
