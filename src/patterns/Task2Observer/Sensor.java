package patterns.Task2Observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private List<Alarm> warnings = new ArrayList<>();

    public void addWarning (Alarm warning) {
        warnings.add(warning);
    }

    public void changeTemp (int temp) {
        System.out.println("Температура за бортом " + temp);
        notification(temp);
    }

    public void notification(int temp) {
        for (Alarm w : warnings) {
            w.tempChanged(temp);
        }
    }
}
