package com.company;


public class Car {

    private String carBrand, carType;
    private Color color;
    private FuelType fuel;
    private int numberOfPassengers, numberOfKilometers, yearOfManufacture, speed;

    public Car(String carBrand, String carType, Color color, FuelType fuel, int numberOfKilometers, int numberOfPassengers, int yearOfManufacture, int speed)
    {
        this.carBrand = carBrand;
        this.carType = carType;
        this.color = color;
        this.fuel = fuel;
        this.numberOfKilometers = numberOfKilometers;
        this.numberOfPassengers = numberOfPassengers;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public Car(String carBrand, String carType, int fuelNumber, boolean family, int yearOfManufacture)
    {
        this.carBrand = carBrand;
        this.carType = carType;
        if(fuelNumber == 0)
        {
              this.fuel = FuelType.DIESEL;
        }else if(fuelNumber == 1)
        {
            this.fuel = FuelType.PETROL;
        }else if(fuelNumber == 2)
        {
            this.fuel = FuelType.GAS;
        }else
        {
            this.fuel = FuelType.ELECTRIC;
        }
        if(family)
        {
            this.numberOfPassengers = 5;
        }else
        {
            this.numberOfPassengers = 2;
        }
        this.yearOfManufacture = yearOfManufacture;

        this.numberOfKilometers = 0;
        this.speed = 0;

        if(carBrand.charAt(0) == 'R')
        {
            this.color = Color.RED;
        }else if(carBrand.charAt(0) == 'G')
        {
            this.color = Color.GREEN;
        }else if(carBrand.charAt(0) == 'B')
        {
            this.color = Color.BLUE;
        }else if(carBrand.charAt(0) == 'W')
        {
            this.color = Color.WHITE;
        }else
        {
            this.color = Color.BLACK;
        }
    }

}
