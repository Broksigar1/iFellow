package ru.IFellow.Car;

import lombok.Getter;

import java.awt.*;

public abstract class Car
{
    private final String brand;
    @Getter
    protected Color color;
    @Getter
    private final int yearOfManufacture;
    private final int seatsAmount;
    private final double maxSpeed;
    private final double mileage;
    private final double engineVolume;

    public Car(String brand, Color color, int yearOfManufacture, double maxSpeed, int seatsAmount, double mileage, double engineVolume)
    {
        this.brand = brand;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.maxSpeed = maxSpeed;
        this.seatsAmount = seatsAmount;
        this.mileage = mileage;
        this.engineVolume = engineVolume;
    }

    public void PrintInfoAboutCar()
    {
        System.out.println("Brand - " + brand);
        System.out.println("Color - " + CarHandler.GetColorName(color));
        System.out.println("Year of manufacture - " + yearOfManufacture);
        System.out.println("Amount of seats - " + seatsAmount);
        System.out.println("Max speed - " + maxSpeed);
        System.out.println("Mileage - " + mileage);
        System.out.println("Engine volume - " + engineVolume);
    }

    public void RepaintCar(Color newColor)
    {
        color = newColor;
    }
}
