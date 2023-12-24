package pattern.behavioral.observer;

public class DesktopDisplay implements WeatherDisplay {
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("Desktop Display: Temperature - " + temperature + ", Pressure - " + pressure);
    }
}
