class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9 / 5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}

public class tempQ3 {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        t.setCelsius(25);
        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());

        t.setFahrenheit(100);
        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}