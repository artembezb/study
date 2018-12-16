package patterns.Task2Observer;

public interface Alarm {
    public void tempChanged(int temp);
}

class GreenWarning implements Alarm {
    private int currentTemp;

    @Override
    public void tempChanged(int temp) {
        if (temp >= 100 && currentTemp <100) {
            System.out.println("Уровень опасности: зеленый");
            currentTemp=temp;
        }

    }
}

class YellowWarning implements Alarm {
    private int currentTemp;
    @Override
    public void tempChanged(int temp) {
        if (temp >= 300 && currentTemp <300) {
            System.out.println("Уровень опасности: зеленый + желтый");
            currentTemp=temp;
        }
    }
}

class RedAlert implements Alarm {
    private int currentTemp;

    @Override
    public void tempChanged(int temp) {
        if (temp >= 600 && currentTemp <600) {
            System.out.println("Уровень опасности: зеленый + желтый + красный");
            currentTemp=temp;
        }
    }
}