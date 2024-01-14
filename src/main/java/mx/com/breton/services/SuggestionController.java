package mx.com.breton.services;

import mx.com.breton.services.bean.GeoData;
import mx.com.breton.services.bean.Suggestion;
import mx.com.breton.services.bean.Suggestions;
import mx.com.breton.util.Convert;
import mx.com.breton.util.FileUtil;
import mx.com.breton.util.LevenshteinDistance;

import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mx.com.breton.util.Validate;
@RestController
public class SuggestionController {

    Logger logger = LoggerFactory.getLogger(SuggestionController.class);
    
    
    @GetMapping("/suggestions")
    public Suggestions suggestions(
            @RequestParam(value = "q", defaultValue = " ") String q, 
            @RequestParam(value = "latitude", defaultValue = "99.0") String latitude,
            @RequestParam(value = "longitude", defaultValue = "-99.0") String longitude) {
        logger.info("==== new request====");
        logger.info("q={}",q);
        logger.info("String latitude={}",latitude);
        logger.info("String longitude={}",longitude);        
        // If floats params are not  number, we put default value
        // the objetive is dont break the service.
        float lat = Validate.validateFloat(latitude);
        float lon = Validate.validateFloat(longitude);
        logger.info("float lat={}",lat);
        logger.info("float lon={}",lon);           
        Suggestions suggestions = new Suggestions();                
        // --
        List<GeoData> data = FileUtil.getGeoData();
        logger.info("Universo de datos total: {}",data.size());
        //  del universo total, solo se debe filtrar.
        // los elementos cuyo nombre y q tengan distancias Levensshtein >0.7
        data.stream().forEach((p)-> {
            double distancia = LevenshteinDistance.findSimilarity(q, p.getName());
            if(distancia>0.7){
                Suggestion sug = Convert.GeoToSuggesion(p);
                sug.setScore((float)distancia);
                suggestions.getSuggestions().add(sug);
            }
        });
        // --
        suggestions.getSuggestions().sort(Comparator.comparingDouble(Suggestion::getLatitude)
                                 .reversed());
         return suggestions;
    }
}
