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

    public String getCarBrand()
    {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand)
    {
        this.carBrand = carBrand;
    }

    public String getCarType()
    {
        return this.carType;
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    public Color getColor()
    {
        return this.color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public FuelType getFuel()
    {
        return this.fuel;
    }

    public void setFuel(FuelType fuel)
    {
        this.fuel = fuel;
    }

    public int getNumberOfKilometers()
    {
        return this.numberOfKilometers;
    }

    public void setNumberOfKilometers(int numberOfKilometers)
    {
        this.numberOfKilometers = numberOfKilometers;
    }

    public int getNumberOfPassengers()
    {
        return this.numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers)
    {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getYearOfManufacture()
    {
        return this.yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture)
    {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void changeSpeed(int speed)
    {
        int speedIndicator;
        if(speed < 0)
        {
            System.out.println("Your speed is cant be negative! ");
        }else
        {
            speedIndicator = this.speed - speed;
            setSpeed(speed);
        }
    }

    public void moveCar(int numberOfKilometers)
    {
        if(numberOfKilometers < 1)
        {
            System.out.println("You can't travel 0 Kilometers or less! ");
        }else
        {
            setNumberOfKilometers(numberOfKilometers);
        }
    }

    public void resetMileage()
    {
        setNumberOfKilometers(0);
    }

    @Override
    public String toString()
    {
        boolean bool1 = true;
        boolean bool2 = false;
        String s1 = "family";
        String s2 = "two-seater";
        s1 = Boolean.toString(bool1);
        s2 = Boolean.toString(bool2);
        return "This car is a " + getCarBrand() + " " + getCarType() + " " + getFuel() + " car which was manufactured in " + getYearOfManufacture() + ". It has " + getColor() + " color and the number of kilometers traveled is: " + getNumberOfKilometers();

    }
}
