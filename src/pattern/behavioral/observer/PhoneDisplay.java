package pattern.behavioral.observer;

public class PhoneDisplay  implements WeatherDisplay {
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("Phone Display: Temperature - " + temperature + ", Humidity - " + humidity);
    }
}