package patterns.Task1Decorator.Task4Strategy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public interface ILogger {
    public void write(String data);
}

class ConsoleLogger implements ILogger {
    @Override
    public void write(String data) {
        System.out.println(data);
    }
}

class FileLogger implements ILogger {

    @Override
    public void write(String data) {
        try(FileWriter writer = new FileWriter("log.txt", false)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TimeFileLogger implements ILogger {
    private Date date = new Date();

    @Override
    public void write(String data) {
        try(FileWriter writer = new FileWriter("log1.txt", false)) {
            writer.write(data + " " + date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}