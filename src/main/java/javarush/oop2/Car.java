package javarush.oop2;

public class Car implements Runnable {
    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
