package ru.IFellow.Car.carBrands;

import ru.IFellow.Car.Car;
import ru.IFellow.Car.CarHandler;

import java.awt.*;

public class Opel extends Car
{
    private final Color interiorColor;

    public Opel(String brand, Color interiorColor, Color color, int yearOfManufacture, double maxSpeed, int seatsAmount, double mileage, double engineVolume)
    {
        super(brand, color, yearOfManufacture, maxSpeed, seatsAmount, mileage, engineVolume);
        this.interiorColor = interiorColor;
    }

    @Override
    public void PrintInfoAboutCar()
    {
        System.out.println("Interior color - " + CarHandler.GetColorName(interiorColor));
        super.PrintInfoAboutCar();
    }
}
