package patterns.Task2Observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.addWarning(new GreenWarning());
        sensor.addWarning(new YellowWarning());
        sensor.addWarning(new RedAlert());

        for(int i = 0; i<1000; i+=60) {
            sensor.changeTemp(i);
        }
    }
}
