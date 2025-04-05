package ru.IFellow.carBrands;

import ru.IFellow.Car;
import ru.IFellow.CarHandler;

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
    public void printInfoAboutCar()
    {
        System.out.println("Interior color - " + CarHandler.getColorName(interiorColor));
        super.printInfoAboutCar();
    }
}
