package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private int temperature;
    private int humidity;
    private int pressure;

    public void addObserver(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeObserver(WeatherDisplay display) {
        displays.remove(display);
    }

    public void setWeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
}
