 /**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.breton.util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.breton.services.bean.GeoData;

/**
 *
 * @author admin
 */


public class FileUtil {

       static Logger logger = LoggerFactory.getLogger(FileUtil.class);

 
   public static List<GeoData> getGeoData() {
      List<GeoData> dataGeo  = new ArrayList<>();
     try{ 
      Path path = Paths.get(FileUtil.class.getClassLoader()
         .getResource("cities_canada-usa.tsv").toURI());
         
      Stream<String> lines = Files.lines(path);
       lines.forEach((p)-> {
         String[] splited = p.split("\t", -1);
         if(splited!=null){
            // se ignora la 1a linea, la de headers.
            if(!splited[0].equals("id")){
               GeoData geo  = new GeoData();
               geo.setName(splited[1]);
               try{
                  geo.setLatitude(Float.parseFloat(splited[4]));                  
                  geo.setLongitude(Float.parseFloat(splited[5]));
                  geo.setCountry(splited[8]);
                  geo.setAdmin1(splited[10]);
               }catch(Exception exc){
                  logger.error("algo fallo, con {} y {}", splited[4],splited[5]);
                  geo.setLatitude(0);                  
                  geo.setLongitude(0);
               }
               dataGeo.add(geo);
            }
          }
      });
      lines.close();
     }catch(Exception exc){
      logger.error(exc.toString());
     }
     return dataGeo;

   }  
  

}
