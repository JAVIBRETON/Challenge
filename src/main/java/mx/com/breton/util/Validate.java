/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.breton.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author admin
 */
public class Validate {

    private static Logger logger = LoggerFactory.getLogger(Validate.class);

    public static float validateFloat(String f) {
        float res = 0f;
        try {
            res = Float.parseFloat(f);
        } catch (Exception e) {
            logger.error("Input value dont is a float value. We use default value");
        }
        return res;
    }
}
