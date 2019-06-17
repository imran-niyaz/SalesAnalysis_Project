package beans;

public class Location {
	
	// instance variables 
	private String city;
	private String state;
	private String country;
	
	
	//constructor
	public Location(String city,String state,String country){
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		
	}
	
	public String toString() {
		return city+","+state+","+country;
	}
	
	
	
	
	
	
	// getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
