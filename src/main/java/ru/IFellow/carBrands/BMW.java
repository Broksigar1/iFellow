package ru.IFellow.carBrands;

import ru.IFellow.Car;

import java.awt.*;

public class BMW extends Car
{
    public BMW(String brand, Color color, int yearOfManufacture, double maxSpeed, int seatsAmount, double mileage, double engineVolume)
    {
        super(brand, color, yearOfManufacture, maxSpeed, seatsAmount, mileage, engineVolume);
    }

    @Override
    public void repaintCar(Color newColor)
    {
        System.out.println("BMW должна быть черного цвета");
        color = Color.BLACK;
    }
}
