package patterns.Task1Decorator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя файла");
        Scanner input = new Scanner(System.in);
        String file = input.nextLine();
        System.out.println("Введите имя второго файла");
        String file1 = input.nextLine();
        System.out.println("Введите имя третьего файла");
        String file2 = input.nextLine();
        System.out.println("Введите пароль");
        String pwd = input.nextLine();
        byte[] key = pwd.getBytes();

        try (
                InputStream in = new CryptoInputStream(new FileInputStream(file), key);
                OutputStream out = new CryptoOutputStream(new FileOutputStream(file1), key)
        ) {
            byte[] byteArr = new byte[in.available()];
            while ((in.read(byteArr)) > 0){
                out.write(byteArr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                InputStream in = new CryptoInputStream(new FileInputStream(file1), key);
                OutputStream out = new CryptoOutputStream(new FileOutputStream(file2), key)
        ) {
            byte[] byteArr = new byte[1];
            while ((in.read(byteArr)) > 0){
                out.write(byteArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


