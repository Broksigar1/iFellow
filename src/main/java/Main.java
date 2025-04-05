import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import ru.IFellow.Car.Car;
import ru.IFellow.Car.CarHandler;
import ru.IFellow.Car.SteeringWheelLocation;
import ru.IFellow.Car.carBrands.BMW;
import ru.IFellow.Car.carBrands.Ford;
import ru.IFellow.Car.carBrands.Opel;
import ru.IFellow.Car.carBrands.Suzuki;
import ru.IFellow.Car.carBrands.Toyota;


public class Main
{
    public static void main(String[] args)
    {
        final String DELIMITER = "----------------------------------------------------";

        List<Car> cars = new ArrayList<>();

        cars.add(new BMW("BMW", Color.GREEN, 2006, 280, 5, 50_000, 2));
        cars.add(new BMW("BMW", Color.BLUE, 2020, 280, 5, 10_000, 2));
        cars.add(new Ford("Ford", Color.PINK, 2000, 200, 5, 250_000, 1.6));
        cars.add(new Ford("Ford", Color.BLUE, 2026, 380, 2, 1000, 4));
        cars.add(new Opel("Opel", Color.GREEN, Color.PINK, 2018, 200, 5, 41_000, 1.4));
        cars.add(new Opel("Opel", Color.GREEN, Color.PINK, 2018, 200, 5, 50_000, 1.4));
        cars.add(new Suzuki("Suzuki", Color.GREEN, 2002, 280, 5, 50_000, 2, SteeringWheelLocation.Left));
        cars.add(new Suzuki("Suzuki", Color.GREEN, 2008, 280, 5, 50_000, 2, SteeringWheelLocation.Right));
        cars.add(new Toyota("Toyota", Color.BLACK, 1999, 220, 5, 550_000, 3.5));
        cars.add(new Toyota("Toyota", Color.GREEN, 2021, 255, 4, 200, 2));

        CarHandler.GetInfoAboutCarsWhichWasManufacturedAfter2006(cars);
        System.out.println(DELIMITER);

        for (Car car : cars)
        {
            System.out.println("Color before - " + CarHandler.GetColorName(car.getColor()));
            CarHandler.RepaintCarInRedIfItGreen(car);
            System.out.println("Color after - " + CarHandler.GetColorName(car.getColor()));
            System.out.println();
        }
        System.out.println(DELIMITER);

        CarHandler.PrintInfoAboutOldestCarInList(cars);
    }
}
