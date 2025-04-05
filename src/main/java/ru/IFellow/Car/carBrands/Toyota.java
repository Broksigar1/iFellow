package ru.IFellow.Car.carBrands;

import ru.IFellow.Car.Car;

import java.awt.*;

public class Toyota extends Car
{
    public Toyota(String brand, Color color, int yearOfManufacture, double maxSpeed, int seatsAmount, double mileage, double engineVolume)
    {
        super(brand, color, yearOfManufacture, maxSpeed, seatsAmount, mileage, engineVolume);
    }

    @Override
    public void PrintInfoAboutCar()
    {
        System.out.println("Информация об автомобиле лучшей марки в мире!");
        super.PrintInfoAboutCar();
    }
}
