package learning.beer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class BeerDataStorage {
	private static ArrayList<Beer> beerData = new ArrayList<Beer>();
	
	BeerDataStorage(){
		
	}
	
	
	public static void readBeers(String filename) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		while(reader.ready()){
			Styles style = Styles.valueOf(reader.readLine());
			Beer beer = new Beer(style, reader.readLine(), reader.readLine(), Double.parseDouble(reader.readLine()), reader.readLine());
			beerData.add(beer);
		}
		reader.close();
	}
	
	public ArrayList<Beer> getBeers(){
		return beerData;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BeerDataStorage.readBeers(args[0]);
		
		
	}
}
