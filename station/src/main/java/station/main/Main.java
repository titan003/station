package station.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import station.model.Station;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.Gson; 

public class Main {
	
	
	public static void main(String... args) throws FileNotFoundException, IOException, ParseException {
		List<Station> listStations = recupererStation();
		
		//filtrer sur les stations de metro
		List<Station> stationsMetro = listStations.stream().filter(station -> station.getReseau().equals("metro")).collect(Collectors.toList());
		afficherListStation(stationsMetro);
		}
	
	public static List<Station> recupererStation() throws FileNotFoundException, IOException, ParseException {
		

		JSONParser parser = new JSONParser();
		JSONObject data = (JSONObject) parser.parse(new FileReader("station.json"));
		
		 
		 JSONArray features= (JSONArray) data.get("features");
		 List<Station> stations = new ArrayList<>();

		    for(int i = 0; i< features.size(); i++) {
		    	JSONObject attributes = (JSONObject) features.get(i);
		    	Gson gson = new Gson();  
		    	Station station = gson.fromJson(attributes.get("attributes").toString(), Station.class);
		    	stations.add(station);
		    }


		return stations;
	}
	
	public static void afficherListStation(List<Station> stations) {
		stations.stream().forEach(station-> System.out.println(station));
	}

}
