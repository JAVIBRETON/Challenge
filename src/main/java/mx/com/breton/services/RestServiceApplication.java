package mx.com.breton.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}

/**
 * 
 * 1. Completar el Bean GeoData (geodata)
 * 2. Implementar Lectura de archivo de texto con java, usar mètodo de java 17 (con que sea mayor a java 8 (file util)
 * Lina por linea,  poner en google "read txt file with java 17"
 * 3. Implementar metodo que recibe un GeoData y devuelve un Suggestion  (convers)
 * 4. Revisar formas para ordenar una lista 
 *     en google "java change order of list" (controller)
 * 
 */