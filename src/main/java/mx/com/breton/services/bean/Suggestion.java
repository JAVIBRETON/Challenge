package mx.com.breton.services.bean;

public class Suggestion {

    private String name;
    private double latitude;
    private double longitude;
    private float score;

    public Suggestion() {
        this("", 0.0, 0.0, 0 - 0);
    }

    public Suggestion(String name, double latitude,
    double longitude, float score) {
        super();
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
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
     * @return the score
     */
    public float getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(float score) {
        this.score = score;
    }
}
