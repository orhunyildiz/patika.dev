package IO.SerializationPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "Qashqai");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/IO/SerializationPractice/output.txt");
            // ObjectOutputStream ile nesne yazma
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
            // ObjectInputStream ile nesne okuma.
            FileInputStream fileInputStream = new FileInputStream("src/IO/SerializationPractice/output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Car newCar = (Car) objectInputStream.readObject();
            System.out.println("Car Brand: " + newCar.getBrand());
            System.out.println("Car Model: " + newCar.getModel());
            objectInputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
