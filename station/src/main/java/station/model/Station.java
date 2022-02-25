package station.model;

import com.google.gson.annotations.SerializedName;

public class Station {
	private String id;
	private String x;
	private String y;
	@SerializedName("nom_station")
	private String stationName;
	@SerializedName("ville_cp")
	private String ville;
	private String reseau;
	
	
	@Override() 
	public String toString() {
		return "station: "+this.stationName + " x: "+this.x + " y: " +this.y + " ville: "+ this.ville +" reseau: "+ this.reseau;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getReseau() {
		return reseau;
	}
	public void setReseau(String reseau) {
		this.reseau = reseau;
	}
	
	

}
