/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.breton.util;

import mx.com.breton.services.bean.GeoData;
import mx.com.breton.services.bean.Suggestion;

/**
 *
 * @author admin
 */
public class Convert {
    
    public static Suggestion GeoToSuggesion(GeoData geoData){
        Suggestion suggestion = new Suggestion();
      
        suggestion.setName(geoData.getName()+", "+geoData.getAdmin1()+", "+geoData.getCountry());
        suggestion.setLongitude(geoData.getLongitude());
        suggestion.setLatitude(geoData.getLatitude());
        return suggestion;
    }
}
