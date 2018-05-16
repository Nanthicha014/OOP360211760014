package lad8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class carApp {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.setEngSize(2500);
        e.setHorsePower(150);

        //create car object
        Car c = new Car();
        c.setColor("Red");
        c.setBrand("Honda");
        c.setCarID("กข-1234");
        c.setEngine(e);

        System.out.println(c.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter car color: ");
        String color = reader.readLine();
        System.out.println("Enter car brand: ");
        String brand = reader.readLine();
        System.out.println("Enter car ID: ");
        String id = reader.readLine();
        System.out.println("Enter engine size: ");
        String  size = reader.readLine();
        System.out.println("Enter horse power");
        String power = reader.readLine();



    }//main


}//class

