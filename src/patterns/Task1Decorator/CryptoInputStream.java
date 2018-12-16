package patterns.Task1Decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CryptoInputStream extends FilterInputStream {
    private byte[] pwd;
    private int number=0;

    public CryptoInputStream(InputStream in, byte[] pwd) {
        super(in);
        this.pwd = pwd;
    }

    @Override
    public int read() throws IOException {
        int a =  super.read();
        a = a^pwd[number%pwd.length];
        number++;
        return a;
    }
}
