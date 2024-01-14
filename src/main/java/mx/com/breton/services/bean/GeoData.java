/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.breton.services.bean;

/**
 *
 * @author admin
 */
public class GeoData {

  private String name;
  private double latitude;
  private double longitude;
  private float geonameid;
  private float asciiname;
  private float alternatenames;
  private float cc2;
  private float population;
  private float elevation;

  private String country;
  private String admin1;

    public GeoData() {
        super();
    }
	/**
     * @return the name
     */
    public String getName() {
      return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
      this.name = name;
  }



  /**
   * @return the latitude
   */
  public double getLatitude() {
      return latitude;
  }

  /**
   * @param latitude the latitude to set
   */
  public void setLatitude(double latitude) {
      this.latitude = latitude;
  }



  /**
   * @return the longitude
   */
  public double getLongitude() {
      return longitude;
  }

  /**
   * @param longitude the longitude to set
   */
  public void setLongitude(double longitude) {
      this.longitude = longitude;
  }



  /**
   * @return the geonameid
   */
  public float getGeonameid() {
    return geonameid;
}

/**
 * @param geonameid the geonameid to set
 */
public void setGeonameid(float geonameid) {
    this.geonameid = geonameid;
}



  /**
   * @return the asciiname
   */
  public float getAsciiname() {
    return asciiname;
}

/**
 * @param asciiname the asciiname to set
 */
public void setAsciiname(float asciiname) {
    this.asciiname = asciiname;
} 



  /**
   * @return the alternatenames
   */
  public float getAlternatenames() {
    return alternatenames;
}

/**
 * @param alternatenames the alternatenames to set
 */
public void setAlternatenames(float alternatenames) {
    this.alternatenames = alternatenames;
} 



  /**
   * @return the cc2
   */
  public float getCc2() {
    return cc2;
}

/**
 * @param cc2 the cc2 to set
 */
public void setCc2(float cc2) {
    this.cc2 = cc2;
} 



  /**
   * @return the population
   */
  public float getPopulation() {
    return population;
}

/**
 * @param population the population to set
 */
public void setPopulation(float population) {
    this.population = population;
} 



  /**
   * @return the elevation
   */
  public float getElevation() {
    return elevation;
}

/**
 * @param elevation the elevation to set
 */
public void setElevation(float elevation) {
    this.elevation = elevation;
}


public void setCountry(String country){
    this.country= country;
}

public String getCountry(){
    return this.country;
}

public void setAdmin1(String admin1){
    this.admin1= admin1;
}

public String getAdmin1(){
    return this.admin1;
}

}


