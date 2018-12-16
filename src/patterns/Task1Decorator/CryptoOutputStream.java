package patterns.Task1Decorator;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptoOutputStream extends FilterOutputStream {
    private byte[] pwd;
    private int number = 0;

    public CryptoOutputStream(OutputStream out, byte[] pwd) {
        super(out);
        this.pwd = pwd;
    }

    @Override
    public void write(int a) throws IOException {
        a = a ^ pwd[number % pwd.length];
        number++;
        super.write(a);
    }
}