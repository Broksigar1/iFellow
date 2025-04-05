package ru.IFellow.carBrands;

import ru.IFellow.Car;
import ru.IFellow.SteeringWheelLocation;

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
    public void printInfoAboutCar()
    {
        System.out.println("Steering wheel location - " + steeringWheelLocation.toString());
        super.printInfoAboutCar();
    }
}
