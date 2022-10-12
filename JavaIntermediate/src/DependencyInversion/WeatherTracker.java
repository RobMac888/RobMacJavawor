package DependencyInversion;

public class WeatherTracker {
    private String conditions;
    phone phone;
    Email email;

    public WeatherTracker() {
        phone = new phone();
        email = new Email();
    }

    public void setConditions(String weather) {
        this.conditions = weather;
        if(weather.equals("rainy")) {
            String alert = phone.generateWeatherAlert(weather);
            System.out.println(alert);
        }
        if(weather.equals("sunny")) {
            String alert = email.generateWeatherAlert(weather);
            System.out.println(alert);
        }
    }

    public String getConditions() {
        return conditions;
    }
}