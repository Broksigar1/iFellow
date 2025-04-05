package ru.IFellow.Car.carBrands;

import ru.IFellow.Car.Car;
import ru.IFellow.Car.SteeringWheelLocation;

import java.awt.*;

public class Suzuki extends Car
{
    private final SteeringWheelLocation steeringWheelLocation;

    public Suzuki(
            String brand,
            Color color,
            int yearOfManufacture,
            double maxSpeed,
            int seatsAmount,
            double mileage,
            double engineVolume,
            SteeringWheelLocation steeringWheelLocation)
    {
        super(brand, color, yearOfManufacture, maxSpeed, seatsAmount, mileage, engineVolume);
        this.steeringWheelLocation = steeringWheelLocation;
    }

    @Override
    public void PrintInfoAboutCar()
    {
        System.out.println("Steering wheel location - " + steeringWheelLocation.toString());
        super.PrintInfoAboutCar();
    }
}
