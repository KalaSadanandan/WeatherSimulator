package com.tcs.env.model;

public class WeatherInfo {

	/* Variable for holding location information */
	private String location;
	
	/* Variable for holding longitude information */
	private Double longitude;

	/* Variable for holding latitude information */
	private Double latitude;
	
	/* Variable for holding elevation information */
	private Double elevation;
	
	/* Variable for holding temperature information */
	private Double temperature;

	/* Variable for holding pressure information */
	private Double pressure;

	/* Variable for holding humidity information */
	private Double humidity;

	/* Variable for holding condition information */
	private String condition;

	/* Variable for holding timestamp information */
	private String timeStamp;
	
	
	/* Method for getting location information 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/* Method for setting location information 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* Method for getting longitude information 
	 * @return longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/* Method for setting longitude information 
	 * @param longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/* Method for getting latitude information 
	 * @return latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/* Method for setting latitude information 
	 * @param latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/* Method for getting elevation information 
	 * @return elevation
	 */
	public Double getElevation() {
		return elevation;
	}

	/* Method for setting elevation information 
	 * @param elevation
	 */
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	/* Method for getting temperature information 
	 * @return temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/* Method for setting temperature information 
	 * @param temperature
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/* Method for getting pressure information 
	 * @return pressure
	 */
	public Double getPressure() {
		return pressure;
	}

	/* Method for setting pressure information 
	 * @param pressure
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	/* Method for getting humidity information 
	 * @return humidity
	 */
	public Double getHumidity() {
		return humidity;
	}

	/* Method for setting humidity information 
	 * @param humidity
	 */
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	/* Method for getting condition information 
	 * @return condition
	 */
	public String getCondition() {
		return condition;
	}

	/* Method for setting condition information 
	 * @param condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/* Method for getting timestamp information 
	 * @return timestamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/* Method for setting timestamp information 
	 * @param timestamp
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * Method for Setting the weather information in WeatherInfo Class.
	 *
	 * @param location
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 * @param condition
	 * @param timeStamp
	 * @param latitude
	 * @param longitude
	 * @param altitude
	 * @param timestamp
	 * 
	 */
	public void setData(String location, Double temp, Double pressure,
			Double humidity, String condition, String timeStamp,
			Double latitude, Double longitude, Double altitude, String timestamp) {
		this.condition = condition;
		this.elevation = altitude;
		this.humidity = humidity;
		this.latitude = latitude;
		this.location = location;
		this.longitude = longitude;
		this.pressure = pressure;
		this.temperature = temp;
		this.timeStamp = timestamp;

	}

}
