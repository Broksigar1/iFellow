package ru.IFellow.Car;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.List;

public class CarHandler
{
    public static void GetInfoAboutCarsWhichWasManufacturedAfter2006(List<Car> cars)
    {
        for (Car car : cars)
        {
            if (car.getYearOfManufacture() > 2006)
            {
                car.PrintInfoAboutCar();
            }
            else
            {
                System.out.println("устаревший авто");
            }

            System.out.println();
        }
    }

    public static void RepaintCarInRedIfItGreen(Car car)
    {
        if (car.getColor() == Color.GREEN)
        {
            car.RepaintCar(Color.RED);
        }
    }

    public static void PrintInfoAboutOldestCarInList(List<Car> cars)
    {
        Car oldestCar = cars.get(0);
        for (int i = 1; i < cars.size(); i++)
        {
            if (cars.get(i).getYearOfManufacture() < oldestCar.getYearOfManufacture())
            {
                oldestCar = cars.get(i);
            }
        }

        oldestCar.PrintInfoAboutCar();
    }

    public static String GetColorName(Color color)
    {
        for (Field field : Color.class.getFields())
        {
            try
            {
                if (field.getType() == Color.class && field.get(null).equals(color))
                {
                    return field.getName();
                }
            }
            catch (java.lang.IllegalAccessException e)
            {
            }
        }

        return "unknown";
    }
}
