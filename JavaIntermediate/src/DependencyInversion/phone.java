package DependencyInversion;

public class phone {
    public String generateWeatherAlert(String conditions) {
        String alert = "It is " + conditions;
        return alert;
    }
}