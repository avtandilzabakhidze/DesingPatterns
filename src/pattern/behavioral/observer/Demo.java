package pattern.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        DesktopDisplay desktopDisplay = new DesktopDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(desktopDisplay);

        // Simulating weather changes
        weatherStation.setWeatherData(25, 60, 1010);
    }
}
