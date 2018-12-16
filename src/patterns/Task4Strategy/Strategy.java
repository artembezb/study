package patterns.Task4Strategy;

public class Strategy {
    private ILogger someLogger;

    public Strategy(ILogger someLogger) {
        this.someLogger = someLogger;
    }

    public void write (String data) {
        someLogger.write(data);
    }
}
