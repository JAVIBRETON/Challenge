/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.breton.services.bean;

import mx.com.breton.services.bean.Suggestion;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Suggestions {

    private ArrayList suggestions;

    public Suggestions() {
        super();
        suggestions = new ArrayList<Suggestion>();
    }

    /**
     * @return the suggestions
     */
    public ArrayList<Suggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * @param suggestions the suggestions to set
     */
    public void setSuggestions(ArrayList<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }
}
