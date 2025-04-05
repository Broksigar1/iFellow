package ru.IFellow;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.List;

public class CarHandler
{
    public static void getInfoAboutCarsWhichWasManufacturedAfterSpecifiedYear(List<Car> cars, int year)
    {
        for (Car car : cars)
        {
            if (car.getYearOfManufacture() > year)
            {
                car.printInfoAboutCar();
            }
            else
            {
                System.out.println("устаревший авто");
            }

            System.out.println();
        }
    }

    public static void repaintCarIfItGreen(Car car, Color newColor)
    {
        if (car.getColor() == Color.GREEN)
        {
            car.repaintCar(newColor);
        }
    }

    public static void printInfoAboutOldestCarInList(List<Car> cars)
    {
        Car oldestCar = cars.get(0);
        for (int i = 1; i < cars.size(); i++)
        {
            if (cars.get(i).getYearOfManufacture() < oldestCar.getYearOfManufacture())
            {
                oldestCar = cars.get(i);
            }
        }

        oldestCar.printInfoAboutCar();
    }

    public static String getColorName(Color color)
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
